package com.example.myShop.repository;

import com.example.myShop.domain.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author nafis
 * @since 19.12.2021
 */

public interface OrderRepository extends PagingAndSortingRepository<Order, Integer> {
}
