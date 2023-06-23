package org.bmsk.catalogapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.bmsk.catalogapp.ui.theme.CatalogAppTheme

@Composable
fun BoxEx() {
    // Box 자체를 만들기 위해 사용하거나 안드로이드 프레임워크에 있는 프레임 레이아웃과 같이 중첩시키는 용도로 사용
//    Box(modifier = Modifier.size(100.dp)) {
//        Text(
//            text = "Hello World",
//            modifier = Modifier.align(Alignment.BottomEnd)
//        )
//    }

    // 1. Text 두개를 Box 안에 배치.
//    Box(modifier = Modifier.size(100.dp)) {
//        Text(
//            text = "Hello World",
//            modifier = Modifier.align(Alignment.BottomEnd)
//        )
//        Text(
//            text = "Jetpack",
//            modifier = Modifier.align(Alignment.CenterEnd)
//        )
//        Text(
//            text = "Compose",
//            modifier = Modifier.align(Alignment.TopStart)
//        )
//    }
    // 2. 2개의 Box를 Box 안에 배치하고 사이즈를 70dp, 색상을 각기 다르게 한다.
//    Box(modifier = Modifier.size(100.dp)) {
//        Box(
//            modifier = Modifier
//                .size(70.dp)
//                .background(Color.Cyan)
//                .align(Alignment.CenterStart)
//        )
//        Box(
//            modifier = Modifier
//            .size(70.dp)
//            .background(Color.Yellow)
//            .align(Alignment.BottomEnd))
//    }
    // 3. 부모 Box에 modifier 설정을 제거해서 콘텐트 사이즈만큼 보여주게 한다.
    Box {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)
                .align(Alignment.CenterStart)
        )
        Box(
            modifier = Modifier
                .size(70.dp)
                .background(Color.Yellow)
                .align(Alignment.Center)
        )
    }
    // 첫번째 자식 Box의 사이즈를 matchParentSize()로 설정
    // 다음에는 fillMaxSize()로 설정
}

@Preview
@Composable
fun BoxExPreview() {
    CatalogAppTheme {
        BoxEx()
    }
}