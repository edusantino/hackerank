fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Write your code here
    x1.toFloat()
    x2.toFloat()
    v1.toFloat()
    v2.toFloat()
    var result: String = if ((x2 - x1)/(v1 - v2) % 2 == 0) "YES" else "NO"

    return if (x1 == 0 && x2 == 0 || x1 == 0 && x2 == 0 && v1 != v2  || x2 > x1 && v2 > v1 || x1 > x2 && v1 > v2) {
        "NO"
    }
    else if (v1 == v2) {
        "NO"
    }
    else {
        "YES"
    }
}