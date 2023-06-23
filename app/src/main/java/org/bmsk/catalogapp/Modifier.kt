package org.bmsk.catalogapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
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
fun ModifierEx() {
//    Button(onClick = {}) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search")
//    }

    // 1. modifier에 Modifier.fillMaxSize()를 사용
//    Button(
//        onClick = {},
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search")
//    }

    // 2. fillMaxSize 대신 Modifier.height를 설정
//    Button(
//        onClick = {},
//        modifier = Modifier.height(100.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search")
//    }

    // 3. modifier에 height와 width를 같이 설정
//    Button(
//        onClick = {},
//        modifier = Modifier
//            .height(100.dp)
//            .width(200.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search")
//    }

    // 4. size에 width와 height를 인자로 넣을 수도 있다.
//    Button(
//        onClick = {},
//        modifier = Modifier.size(200.dp, 100.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search")
//    }

    // 5. background를 설정. (버튼에서는 되지 않는다)
//    Button(
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp, 100.dp)
//            .background(Color.Red)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search")
//    }

    // 6. colors 파라미터에 ButtonDefaults.buttonColors를 넣는다.
    // containerColor와 contentColor 프로퍼티를 설정한다.
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Red,
//            contentColor = Color.Cyan
//        ),
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp, 100.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search")
//    }

    // 7. Button의 modifier에 padding을 추가한다.
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Red,
//            contentColor = Color.Cyan
//        ),
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp, 100.dp)
//            .padding(10.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search")
//    }

    // 8. Button에 enabled를 false로 설정하고,
    // Text의 modifier에 clickable을 넣어본다.
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Red,
//            contentColor = Color.Cyan
//        ),
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp, 100.dp),
//        enabled = false,
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text("Search",
//            modifier = Modifier.clickable {
//
//            })
//    }

    // 9. Text의 modifier에 offset을 설정하고 x 파라미터를 설정
    // x = 10.dp일 때 오른쪽으로 약간 이동한 것을 볼 수 있다.
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            contentColor = Color.Cyan
        ),
        onClick = {},
        modifier = Modifier
            .size(200.dp, 100.dp),
        enabled = false,
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
            modifier = Modifier.background(Color.Blue)
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(
            "Search",
            modifier = Modifier.offset(x = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ModifierExPreview() {
    CatalogAppTheme {
        ModifierEx()
    }
}