package paquete1;

import paquete2.PromedioNota;

public class Ejecutor {
    public static void main(String[] args) {
        // Objeto de tipo PromedioNota #1
        PromedioNota prom = new PromedioNota();
        prom.calcularPromedioNota();
        
        System.out.printf("%s",prom);
        
        // Objeto de tipo PromedioNota #2
        String nombreEstudiante = "Sebatián Mendieta";
        double notaMateria1 = 8.65;
        double notaMateria2 = 8.05;
        double notaMateria3 = 9.25;
        
        PromedioNota prom2 = new PromedioNota(nombreEstudiante
                ,notaMateria1,notaMateria2,notaMateria3);
        prom2.calcularPromedioNota();
        
        System.out.printf("%s",prom2);
    }
    
}
