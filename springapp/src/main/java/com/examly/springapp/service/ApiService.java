package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApiService {
    private final Map<Integer, Laptop> laptopMap = new HashMap<>();

        public boolean addLaptop(Laptop laptop) {
                if (laptopMap.containsKey(laptop.getLaptopId())) {
                            return false; // Laptop with the same ID already exists
                                    }
                                            laptopMap.put(laptop.getLaptopId(), laptop);
                                                    return true;
                                                        }

                                                            public Laptop getLaptopById(int laptopId) {
                                                                    return laptopMap.getOrDefault(laptopId, null);
                                                                        }

                                                                            public List<Laptop> getAllLaptops() {
                                                                                    return new ArrayList<>(laptopMap.values());
                                                                                        }
                                                                                        }
                                                                                        