package ru.skypro.spring21.service;

import java.util.List;
import java.util.Set;

public interface OrderService {
    Set<Integer> add(List<Integer> list);
    Set<Integer> get();

}
