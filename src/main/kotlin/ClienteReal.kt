class ClienteReal(override var nome: String) : ClienteAbstract() {
    override fun buscarBD(): String {
        return nome
    }
}