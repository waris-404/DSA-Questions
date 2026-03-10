public class CompressString {

    public static void main(String[] args) {

        String s="aabbbbeeeeffggg";

        int count=1;

        for(int i=1;i<=s.length();i++){

            if(i<s.length() && s.charAt(i)==s.charAt(i-1))
                count++;
            else{
                System.out.print(s.charAt(i-1)+""+count);
                count=1;
            }
        }
    }
}