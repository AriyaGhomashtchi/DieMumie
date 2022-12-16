class Jonathan (name: String, hp: Int): Person (name,hp, zusatzschaden = 0) {

    fun dieFackel(ziel: Person) {
        var schaden: Int = 100 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }

    fun dasglueck(ziel: Person){
        var schaden: Int = 80 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }

    fun dasDynamit(ziel: Person) {
        var schaden: Int = 60 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }

    fun dieGabel(ziel: Person) {
        var schaden: Int = 40 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }
}