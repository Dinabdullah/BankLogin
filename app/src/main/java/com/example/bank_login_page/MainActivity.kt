package com.example.bank_login_page

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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

@Composable
fun LonginScreen() {
    val userNameVal = remember { mutableStateOf("") }
    val passwordVal = remember { mutableStateOf("") }
    val passwordVisibality = remember { mutableStateOf(false) }
    val buttonEnabled = remember { mutableStateOf(false) }
    val isButtonEnabled = { userNameVal.value.isNotEmpty() && passwordVal.value.isNotEmpty() }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(18.dp),
    ) {
        Spacer(modifier = Modifier.padding(all = 20.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.bm_icon),
                contentDescription = "Bank Misr Icon",
            )

            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = stringResource(R.string.language),
                    color = Color(0xFFC04141),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

            }

        }

        Spacer(modifier = Modifier.padding(all = 10.dp))
        OutlinedTextField(

            value = userNameVal.value,
            onValueChange = {
                userNameVal.value = it
                buttonEnabled.value =
                    userNameVal.value.isNotEmpty() && passwordVal.value.isNotEmpty()
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                focusedBorderColor = Color.Black,
                unfocusedTextColor = Color.Black
            ),
            label = { Text(text = stringResource(R.string.username), color = Color.Gray) },
            placeholder = { Text(text = stringResource(R.string.username1), color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
        )
        Spacer(modifier = Modifier.padding(all = 10.dp))

        OutlinedTextField(
            value = passwordVal.value,
            onValueChange = {
                passwordVal.value = it
                buttonEnabled.value =
                    userNameVal.value.isNotEmpty() && passwordVal.value.isNotEmpty()
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                focusedBorderColor = Color.Black,
                unfocusedTextColor = Color.Black
            ),
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibality.value = !passwordVisibality.value
                }) {
                    if (passwordVisibality.value) {
                        Icon(
                            painter = painterResource(R.drawable.baseline_remove_red_eye_24), // Replace with your eye-off icon resource
                            contentDescription = "Hide password",
                            tint = Color.Gray
                        )
                    } else {
                        Icon(
                            painter = painterResource(R.drawable.baseline_visibility_off_24),
                            contentDescription = "Show password",
                            tint = Color.Gray
                        )
                    }
                }


            },
            label = { Text(text = stringResource(R.string.password), color = Color.Gray) },
            placeholder = { Text(text = stringResource(R.string.password1), color = Color.Gray) },
            visualTransformation =
            if (passwordVisibality.value) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),

            )
        Spacer(modifier = Modifier.padding(all = 10.dp))
        Text(
            text = stringResource(R.string.forgot_username_password),
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.padding(all = 18.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                if (isButtonEnabled()) Color(0xFFC04141)
                else Color(0x57812B10)
            )
        )
        {
            Text(
                stringResource(R.string.login),
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.padding(all = 14.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = stringResource(R.string.need_help),
                modifier = Modifier.padding(end = 4.dp),
            )

            Text(
                text = stringResource(R.string.contant_us),
                textDecoration = TextDecoration.Underline,
                color = Color(0xFFC04141),
            )
        }

        Spacer(modifier = Modifier.padding(all = 20.dp))

        Divider(
            color = Color.LightGray,
            thickness = 2.dp,
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.our_products),
                    contentDescription = "Bank Misr Icon",
                )
                Text(
                    text = stringResource(R.string.our_products),
                    fontSize = 10.sp,
                )
            }

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.exchange_rate),
                    contentDescription = "Bank Misr Icon",
                )
                Text(
                    text = stringResource(R.string.exchange_rate),
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.security_tips),
                    contentDescription = "Bank Misr Icon",
                )
                Text(
                    text = stringResource(R.string.security_tips),
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.nearest_branch_or_atm),
                    contentDescription = "Bank Misr Icon",
                )
                Text(
                    text = stringResource(R.string.nearest_branch_or_atm),
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}


@Preview(showSystemUi = true, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun Loginpreview() {
    LonginScreen()
}
