import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var minMaxScores = mutableListOf<Int>()
    var minScore: Int = 0
    var maxScore: Int = 0
    var k: Int = 1
    var curr: Int = scores[0]

    while (k < scores.size) {
        if (curr > scores[k]) {
            maxScore += 1
            curr = scores[k]
            k += 1
        }
        else {
            k += 1
        }
    }
    k = 1
    curr = scores[0]

    while (k < scores.size) {
        if (curr < scores[k]) {
            minScore += 1
            curr = scores[k]
            k += 1
        }
        else {
            k += 1
        }
    }
    minMaxScores.add(minScore)
    minMaxScores.add(maxScore)

    return minMaxScores.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
