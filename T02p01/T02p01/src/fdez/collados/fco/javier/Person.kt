package fdez.collados.fco.javier

class Person(
    private val name: String,
    private val age: Int,
    private val hobby: String?,
    private val referrer: Person?
) {
    fun showProfile() {
        // Fill in code
        println("Name: $name")
        println("Age: $age")

        if (hobby != null)
            print("$name likes to $hobby. ")

        if(referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null)
                print(", who likes to ${referrer.hobby}.")
            else
                print(".")

        } else {
            print("Doesn't have a referer.")
        }

        print("\n\n")
    }
}