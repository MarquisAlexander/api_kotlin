package br.com.pessoal.games.principal

import br.com.pessoal.games.modelo.Periodo
import br.com.pessoal.games.modelo.PlanoAssinatura
import br.com.pessoal.games.servicos.ConsumoApi
import com.google.gson.GsonBuilder
import java.io.File
import java.time.LocalDate

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscaJogosJson()

//    val gamerCaroline = listaGamers.get(3)
//    val jogoResidentVillage = listaJogoJson.get(10)
//    val jogoSpider = listaJogoJson.get(13)
//    val jogoTheLastOfUs = listaJogoJson.get(2)
//
////    println(gamerCaroline)
////    println(jogoResidentVillage)
//
//    val periodo = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
//    val periodo1 = Periodo(LocalDate.now(), LocalDate.now().plusDays(3))
//    val periodo2 = Periodo(LocalDate.now(), LocalDate.now().plusDays(10))
//    val periodo4 = Periodo(LocalDate.of(2020, 8, 2), LocalDate.of(2020, 8, 15))
//
//    gamerCaroline.alugaJogo(jogoResidentVillage, periodo)
//    gamerCaroline.alugaJogo(jogoSpider, periodo1)
//    gamerCaroline.alugaJogo(jogoTheLastOfUs, periodo2)
//    gamerCaroline.alugaJogo(jogoSpider, periodo4)
////    println(gamerCaroline.jogosAlugados)
//
    val gamerCamila = listaGamers.get(5)
//    gamerCamila.plano = PlanoAssinatura("PRATA", 9.90, 3, 0.15)
//
//    gamerCamila.alugaJogo(jogoResidentVillage, periodo)
//    gamerCamila.alugaJogo(jogoSpider, periodo1)
//    gamerCamila.alugaJogo(jogoTheLastOfUs, periodo2)
//    gamerCamila.alugaJogo(jogoTheLastOfUs, periodo2)
////    println(gamerCamila.jogosAlugados)
//
//    gamerCamila.recomendar(7)
//    gamerCamila.recomendar(10)
//    gamerCamila.recomendar(8)
////    println(gamerCamila)
//
//    gamerCamila.alugaJogo(jogoResidentVillage, periodo)
//    println(gamerCamila.jogosAlugados)
//
//    gamerCamila.recomendarJogo(jogoResidentVillage, 7)
//    gamerCamila.recomendarJogo(jogoTheLastOfUs, 10)
//
//    gamerCaroline.recomendarJogo(jogoResidentVillage, 8)
//    gamerCaroline.recomendarJogo(jogoTheLastOfUs, 9)
//
//    println("Recomendações da Camila")
//    println(gamerCamila.jogosRecomendados)
//    println("Recomendações da Caroline")
//    println(gamerCaroline.jogosRecomendados)



    val gamerCaroline = listaGamers.get(3)
    val jogoResidentVillage = listaJogoJson.get(10)
    val jogoSpider = listaJogoJson.get(13)
    val jogoTheLastOfUs = listaJogoJson.get(2)
    val jogoDandara = listaJogoJson.get(5)
    val jogoAssassins = listaJogoJson.get(4)
    val jogoCyber = listaJogoJson.get(6)
    val jogoGod = listaJogoJson.get(7)
    val jogoSkyrim = listaJogoJson.get(18)

    gamerCamila.recomendarJogo(jogoResidentVillage, 7)
    gamerCamila.recomendarJogo(jogoTheLastOfUs, 10)
    gamerCamila.recomendarJogo(jogoAssassins, 8)
    gamerCamila.recomendarJogo(jogoCyber, 7)
    gamerCamila.recomendarJogo(jogoGod, 10)
    gamerCamila.recomendarJogo(jogoDandara, 8)
    gamerCamila.recomendarJogo(jogoSkyrim, 8)
    gamerCamila.recomendarJogo(jogoSpider, 6)

    val gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    val serializacao = gson.toJson(gamerCamila.jogosRecomendados)

    println(serializacao)

    val arquivo = File("jogosRecomendados-${gamerCamila.nome}.json")
    arquivo.writeText(serializacao)
//    println(arquivo.absolutePath)

}