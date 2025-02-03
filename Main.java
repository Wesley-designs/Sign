public class Main {
    public static void main(String[] args) {
        Sign sign1 = new Sign("ABC222DE", 3);
        System.out.println(sign1.NumberOfLines());
        System.out.println(sign1.getLines());
        Sign sign2 = new Sign("ABCD", 10);
    }
}