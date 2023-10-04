package com.example.demo.service;

import com.example.demo.model.Laptop;

import java.util.ArrayList;
import java.util.List;

public class ApiService {
    private List<Laptop> laptopList = new ArrayList<>();

        public Laptop addLaptop(Laptop laptop) {
                laptopList.add(laptop);
                        return laptop;
                            }

                                public Laptop getLaptop(int laptopId) {
                                        return laptopList.stream()
                                                        .filter(laptop -> laptop.getLaptopId() == laptopId)
                                                                        .findFirst()
                                                                                        .orElse(null);
                                                                                            }

                                                                                                public List<Laptop> getAllLaptops() {
                                                                                                        return laptopList;
                                                                                                            }
                                                                                                            }