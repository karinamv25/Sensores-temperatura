import java.util.Date;
import java.util.Random;

/* Measurement Class - 2022-12-10 - By Karina*/

public class Main {
    
    static void Temperature() {
        int[] vet;
        int min = -10;
        int max = 60;
        Random r = new Random();
        Date date = new Date();
        int aux = 0;
        vet = new int[48];
        
        System.out.println("Starting temperature measurement...");
        
        // ALGORITMO DE SIMULACAO DE CAPTURA DE MEDIDAS DE TEMPERATURA
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(max - min) + min;
        }
        
        // ALGORITMO DE ORDENACAO DAS MEDIDAS
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] >= vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
            }
        }

        // IMPRESSAO DAS MEDIDAS
        System.out.println("--==**TEMPERATURE**==--");

        for (int j = 0; j < vet.length; j++) {
            System.out.println("Temperature: " + vet[j] + "ºC Date/Hour: " + date);
        }
        System.out.println("\n");
    }
    
    static void Humidity() {
        int[] vet;
        int min = 1;
        int max = 80;
        Random r = new Random();
        Date date = new Date();
        int aux = 0;
        vet = new int[48];
        
        System.out.println("Starting humidity measurement...");
        
        //ALGORITMO DE SIMULACAO DE CAPTURA DE MEDIDAS DE UMIDADE
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(max - min) + min;
        }
        
        //ALGORITMO DE ORDENACAO DAS MEDIDAS
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] >= vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
            }
        }

        //IMPRESSAO DAS MEDIDAS
        System.out.println("--==**HUMIDITY**==--");
        for (int j = 0; j < vet.length; j++) {
            System.out.println("Humidity: " + vet[j] + "% - Date/Hour: " + date);
        }
        System.out.println("\n");
    }
    
    static void Co2() {
        int[] vet;
        int min = 1;
        int max = 10;
        Random r = new Random();
        Date date = new Date();
        int aux = 0;
        vet = new int[48];
        
        System.out.println("Starting measurement of Co2 gas generation....");
        
        //ALGORITMO DE SIMULACAO DE CAPTURA DE MEDIDAS DE GERACAO DE CO2
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(max - min) + min;
        }
        
        //ALGORITMO DE ORDENACAO DAS MEDIDAS
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] >= vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
            }
        }

        //IMPRESSAO DAS MEDIDAS
        System.out.println("--==**CO2 GENERATION**==--");
        for (int j = 0; j < vet.length; j++) {
            System.out.println("Co2: " + vet[j] + "% - Date/Hour: " + date);
        }
        System.out.println("\n");
    }

    
	public static void main(String[] args) {
		Temperature();
 		Humidity();
        Co2();
	}
}

