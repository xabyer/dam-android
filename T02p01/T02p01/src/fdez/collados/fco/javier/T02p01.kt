package fdez.collados.fco.javier

fun main() {
    // 2. Mobile notifications
    val morningNotification = 51
    val eveningNotification = 135

    print("\n")
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

    // 4. Temperature converter
    /**
     * Output:
     * 27.0 degrees Celsius is 80.60 degrees Fahrenheit.
     * 350.0 degrees Kelvin is 76.85 degrees Celsius.
     * 10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
     */
    printNumberExercise("Exercise 4: Temperature converter")
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") {
        5.0 / 9.0 * (it - 32) + 273.15
    }
    printSeparator()

    // 5. Song catalog
    printNumberExercise("Exercise 5: Song catalog")
    val braveNewWorldIronMaiden = Song(
        "Brave New World",
        "Iron Maiden",
        2000,
        80000000
    )
    braveNewWorldIronMaiden.printSongDescription()
    println("Is Brave New World a popular song? ${braveNewWorldIronMaiden.isPopularSong}")
    printSeparator()

    // 6. Internet profile
    /**
     * Output:
     * Name: Amanda
     * Age: 33
     * Likes to play tennis. Doesn't have a referrer.
     *
     * Name: Atiqah
     * Age: 28
     * Likes to climb. Has a referrer named Amanda, who likes to play tennis.
     */
    printNumberExercise("Exercise 6: Internet profile")
    val amanda = Person("Amanda", 33, "play tennis", null)
    @Suppress("SpellCheckingInspection") val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
    printSeparator()



}

fun printNumberExercise(exerciseName:String){
    println("*---------------------- $exerciseName  ----------------------*")
}

fun printSeparator() {
    println("*------------------------------------------------------------------------------*")
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

// Temperature converter
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
