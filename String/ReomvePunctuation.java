package SelfPrograms.String;

//............................................... Welly edge Code ..........................................//

import java.util.Scanner;

public class ReomvePunctuation {

    //............................................................................//
    public static boolean isPunctuation(char c){                  //function declaration
        return c=='.' || c==',' || c=='?' || c=='!' || c=='-' || c==':';
    }

    public static String removePunctuation(String ab){           //function declaration

        StringBuilder res = new StringBuilder();

        for (char c : ab.toCharArray()){                 //toCharArray() - convert String input into Character Array
            if (!isPunctuation(c)){                     //function call
                res.append(c);                         //append() - add character in the string
            }
        }
        return res.toString();
    }
    //............................................................................//

    public static void main(String[] args) {

        System.out.println("Enter String With Punctuations :- ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = removePunctuation(str);                               //function call

        System.out.println("String without Punctuations :- " + result);
    }

}


