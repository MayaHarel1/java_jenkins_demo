public class HelloWorld {
    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "World";
        String env = (args.length > 1) ? args[1] : "DEV";

        System.out.println("Hello, " + name + "!");
        System.out.println("Environment: " + env);
    }
}
