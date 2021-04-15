package br.com.fiap.gameslista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import br.com.fiap.gameslista.adapter.ItemAdapter
import br.com.fiap.gameslista.data.DataSource
import br.com.fiap.gameslista.databinding.ActivityListaGamesBinding
import br.com.fiap.gameslista.databinding.ActivityMainBinding
import br.com.fiap.gameslista.databinding.ActivityListaGamesBinding.inflate

class ListaGamesActivity : AppCompatActivity() {

    lateinit var binding: ActivityListaGamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListaGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataset = DataSource().carregarGames()
        binding.recyclerListaGame.adapter = ItemAdapter(this, dataset)


        binding.btadd.setOnClickListener{
            val intent = Intent(this, CadastrarGameActivity::class.java)
            startActivity(intent)
        }
    }
}