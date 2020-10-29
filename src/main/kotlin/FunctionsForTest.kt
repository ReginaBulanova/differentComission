package ru.netology


private var comission: Double = 0.0
fun comissionBasedOnType(cardType: String, sumToTransact: Double): Double {
    if (cardType == "VK Pay") {
        comission = 0.0
    } else {
        if (cardType == "MasterCard" || cardType == "Maestro") {
            if (sumToTransact in 301.0..74999.0)
                comission = 0.06 * sumToTransact + 20
        } else {
            if ((cardType == "VISA" || cardType == "MIR") && sumToTransact > 35)
                comission = 0.075 * sumToTransact
        }
    }
    return comission
}

fun transaction(sumCard: Double, sumToTransact: Double, comission: Double): Double {
    print("Баланс карты стал: ")
    print(sumCard - sumToTransact - comission)
    print(" операция прошла")
    return comission
}
