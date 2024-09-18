
package Controlador;

import Modelo.Modelo_Cuenta;
import Vista.Vista_Cuenta;

public class Control_Cuenta {
    
    public byte op;
    public String tipo;
    public double valorInicial;
    public double monto;
    
    Vista_Cuenta visC= new Vista_Cuenta();
    
    private Modelo_Cuenta crear(){
    this.tipo=visC.capturaTipo();
    this.valorInicial=visC.capturaValor();
    Modelo_Cuenta miCuenta= new Modelo_Cuenta(this.tipo,this.valorInicial);
    return miCuenta;
    }
    
    public void control(){
    Modelo_Cuenta x=this.crear();
    this.op=visC.mostrarMenu();
    
    while(this.op>=1 && this.op<=6){
    switch(this.op){
        case 1:
        this.monto=visC.capturaMonto();
        x.consignar(this.monto);
        break;
        case 2:
        this.monto=visC.capturaMonto();
        x.retirar(this.monto);
        break;
        case 3:
        System.out.println("Su Saldo Actual es: "+x.mostrarSaldoActual());
        break;
        case 4:
        System.out.println("Su Saldo Minimo es: "+x.mostrarSaldoMinimo());
        break;
        case 5:
        System.out.println("Su Capacidad de Credito es: "+x.capacidadCredito());
        break;
        case 6:
        System.out.println("Hasta Pronto....");
        System.exit(0);
        break;
        default:
        break;
    }
    this.op=visC.mostrarMenu();
    }
    }
    
}
