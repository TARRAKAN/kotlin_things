package com.example.tetris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tetris.storage.AppPreferences

class GameActivity : AppCompatActivity() {
    private var tvHighScore: TextView? = null
    private var tvCurrentScore: TextView? = null
    private var appPreferences: AppPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        appPreferences = AppPreferences(this)

        var btnRestart = findViewById<Button>(R.id.btn_restart)
        tvHighScore = findViewById(R.id.tv_high_score)
        tvCurrentScore = findViewById(R.id.tv_current_score)

        updateHighScore()
        updateCurrentScore()
    }

    private fun updateHighScore(){
        tvHighScore?.text = "${appPreferences?.getHighScore()}"
    }

    private fun updateCurrentScore(){
        tvCurrentScore?.text = "0"
    }
}