package br.com.pessoal.games.dados

import org.example.br.com.pessoal.games.modelo.Jogo
import javax.persistence.EntityManager

class JogosDAO(val manager: EntityManager) {
    fun getJogos(): List<Jogo> {
        val query = manager.createQuery("FROM JogoEntity", JogoEntity::class.java)
        return query.resultList.map { entity ->
            Jogo(
                entity.titulo,
                entity.capa,
                entity.preco,
                entity.descricao.toString(),
                entity.id
            )
        }
    }

    fun adicionarJogo(jogo: Jogo) {
        val entity = JogoEntity(jogo.titulo, jogo.capa, jogo.preco, jogo.descricao)
        manager.transaction.begin()
        manager.persist(entity)
        manager.transaction.commit()
    }
}