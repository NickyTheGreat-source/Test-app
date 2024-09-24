public class ReverseString {

    public static String reverseString(String str){ //ask question, do you want to return or print out

        if(str == null){ //always do this part, check if the string is null, after this write logic
            return null;
        }

        String reversed = ""; //Initialize first

        for (int i = str.length()-1; i >=0; i--){
            reversed += str.charAt(i);

        }
        return reversed;
    }
}
