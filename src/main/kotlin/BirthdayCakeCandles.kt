fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    var numTallers: Int = 1
    candles.sort()
    var getLastValue = candles[candles.size - 1]
    var pos: Int = 0

    for (i in candles) {
        if (pos == candles.size - 1) {
            break
        }
        if (i == getLastValue) {
            numTallers += 1
            pos += 1
        } else {
            pos += 1
        }
    }
    return numTallers
}