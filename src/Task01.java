public class Task01 {
    public static void main(String[] args) {

        String oneToThirty = "";

        for (int i = 0; i <= 30; i ++) {
            if (oneToThirty.equals("")) {
                oneToThirty = "" + i;
            } else {
                oneToThirty = oneToThirty + ", " + i;
            }
        }
        System.out.println(oneToThirty);

    }
}