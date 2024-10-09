public class Task04 {
    public static void main(String[] args) {

        String tenToZero = "";

        for (int i = 10; i >= 0; i = i - 2) {
            if (tenToZero.equals("")) {
                tenToZero = "" + i;
            } else {
                tenToZero = tenToZero + ", " + i;
            }
        }
        System.out.println(tenToZero);

    }
}