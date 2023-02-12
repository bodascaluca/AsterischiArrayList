import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        quanti asterischi dovevamo mettere per rappresentare le vendite dei negozi.
        Si potrebbe rifare utilizzando gli arrayList. In questo caso si potrebbe fare che l'inserimento è indefinito e termina quando inseriamo un valore negativo .
        Raccolti i dati si possono stampare gli asterischi e magari mettendo in ordine i negozi in base alle vendite (da quello che ha venduto di piu' a scendere)
        * */

        //1) Scanner inserimento di dati fino a un dato negativo
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> lista = new ArrayList<>();
        boolean flag= true;

        do{
            System.out.println("Inserisci le vendite dei negozi");
            float incasso = scanner.nextFloat();
            //2) Raccogli in un ArrayList
            if(incasso>0){
                lista.add(incasso);
                flag=true;
            }else{
                flag=false;
            }
        }while(flag);

        Collections.sort(lista);
        System.out.println(lista);

        for(int i=0; i<lista.size(); i++){
            float contenuto = lista.get(i);

            int numAsterishi = 0;
            if(contenuto>1000){
                 numAsterishi = (int) (contenuto/100);
            }else if(contenuto<1000){
                 numAsterishi = (int) (contenuto/10);
            }

            System.out.print("Negozio "+(i+1)+" :");
            for (int l = 0; l<=numAsterishi;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
