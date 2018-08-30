package com.study.vipoliveira.creditcard.repository

import com.study.vipoliveira.creditcard.model.PaymentMethod
import io.reactivex.Single

interface CreditCardRepository {
    fun getPayment(): Single<MutableList<PaymentMethod>>
}