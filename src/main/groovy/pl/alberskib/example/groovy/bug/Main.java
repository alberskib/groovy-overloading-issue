package pl.alberskib.example.groovy.bug;

public class Main {

    public static void main(String[] args) {
        IGroovyBugSpecialized gj = new GroovyBugJ2();
        System.out.println("### JAVA ###");
        gj.method1(new Integer(0));
        gj.method1(new String("a"));

        System.out.println("### GROOVY ###");
        IGroovyBugSpecialized g = new GroovyBugG();
        g.method1(new Integer(0));
        g.method1(new String("a"));
    }
}
