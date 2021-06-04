package de.senacor.innolab.graalvm.demo.customer.mapper;

import de.senacor.innolab.graalvm.demo.customer.controller.openapiMock.model.CustomerDto;
import de.senacor.innolab.graalvm.demo.customer.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDto toDto(final Customer customer) {
        return new CustomerDto()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .dateOfBirth(customer.getDateOfBirth())
                .income(customer.getIncome());
    }
}
