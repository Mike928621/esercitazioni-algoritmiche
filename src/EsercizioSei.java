public class EsercizioSei {
    public static void main(String[]args){
        final short annoNascita = 2000;
        short annoAttuale = 2025;

        int eta = annoAttuale-annoNascita;
        if((eta+1)%2 == 0){
            System.out.println("Il numero dei miei anni + 1 è PARI");
        }else{
            System.out.println("Il numero dei miei anni + 1 è DISPARI");
        }
    }
}
