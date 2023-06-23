package org.bmsk.catalogapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import org.bmsk.catalogapp.ui.theme.CatalogAppTheme

@Composable
fun ProfileCardEx(cardData: CardData) {
    val placeHolderColor = Color(0x33000000)

    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            // 1. `AsyncImage`, `Spacer`, `Column`, `Text`로 레이아웃을 만든다.
//            AsyncImage(
//                model = cardData.imageUri,
//                contentDescription = cardData.imageDescription,
//                modifier = Modifier.size(32.dp)
//            )
//            Spacer(modifier = Modifier.size(8.dp))
//            Column {
//                Text(text = cardData.author)
//                Spacer(modifier = Modifier.size(4.dp))
//                Text(text = cardData.description)
//            }

            // 2. `AsyncImage`에는 `placeholder`를 지정하고,
            // `contentScale`을 `ContentScale.Crop`으로 설정한다.
            // `clip(CircleShape)`로 둥근 외양을 만들어 본다.
            AsyncImage(
                model = cardData.imageUri,
                contentScale = ContentScale.Crop,
                contentDescription = cardData.imageDescription,
                placeholder = ColorPainter(placeHolderColor),
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.size(8.dp))
            Column {
                Text(text = cardData.author)
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = cardData.description)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardExPreview() {
    val cardData = CardData(
        imageUri = "https://picsum.photos/200/300",
        imageDescription = "random image",
        author = "bmsk",
        description = "픽숨 랜덤 이미지입니다."
    )

    CatalogAppTheme {
        Column {
            ProfileCardEx(cardData)
            ProfileCardEx(cardData)
        }
    }
}

data class CardData(
    val imageUri: String,
    val imageDescription: String,
    val author: String,
    val description: String
)