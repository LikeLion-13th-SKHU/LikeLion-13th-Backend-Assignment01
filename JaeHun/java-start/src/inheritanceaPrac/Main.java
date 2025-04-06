package inheritanceaPrac;

class animal {
    private String name;

    public animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends animal {
    private int leg;

    public Dog(String name, int leg) {
        super(name);
        this.leg = leg;
    }

    public void introduce() {
        System.out.println(getName() + "의 다리 수는 " + leg + "개입니다.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("강아지", 4);
        dog.introduce();
    }
}