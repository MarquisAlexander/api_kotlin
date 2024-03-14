package br.com.pessoal.games.principal

import br.com.pessoal.games.dados.Banco

fun main() {
    val conexao = Banco.obterConexao()
    println(conexao)
}