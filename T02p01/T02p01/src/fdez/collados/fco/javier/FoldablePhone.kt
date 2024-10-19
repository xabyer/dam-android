package fdez.collados.fco.javier

class FoldablePhone(
    private var isFolded: Boolean = true
): Phone() {

    override fun switchOn() {
        if(!isFolded)
            isScreenLightOn = true
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}