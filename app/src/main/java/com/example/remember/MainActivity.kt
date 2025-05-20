package com.example.remember

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.home_work_relativelayouttogglebuttonscrollview.Database

class MainActivity : AppCompatActivity() {
    private lateinit var textTV: TextView
    private lateinit var textTV1: TextView
    private lateinit var loadingBTN: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        textTV = findViewById(R.id.textTV)
        textTV1 = findViewById(R.id.textTV1)
        loadingBTN = findViewById(R.id.loadingBTN)
        loadingBTN.setOnClickListener {
            val book = loadBook(Database().text.toString())
            for (i in book) {
                textTV.append("$i ").toString()
            }
            val book1 = loadBook(Database().text1.toString())
            for (i in book1) {
                textTV1.append("$i ").toString()
            }
        }
    }

    private fun loadBook(string: String): MutableList<String> {
        return string.split(" ") as MutableList<String>
    }
}





