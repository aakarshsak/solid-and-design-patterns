package com.upgrad.designpatterns.principles.lsp.bad;

public class Lion extends Animal{
    @Override
    public void eatGrass() throws Exception {
        throw new Exception("Hey!!! I won't eat Grass.");
    }
}
