fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Write your code here
    var numApples: Int = 0
    var numOranges: Int = 0

    for (i in apples) {
        if (a + i in s..t) {
            numApples += 1
        }
    }
    for (j in oranges) {
        if (j < 0) {
            if (b - kotlin.math.abs(j) in s..t) {
                numOranges += 1
            }
            else {
                if (b - j in s..t) {
                    numOranges += 1
                }
            }
        }
    }

    println(numApples)
    println(numOranges)
}