package com.stormcorgi.omikuji

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val fortunes = listOf(
        "大吉", "中吉", "小吉", "吉", "末吉", "凶", "大凶"
    )

    private val fortuneColors = mapOf(
        "大吉" to Color.rgb(255, 215, 0),
        "中吉" to Color.RED,
        "小吉" to Color.BLUE,
        "吉" to Color.GREEN,
        "末吉" to Color.GRAY,
        "凶" to Color.rgb(139, 0, 0),
        "大凶" to Color.BLACK
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultTextView = findViewById<TextView>(R.id.result)
        val drawButton = findViewById<Button>(R.id.btn_draw)

        drawButton.setOnClickListener {
            val fortune = fortunes[Random.nextInt(fortunes.size)]
            val color = fortuneColors[fortune] ?: Color.BLACK
            resultTextView.text = fortune
            resultTextView.setTextColor(color)
            resultTextView.textSize = 48f
        }
    }
}
