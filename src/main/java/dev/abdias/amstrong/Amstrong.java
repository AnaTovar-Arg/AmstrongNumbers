package dev.abdias.amstrong;

public class Amstrong {

    public Amstrong(){
        
    }

    public static boolean isAmstrongNumnb(int numb){
        String numbString = Integer.toString(numb);
        int result = 0;
        for(int i = 0; i< numbString.length(); i++){
            result += Math.pow(Character.getNumericValue(numbString.charAt(i)), numbString.length());
        }
        if(result == numb) return true;
        return false;
    }
}
