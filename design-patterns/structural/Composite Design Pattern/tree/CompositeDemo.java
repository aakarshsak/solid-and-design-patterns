package com.upgrad.designpatterns.structural.composite.tree;

public class CompositeDemo {
    public static void main(String[] args) {
        Tree tree = new Tree("Universe", "Marvel");

        tree.addComponent(new TreeNode("Hero", "Spiderman"));

        Tree avengersSubTree = new Tree("Team", "Avengers");
        tree.addComponent(avengersSubTree);
        avengersSubTree.addComponent(new TreeNode("Hero", "Ironman"));
        avengersSubTree.addComponent(new TreeNode("Hero", "Captain America"));

        System.out.println(tree.toString());
    }
}
