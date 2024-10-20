package com.example.intentkt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentkt.databinding.ActivitySubBinding // View Binding을 사용하기 위해 import
class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        // View Binding 사용
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("msg")) // intent에 msg라는 key값이 존재한다면
        {
            binding.tvGetMsg.text = intent.getStringExtra("msg") // 서브 액티비티에 존재하는 텍스트뷰에다가 HelloWorld가 넘겨져 온다.
        }
    }
}