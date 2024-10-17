package com.example.textviewkt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.textviewkt.ui.theme.TextViewKtTheme
import android.widget.TextView // TextView를 가져오고
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초 실행되었을 때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // xml 화면 뷰를 연결한다.

        val tv_title = findViewById<TextView>(R.id.tv_title) // id값으로 가져와서 선언하고
        tv_title.setText("Hello World!") // 텍스트를 변경해준다.


    }
}