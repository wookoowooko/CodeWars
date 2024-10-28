package functions

/**
 * Просто, учитывая строку слов, верните длину самого короткого слова (слов).
 *
 * Строка никогда не будет пустой, и вам не нужно учитывать разные типы данных.
 * "bitcoin take over the world maybe who knows perhaps"
 */
fun findShort(s: String): Int = s.split(" ").toTypedArray().minOf { it.length }
