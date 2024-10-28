package functions

/**
 * Напишите функцию, которая принимает строку из одного или нескольких слов и возвращает ту же строку,
 * но со всеми словами, в которых пять или более букв перевернуты (точно так же, как название этой ката).
 * Передаваемые строки будут состоять только из букв и пробелов.
 * Пробелы будут включены только в том случае, если присутствует более одного слова.
 * "Hey fellow warriors"  --> "Hey wollef sroirraw"
 * "This is a test        --> "This is a test"
 * "This is another test" --> "This is rehtona test"
 * */
fun spinWords(sentence: String): String {
   return sentence.split(" ").joinToString(" ") {
        if (it.length>=5) it.reversed() else it
    }
}