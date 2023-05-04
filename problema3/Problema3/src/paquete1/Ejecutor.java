package paquete1;

import paquete2.Automotor;

public class Ejecutor {
    public static void main(String[] args) {
        // Objeto de tipo Automotor #1
        Automotor auto = new Automotor();
        auto.calcularValorMatricula();
        
        System.out.printf("%s",auto);
        
        // Objeto de tipo Automotor #2
        String cedulaDuenio = "1106524893";
        String marcaVehiculo = "Ferrari";
        int anioFabricacion = 1999;
        double valorVehiculo = 3050.99;
        
        Automotor auto2 = new Automotor(cedulaDuenio,marcaVehiculo
                ,anioFabricacion,valorVehiculo);
        auto2.calcularValorMatricula();
        
        System.out.printf("%s",auto2);
    }
    
}
