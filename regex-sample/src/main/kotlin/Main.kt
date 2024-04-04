package org.sample

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val st = """
        He set up his bills here in Messina and
        challenged Cupid at the flight, and my uncle’s Fool,
        reading the challenge, subscribed for Cupid and
        challenged him at the bird-bolt. I pray you, how
        many hath he killed and eaten in these wars? But
        how many hath he killed? For indeed I promised to
        eat all of his killing.
    """.trimIndent()

    val rx = "kill(ed|ing)".toRegex()

    g(st.split("\n"), rx, ::println)
}

fun g(p1: List<String>, p2: Regex, p3: (String) -> Unit) {
    p1.filter(p2::containsMatchIn)
        .forEach(p3)
}