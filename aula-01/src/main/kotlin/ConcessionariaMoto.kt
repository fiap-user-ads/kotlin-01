data class ConcessionariaMoto(
    override var name: String,
    override val endereco: String,
    override val telefone: String
): Concessionaria(name, endereco, telefone) {

}
