package com.example.customer.resource;


import com.example.customer.entity.CustomerList;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/shares/{cid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerList searchShareByCustomerIdResource(int userId) {
        return new CustomerList(customerService.searchShareByCustomerId(userId));
    }


}
