package ru.skypro.spring21.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
@SessionScope
public class OrderRepository {
    private final Set<Integer> ids = new HashSet<>();

    public Set<Integer> add(List<Integer> ids) {
        this.ids.addAll(ids);
        return this.ids;
    }


    public Set<Integer> get() {
        return ids;

    }

}

