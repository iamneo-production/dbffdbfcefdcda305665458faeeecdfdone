package com.example.demo.model;

public class Laptop {
    private int laptopId;
        private String laptopBrand;
            private int laptopPrice;

                public Laptop(int laptopId, String laptopBrand, int laptopPrice) {
                        this.laptopId = laptopId;
                                this.laptopBrand = laptopBrand;
                                        this.laptopPrice = laptopPrice;
                                            }

                                                public int getLaptopId() {
                                                        return laptopId;
                                                            }

                                                                public void setLaptopId(int laptopId) {
                                                                        this.laptopId = laptopId;
                                                                            }

                                                                                public String getLaptopBrand() {
                                                                                        return laptopBrand;
                                                                                            }

                                                                                                public void setLaptopBrand(String laptopBrand) {
                                                                                                        this.laptopBrand = laptopBrand;
                                                                                                            }

                                                                                                                public int getLaptopPrice() {
                                                                                                                        return laptopPrice;
                                                                                                                            }

                                                                                                                                public void setLaptopPrice(int laptopPrice) {
                                                                                                                                        this.laptopPrice = laptopPrice;
                                                                                                                                            }

                                                                                                                                                @Override
                                                                                                                                                    public String toString() {
                                                                                                                                                            return "Laptop{" +
                                                                                                                                                                            "laptopId=" + laptopId +
                                                                                                                                                                                            ", laptopBrand='" + laptopBrand + '\'' +
                                                                                                                                                                                                            ", laptopPrice=" + laptopPrice +
                                                                                                                                                                                                                            '}';
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                }