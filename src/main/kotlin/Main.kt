fun main() {
    work()
}

fun work() {
    println("Please, enter a number of chapter from 1 to 24")
    val input = readLine()
    if (checkInputValue(input)) {
        val countOfTask = chooseTask(input)
        val randomTask = chooseRandomTask(countOfTask)
        println("Number of your task is $randomTask from chapter $input")
    } else {
        println("Please enter a valid value")
        work()
    }
}

fun chooseRandomTask(countOfTask: Int): Int {
    return (1..countOfTask).random()
}

fun checkInputValue(input: String?): Boolean {
    return input?.toInt() in 1..24
}

fun chooseTask(input: String?): Int {
    return when (input?.toInt()) {
        1 -> 150
        2 -> 139
        3 -> 79
        4 -> 131
        5 -> 31
        6 -> 11
        7 -> 31
        8 -> 11
        9 -> 30
        10 -> 46
        11 -> 3
        12 -> 10
        13 -> 100
        14 -> 150
        15 -> 8
        16 -> 66
        17 -> 53
        18 -> 9
        19 -> 15
        20 -> 15
        21 -> 15
        22 -> 70
        23 -> 26
        else -> 7
    }
}


