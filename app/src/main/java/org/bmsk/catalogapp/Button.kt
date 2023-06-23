package org.bmsk.catalogapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.bmsk.catalogapp.ui.theme.CatalogAppTheme


@Composable
fun ButtonExample(onButtonClicked: () -> Unit) {
//    Button(onClick = onButtonClicked) {
//        Text(text = "Send")
//    }

    // 2. Icon을 Text 앞에 추가
    Button(onClick = onButtonClicked) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Text(text = "Send")
    }

    // 3. 아이콘과 텍스트 사이에 Spacer를 넣어준다.
    // modifier에 Modifier.size를 넣고 사이즈를
    // ButtonDefaults.IconSpacing으로 지정한다.
//    Button(onClick = onButtonClicked) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }

    // 4. enabled를 false로 바꾸기.
    Button(
        onClick = onButtonClicked,
        enabled = false
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }

    // 5. border에 BorderStroke를 설정
//    Button(
//        onClick = onButtonClicked,
//        enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }

    // 6. shape를 CircleShape로 지정한다.
//    Button(
//        onClick = onButtonClicked,
//        enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta),
//        shape = CircleShape
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Send,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }

    // 7. contentPadding에 PaddingValues를 설정.
    Button(
        onClick = onButtonClicked,
        enabled = true,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = CircleShape,
        contentPadding = PaddingValues(20.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    CatalogAppTheme {
        ButtonExample {}
    }
}