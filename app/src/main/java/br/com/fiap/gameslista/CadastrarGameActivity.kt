package br.com.fiap.gameslista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.gameslista.databinding.ActivityCadastrarGameBinding

class CadastrarGameActivity : AppCompatActivity() {

    lateinit var binding: ActivityCadastrarGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_game)

        binding = ActivityCadastrarGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCadastrar.setOnClickListener{
            val intent = Intent(this, ListaGamesActivity::class.java)
            startActivity(intent)
        }
    }
}