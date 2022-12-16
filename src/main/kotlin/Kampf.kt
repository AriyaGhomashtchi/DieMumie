class Kampf {

    fun angriffwahlenRick(rick: Rick, gegner: Person) {

        do {
            var richtigeEingabe = false

            println(
                "Rick greift als erstes an.Waehle deine Waffe.\n" +
                        "1. Der Colt. \n" +
                        "2. Die Peitsche. \n" +
                        "3. Die Faust. \n" +
                        "4. Der Tritt.\n" +
                        "5. Heiltrank.\n" +
                        "6. Vitamine."
            )
            try {
                var eingabe = readln().toInt()
                when (eingabe) {
                    1 -> {
                        rick.derColt(gegner)

                        println()
                    }

                    2 -> {
                        rick.diePeitsche(gegner)
                    }

                    3 -> {
                        rick.dieFaust(gegner)
                    }

                    4 -> {
                        rick.derTritt(gegner)
                    }

                    5 -> {
                        if (!beutel.heiltrank(rick)) {
                            richtigeEingabe = true
                            println("Heiltrank aufgebraucht.")
                        }
                    }

                    6 -> {
                        if (!beutel.vitamine(rick)) {
                            richtigeEingabe = true
                            println("Vitamine aufgeabraucht.")
                        }
                    }
                }
            } catch (e: Exception) {
                println("Gebe eine Zahl ein.")

                var eingabe = readln().toInt()
                when (eingabe) {
                    1 -> {
                        rick.derColt(gegner)

                        println()
                    }

                    2 -> {
                        rick.diePeitsche(gegner)
                    }

                    3 -> {
                        rick.dieFaust(gegner)
                    }

                    4 -> {
                        rick.derTritt(gegner)
                    }

                    5 -> {
                        beutel.heiltrank(rick)
                    }

                    6 -> {
                        beutel.vitamine(rick)

                    }
                }
            }
        }
        while (richtigeEingabe)
    }

    fun angriffwahlenEvelyn(evelyn: Evelyn, gegner: Person) {
        do {
            var richtigeEingabe = false
            println(
                "Evelyn kommt zur Unterstuetzung.Wähle deine Waffe.\n" +
                        "1. dasBuch. \n" +
                        "2. hamito \n" +
                        "3. derDolch. \n" +
                        "4. dieOhrfeige. \n" +
                        "5. Heiltrank. \n" +
                        "6. Vitamine."
            )

            try {
                var eingabe = readln().toInt()
                when (eingabe) {
                    1 -> {
                        evelyn.dasBuch(gegner)
                    }

                    2 -> {
                        evelyn.hamito(gegner)
                    }

                    3 -> {
                        evelyn.derDolch(gegner)
                    }

                    4 -> {
                        evelyn.dieOhrfeige(gegner)
                    }
                    5 -> {
                        if (!beutel.heiltrank(evelyn)) {
                            richtigeEingabe = true
                            println("Heiltrank aufgebraucht.")
                        }
                    }

                    6 -> {
                        if (!beutel.vitamine(evelyn)) {
                            richtigeEingabe = true
                            println("Vitamine aufgeabraucht.")
                        }
                    }
                }}
            catch (e: Exception) {
                println("Gebe eine Zahl ein.")

                var eingabe = readln().toInt()
                when (eingabe) {
                    1 -> {
                        evelyn.dasBuch(gegner)
                    }

                    2 -> {
                        evelyn.hamito(gegner)
                    }

                    3 -> {
                        evelyn.derDolch(gegner)
                    }

                    4 -> {
                        evelyn.dieOhrfeige(gegner)
                    }
                    5 -> {
                        beutel.heiltrank(evelyn)
                    }
                    6 -> {
                        beutel.vitamine(evelyn)
                    }
                }
            }
        } while (richtigeEingabe)
    }

    fun angriffwahlenJonathan(jonathan: Jonathan, gegner: Person) {
        do {

            var richtigeEingabe = false


            println(
                "Jonathan fasst sich ein Herz und attackiert mit!Wähle deine Waffe.\n" +
                        "1. dieFackel. \n" +
                        "2. dasGlueck. \n" +
                        "3. dasDynamit. \n" +
                        "4. dieGabel. \n" +
                        "5. Heiltrank. \n" +
                        "6. Vitamine."
            )

            try {
                var eingabe = readln().toInt()
                when (eingabe) {
                    1 -> {
                        jonathan.dieFackel(gegner)
                    }

                    2 -> {
                        jonathan.dasglueck(gegner)
                    }

                    3 -> {
                        jonathan.dasDynamit(gegner)
                    }

                    4 -> {
                        jonathan.dieGabel(gegner)
                    }
                    5 -> {
                        if (!beutel.heiltrank(jonathan)) {
                            richtigeEingabe = true
                            println("Heiltrank aufgebraucht.")
                        }
                    }

                    6 -> {
                        if (!beutel.vitamine(jonathan)) {
                            richtigeEingabe = true
                            println("Vitamine aufgeabraucht.")}
                    }
                }
            } catch (e: Exception) {
                println("Gebe eine Zahl ein.")

                var eingabe = readln().toInt()
                when (eingabe) {
                    1 -> {
                        jonathan.dieFackel(gegner)
                    }

                    2 -> {
                        jonathan.dasglueck(gegner)
                    }

                    3 -> {
                        jonathan.dasDynamit(gegner)
                    }

                    4 -> {
                        jonathan.dieGabel(gegner)
                    }
                }
            }
        } while (richtigeEingabe)
    }

    fun angriffwahlenImothep (imothep: Imothep,helden: Person){

        var werte = listOf<Int>(1,2,3,4,5,6)
        var zufaellig = werte.random()
        println("Oh Nein! Jetzt greift Imothep an und setzt seine Kraefte gegen dich ein!")
        when (zufaellig){
            1->{
                imothep.mumifizieren(helden)
            }
            2->{
                imothep.derTodesschrei(helden)
            }
            3-> {
                imothep.derSandsturm(helden)
            }
            4-> {
                imothep.derFluch(helden)
            }
            5-> {
                imothep.dieTotenGraeber(helden)
            }
            6->{
                imothep.dieKaefer(helden)
            }
        }
    }

    fun angriffwahlenbenni (benni: Benni,helden: Person) {

        var werte = listOf<Int>(1, 2, 3, 4)
        var zufaellig = werte.random()
        println("Benni der fiese Schurke greift dich an,pass auf!")
        when (zufaellig) {
            1 -> {
                benni.amulet(helden)
            }

            2 -> {
                benni.luegen(helden)
            }

            3 -> {
                benni.messer(helden)
            }

            4 -> {
                benni.sand()

            }
        }}
}


