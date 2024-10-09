public class Task02 {
    public static void main(String[] args) {

        String thirtyToOne = "";

        for (int i = 30; i >= 0; i --) {
            if (thirtyToOne.equals("")) {
                thirtyToOne = "" + i;
            } else {
                thirtyToOne = thirtyToOne + ", " + i;
            }
        }
        System.out.println(thirtyToOne);

    }
}