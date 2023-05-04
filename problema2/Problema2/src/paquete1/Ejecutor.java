package paquete1;

import paquete2.ProfesorInstituto;

public class Ejecutor {
    public static void main(String[] args) {
        // Objeto de tipo ProfesorInstituto #1
        ProfesorInstituto prof = new ProfesorInstituto();
        prof.calcularSueldoTotal();
        
        System.out.printf("%s",prof);
        
        // Objeto de tipo ProfesorInstituto #2
        String nombre = "Federico";
        String apellido = "Gonzales";
        double sueldoBasico = 980.00;
        String cedula = "11063215894";
        
        ProfesorInstituto prof2 = new ProfesorInstituto(nombre,apellido
                ,sueldoBasico,cedula);
        prof2.calcularSueldoTotal();
        
        System.out.printf("%s",prof2);
    }
    
}
