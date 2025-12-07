package com.upgrad.designpatterns.structural.composite.tree;

public class TreeNode extends TreeComponent {
    public TreeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("     " + name);
        sb.append(" = ");
        sb.append(value);
        sb.append("\n");
        return sb.toString();
    }
}
