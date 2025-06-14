package com.SpringCrud.SpringApplication.CustomerServices;

import com.SpringCrud.SpringApplication.DTO.CustomerDTO;
import com.SpringCrud.SpringApplication.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringApplication.DTO.CustomerUpdateDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Long addCustomer(CustomerSaveDTO customerSaveDTO); // Changed return type to Long for better identification
    List<CustomerDTO> getAllCustomers(); // Changed method name for consistency
    String updateCustomer(CustomerUpdateDTO customerUpdateDTO); // Singular form for clarity
    Optional<CustomerDTO> deleteCustomer(int id); // Using Optional to indicate deletion success and return entity
}
