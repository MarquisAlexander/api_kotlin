package br.com.pessoal.games.utilitario

import br.com.alura.alugames.modelo.InfoJogoJson
import br.com.pessoal.games.dados.JogoEntity
import org.example.br.com.pessoal.games.modelo.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}

fun Jogo.toEntity(): JogoEntity {
    return JogoEntity(this.titulo, this.capa, this.preco, this.descricao, this.id)
}

fun JogoEntity.toModel(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao.toString(), this.id)
}
