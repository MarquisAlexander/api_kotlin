package br.com.pessoal.games.dados

import br.com.pessoal.games.utilitario.toEntity
import br.com.pessoal.games.utilitario.toModel
import org.example.br.com.pessoal.games.modelo.Jogo
import javax.persistence.EntityManager

class JogosDAO(manager: EntityManager) : DAO<Jogo, JogoEntity>(manager, JogoEntity::class.java) {

    override fun toEntity(objeto: Jogo): JogoEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: JogoEntity): Jogo {
        return entity.toModel()
    }
}