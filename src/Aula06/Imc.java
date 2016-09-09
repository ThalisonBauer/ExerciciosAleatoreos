package Aula06;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        float peso;
        float altura;
        float imc;
        String sexo;
            System.out.println("Informe sua Altura");
                altura=tc.nextFloat();
            System.out.println("Informe seu peso");
                peso=tc.nextFloat();
            System.out.println("M = Masculino :: F = Feminino");
                sexo=tc.next();
                sexo = sexo.toLowerCase();
                imc = peso/(altura*altura);

        switch (sexo)
        {
            case "m":
            {
                if (imc < 20.7){
                    System.out.println("Abaixo do peso Ideal");
                } else if(imc>20.7 && imc < 26.4){
                    System.out.println("No peso Ideal");
                } else if(imc>26.4 && imc < 27.8){
                    System.out.println("Marginalmente acima do peso");
                } else if(imc>27.8 && imc < 31.1){
                    System.out.println("Acima do peso ideal");
                }else{
                    System.out.println("OBESO #PARTIUFITNESS");
                }
                break;
            }
            case "f":
            {
                if (imc < 19.1){
                    System.out.println("Abaixo do peso Ideal");
                } else if(imc>19.1 && imc < 25.8){
                    System.out.println("No peso Ideal");
                } else if(imc>25.8 && imc < 27.3){
                    System.out.println("Marginalmente acima do peso");
                } else if(imc>27.3 && imc < 32.3){
                    System.out.println("Acima do peso ideal");
                }else{
                    System.out.println("OBESO #PARTIUFITNESS");
                }
                break;
            }

        }

    }
}
