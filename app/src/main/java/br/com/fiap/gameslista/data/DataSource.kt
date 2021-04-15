package br.com.fiap.gameslista.data

import br.com.fiap.gameslista.R
import br.com.fiap.gameslista.model.Game

class DataSource {

    fun carregarGames ():List<Game>{
        return listOf<Game>(

            Game(R.drawable.csgo, R.string.counter_strike, R.string.plataforma, R.string.nota),
            Game(R.drawable.csgo, R.string.counter_strike, R.string.plataforma, R.string.nota),
            Game(R.drawable.csgo, R.string.counter_strike, R.string.plataforma, R.string.nota),
            Game(R.drawable.csgo, R.string.counter_strike, R.string.plataforma, R.string.nota),
            Game(R.drawable.csgo, R.string.counter_strike, R.string.plataforma, R.string.nota),
            Game(R.drawable.csgo, R.string.counter_strike, R.string.plataforma, R.string.nota)
        )
    }
}