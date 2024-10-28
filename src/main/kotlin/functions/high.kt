package functions

/**
 * Учитывая строку слов, вам нужно найти слово с наибольшим количеством очков.
 *
 * Каждая буква слова набирает очки в зависимости от ее позиции в алфавите: a = 1, b = 2, c = 3 и т. д.
 *
 * Например, оценка абада равна 8 (1+2+1+4).
 *
 * Вам нужно вернуть слово с наивысшим баллом в виде строки.
 *
 * Если два слова имеют одинаковую оценку, верните слово, которое встречается первым в исходной строке.
 *
 * Все буквы будут строчными, и все вводимые данные будут действительными.
 * "man i need a taxi up to ubud"
 * */
fun high(str: String): String {
    return str.split(" ")
        .maxBy { word ->
            word.sumOf { it - 'a' + 1 }
        }
}