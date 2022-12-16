fun gegnerlist(imothep: Imothep,benni: Benni):MutableList<Person>{
    var gegnerliste = mutableListOf<Person>(imothep,benni)

    var gegnerlisteNeu = mutableListOf<Person>()
    for (gegner in gegnerliste) {
        if (gegner.hp <= 0) {
        println("${gegner.name} ist gestorben.")
        } else {
            gegnerlisteNeu.add(gegner)
        }
    }

    return gegnerlisteNeu
}
fun heldenlist(rick: Rick,evelyn: Evelyn,jonathan: Jonathan):MutableList<Person>{
    var heldenliste = mutableListOf<Person>(rick,evelyn,jonathan)

    var hehldenListeNeu = mutableListOf<Person>()
    for (helden in heldenliste){
         if (helden.hp <=0) {
         }else {
            hehldenListeNeu.add(helden)
         }
    }
    return hehldenListeNeu
}