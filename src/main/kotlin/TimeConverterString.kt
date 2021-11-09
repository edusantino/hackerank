fun timeConversion(s: String): String {
    // Write your code here
    var hrsFormat: String = ""
    var firstValues: String = s.substring(0, 2)
    var lastValues: String = s.substring(s.length - 2, s.length)
    var middleValues = s.substring(2, s.length - 2)

    if (firstValues == "12" && lastValues == "PM") {
        hrsFormat = firstValues + middleValues
    }
    else if (firstValues == "12" && lastValues == "AM") {
        hrsFormat = "00$middleValues"
    }
    else if (lastValues == "PM") {
        when (firstValues) {
            "01" -> hrsFormat = "13$middleValues"
            "02" -> hrsFormat = "14$middleValues"
            "03" -> hrsFormat = "15$middleValues"
            "04" -> hrsFormat = "16$middleValues"
            "05" -> hrsFormat = "17$middleValues"
            "06" -> hrsFormat = "18$middleValues"
            "07" -> hrsFormat = "19$middleValues"
            "08" -> hrsFormat = "20$middleValues"
            "09" -> hrsFormat = "21$middleValues"
            "10" -> hrsFormat = "22$middleValues"
            "11" -> hrsFormat = "23$middleValues"
        }
    }
    else {
        hrsFormat = firstValues + middleValues
    }

    return hrsFormat
}