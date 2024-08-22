package com.example.bank_login_page

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bank_login_page.ui.theme.BankloginpageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankloginpageTheme {
                LonginScreen()
            }
        }
    }
}


@SuppressLint("ResourceType")
@Composable
fun LonginScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp),
    ) {
        Spacer(modifier =Modifier.padding(all = 20.dp) )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.bm_icon),
                contentDescription = "Bank Misr Icon",
            )

            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = stringResource(R.string.language),
                    color = Color(0xFF812B10),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

            }

        }

        Spacer(modifier =Modifier.padding(all = 10.dp) )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(R.string.username), color = Color.Gray) },
            placeholder = { Text(text = stringResource(R.string.username1), color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
            )
        Spacer(modifier =Modifier.padding(all = 10.dp) )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.baseline_remove_red_eye_24),
                    contentDescription = "Password",
                )
            },
            label = { Text(text = stringResource(R.string.password), color = Color.Gray) },
            placeholder = { Text(text = stringResource(R.string.password1), color = Color.Gray) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),

        )
        Spacer(modifier =Modifier.padding(all = 10.dp) )
        Text(
            text = stringResource(R.string.forgot_username_password),
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )

        Spacer(modifier =Modifier.padding(all = 18.dp) )

        Button(
            onClick = { },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color(0x57812B10))
        )
         {
            Text(stringResource(R.string.login))
        }

        Spacer(modifier =Modifier.padding(all = 14.dp) )

        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = stringResource(R.string.need_help),
                modifier = Modifier.padding( end =4.dp),
            )

            Text(
                text = stringResource(R.string.contant_us),
                textDecoration = TextDecoration.Underline,
                color = Color(0xFF812B10),
            )
        }

        Spacer(modifier =Modifier.padding(all = 28.dp) )

        Divider(
            color = Color.LightGray,
            thickness = 2.dp,
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier.weight(1f) // Make all columns equal width
            ) {
                Image(
                    painter = painterResource(id = R.drawable.our_products),
                    contentDescription = "Bank Misr Icon",
                )
                Text(text = stringResource(R.string.our_products),
                    fontSize =14.sp,
                    )
            }

            Column(
                modifier = Modifier.weight(1f) // Make all columns equal width
            ) {
                Image(
                    painter = painterResource(id = R.drawable.exchange_rate),
                    contentDescription = "Bank Misr Icon",
                )
                Text(text = stringResource(R.string.exchange_rate),
                    fontSize =14.sp,
                    )
            }

            Column(
                modifier = Modifier.weight(1f) // Make all columns equal width
            ) {
                Image(
                    painter = painterResource(id = R.drawable.security_tips),
                    contentDescription = "Bank Misr Icon",
                )
                Text(text = stringResource(R.string.security_tips),
                    fontSize =14.sp,
                    )
            }

            Column(
                modifier = Modifier.weight(1f) // Make all columns equal width
            ) {
                Image(
                    painter = painterResource(id = R.drawable.nearest_branch_or_atm),
                    contentDescription = "Bank Misr Icon",
                )
                Text(text = stringResource(R.string.nearest_branch_or_atm),
                    fontSize =14.sp,
                    )
            }
        }
    }

    }


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Loginpreview() {
    LonginScreen()
}
