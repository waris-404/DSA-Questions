public class StringRotation {

    public static void main(String[] args) {

        String s="abcde";
        String goal="cdeab";

        System.out.println((s+s).contains(goal));
    }
}