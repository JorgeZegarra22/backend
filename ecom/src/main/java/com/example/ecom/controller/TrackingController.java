package com.example.ecom.controller;


import com.example.ecom.dto.OrderDto;
import com.example.ecom.services.customer.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequiredArgsConstructor
public class TrackingController {

    private final CartService cartService;

    public ResponseEntity<OrderDto> searchOrderByTrackingId(@PathVariable UUID trackingId){
        OrderDto orderDto = cartService.searchOrderByByTrackingId(trackingId);
        if(orderDto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(orderDto);
    }
}
