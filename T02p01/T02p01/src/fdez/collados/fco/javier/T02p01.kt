package fdez.collados.fco.javier

fun main() {
    // 2. Mobile notifications
    val morningNotification = 51
    val eveningNotification = 135

    printNumberExercise("Exercise 2: Mobile Notifications")
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
    printSeparator()


    // 3. Movie-ticket price
    printNumberExercise("Exercise 3: Movie-ticket price")
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")

    printSeparator()
}

fun printNumberExercise(exerciseName:String){
    println("*---------------------- $exerciseName  ----------------------*")
}

fun printSeparator() {
    println("*------------------------------------------------------------*")
    println()
}

// Mobile Notifications
fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if(numberOfMessages >= 100) {
        println("Your phone is blowing up! You have 99+ notifications.")

    } else {
        println("You have $numberOfMessages notifications.")
    }
}


// Movie-ticket price
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    if(age <= 12) {
        return 15

    } else if (age <=60 && isMonday) {
        return 25

    } else if (age <=60) {
        return 30

    }
    return 20
}