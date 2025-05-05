public class greeter {

    void greet() {
        System.out.println("Hello there!");
    }
    public static void main(String[]args){
        (new greeter()).greet();
    }
}