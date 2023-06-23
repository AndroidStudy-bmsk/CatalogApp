package org.bmsk.catalogapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import org.bmsk.catalogapp.ui.theme.CatalogAppTheme

@Composable
fun ImageEx() {
    Column {
        // 1: Image를 만든다.
        // painter 항목에 painterResource(id = R.drawable.wall)
        // contentDescription에 엔텔로프 캐니언이라고 넣는다.
        Image(
            painter = painterResource(id = R.drawable.wall),
            contentDescription = "엔텔로프 캐니언"
        )
        // 2: 두 번째 Image를 만든다.
        // imageVector에 Icons.Filled.Settings를 설정한다.
        Image(
            imageVector = Icons.Filled.Settings,
            contentDescription = "세팅"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ImageExPreview() {
    CatalogAppTheme {
        ImageEx()
    }
}