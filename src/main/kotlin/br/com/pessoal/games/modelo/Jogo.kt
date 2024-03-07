package org.example.br.com.pessoal.games.modelo

import br.com.pessoal.games.modelo.Recomendavel
import com.google.gson.annotations.Expose

data class Jogo(@Expose val titulo: String, @Expose val capa: String) : Recomendavel {
    var descricao: String? = null
    var preco = 0.0
    private val listaNotas = mutableListOf<Int>()

    override val media: Double
        get() = listaNotas.average()

    override fun recomendar(nota: Int) {
        if (nota < 1 || nota > 10) {
            println("A nota $nota é inválida. Insira uma nota entre 1 e 10")
        } else {
            listaNotas.add(nota)
        }
    }

    constructor(titulo: String, capa: String, preco: Double, descricao: String) : this(titulo, capa) {
        this.preco = preco
        this.descricao = descricao
    }

    override fun toString(): String {
        return "Jogo: \n" +
                "Titulo: $titulo \n" +
                "Capa: '$capa \n" +
                "Descricao: $descricao \n" +
                "Preço: $preco \n" +
                "Reputação: $media \n"
    }
}