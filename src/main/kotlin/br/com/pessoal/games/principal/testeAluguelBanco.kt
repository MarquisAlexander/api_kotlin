package br.com.pessoal.games.principal

import br.com.pessoal.games.dados.AluguelDAO
import br.com.pessoal.games.dados.Banco
import br.com.pessoal.games.dados.GamersDAO
import br.com.pessoal.games.dados.JogosDAO
import br.com.pessoal.games.modelo.Periodo

fun main() {
    val manager = Banco.getEntityManager()
    val jogoDAO = JogosDAO(manager)
    val gamerDAO = GamersDAO(manager)
    val aluguelDAO = AluguelDAO(manager)

    val gamer = gamerDAO.recuperarPeloId(1)
    val jogo = jogoDAO.recuperarPeloId(3)
    val aluguel = gamer.alugaJogo(jogo, Periodo())

    aluguelDAO.adicionar(aluguel)

    val listaAluguel = aluguelDAO.getLista()
    println(listaAluguel)

    manager.close()
}