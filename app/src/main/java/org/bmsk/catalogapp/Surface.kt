package org.bmsk.catalogapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.bmsk.catalogapp.ui.theme.CatalogAppTheme

// Surface는 뒤에 터치를 전달하지 않는다.
// Jetpack compose 모델은 마진이 아니라 패딩만 존재
@Composable
fun SurfaceEx(name: String = "bmsk") {
//    Surface(
//        color = MaterialTheme.colorScheme.onSurface,
//        modifier = Modifier.padding(5.dp)
//    ) {
//        // 텍스트에 5dp 마진을 설정하는 것이 아니라, 위의 surface에 5dp의 패딩을 설정한다.
//        // 이는 성능을 위한 결정
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 1. Surface에 elevation을 설정. 입체감을 넣을 수 있다.
//    Surface(
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 20.dp
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 2. border의 값을 설정.
//    Surface(
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 20.dp,
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Magenta
//        )
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 3. Surface의 shape도 설정.
//    Surface(
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 20.dp,
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Magenta
//        ),
//        shape = CircleShape
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 4. color를 지정
    // MaterialTheme.colors에서 primary, error,
    // background, surface, secondary 등을 지정
    // contentColor가 자동으로 선택된다.
    Surface(
        modifier = Modifier.padding(5.dp),
        shadowElevation = 20.dp,
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta
        ),
        shape = CircleShape,
        color = MaterialTheme.colorScheme.secondary
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SurfaceExPreview() {
    CatalogAppTheme {
        SurfaceEx()
    }
}