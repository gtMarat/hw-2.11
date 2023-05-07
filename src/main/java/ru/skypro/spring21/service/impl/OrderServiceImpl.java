package ru.skypro.spring21.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.spring21.repository.OrderRepository;
import ru.skypro.spring21.service.OrderService;

import java.util.List;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Set<Integer> add(List<Integer> ids) {
        return orderRepository.add(ids);
    }

    @Override
    public Set<Integer> get() {
        return orderRepository.get();
    }
}