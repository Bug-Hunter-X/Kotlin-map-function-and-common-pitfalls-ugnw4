# Kotlin Map Function and Common Pitfalls

This example showcases the usage of the `map` function in Kotlin for lists and maps, along with a common error that developers might encounter.

The `map` function is a higher-order function that transforms each element of a collection into a new element using a provided lambda expression.

The example demonstrates how to correctly use map with lists and maps and highlight how to avoid the pitfall of attempting to use `length()` which does not exist for a string object in Kotlin.  The correct usage is to access the `length` property of the string object.

The included Kotlin files demonstrates the correct and incorrect code scenarios.