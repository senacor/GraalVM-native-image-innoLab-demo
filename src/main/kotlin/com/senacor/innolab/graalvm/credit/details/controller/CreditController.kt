package com.senacor.innolab.graalvm.credit.details.controller

import com.senacor.innolab.graalvm.credit.details.model.CreditDetails
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.reactivex.Flowable
import org.slf4j.LoggerFactory
import java.math.BigDecimal

import java.util.*
import javax.annotation.PostConstruct
import javax.inject.Inject

@Controller("/credit")
class CreditController() {

    private val logger = LoggerFactory.getLogger(javaClass.name)

    @Get("/{creditId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getCreditDetails(creditId: String): CreditDetails {
        logger.info("Looking up credit details with ID $creditId")
        val creditDetails = CreditDetails.of(
                "123456",
                BigDecimal.valueOf(123456),
                "2020-01-01",
                "2020-12-31",
                BigDecimal.valueOf(1)
            )

        logger.info("Result: ${creditDetails}")
        return creditDetails
    }
}
