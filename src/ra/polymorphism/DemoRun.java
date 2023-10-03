package ra.polymorphism;

public class DemoRun {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.sumNumbers(5,7);
        demo.sumNumbers(6.8F,9.2F);
        demo.sumNumbers(5,7,9);
        ClassB b = new ClassB();
        b.sayHello();
        System.out.println(b.toString());
    }
}
