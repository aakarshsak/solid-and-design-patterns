package com.upgrad.designpatterns.structural.composite.tree;

import java.util.ArrayList;
import java.util.List;

public abstract class TreeComponent {
    String name;
    String value;
    List<TreeComponent> treeComponentList = new ArrayList<>();

    public abstract String toString();

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    String print(TreeComponent treeComponent) {
        StringBuilder sb = new StringBuilder(name);
        sb.append(" = ");
        sb.append(value);
        sb.append("\n");
        return sb.toString();
    }

}
