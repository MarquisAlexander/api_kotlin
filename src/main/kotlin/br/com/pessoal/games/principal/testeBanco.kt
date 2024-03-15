package br.com.pessoal.games.principal

import br.com.pessoal.games.dados.Banco
import org.example.br.com.pessoal.games.modelo.Jogo

fun main() {
    val conexao = Banco.obterConexao()

    val listaJogos: List<Jogo> = Banco.getJogos()
    println(listaJogos)
}