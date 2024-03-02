package br.com.pessoal.games.utilitario

import br.com.alura.alugames.modelo.InfoJogoJson
import org.example.br.com.pessoal.games.modelo.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}
