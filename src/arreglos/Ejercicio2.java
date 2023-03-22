package arreglos;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        //declarando variabbles
        int[] nacional = {25000, 18600, 14400, 12000, 30000};
        int[] extranjero = {10000, 5000, 200, 800, 60000};
        String[] platos = {"Lomo Saltado", "Ají de gallina", "Papa rellena", "seco con frejoles", "Pollo a la brasa"};

        //probar el método calcularTotalxPlato
        int[] totalxPlato = calcularTotalxPlato(nacional,extranjero);
        System.out.println("Los totales de cada plato son = " + Arrays.toString(totalxPlato));

        //probar el método calcularPorcentaje
        double[] porcentaje = calcularPorcentaje(nacional,extranjero);
        System.out.println("Los porcentajes de los totales de cada plato son = " + Arrays.toString(porcentaje));

        //probar el método platoMasVendido
        String plato = platoMasVendido(extranjero,nacional,platos);
        System.out.println("El plato más vendido es = " + plato);
    }

    public static int[] calcularTotalxPlato(int[] nacional, int[] extranjero){
        int[] arr = new int[extranjero.length];
        for (int i=0; i< extranjero.length; i++ ){
            arr[i] = nacional[i] + extranjero[i];
        }
        return arr;
    }

    public static double[] calcularPorcentaje(int[] nacional, int[] extranjero){
        int[]  totalxPlato = calcularTotalxPlato(nacional, extranjero);
        int suma = 0;

        for (int i = 0; i<extranjero.length; ++i){
            suma+= totalxPlato[i];// suma = suma + totalxPlato[i];
        }

        double porcentaje;
        double[] arrPorcentaje = new double[extranjero.length];
        for (int i=0; i < extranjero.length;++i){
            porcentaje = totalxPlato[i]*100/suma;
            arrPorcentaje[i] = porcentaje;
        }

        return arrPorcentaje;

    }

    public static String platoMasVendido(int[] nacional , int[] extranjero, String[] platos){
        int[] totalxPlato = calcularTotalxPlato(nacional, extranjero);
        int cantidadMayor = 0;
        int posicion = 0;

        for (int i = 0; i< extranjero.length; ++i){
            if (totalxPlato[i]  > cantidadMayor){
                cantidadMayor = totalxPlato[i];
                posicion = i;
            }
        }
        return platos[posicion];
    }
}
