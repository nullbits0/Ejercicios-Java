import java.util.Scanner;

public class Ejercicio14U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Leer los precios de los 5 artículos
        double[] precios = new double[5];
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Precio artículo " + (i + 1) + ": ");
            precios[i] = input.nextDouble();
        }
        
        // Leer las cantidades vendidas en las 4 sucursales
        int[][] cantidades = new int[4][5]; // 4 sucursales x 5 artículos
        for (int sucursal = 0; sucursal < 4; sucursal++) {
            System.out.println("\nIngrese cantidades vendidas para Sucursal " + (sucursal + 1));
            for (int articulo = 0; articulo < 5; articulo++) {
                System.out.print("Artículo " + (articulo + 1) + ": ");
                cantidades[sucursal][articulo] = input.nextInt();
            }
        }
        
        input.close();
        
        // 1. Cantidades totales de cada artículo
        int[] totalArticulos = new int[5];
        for (int articulo = 0; articulo < 5; articulo++) {
            for (int sucursal = 0; sucursal < 4; sucursal++) {
                totalArticulos[articulo] += cantidades[sucursal][articulo];
            }
        }
        
        System.out.println("\n1. Cantidades totales por artículo:");
        for (int i = 0; i < totalArticulos.length; i++) {
            System.out.println("Artículo " + (i + 1) + ": " + totalArticulos[i]);
        }
        
        // 2. Cantidad de artículos en la sucursal 2
        int totalSucursal2 = 0;
        for (int articulo = 0; articulo < 5; articulo++) {
            totalSucursal2 += cantidades[1][articulo]; // Índice 1 = Sucursal 2
        }
        System.out.println("\n2. Total artículos en Sucursal 2: " + totalSucursal2);
        
        // 3. Cantidad del artículo 3 en la sucursal 1
        System.out.println("\n3. Cantidad artículo 3 en Sucursal 1: " + cantidades[0][2]);
        
        // 4. Recaudación total de cada sucursal
        double[] recaudacionSucursal = new double[4];
        for (int sucursal = 0; sucursal < 4; sucursal++) {
            for (int articulo = 0; articulo < 5; articulo++) {
                recaudacionSucursal[sucursal] += cantidades[sucursal][articulo] * precios[articulo];
            }
        }
        
        System.out.println("\n4. Recaudación por sucursal:");
        for (int i = 0; i < recaudacionSucursal.length; i++) {
            System.out.println("Sucursal " + (i + 1) + ": $" + recaudacionSucursal[i]);
        }
        
        // 5. Recaudación total de la empresa
        double recaudacionTotal = 0;
        for (double recaudacion : recaudacionSucursal) {
            recaudacionTotal += recaudacion;
        }
        System.out.println("\n5. Recaudación total de la empresa: $" + recaudacionTotal);
        
        // 6. Sucursal de mayor recaudación
        int sucursalMayor = 0;
        double mayorRecaudacion = recaudacionSucursal[0];
        for (int i = 1; i < 4; i++) {
            if (recaudacionSucursal[i] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal[i];
                sucursalMayor = i;
            }
        }
        System.out.println("\n6. Sucursal de mayor recaudación: Sucursal " + (sucursalMayor + 1) + 
                          " con $" + mayorRecaudacion);
    }
}
