import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var k: Int = 0
    var j: Int = 0
    var sumDiffA: Int = 0
    var sumDiffB: Int = 0

    while (k <= arr.size - 1) {
        sumDiffA += arr[j][k]
        j += 1
        k += 1
    }
    j = 0
    k = arr.size - 1

    while (k >= 0) {
        k -= 1
        j += 1
        sumDiffB += arr[j][k]
    }

    return abs(sumDiffA - sumDiffB)
}