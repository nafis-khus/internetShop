package com.example.myShop.domain.dto.user;

import com.example.myShop.domain.entity.Order;
import com.example.myShop.domain.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static lombok.AccessLevel.PRIVATE;

/**
 * @author nafis
 * @since 20.12.2021
 */

@Value
@Builder
@Jacksonized
@AllArgsConstructor(access = PRIVATE)
public class UserDto {
    int id;
    String name;
    String phone;
    String email;
    String password;

    List<Order> orders;
}