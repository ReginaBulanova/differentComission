package ru.netology

var comission: Double = TODO()
fun main() {
    val cardVisa = Card("VISA", 0, 1500, 80)
    val cardMaestro = Card("Maestro", 0, 10000000, 789)
    val cardVK = Card("VK Pay", 1230000, 12096, 10009)
    val cardMir = Card("MIR", 0, 1395, 2237)
    val cardMir2 = Card("MIR", 10000, 1234, 34567)
    val cardMaster = Card("MasterCard", 99, 1000, 1230087)

    comissionBasedOnType("VISA", 1500)
    limitations("VISA", 0)
    transaction(80, 1500, comissionBasedOnType("VISA", 1500))
}

fun comissionBasedOnType(cardType: String, sumToTransact: Int): Double {
    if (cardType == "VK Pay") {
        comission = 0.0
    } else {
        if (cardType == "MasterCard" || cardType == "Maestro") {
            if (300 < sumToTransact && sumToTransact < 75000)
                comission = 0.06 * sumToTransact + 20 * 100
        } else {
            if ((cardType == "VISA" || cardType == "MIR") && sumToTransact > 35)
                comission = 0.75 * sumToTransact
        }
    }
    return comission
}

fun limitations(cardType: String, transactedLastMonth: Int) {
    if (cardType == "VK Pay") {
        if (transactedLastMonth > 15000 || transactedLastMonth < 40000)
            print("loading...")
    } else {
        print("Операция разрешена")
    }
}
fun transaction (sumCard: Int, sumToTransact: Int, comission: Double): Double {
    print(sumCard - sumToTransact - comission)
    print("операция прошла")
    return comission
}





