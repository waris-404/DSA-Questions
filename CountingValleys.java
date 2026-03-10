public class CountingValleys {

    public static void main(String[] args) {

        String path="UDDDUDUU";

        int level=0,valley=0;

        for(char step:path.toCharArray()){

            if(step=='U')
                level++;
            else
                level--;

            if(level==0 && step=='U')
                valley++;
        }

        System.out.println(valley);
    }
}