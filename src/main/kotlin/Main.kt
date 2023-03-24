interface Truncated {
    val truncated: String
    val original: String
}

private fun String.truncator(max: Int) = object: Truncated{
    override val truncated: String
        get() = if (length <= max) this@truncator else substring(0, max)

    override val original: String
        get() = this@truncator
}

fun main() {
    val truncator = "Hello".truncator(3)

    println(truncator.original)
    println(truncator.truncated)
}