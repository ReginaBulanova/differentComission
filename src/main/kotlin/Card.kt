package ru.netology

class Card constructor(var cardType: String, var transactedLastMonth: Int, var sumToTransact: Int, var sumCard: Int) {
    init {
        this.cardType = cardType
        this.transactedLastMonth = transactedLastMonth
        this.sumToTransact = sumToTransact
        this.sumCard = sumCard
    }

}