import br.com.pessoal.games.modelo.Gamer

fun main() {
    val gamer1 = Gamer("Marquis", "teste@teste.com")
    println(gamer1)
    val gamer2 = Gamer(
        "Alexander",
        "teste@teste.com",
        "28/08/2000",
        "thisIsMarquis")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "28/09/2005"
        it.usuario = "HomemVerso"
        it.idInterno = "HomemVerso1234"
    }

    println(gamer1)
}