package com.example.edittextkt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.edittextkt.databinding.ActivityMainBinding // View Binding을 사용하기 위해 import
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티가 최고 실행 되면 이곳을 수행한다.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View Binding 사용
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 이제 findViewById 없이 View Binding으로 직접 사용 가능
        binding.btnGetText.setOnClickListener {
            val resultText = binding.etId.text.toString()
            binding.tvResult.text = resultText
        }
    }
}