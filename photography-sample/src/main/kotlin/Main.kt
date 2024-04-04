package org.sample

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.math.ceil
import kotlin.math.log2

fun ev(fnum: Double, time: Double): Int {
    val bl = (fnum * fnum) / time
    val ev = log2(bl)
    return ceil(ev).toInt()
}

fun main() {
    println(ev(4.0, 1 / 15.0))
}