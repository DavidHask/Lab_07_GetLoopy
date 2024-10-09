public class Task03 {
    public static void main(String[] args) {

        String zeroToEighteen = "";

        for (int i = 0; i <= 18; i = i + 3) {
            if (zeroToEighteen.equals("")) {
                zeroToEighteen = "" + i;
            } else {
                zeroToEighteen = zeroToEighteen + ", " + i;
            }
        }
        System.out.println(zeroToEighteen);

    }
}