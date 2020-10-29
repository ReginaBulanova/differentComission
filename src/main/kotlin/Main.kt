package ru.netology

fun main() {
    val cardVisa = Card("VISA", 0, 1500.0, 80.0)
    val cardMaestro = Card("Maestro", 0, 10000000.8, 789.0)
    val cardVK = Card("VK Pay", 1230000, 12096.7, 10009.0)
    val cardMir = Card("MIR", 0, 1395.0, 2237.0)
    val cardMir2 = Card("MIR", 10000, 1234.9, 34567.9)
    val cardMaster = Card("MasterCard", 99, 1000.0, 1230087.0)

    comissionBasedOnType("VISA", 1500.0)
    limitations("VISA", 0)
    transaction(80.0, 1500.0, comissionBasedOnType("VISA", 1500.0))
}

fun limitations(cardType: String, transactedLastMonth: Int) {
    if (cardType == "VK Pay") {
        if (transactedLastMonth > 15000 || transactedLastMonth < 40000)
            print("loading...")
    } else {
        print("Операция разрешена. ")
    }
}









