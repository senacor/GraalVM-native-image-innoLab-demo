package de.senacor.innolab.graalvm.demo.lambda;

import com.amazonaws.serverless.proxy.model.*;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets = {
        AlbContext.class,
        ApiGatewayAuthorizerContext.class,
        ApiGatewayRequestIdentity.class,
        AwsProxyResponse.class,
        AwsProxyRequest.class,
        AwsProxyRequestContext.class,
        CognitoAuthorizerClaims.class,
        Headers.class
})
public class ReflectionConfig {
}
