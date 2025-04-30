package com.jothisri.customer_orders.repository;

import com.jothisri.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
