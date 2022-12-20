fun main(args: Array<String>) {

    val cliente01 : ClienteAbstract = ClienteDAO.buscarBD("Lucas")
    val cliente02 : ClienteAbstract = ClienteDAO.buscarBD("Pedro")
    val cliente03 : ClienteAbstract = ClienteDAO.buscarBD("Ronny")
    val cliente04 : ClienteAbstract = ClienteDAO.buscarBD("Jennifer")

    println("Clientes")
    println(cliente01.buscarBD())
    println(cliente02.buscarBD())
    println(cliente03.buscarBD())
    println(cliente04.buscarBD())
}