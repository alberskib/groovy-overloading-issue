package pl.alberskib.example.groovy.bug;

import java.io.Serializable;

public class GroovyBugJ<T1, T2 extends Serializable> implements IGroovyBug<T1, T2> {

    public void method1(T2 t){
        System.out.println("t2");
    }

    public void method1(T1 t){
        System.out.println("t1");
    }
}
