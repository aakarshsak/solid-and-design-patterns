package com.upgrad.designpatterns.creational.factory.good;


public class WebsiteFactory {
    public static Website getWebsite(String type) {
        switch (type) {
            case "Blog": {
                return new Blog();
            }

            case "ECommerce": {
                return new ECommerce();
            }

            default: {
                return null;
            }
        }
    }

}
