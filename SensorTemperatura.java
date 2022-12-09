package PkgTemperatura;

import java.sql.Date;
// import java.time.LocalDate;
// import java.util.Arrays;
import java.util.Random;

public class SensorTemperatura {
  
    public void main(String[] args) {
        int[] vet;
        int num = 70;
        Random r = new Random();
        Date date = new Date(num);
        int aux = 0;
        vet = new int[48];
        
        //ALGORITMO DE PREENCHIMENTO DE TABELA COM NUMEROS ALEATORIOS
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(num);
        }
        
        // System.out.println(Arrays.toString(vet)); 
        
        //ALGORITMO DE ORDENAÇÃO
        for (int i = 0; i <= vet.length; i++) {//LEITURA DE LINHAS DETERMINADAS NO VETOR
            for (int j = 0; j < vet.length - 1; j++)//VERIFICAÇÃO DO NUMERO EM CADA LINHA
                if (vet[j] >= vet[j + 1]) {//CONDIÇÃO PARA COMEÇAR A ORDENAÇÃO
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
            }
        }

        // System.out.println(Arrays.toString(vet)); 

        //IMPRESSAO NA TELA
        System.out.println("--==**TEMPERATURA**==--");
        for (int j = 0; j < vet.length; j++) {
            // date = new Date();  //ATUAL QUE É 30*60*1000.
            System.out.printf("Temperatura: " + vet[j] + "C");
            System.out.printf(" - Data/Hora: " + date);
            System.out.println("");
        }
    }
        
}
