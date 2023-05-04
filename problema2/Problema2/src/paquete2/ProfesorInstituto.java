package paquete2;

public class ProfesorInstituto {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public ProfesorInstituto(){
        nombre = "Rodrigo";
        apellido = "Fernandez";
        sueldoBasico = 1250.50;
        cedula = "1106954358";
    }
    
    public ProfesorInstituto(String nom, String apll, double sBas
            , String ced){
        nombre = nom;
        apellido = apll;
        sueldoBasico = sBas;
        cedula = ced;
    }
    
    public void establecerNombre(String x){
        nombre  = x;
    }
    
    public void establecerApellido(String x){
        apellido  = x;
    }
    
    public void establecerSueldoBasico(double x){
        sueldoBasico = x;
    }
    
    public void calcularSueldoTotal(){
        sueldoTotal = sueldoBasico + (sueldoBasico*0.2);
    }
    
    public void establecerCedula(String x){
        cedula = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Profesores de Instituto\n"
                + "Nombre: %s\nApellido: %s\nSueldo Básico: %.2f\n"
                + "Sueldo Total: %.2f\nCédula: %s\n\n",nombre
                ,apellido,sueldoBasico,sueldoTotal
                ,cedula);
        return cadena;
    }
    
}
