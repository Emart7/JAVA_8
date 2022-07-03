package model;

import java.util.function.Consumer;

public class Consumidor implements Consumer<String> {


    @Override
    public void accept(String s) {
        if (s.length() < 15){
            System.out.println(s);
        }
    }
}
