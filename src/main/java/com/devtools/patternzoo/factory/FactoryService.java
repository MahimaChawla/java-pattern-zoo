package com.devtools.patternzoo.factory;

public class FactoryService {
    public static void main(String[] args) {
        AutowiredDemo autowire = new AutowiredDemo("DEVELOPMENT");
        autowire.showBean();
    }
}
