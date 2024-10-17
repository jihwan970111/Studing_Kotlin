package com.example.listviewkt

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "박지환", "27", "안녕하세요"),
        User(R.drawable.android, "김도경", "59", "안녕하신가요"),
        User(R.drawable.android, "김정서", "26", "안녕안녕"),
        User(R.drawable.android, "한윤호", "28", "안녕하겠냐"),
        User(R.drawable.android, "윤건희", "28", "예"),
        User(R.drawable.android, "박지환", "27", "안녕하세요"),
        User(R.drawable.android, "김도경", "59", "안녕하신가요"),
        User(R.drawable.android, "김정서", "26", "안녕안녕"),
        User(R.drawable.android, "한윤호", "28", "안녕하겠냐"),
        User(R.drawable.android, "윤건희", "28", "예"),
        User(R.drawable.android, "박지환", "27", "안녕하세요"),
        User(R.drawable.android, "김도경", "59", "안녕하신가요"),
        User(R.drawable.android, "김정서", "26", "안녕안녕"),
        User(R.drawable.android, "한윤호", "28", "안녕하겠냐"),
        User(R.drawable.android, "윤건희", "28", "예")
    )

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View Binding 사용
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val item = arrayOf("사과", "배", "딸기", "키위", "박지환")
//        // context란 한 액티비티의 모든 정보를 담고있다.
//        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = UserAdapter(this, UserList)
        binding.listView.adapter = Adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }
    }
}