package org.bmsk.catalogapp

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.bmsk.catalogapp.ui.theme.CatalogAppTheme


@Composable
fun Outer() {
    // 4. Columm에 width를 지정해서 제한
    Column(modifier = Modifier.width(150.dp)) {
        // 2. Inner의 인자로 Modifier.widthIn(min = 100.dp)를 전달
        // 2-1. heightIn도 전달.
        // 2-2. 각각 인자의 max 값도 전달
        Inner(
            modifier = Modifier
                .width(200.dp)
                .height(160.dp)
        )
        Inner(
            modifier = Modifier
                .width(200.dp)
                .height(100.dp)
        )
    }
}

// 1. Inner 인자로 modifier를 전달.
// 기본 값을 Modifier로 지정
// 파라미터로 받은 modifier를 BoxWithConstrains에 전달
@Composable
private fun Inner(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier = modifier) {
        // 3. maxHeight 값이 150dp가 넘을 때만 추가로 텍스트를 출력
        if (maxHeight > 150.dp) {
            Text(
                text = "여기 꽤 길군요",
                modifier = Modifier.align(
                    Alignment.BottomCenter
                )
            )
        }
        Text("maxW:$maxWidth maxH:$maxHeight minW:$minWidth minH:$minHeight")
    }
}

@Preview(showBackground = true)
@Composable
fun InnerPreview() {
    CatalogAppTheme {
        Inner()
    }
}

@Preview(showBackground = true)
@Composable
fun OuterPreview() {
    CatalogAppTheme {
        Outer()
    }
}