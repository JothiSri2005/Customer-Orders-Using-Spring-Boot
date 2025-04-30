package com.jothisri.customer_orders.repository;

import com.jothisri.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
