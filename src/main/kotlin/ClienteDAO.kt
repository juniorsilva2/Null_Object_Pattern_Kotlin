class ClienteDAO {
    companion object {
        @JvmStatic var Nomes = arrayOf("Jeniffer", "Manoel", "Pedro", "Lucas")
        fun buscarBD(nomeCliente : String): ClienteAbstract {
            for (nome in Nomes)
                if (nome === nomeCliente)
                    return ClienteReal(nomeCliente)
            return ClienteNull()
        }
    }
}