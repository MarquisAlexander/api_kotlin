package br.com.pessoal.games.utilitario

import PlanoAssinaturaEntity
import PlanoAvulsoEntity
import PlanoEntity
import br.com.pessoal.games.modelo.Plano
import br.com.pessoal.games.modelo.PlanoAssinatura
import br.com.pessoal.games.modelo.PlanoAvulso

fun Plano.toEntity(): PlanoEntity {
    return if (this is PlanoAssinatura) {
        PlanoAssinaturaEntity(
            this.tipo,
            this.mensalidade,
            this.jogosIncluidos,
            this.percentualDescontoReputacao,
            this.id
        )
    } else {
        PlanoAvulsoEntity(this.tipo, this.id)
    }
}

fun PlanoEntity.toModel(): Plano {
    return if (this is PlanoAssinaturaEntity) {
        PlanoAssinatura(
            this.tipo,
            this.mensalidade,
            this.jogosIncluidos,
            this.percentualDescontoReputacao,
            this.id
        )
    } else {
        PlanoAvulso(this.tipo, this.id)
    }
}