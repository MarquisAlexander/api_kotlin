package br.com.pessoal.games.principal

import br.com.pessoal.games.servicos.ConsumoApi

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val jogoApi = consumo.buscaJogo("151")

    println(jogoApi)
    println(listaGamers)
}