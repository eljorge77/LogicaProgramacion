
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String [] productos  = {"Cactus","Suculenta","Maceta","Tierra","Fertilizante"};
        String [] diasDeVentas  = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        Double [] precios  = {45.5,35.5,60.0,80.0,95.0};
        Scanner reader = new Scanner(System.in);
        Double [][] matriz = new Double[6][5];
        double resultadoVentaFinal = 0;


        for (int i = 0; i < diasDeVentas.length; i++) {
            
            

            for (int j = 0; j < productos.length; j++) {
                System.out.println("que cantidad de " + productos[j] + "se vendio el dia " + diasDeVentas[i]);
                double cantProd = Double.parseDouble(reader.nextLine());
                double cantTotal = cantProd * precios[j];
                matriz[i][j] = cantTotal;
                System.out.println(matriz[i][j]);
                
            }
            
        }


        System.out.println("Resultados/n");
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < diasDeVentas.length; j++) {
                resultadoVentaFinal = resultadoVentaFinal + matriz[j][i];
            }
            System.out.println("El total de venta de la semana de " + productos[i] + "fue $" + resultadoVentaFinal);
        }

        


    }
}
