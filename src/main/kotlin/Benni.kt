class Benni (name: String,hp: Int): Person (name,hp, zusatzschaden = 0) {

    var stun : Boolean = false

    fun amulet(ziel: Person) {
        var schaden: Int = 100
        ziel.hp -= schaden
    }

    fun luegen (ziel: Person) {
        var schaden: Int = 80
        ziel.hp -= schaden
    }

    fun messer (ziel: Person) {
        var schaden: Int = 60
        ziel.hp -= schaden
    }

    fun sand () {
        stun=true

    }
}