package com.example.fastcampus

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class AsnycActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asnyc)
    }
}

class BackgoundAsyncTask(
    val prgressbar: ProgressBar,
    val ProgressText: TextView
):AsyncTask<Int,Int,Int>() {
    // Params, Progress, Result
    // deprecated -> 더 이상 사용을 권장하지 않는다
    // params -> doInbackground에서 사용할 타입
    // 코루틴 -> 멀티 태스킹, 동기/비동기 처리

    override fun doInBackground(vararg p0: Int?): Int {
        TODO("Not yet implemented")
    }

    override fun onPreExecute() {
        super.onPreExecute()
    }

    override fun onPostExecute(result: Int?) {
        super.onPostExecute(result)
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)
    }

    override fun onCancelled(result: Int?) {
        super.onCancelled(result)
    }

    override fun onCancelled() {
        super.onCancelled()
    }
}