package com.example.imageviewkt

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.imageviewkt.databinding.ActivityMainBinding // View Binding을 사용하기 위해 import
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View Binding 사용
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener{
            binding.ivProfile.setImageResource(R.drawable.robot) // 이미지 뷰에 새로운 이미지 등록
            Toast.makeText(this@MainActivity, "버튼이 클릭 되었습니다", Toast.LENGTH_SHORT).show()
        }
    }
}