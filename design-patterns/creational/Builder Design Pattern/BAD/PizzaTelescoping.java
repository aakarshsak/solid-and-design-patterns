package com.upgrad.designpatterns.creational.builder.bad;


public class PizzaTelescoping {
    private String base;
    private String dressing;
    private String meat;

    public PizzaTelescoping(String base) {
        this.base = base;
    }

    public PizzaTelescoping(String base, String dressing) {
        this(base);
        this.dressing = dressing;
    }

    public PizzaTelescoping(String base, String dressing, String meat) {
        this(base, dressing);
        this.meat = meat;
    }

    public String getBase() {
        return this.base;
    }

    public String getDressing() {
        return this.dressing;
    }

    public String getMeat() {
        return this.meat;
    }

}
