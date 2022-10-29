package extensions

fun String?.getNotEmptyString(): String {
    var input = this //this 는 nullableString
    while(input.isNullOrBlank()) {
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.trim() // trim() 공백을 포함한 부분을 제거함
}

fun String?.getNotEmptyInt(): Int {
    var input = this?.trim()
    while(input.isNullOrEmpty() || input.toIntOrNull() == null) {
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.toInt()
}
