import br.com.pessoal.games.modelo.Gamer

fun main() {
    val gamer1 = Gamer(
        "Alexander",
        "marquissantos123@gmail",
        "28/08/2000",
        "thisIsMarquis"
    )

    println(gamer1)

    gamer1.let {
        println(gamer1.idInterno)
    }

    gamer1.usuario = "alterei o user"
    println(gamer1)
}