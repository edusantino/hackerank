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
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    var diff: Int = 0
    var newGrades = mutableListOf<Int>()
    var next: Int = 0
    var count: Int = 0

    for (i in grades) {
        if (i < 38) {
            newGrades.add(i)
        } else {
            if (i % 10 == 5 || i % 10 == 0) {
                next = i
            }
            if (i % 10 in 1..4) {
                var x: Int = 5 - (i % 10)
                next = i + x
            }
            else if (i % 10 in 6..9) {
                var x: Int = 10 - (i % 10)
                next = i + x
            }
            if (next - i < 3) {
                newGrades.add(next)
                next = 0
            }
            else {
                newGrades.add(i)
                next = 0
            }
        }
        count += 1
    }

    return newGrades.toTypedArray()
}