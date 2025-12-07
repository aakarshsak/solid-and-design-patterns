package com.upgrad.designpatterns.creational.factory.bad;

import com.upgrad.designpatterns.creational.factory.good.*;

import java.util.ArrayList;
import java.util.List;

public class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website(String type) {
        this.createWebsite(type);
    }

    public List<Page> getPages() {
        return pages;
    }

    public void createWebsite(String type){
        if(type == "Blog") {
            pages.add(new AboutPage());
            pages.add(new CommentPage());
            pages.add(new ContactPage());
        } else {
            pages.add(new HomePage());
            pages.add(new CartPage());
            pages.add(new SearchPage());
        }
    }

}
