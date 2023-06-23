package org.bmsk.catalogapp

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.bmsk.catalogapp.ui.theme.CatalogAppTheme


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    // 1.
// Text(color = Color.Red, text = "Hello $name")

    // 2.
// Text(color = Color(0xffff9944), text = "Hello $name")

    // 3.
// Text(text = "Hello $name!", color = Color.Red, fontSize = 30.sp)

    // 4.
// Text(color = Color.Red, text = "Hello $name", fontSize = 30.sp, fontWeight = FontWeight.Bold)

    // 5.
//    Text(
//        color = Color.Red,
//        text = "Hello $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//    )

    // 6.
//    Text(
//        color = Color.Red,
//        text = "Hello $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        letterSpacing = 2.sp
//    )

    // 7.
//    Text(
//        color = Color.Red,
//        text = "Hello $name\nHello $name\nHello $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        maxLines = 2
//    )

    // 8.
//    Text(
//        color = Color.Red,
//        text = "Hello $name\nHello $name\nHello $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        maxLines = 2,
//        textDecoration = TextDecoration.Underline
//    )

    // 9.
    Text(
        modifier = Modifier.size(300.dp),
        color = Color.Red,
        text = "Hello $name\nHello $name\nHello $name",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        maxLines = 2,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CatalogAppTheme {
        Greeting("Android")
    }
}