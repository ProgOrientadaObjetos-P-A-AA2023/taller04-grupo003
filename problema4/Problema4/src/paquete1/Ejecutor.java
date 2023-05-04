package paquete1;

import paquete2.Banco;

public class Ejecutor {
    public static void main(String[] args) {
        // Objeto de tipo Banco #1
        Banco chq = new Banco();
        chq.calcularComisionBanco();
        
        System.out.printf("%s",chq);
        
        // Objeto de tipo Banco #2
        String nombreCliente = "Sebastián Mendieta";
        String nombreBanco = "Banco Pichincha";
        double valorCheque = 1100.50;
        
        Banco chq2 = new Banco(nombreCliente,nombreBanco
                ,valorCheque);
        chq2.calcularComisionBanco();
        
        System.out.printf("%s",chq2);
    }
    
}
