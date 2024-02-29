package org.example.br.com.pessoal.games.modelo

data class Jogo(val titulo: String, val capa: String) {
    var descricao: String? = null
    override fun toString(): String {
        return "Jogo: \n" +
                "Titulo: $titulo \n" +
                "Capa: '$capa \n" +
                "Descricao: $descricao"
    }
}