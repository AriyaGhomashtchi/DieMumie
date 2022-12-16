class Imothep(name: String,hp: Int): Person (name, hp, zusatzschaden = 0) {

    fun mumifizieren (ziel: Person) {
        var schaden: Int = 150
        ziel.hp -= schaden
    }

    fun derTodesschrei (ziel: Person) {
        var schaden: Int = 100
        ziel.hp -= schaden
    }

    fun derSandsturm (ziel: Person) {
        var schaden: Int = 50
        ziel.hp -= schaden
    }

    fun derFluch (ziel: Person) {
        var schaden: Int = 150
        ziel.hp -= schaden
    }

    fun dieTotenGraeber(ziel: Person){
        var schaden: Int = 100
        ziel.hp -= schaden
    }

    fun dieKaefer(ziel: Person){
        var schaden: Int =50
        ziel.hp -= schaden
    }
}