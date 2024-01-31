package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentManager = supportFragmentManager
        val fragmentFirst = FragmentFirst()

        // Transaction
        // - 작업의 단위 -> 시작과 끝이 있다
        // A, B, C, D
        (findViewById<TextView>(R.id.add)).setOnClickListener {
            val transaction = fragmentManager.beginTransaction() // 시작
            transaction.replace(R.id.root, fragmentFirst)
            transaction.commit() // 끝
        }

        (findViewById<TextView>(R.id.add)).setOnClickListener {

        }
        // Commit
        // 1> commit
        // 2> commiAllowingStateLoss
        // 3> commitNow
        // 4> commitNowAllowingStateLoss
        // - 상태손실을 허락한다
        // - onStop, lifecycle 또는 os에 의해서 앱이 상태를 저장해야 할 수 있다
        // - 상태저장 : onSaveInstanceState
        // commit - commitNow(Now)

    }
}