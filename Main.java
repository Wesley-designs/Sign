public class Main {
    public static void main(String[] args) {

        Sign sign1 = new Sign("ABC222DE", 3);
        System.out.println(sign1.NumberOfLines());
        System.out.println(sign1.getLines());

        Sign sign2 = new Sign("ABCD", 10);
        System.out.println(sign2.NumberOfLines());
        System.out.println(sign2.getLines());
        
        Sign sign3 = new Sign("ABCDEF", 6);
        System.out.println(sign3.NumberOfLines());
        System.out.println(sign3.getLines());
        
        Sign sign4 = new Sign("", 4);
        System.out.println(sign4.NumberOfLines());
        System.out.println(sign4.getLines());
        
        Sign sign5 = new Sign("AB_CD_EF", 2);
        System.out.println(sign5.NumberOfLines());
        System.out.println(sign5.getLines());
    }
}
