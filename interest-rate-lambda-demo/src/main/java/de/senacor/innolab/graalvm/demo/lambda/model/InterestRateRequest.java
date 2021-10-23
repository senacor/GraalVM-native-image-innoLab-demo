package de.senacor.innolab.graalvm.demo.lambda.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class InterestRateRequest {
    private CustomerDetails customerDetails;
    private CreditDetails creditDetails;
}