package paquete2;

public class PromedioNota {
    private String nombreEstudiante;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;
    private double promedioNota;
    
    public PromedioNota(){
        nombreEstudiante = "Santiago Riofrío";
        notaMateria1 = 7.55;
        notaMateria2 = 8.25;
        notaMateria3 = 7.00;
    }
    
    public PromedioNota(String nomEstd, double ntMat1, double ntMat2
            , double ntMat3){
        nombreEstudiante = nomEstd;
        notaMateria1 = ntMat1;
        notaMateria2 = ntMat2;
        notaMateria3 = ntMat3;
    }
    
    public void establecerNombreEstudiante(String x){
        nombreEstudiante = x;
    }
    
    public void establecerNotaMateria1(double x){
        notaMateria1 = x;
    }
    
    public void establecerNotaMateria2(double x){
        notaMateria2 = x;
    }
    
    public void establecerNotaMateria3(double x){
        notaMateria3 = x;
    }
    
    public void calcularPromedioNota(){
        promedioNota = (notaMateria1 + notaMateria2 + notaMateria3)/3 ;
    }
    
    public String obtenerNombreEstudiante(){
        return nombreEstudiante;
    }
    
    public double obtenerNotaMateria1(){
        return notaMateria1;
    }
    
    public double obtenerNotaMateria2(){
        return notaMateria2;
    }
    
    public double obtenerNotaMateria3(){
        return notaMateria3;
    }
    
    public double obtenerPromedioNota(){
        return promedioNota;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Promedio de Notas:\nNombre: %s\n"
                + "Materia 1, nota: %.2f\nMateria 2, nota; %.2f\n"
                + "Materia 3, nota %.2f\nPromedio: %.2f\n\n"
                ,nombreEstudiante,notaMateria1,notaMateria2
                ,notaMateria3,promedioNota);
        return cadena;
    }
    
}
