public class MoveHash {

    public static void main(String[] args) {

        String s="Move#Hash#to#Front";

        String hash="";
        String text="";

        for(char c:s.toCharArray()){

            if(c=='#')
                hash+=c;
            else
                text+=c;
        }

        System.out.println(hash+text);
    }
}