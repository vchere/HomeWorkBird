package com.company;

abstract class Bird {
    boolean feathers;
    int eggs;
}
abstract class FlyingBird extends Bird {
    abstract void fly();
}
abstract class NonflyingBird extends Bird {
    abstract void run();
}
class Eagle extends FlyingBird {
    @Override
    void fly() {
        System.out.println("visoko");
    }
}
class Swallow extends FlyingBird {
    @Override
    void fly() {
        System.out.println("nizko");
    }
}
class Penguin extends NonflyingBird {
    @Override
    void run() {
        System.out.println("neukluge");
    }
}
class Kiwi extends NonflyingBird {
    @Override
    void run() {
        System.out.println("nu toge tak sebe");
    }
}