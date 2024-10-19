package fdez.collados.fco.javier

class Song(
    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private val playCount: Int
) {
    val isPopularSong: Boolean
        get() = playCount >= 1000
    

    fun printSongDescription() {
        println("$title, performed by $artist, was released in $yearPublished")
    }
}