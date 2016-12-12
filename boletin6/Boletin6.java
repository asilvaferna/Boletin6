package boletin6;
public class Boletin6 {
    public static void main(String[] args) {

      Cuenta c1 = new Cuenta();
      c1.setNombre("Adrián Silva");
      c1.setNumero("1234567890");
      c1.setSaldo(1000);
      c1.ingreso(100);
      c1.reintegro(20);
      c1.reintegro(90);
      c1.enseñar();
      Cuenta c2 = new Cuenta();
      c2.setNombre("Eduardo Lopez");
      c2.setNumero("0987654321");
      c2.setSaldo(5000);
      c2.ingreso(3400);
      c2.reintegro(1200);
      c2.reintegro(1200);
      c2.enseñar();
      c2.transferencia(c1, 2000);
      c2.enseñar();
      c1.enseñar();
    }

}
