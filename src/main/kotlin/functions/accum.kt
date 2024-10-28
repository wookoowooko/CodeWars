package functions
/**
 *На этот раз без истории и теории. Примеры ниже показывают, как написать функцию `accum`:
 * Examples:
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * Параметр функции accum — это строка, которая включает только буквы от a до z и от A до Z.
 */
fun accum(s: String): String {
    var string = ""
    s.forEachIndexed { index, char ->
        val d = if (index == s.lastIndex) "" else "-"
        string += (char.uppercase() + (char.lowercase().repeat(index)) + d)
    }
    return string
}

