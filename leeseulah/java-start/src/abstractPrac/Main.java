package abstractPrac;

abstract class Animal {
    String name;
    
    // 일반 메서드
    public void sleep() {
        System.out.println(name + "이 자고 있습니다.");
    }
    
    // 추상 메서드
    public abstract void sound();
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    // 추상 메서드 구현
    @Override
    public void sound() {
        System.out.println(name + "가 멍멍 소리를 냅니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("강아지");
        dog.sleep();
        dog.sound();
    }
}
