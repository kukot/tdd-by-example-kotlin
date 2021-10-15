package com.kukot

class Franc(amount: Int) : Money(amount) {

    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}
