fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    // Write your code here
    var pts = intArrayOf(0, 0)
    var sumA: Int = 0
    var sumB: Int = 0
    var pos: Int = 0

    for (i in a) {
        if (i > b[pos]) {
            sumA += 1
        }
        else if (i == b[pos]) {
        }
        else {
            sumB += 1
        }
        pos++
    }
    pts[0] = sumA
    pts[1] = sumB
    return pts.toTypedArray()
}