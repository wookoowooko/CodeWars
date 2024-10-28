package functions
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
 */

fun longest(s1: String, s2: String): String {
    return (s1 + s2).toSortedSet().joinToString("")
}
