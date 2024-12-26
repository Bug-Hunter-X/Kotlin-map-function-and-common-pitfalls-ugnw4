fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 } 
    println(result) // Output: [2, 4, 6, 8, 10]

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val doubledMap = map.mapValues { it.value * 2 }
    println(doubledMap) // Output: {a=2, b=4, c=6}

    //Example of an uncommon error:
    val stringList = listOf("apple", "banana", "cherry")
    val lengths = stringList.map { it.length } // Correct way to get the length of strings
    //val lengthsIncorrect = stringList.map { it.length() } // Incorrect: strings do not have length() method, only length
    println(lengths) // Output: [5, 6, 6]
}