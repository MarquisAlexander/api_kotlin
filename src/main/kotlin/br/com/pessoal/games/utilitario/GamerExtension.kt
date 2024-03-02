package br.com.pessoal.games.utilitario

import br.com.pessoal.games.modelo.Gamer
import br.com.pessoal.games.modelo.InfoGamerJson

fun InfoGamerJson.criaGamer(): Gamer {
    return Gamer(this.nome, this.email, this.dataNascimento, this.usuario)
}