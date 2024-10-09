public class Task06 {
    public static void main(String[] args) {

        String stars = "";
        int index = 5;

        for (int x = 1; x <= 5; x++) {
            for (int i = index; i >= 1; i--) {

                stars = stars + "*";
            }
            System.out.println(stars);
            index = index - 1;
            stars = "";
        }

    }
}
