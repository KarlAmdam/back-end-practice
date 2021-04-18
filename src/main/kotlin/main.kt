
// Top level variables
val firstName: String = "Example"
var greeting:String = "Hello"

// To make values be able to have null, you have to add the ? to the type. Nullable type
var nullableItem: String? = null

// Functions introduction:

fun getHello(): String {
    return "Hello Kotlin"
}

fun sayHello(): Unit {
    println(getHello())
}

// Example of a nullable return function is just to add ? to the return type.
fun nullableReturnFunction(): String? {
    return null
}

// Below is a function with a parameter and that uses string templates:
fun sayHello(itemToGreet:String) {
    val msg = "Hello $itemToGreet"
    println(msg)
}

// The function above can be simplified to a single expression function:
fun sayHelloSingleExpression(itemToGreet:String) = "Hello $itemToGreet"

// Single expression function with type inference:
fun SingleExpressionFunction() = "Hello SingleExpression"

fun main() {

    val person = Person()
    person.lastName
    person.firstName

    // Introduction to types and null values

    val name: String = "PersonName"

    var lastName: String = "Surname"
    lastName = "Surname2"

    println(greeting)

    greeting = "HelloNew"

    //Both examples are okay because of "String?" It is a nullable type of String.
    nullableItem = "Hello"
    nullableItem = null

    println(greeting)

    println(lastName)
    println("Hello World!")
    println(name)
    println(firstName)

    // Checks for nullable with If statement, and if null does one thing, else does the other.
    if (nullableItem != null) {
        println(nullableItem)
    } else {
        println("Hi - If")
    }

    // Checks for nullable with When statement, and if null does one thing, else does the other.
    when (nullableItem) {
        null -> println("Hi - When")
        else -> println(nullableItem)
    }

    val itemToPrintIf = if(nullableItem != null) nullableItem else "Hi - Assigned If"
    println(itemToPrintIf)

    val itemToPrintWhen = when (nullableItem) {
        null -> "Hi - Assigned When"
        else -> nullableItem
    }
    println(itemToPrintWhen)



    // Functions in Kotlin:
    println(getHello())

    // Collections and Iteration

    // Basic array in Kotlin:
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println("The size of the array: " + interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    // Syntax of for loops in Kotlin:
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }

    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }
    
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }

    // List examples:

    val interestingThingsList = listOf("Kotlin list", "Programming list", "Comic Books list")
    interestingThingsList.forEach { interestingThing ->
        println(interestingThing)
    }

    interestingThingsList.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }

    // Map examples:

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) ->
        println("$key -> $value")
    }

    fun sayHelloList(greeting: String, vararg itemsToGreet:String) {
        itemsToGreet.forEach { itemToGreet ->
            println("$greeting $itemToGreet")
        }
    }
    sayHelloList("Hi")

    fun greetPersonNamed(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

    greetPersonNamed()
}