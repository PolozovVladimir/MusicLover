import kotlin.time.times

fun main(){


    var amountPurchase = readLine()!!.toDouble()
    val noDiscount: Int = 1000
    val discountHundred: Int = 10000
    val discountVip: Double = 0.99
    val discountFivePercent: Int = 1

    var totalPrice: Double = if (amountPurchase > noDiscount && amountPurchase < discountHundred) amountPurchase - 100
    else if (amountPurchase > discountHundred) amountPurchase * 0.95 else amountPurchase

    println("Стоимость покупки с учётом скидки составит: " + totalPrice)
    var totalPriceVip: Double = totalPrice * discountVip

    println("Стоимость покупки для постоянного покупателя составит: " + totalPriceVip)

}