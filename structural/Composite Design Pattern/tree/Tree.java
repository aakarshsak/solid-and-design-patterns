package com.upgrad.designpatterns.structural.composite.tree;

public class Tree extends TreeComponent{

    public Tree(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void addComponent(TreeComponent treeComponent){
        treeComponentList.add(treeComponent);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String printValue = print(this);
        sb.append(printValue);

        for (TreeComponent treeComponent : treeComponentList) {
            sb.append(treeComponent.toString());
        }
        return sb.toString();
    }
}
