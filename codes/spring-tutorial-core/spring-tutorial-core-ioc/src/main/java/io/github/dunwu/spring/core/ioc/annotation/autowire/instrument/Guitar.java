package io.github.dunwu.spring.core.ioc.annotation.autowire.instrument;

public class Guitar implements Instrument {

    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("弹奏吉他");
    }

}
