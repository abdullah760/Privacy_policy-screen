 package com.example.privacy_policy_screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.privacy_policy_screen.ui.theme.Privacy_policyscreenTheme


 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Privacy_policyscreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@Composable
fun MainView( modifier: Modifier = Modifier,

              ) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ){
        item {
            Header(modifier = Modifier)
        }
        item {

            MainText()
        }
        item {
            AgreementButtons(modifier = Modifier , onClick = {

            })

        }
    }
}
 @Composable
 fun Header(modifier : Modifier){
     Text(
        modifier = Modifier
            .padding(bottom = 8.dp)
            ,
         fontSize = 30.sp,
         fontWeight = FontWeight.SemiBold,
         text = "Investa Privacy Policy"


     )
 }

@Composable
 fun AgreementButtons(
     modifier: Modifier,
     onClick: () -> Unit
 ) {
     Row(
         modifier = modifier
             .fillMaxWidth()
             .padding(vertical = 10.dp)
         ,
         horizontalArrangement = Arrangement.Center
     ) {

             Button(
                    modifier = Modifier
//                        .padding(horizontal = 40.dp)
                            ,
                 onClick = {

                 },
                 colors = ButtonDefaults.buttonColors(
                     contentColor = Color.White, containerColor =Color(0xFF2796ff)
                 ),
             ) {
                 Text(text = "Agree",
                     fontWeight = FontWeight.Bold,
                     fontSize = 15.sp,

                     )
             }
         Spacer(modifier = Modifier.width(90.dp))

         Button(
             modifier = Modifier
//                 .padding(horizontal = 40.dp)
                 ,
             onClick = onClick,
             colors = ButtonDefaults.buttonColors(
                 contentColor = Color.White, containerColor =Color(0xFF2796ff)
             )

         ) {
             Text(text = "Disagree",
                 fontWeight = FontWeight.Bold,
                 fontSize = 15.sp,

                 )
         }

     }
 }


 @Composable
 fun MainText(){
    LazyColumn(modifier = Modifier
        .border(1.dp, Color.Black, shape = RoundedCornerShape(8.dp))
        .height(600.dp)
        .width(500.dp)
        .fillMaxHeight()
        .background(Color(0xFFf2f2f2)),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        items(count = 1){
            Text(
                text = "We go over this topic in-depth in our guide on how to create a privacy policy but the TL;DR version is that your basic privacy policy should cover the following details: \n" +
                        "\n" +
                        "Your contact information\n" +
                        "User data collection and the purposes behind it\n" +
                        "Data processing, storage, and sharing\n" +
                        "Data retention and deletion\n" +
                        "Your users’ data rights and how they can exercise them\n" +
                        "How to submit a complaint\n" +
                        "Details of any changes to the policy document\n" +
                        "An affiliate disclaimer\n" +
                        "A legal disclaimer\n" +
                        "A past performance disclaimer if you manage things like banking & financial services\n" +
                        "This isn’t an exhaustive list. If your website visitors include children, for example, you’ll also need to include a disclaimer on children’s rights and what this means for both children and parents. In areas where California’s CCPA applies, you’ll need a section that covers the sale of data and how to opt-out. Our basic disclaimer template points you in the right direction and its customizability helps you with the specific sections you need.",
                modifier = Modifier
                    .padding(15.dp),
                textAlign = TextAlign.Start,




                )
        }
    }
 }


@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    Privacy_policyscreenTheme {
        MainView()
    }
}