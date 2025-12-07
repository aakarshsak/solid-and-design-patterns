package com.upgrad.designpatterns.creational.builder.good;

public class Pizza {
    private final String base;
    private final String dressing;
    private final String meat;

    public static class Builder {
        private String base;
        private String dressing;
        private String meat;

        public Builder() {

        }

        public Pizza build() {
            return new Pizza(this);
        }

        public Builder base(String base) {
            this.base = base;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

    }

    private Pizza(Builder builder) {
        this.base = builder.base;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBase() {
        return base;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

}

