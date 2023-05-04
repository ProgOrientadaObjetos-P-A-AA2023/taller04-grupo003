package paquete2;

public class Banco {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public Banco(){
        nombreCliente = "Santigo Riofrío";
        nombreBanco = "Banco de Loja";
        valorCheque = 850.25;
    }
    
    public Banco(String nomClien, String nomBan, double valCheq){
        nombreCliente = nomClien;
        nombreBanco = nomBan;
        valorCheque = valCheq;
    }
    
    public void establecerNombreCliente(String x){
        nombreCliente = x;
    }
    
    public void establecerNombreBanco(String x){
        nombreBanco = x;
    }
    
    public void establecerValorCheque(double x){
        valorCheque = x;
    }
    
    public void calcularComisionBanco(){
        comisionBanco = valorCheque*0.00003;
    }
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    
    public double obtenerValorCheque(){
        return valorCheque;
    }
    
    public double obtenerComisionBancoo(){
        return comisionBanco;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Manejo de Cheques\n"
                + "Nombre del Cliente: %s\nNombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\nComision del Banco: %.2f\n\n"
                ,nombreCliente,nombreBanco,valorCheque
                ,comisionBanco);
        return cadena;
    }
    
}
