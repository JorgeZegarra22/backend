package com.example.ecom.services.admin.adminOrder;

import com.example.ecom.dto.AnalyticsResponse;
import com.example.ecom.dto.OrderDto;
import com.example.ecom.entity.Order;
import com.example.ecom.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AdminOrderService {

    List<OrderDto> getAllPlacedOrders();

    OrderDto changeOrderStatus(Long orderId, String status);
    AnalyticsResponse calculateAnalytics();

}
