
public abstract class Greeting {

    public abstract void sayHello();

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello syanggg :)");
            }
        };
        greeting.sayHello();
    }
}
