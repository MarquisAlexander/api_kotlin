package br.com.pessoal.games.modelo

interface Recomendavel {
    val media: Double

    fun recomendar(nota: Int)
}