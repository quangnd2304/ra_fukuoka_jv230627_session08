package ra.polymorphism;

public class ClassB extends ClassA{
    //Phương thức ghi đè

    public void sayHello(){
        System.out.println("Chào Linh xấu xí");
    }

    public String toString(){
        return "Đã ghi đề phương thức toString của lớp Object";
    }
}
