import java.util.Scanner;

public class HelloWorld {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void sayHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        sayHello(name);
    }
}
