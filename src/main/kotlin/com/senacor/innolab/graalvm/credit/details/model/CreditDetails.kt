package com.senacor.innolab.graalvm.credit.details.model

import io.micronaut.core.annotation.Introspected
import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDate

@Introspected
class CreditDetails(

    var id: String,

    var amount: BigDecimal,

    @JsonFormat(pattern = "yyyy-MM-dd")
    var start: LocalDate,

    @JsonFormat(pattern = "yyyy-MM-dd")
    var end: LocalDate,

    var interestRate: BigDecimal
) {

    companion object {
        fun of(id: String, amount: BigDecimal, startDate: String, endDate: String, interestRate: BigDecimal) =
            CreditDetails(
                id,
                amount,
                LocalDate.parse(startDate),
                LocalDate.parse(endDate),
                interestRate
            )
    }
}