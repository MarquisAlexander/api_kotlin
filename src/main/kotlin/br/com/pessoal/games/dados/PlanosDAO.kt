package br.com.pessoal.games.dados

import PlanoAssinaturaEntity
import PlanoAvulsoEntity
import PlanoEntity
import br.com.pessoal.games.modelo.Plano
import br.com.pessoal.games.modelo.PlanoAssinatura
import br.com.pessoal.games.modelo.PlanoAvulso
import br.com.pessoal.games.utilitario.toEntity
import br.com.pessoal.games.utilitario.toModel
import javax.persistence.EntityManager

class PlanosDAO(manager: EntityManager) : DAO<Plano, PlanoEntity>(manager, PlanoEntity::class.java) {
    override fun toEntity(plano: Plano): PlanoEntity {
        return plano.toEntity()
    }

    override fun toModel(entity: PlanoEntity): Plano {
        return entity.toModel()
    }
}