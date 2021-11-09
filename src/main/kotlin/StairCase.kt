fun staircase(n: Int): Unit {
    // Write your code here
    val s = " "
    val e = "#"
    var j: Int = 0
    var k: Int = 0
    var sum: Int = 0

    while (n >= k) {
        sum = j + k
        if (sum <= n) {
            print(s)
        }
        else {
            print(e)
            println()
            k = 0
            j += 1
        }
        k += 1
    }
}