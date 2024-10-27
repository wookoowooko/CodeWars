package io.genry.wooko

fun main() {
//    makeComplement("ATTGC")
    longest(s1 = "xyaabbbccccdefww", s2 = "xxxxyyyyabklmopq")
}

/**
 * Возьмите 2 строки s1 и s2, содержащие только буквы от a до z.
 * Верните новую отсортированную строку (в алфавитном порядке),
 * максимально длинную, содержащую разные буквы — каждая буква берется только один раз — из s1 или s2.
 *
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 *
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 * */

fun longest(s1: String, s2: String): String {
    return (s1 + s2).toSortedSet().joinToString("")
}


/***
 * Дезоксирибонуклеиновая кислота (ДНК) — это химическое вещество, найденное в ядре клеток, которое несет "инструкции" для развития и функционирования живых организмов.
 *
 * Если вы хотите узнать больше: http://en.wikipedia.org/wiki/DNA
 *
 * В строках ДНК символы "A" и "T" являются комплементарными друг другу, как "C" и "G". Ваша функция получает одну сторону ДНК (строку, за исключением Haskell);
 * вам нужно вернуть другую комплементарную сторону.
 * Строка ДНК никогда не бывает пустой и не содержит ДНК вообще (опять же, за исключением Haskell).
 *
 * Больше похожих упражнений можно найти здесь: http://rosalind.info/problems/list-view/ (источник)
 *
 * Пример: (вход --> выход)
 * "ATTGC" --> "TAACG"
 * "GTAT" --> "CATA"
 */

fun makeComplement(dna: String): String {
    var newString = ""
    fun replaceChar(oldChar: Char): Char {
        return when (oldChar) {
            'A' -> 'T'
            'T' -> 'A'
            'C' -> 'G'
            'G' -> 'C'
            else -> oldChar
        }
    }

    for (i in dna) {
        val replaced = replaceChar(i)
        newString += replaced
    }

    return newString
}
