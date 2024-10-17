package com.example.intentkt

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentkt.databinding.ActivityMainBinding // View Binding을 사용하기 위해 import
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View Binding 사용
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener{
            // var : 변수 값이 언제든지 변경 될 수 있음.
            // val : 자바에서는 final 값이 변경되지 못하는 변수

            val intent = Intent(this, SubActivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성
            intent.putExtra("msg", binding.tvSendMsg.text.toString()) // "HelloWorld라는 텍스트 값을 담은 뒤 msg라는 키로 잠궜다.
            startActivity(intent)   // intent에 저장되어있는 액티비티 쪽으로 이동한다.
            finish()                // 자기 자신 액티비티를 파괴한다.

        }

    }
}