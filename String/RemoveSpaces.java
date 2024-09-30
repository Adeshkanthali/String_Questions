package SelfPrograms.String;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = " I am Adesh ";

        String result = str.replaceAll("[ ]","");

        System.out.println(result);
    }

}



