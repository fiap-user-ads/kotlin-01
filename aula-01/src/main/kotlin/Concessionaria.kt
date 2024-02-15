open class Concessionaria (
    open var name: String = "Jairson",
    open val endereco: String?,
    open val telefone: String? = "11 999999999"
) {
    val listaMotos:ArrayList<String>? = arrayListOf<String>()
    val listaCarros:ArrayList<String>? = arrayListOf<String>()
}