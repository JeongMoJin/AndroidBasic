package com.example.fastcampus

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class AsnycActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asnyc)

        val backgoundTask = BackgoundAsyncTask(
            findViewById(R.id.progressBar),
            findViewById(R.id.progressBarText))

        findViewById<TextView>(R.id.start).setOnClickListener {
            backgoundTask.execute()
        }

        findViewById<TextView>(R.id.stop).setOnClickListener {
            backgoundTask.cancel(true)
        }
        findViewById<TextView>(R.id.shot).setOnClickListener {
            Log.d("testt","SHOT!!!")
        }
    }
}

class BackgoundAsyncTask(
    val progressbar: ProgressBar,
    val progressText: TextView
):AsyncTask<Int,Int,Int>() {
    // Params, Progress, Result

    // params -> doInbackground에서 사용할 타입
    // progress -> onProgressUpdate에서 사용할 타입
    // result -> onPostExcute에서 사용할 타입

    // deprecated -> 더 이상 사용을 권장하지 않는다
    // 코루틴 -> 멀티 태스킹, 동기/비동기 처리

    var percent:Int = 0
    override fun doInBackground(vararg p0: Int?): Int {
        while(isCancelled() == false) {
            percent++
            if (percent > 100) break
            else{
                Log.d("testt", "" + percent)
                publishProgress(percent)
            }
            Thread.sleep(100)
        }
        return percent
    }

    override fun onPreExecute() {
        percent = 0
        progressbar.setProgress(percent)
    }

    override fun onPostExecute(result: Int?) {
        progressText.text = "작업이 완료되었습니다"
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)
        progressbar.setProgress(values[0] ?: 0)
        progressText.text = "퍼센트 : " + values[0]
    }

    override fun onCancelled(result: Int?) {
        progressbar.setProgress(0)
        progressText.text="작업이 취소되었습니다"
    }

    override fun onCancelled() {
        super.onCancelled()
    }
}