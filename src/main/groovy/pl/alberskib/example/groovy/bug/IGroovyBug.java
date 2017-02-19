package pl.alberskib.example.groovy.bug;

import java.io.Serializable;

public interface IGroovyBug<T1, T2 extends Serializable> {
    void method1(T2 t);
    void method1(T1 t);
}
