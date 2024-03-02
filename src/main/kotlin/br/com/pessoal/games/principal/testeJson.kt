package br.com.pessoal.games.principal

import br.com.pessoal.games.servicos.ConsumoApi

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscaJogosJson()

    val gamerCaroline = listaGamers.get(3)
    val jogoResidentVillage = listaJogoJson.get(10)

    println(gamerCaroline)
    println(jogoResidentVillage)

    val aluguel = gamerCaroline.alugaJogo(jogoResidentVillage)
    println(aluguel)
}