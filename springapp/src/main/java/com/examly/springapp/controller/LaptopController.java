package com.example.demo.controller;

import com.example.demo.model.Laptop;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class LaptopController {
    @Autowired
        private ApiService apiService;

            @PostMapping("/")
                public boolean addLaptop(@RequestBody Laptop laptop) {
                        apiService.addLaptop(laptop);
                                return true;
                                    }

                                        @GetMapping("/{laptopId}")
                                            public Laptop getLaptop(@PathVariable int laptopId) {
                                                    return apiService.getLaptop(laptopId);
                                                        }

                                                            @GetMapping("/")
                                                                public List<Laptop> getAllLaptops() {
                                                                        return apiService.getAllLaptops();
                                                                            }
                                                                            }

                                                    