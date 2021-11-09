fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    val arrNumbersSum = mutableListOf<Long>()
    var arrCopy: MutableList<Int>
    var pos: Int = 0
    var sum: Long = 0
    var min: Long = 0
    var max: Long = 0

    for (i in arr) {
        arrCopy = arr.toMutableList()
        arrCopy.removeAt(pos)
        pos++
        for (n in arrCopy) {
            sum += n
        }
        arrNumbersSum.add(sum)
        arrCopy.clear()
        sum = 0
    }
    arrNumbersSum.sort()
    min = arrNumbersSum[0]
    max = arrNumbersSum[arrNumbersSum.size - 1]
    print("${min} ${max}")
}