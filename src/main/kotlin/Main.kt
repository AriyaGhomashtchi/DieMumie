var beutel = Beutel()

fun main (){
    var imothep= Imothep (name = "Imothep", hp = 1000)
    var benni= Benni (name = "Benni", hp = 250)
    var rick= Rick (name = "Rick", hp = 600)
    var evelyn= Evelyn (name = "Evelyn", hp = 500)
    var jonathan= Jonathan(name = "Jonathan", hp = 400)
    var gegnerliste = mutableListOf<Person>(imothep,benni)
    var heldenliste = mutableListOf<Person>(rick,evelyn,jonathan)
    var istGutTod = false
    var istBoeseTod = false

    println(
        "1919. Du und deine Helden gegibt euch in die heiligen Graeber von Utasa. \n" +
                "Je tiefer du dich hinein begibst spuerst du eiene grauenhafte Praesens. \n" +
                "Benni der fiese Schurke liesst aus den Heiligen Buecher vor und plötzlich erscheint Imothep!\n"
    )
    
    do {

        if (benni.stun){
            println("Benni wirft mit Sand,alle Helden sind blind für eine Runde")
            benni.stun = false
        }
        if (rick.hp>0){

    Kampf().angriffwahlenRick(rick,zufallsangriff(gegnerlist(imothep,benni)))
        if (imothep.hp>=0)
            println("Imothep hat noch ${imothep.hp} leben.")
        if (benni.hp>=0)
            println("Benni hat noch ${benni.hp} leben.")
        if (imothep.hp <= 0 && benni.hp <= 0){
        istBoeseTod = true
        break
            }}

        if (evelyn.hp>0){

    Kampf().angriffwahlenEvelyn(evelyn,zufallsangriff(gegnerlist(imothep,benni)))
            if (imothep.hp>=0)
            println("Imothep hat noch ${imothep.hp} leben.")
            if (benni.hp>=0)
            println("Benni hat noch ${benni.hp} leben.")
            if (imothep.hp <= 0 && benni.hp <= 0) {
                istBoeseTod = true
                break
            }}

    if (jonathan.hp>0){

    Kampf().angriffwahlenJonathan(jonathan,zufallsangriff(gegnerlist(imothep,benni)))
        if (imothep.hp>=0)
            println("Imothep hat noch ${imothep.hp} leben.")
        if (benni.hp>=0)
            println("Benni hat noch ${benni.hp} leben.")
        if (imothep.hp <= 0 && benni.hp <= 0){
            istBoeseTod = true
        break

            }}
                        println("")
        if (imothep.hp>0) {

            Kampf().angriffwahlenImothep(imothep, zufallsangriff(heldenlist(rick,evelyn,jonathan)))
            println("Rick hat noch ${rick.hp} leben.")
            println("Evelyn hat noch ${evelyn.hp} leben.")
            println("Jonathan hat noch ${jonathan.hp} leben")
            if (rick.hp <= 0 && evelyn.hp <= 0 && jonathan.hp <= 0) {
                istGutTod = true
                break

            }}
            println("")
        if (benni.hp>0){

            Kampf().angriffwahlenbenni(benni,zufallsangriff(heldenlist(rick,evelyn,jonathan)))
            println("Rick hat noch ${rick.hp} leben.")
            println("Evelyn hat noch ${evelyn.hp} leben.")
            println("Jonathan hat noch ${jonathan.hp} leben.")
            if (rick.hp <= 0 && evelyn.hp <= 0 && jonathan.hp <= 0) {
                istGutTod = true
                break
            }}
    }
    while (istGutTod == false && istBoeseTod == false)
    if (istGutTod == true)
            println("Das Gute hat verloren.")
    else if (istBoeseTod == true)
            println("Du hast das Boese besiegt und hast die Welt gerretet! Du bist ein wahrer Held,Glueckwunsch!.")

}
    fun zufallsangriff(alle: MutableList<Person>):Person{
    var auswahlgegner = alle.random()
    return auswahlgegner
}