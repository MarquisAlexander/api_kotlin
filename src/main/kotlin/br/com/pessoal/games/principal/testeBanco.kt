package br.com.pessoal.games.principal

import br.com.pessoal.games.dados.Banco
import br.com.pessoal.games.dados.JogosDAO
import org.example.br.com.pessoal.games.modelo.Jogo

fun main() {
    val jogo = Jogo(
        "Horizon Zero Dawn",
        "https://cdn.cloudflare.steamstatic.com/steam/apps/1151640/header.jpg?t=1667297464",
        3.99,
        "Um jogo de ação e aventura, onde você assume o papel de Aloy, uma caçadora habilidosa, em um mundo pós-apocalíptico dominado por máquinas."
    )
    val jogo2 = Jogo(
        "Grand Theft Auto V",
        "https://cdn.cloudflare.steamstatic.com/steam/apps/271590/header.jpg?t=1678296348",
        2.99,
        "Um jogo de ação em mundo aberto, onde você pode assumir o papel de três protagonistas e explorar uma cidade cheia de possibilidades."
    )
    val manager = Banco.getEntityManager()
    val jogoDAO = JogosDAO(manager)
//    jogoDao.adicionar(jogo2)

    val jogoRecuperado = jogoDAO.recuperarPeloId(5)
    println(jogoRecuperado)

    jogoDAO.apagar(5)

    val listaJogos: List<Jogo> = jogoDAO.getLista()
    println(listaJogos)

    manager.close()
}