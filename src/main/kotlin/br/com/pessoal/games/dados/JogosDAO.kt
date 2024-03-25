package br.com.pessoal.games.dados

import org.example.br.com.pessoal.games.modelo.Jogo
import javax.persistence.EntityManager

class JogosDAO(manager: EntityManager) : DAO<Jogo, JogoEntity>(manager, JogoEntity::class.java) {

    override fun toEntity(objeto: Jogo): JogoEntity {
        return JogoEntity(objeto.titulo, objeto.capa, objeto.preco, objeto.descricao, objeto.id)
    }

    override fun toModel(entity: JogoEntity): Jogo {
        return Jogo(
            entity.titulo,
            entity.capa,
            entity.preco,
            entity.descricao.toString(),
            entity.id
        )
    }
}