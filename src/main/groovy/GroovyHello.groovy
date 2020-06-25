class GroovyHello {
    public static void main(String[] args) {
        def javaHello = new JavaHello()
        def message = javaHello.message
        println message
    }
}
