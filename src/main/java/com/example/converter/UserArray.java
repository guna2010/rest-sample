package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Collector;
public class UserArray {
    public List<User2> getItems() {
        return items;
    }

    public void setItems(List<User2> items) {
        this.items = items;
    }
    void test(){

        items.stream().collect(Collectors.groupingBy(s->s.getTitle()));
    }


    List<User2> items;
}
