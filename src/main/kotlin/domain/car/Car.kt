package domain.car

class Car(
    val name: String,
    var position: Int,
) {

    fun move(): Int {
        this.position += 1
        return this.position
    }

    fun displayCurrentPosition() {
        val result = "-".repeat(this.position)
        println("${this.name} : $result")
    }
}