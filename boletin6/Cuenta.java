package boletin6;
public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;
    public Cuenta(String nCliente, String nCuenta, double sal){
        nombreCliente = nCliente;
        numeroCuenta = nCuenta;
        saldo = sal;

    }
    public Cuenta(){
        nombreCliente = "";
        numeroCuenta = "";
        saldo = 0;
    }
    public void setSaldo(double sald ){
        saldo = sald;
    }
    public void setNombre(String nom){
        nombreCliente = nom;
    }
    public void setNumero(String num){
        numeroCuenta = num;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean ingreso(double x){
      if (x >= 0){
        saldo += x;
        return true;
      }
      else {
        System.out.println("Introduce un valor positivo");
        return false;
      }
    }
    public boolean reintegro(double x){
      if (x >= 0){
        saldo -= x;
        return true;
      }
      else {
        System.out.println("Introduce un valor positivo");
        return false;
      }
    }
    public void enseñar(){
      System.out.println("Nombre: " + nombreCliente);
      System.out.println("Numero de cuenta: " + numeroCuenta);
      System.out.println("Saldo en cuenta: " + saldo + "€");
    }
    public void transferencia(Cuenta cuentaDestino, double importe){
        if (saldo>importe) {
          cuentaDestino.ingreso(importe);
          saldo -= importe;
        }
        else System.out.println("La operacion no se puede realizar");

    }
}
