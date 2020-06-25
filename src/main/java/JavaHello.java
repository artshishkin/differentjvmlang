public class JavaHello {
    public static void main(String[] args) {
        String message = new JavaHello().message;
        System.out.println(message);
    }

    private String message = "hello art";

    public String getMessage() {
        return message;
    }
}
