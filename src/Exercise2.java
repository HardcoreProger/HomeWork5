public class Exercise2 {
    public static void main(String [] args) {
        int a = 5, inca = a-- - --a + ++a + a++ + a;
        int b = 8, incb = ++b - b++ + ++b - --b;;
        System.out.println(inca + "\n" + incb);
    }
}
