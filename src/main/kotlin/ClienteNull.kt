class ClienteNull() : ClienteAbstract() {
    override var nome: String = ""
    override fun buscarBD(): String {
        return "Cliente não encontrado no Banco de Dados!"
    }
}



