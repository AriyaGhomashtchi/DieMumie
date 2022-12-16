class Rick(name: String, hp: Int,) : Person (name, hp, zusatzschaden = 0) {

    fun derColt(ziel: Person) {
        var schaden: Int = 200 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden

    }

    fun diePeitsche(ziel: Person) {
        var schaden: Int = 150 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }

    fun dieFaust(ziel: Person) {
        var schaden: Int = 100 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }

    fun derTritt(ziel: Person) {
        var schaden:Int = 50 + zusatzschaden
        ziel.hp -= schaden
        ziel.zusatzschaden
    }
}