package es1;

public class esercizio_1 {
    public static void main(String[] args){
        String inputString = "Esempio esercizio uno";
        boolean result = stringaPariDispari(inputString);
        System.out.println("La lunghezza della stringa é pari? " + result);
    }
     public static boolean stringaPariDispari(String input) {
         int lunghezza = input.length();
         if (lunghezza % 2 == 0) {
             return true;
         } else {
             return false;
         }
     }
}
