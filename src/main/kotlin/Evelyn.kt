class Evelyn (name: String,hp: Int): Person (name,hp, zusatzschaden = 0) {

    fun dasBuch(ziel: Person) {
        var schaden: Int = 150 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }

    fun hamito (ziel: Person){
        var schaden: Int = 100 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }

    fun derDolch (ziel: Person) {
        var schaden: Int = 50 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }

    fun dieOhrfeige(ziel: Person) {
        var schaden: Int = 25 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }
}

