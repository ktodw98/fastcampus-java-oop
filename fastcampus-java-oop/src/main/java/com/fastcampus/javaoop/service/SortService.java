package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        Sort<String> sort = new JavaSort<>();

        return sort.sort(list);
    }
}
