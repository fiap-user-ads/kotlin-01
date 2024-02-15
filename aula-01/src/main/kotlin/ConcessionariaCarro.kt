data class ConcessionariaCarro(
    override var name: String,
    override val endereco: String,
    override val telefone: String
): Concessionaria(name, endereco, telefone) {
    val lista = super.listaCarros
}
