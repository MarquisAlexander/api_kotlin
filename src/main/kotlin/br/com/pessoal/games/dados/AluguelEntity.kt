package br.com.pessoal.games.dados

import br.com.pessoal.games.modelo.Periodo
import javax.persistence.*

@Entity
@Table(name = "aluguel ")
class AluguelEntity(
    @ManyToOne
    val gamer: GamerEntity = GamerEntity(),
    @ManyToOne
    val jogo: JogoEntity = JogoEntity(),
    @Embedded
    val periodo: Periodo = Periodo()
) {
    var valorDoAluguel = 0.0

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id = 0
}