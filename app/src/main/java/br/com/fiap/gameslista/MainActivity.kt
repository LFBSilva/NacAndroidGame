package br.com.fiap.gameslista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    private val splashtimeout = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this@MainActivity, ListaGamesActivity::class.java)
            startActivity(i)
            finish()
        }, splashtimeout)
    }
}