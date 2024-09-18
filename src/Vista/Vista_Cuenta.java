
package Vista;

import Controlador.Control_Cuenta;
import java.util.Scanner;

public class Vista_Cuenta {
    
    public byte op;
    public String tipo;
    public double valorInicial;
    public double monto;
Scanner x = new Scanner(System.in);

public String capturaTipo(){
System.out.println("Digite Tipo de Cuenta:");
this.tipo=x.nextLine().toLowerCase();
while(!this.tipo.equals("ahorros") && !this.tipo.equals("credito")){
System.out.println("Tipo de Cuenta Invalido:");
System.out.println("Digite Tipo de Cuenta:");
this.tipo=x.nextLine();
}
return this.tipo;
}

public double capturaValor(){
System.out.println("Digite Valor Inicial de la Cuenta:");
this.valorInicial=x.nextDouble();
while(this.valorInicial<100000){
System.out.println("El valor inicial debe ser 100000 o más");
System.out.println("Digite Valor Inicial de la Cuenta:");
this.valorInicial=x.nextDouble();
}
return this.valorInicial;
}

public double capturaMonto(){
System.out.println("Digite monto:");
this.monto=x.nextDouble();
while(this.monto<=0){
System.out.println("El valor del monto debe ser mayor a 0");
System.out.println("Digite monto:");
this.monto=x.nextDouble();
}
return this.monto;
}

public byte mostrarMenu(){

System.out.println("1. Consignar\n2. Retirar\n3. Consultar Saldo Actual\n"
        +"4. Consultar Saldo Minimo\n5. Capacidad de Credito\n6. Salir");
System.out.println("Seleccione Opcion:");
this.op=x.nextByte();
while(this.op<1 || this.op>6){
System.out.println("Opcion no Valida:");
System.out.println("1. Consignar\n2. Retirar\n3. Consultar Saldo Actual\n"
        +"4. Consultar Saldo Minimo\n5. Capacidad de Credito\n6. Salir");
System.out.println("Seleccione Opcion:");
this.op=x.nextByte();
}
return this.op;
}

public void conectar(){
Control_Cuenta cC= new Control_Cuenta();
cC.control();
}

}
