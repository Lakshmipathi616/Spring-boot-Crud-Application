package com.SpringCrud.SpringApplication.CustomerServices;

import com.SpringCrud.SpringApplication.entity.Customer;

public interface CustomerServiceIMPL implements CustomerService
{
    @Autowired
    CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO)
    {
        Customer customer = new Customer(
                customerSaveDTO.getCustomername(),
                customerSaveDTO.getCustomeraddress(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomername();
    }
    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> getCustomers = customerRepo.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for(Customer a:getCustomers)
        {
            CustomerDTO customerDTO = new CustomerDTO(
                    a.getCustomerid(),
                    a.getCustomername(),
                    a.getCustomeraddress(),
                    a.getMobile()
            );
            customerDTOList.add(customerDTO);
        }
        return  customerDTOList;
    }
    @Override
    public String updateCustomers(CustomerUpdateDTO customerUpdateDTO)
    {
        if (customerRepo.existsById(customerUpdateDTO.getCustomerid())) {
            Customer customer = customerRepo.getById(customerUpdateDTO.getCustomerid());
            customer.setCustomername(customerUpdateDTO.getCustomername());
            customer.setCustomeraddress(customerUpdateDTO.getCustomeraddress());
            customer.setMobile(customerUpdateDTO.getMobile());
            customerRepo.save(customer);
        }
        else
        {
            System.out.println("Customer ID do not Exist");
        }
        return null;
    }
    @Override
    public boolean deleteCustomer(int id) {
        if(customerRepo.existsById(id))
        {
            customerRepo.deleteById(id);
        }
        else
        {
            System.out.println("customer id not found");
        }
        return true;
    }
}

