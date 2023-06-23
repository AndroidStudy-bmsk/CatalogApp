package org.bmsk.catalogapp

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import org.bmsk.catalogapp.ui.theme.CatalogAppTheme

@Composable
fun CoilEx() {
    // rememberImagePainter를 이용해 Image의 painter를 설정한다.
//    val painter = rememberImagePainter(data = "https://picsum.photos/200/300")
//    Image(painter = painter, contentDescription = "picsum random image")

    // AsyncImage를 이용한다. model에 주소를 적으면 된다.
    Column {
        AsyncImage(
            model = "https://picsum.photos/200/300",
            contentDescription = "picsum random image"
        )
        AsyncImage(
            model = "https://picsum.photos/200/300",
            contentDescription = "picsum random image"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CoilExPreview() {
    CatalogAppTheme {
        CoilEx()
    }
}