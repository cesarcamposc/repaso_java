package repetitivas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //declarando variables
        int anios;
        String tipoTrabajador;
        double sueldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar número en años : ");
        anios = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresar el tipo trabajador : ");
        tipoTrabajador = sc.nextLine();

        System.out.println("Ingresar el sueldo : ");
        sueldo = sc.nextDouble();

        //probar el método calculaSueldoNanios
        double calcularSueldo = calculaSueldoNanios(anios, tipoTrabajador,sueldo);
        System.out.printf(" El sueldo es : %.2f \n", calcularSueldo);

        //probar el método calculaPorcentajeAumento
        double aumento = calculaPorcentajeAumento(anios,tipoTrabajador,sueldo);
        System.out.printf(" El porcentaje de aumento después de N años es  %.2f \n: ", aumento);

    }

    public static double calculaSueldoNanios(int anios, String tipoTrabajador, double sueldo){
        double nuevosueldo = sueldo;
        if (tipoTrabajador.equals("gerente")){
            for (int i = 1; i<= anios;  i++){
                if(i%4==0){
                    nuevosueldo = nuevosueldo +nuevosueldo*0.18;
                }else {
                    nuevosueldo = nuevosueldo + nuevosueldo*0.14;
                }
            }
        }else {
            for (int i = 1; i<= anios;  i++){
                if(i%4==0){
                    nuevosueldo = nuevosueldo + nuevosueldo*0.12;
                    //nuevosueldo += nuevosueldo*0.12;
                }else {
                    nuevosueldo = nuevosueldo + nuevosueldo*0.08;
                }
            }

        }
        return nuevosueldo;

    }

    public static double calculaPorcentajeAumento(int anios, String tipoTrabajador, double sueldo){
        double sueldoTotal = calculaSueldoNanios(anios, tipoTrabajador, sueldo);
        double porcentajeAumento = sueldoTotal*100/sueldo - 100;

        return porcentajeAumento;
    }
}
