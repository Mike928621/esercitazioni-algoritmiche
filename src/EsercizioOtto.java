public class EsercizioOtto {
    public static void main(String[]args){
        String stringa = "Ciao Mondo";

        int primaOccorrenza_o = stringa.indexOf("o");
        if(primaOccorrenza_o%2 == 0){
            System.out.println("Il primo indice della lettera 'o' è pari? SI");
        }else{
            System.out.println("Il primo indice della lettera 'o' è dispari");
        }

    }
}
