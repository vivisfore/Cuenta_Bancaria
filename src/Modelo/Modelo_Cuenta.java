
package Modelo;

public class Modelo_Cuenta {
 
    public String tipo;
    public double valorInicial;
    public double saldoActual;
    public double saldoMinimo;
    public double capacidadCredito;

    public Modelo_Cuenta(String tipo, double valorInicial) {
        this.tipo = tipo;
        this.valorInicial = valorInicial;
        this.saldoActual= this.valorInicial;
        this.saldoMinimo= this.valorInicial*0.1;
    }
    
    public void consignar(double monto){
    this.saldoActual+=monto;
    }
    
    public void retirar(double monto){
    double disponible=this.saldoActual-this.saldoMinimo;
    if(disponible>=monto){
      this.saldoActual-=monto;
    }else{
    System.out.println("Maximo monto a retirar es:"+disponible);
    this.saldoActual=this.saldoMinimo;
    }
    }
    
    public double mostrarSaldoActual(){
    return this.saldoActual;
    }
    
    public double mostrarSaldoMinimo(){
    return this.saldoMinimo;
    }
    
    public double capacidadCredito(){
    if(this.tipo.equals("ahorros")){
    this.capacidadCredito=this.saldoActual-this.saldoMinimo;
    }else{this.capacidadCredito=this.saldoActual*3;}
    return this.capacidadCredito;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
