package ar.edu.unju.fi.model;
/*Realiza el cálculo del tiempo que tarda en caer un objeto desde una altura h. Aplicar la siguiente formula:
𝑡 = (√2 ∗ ℎ)/g
Donde g = 9.81 m/s^2
Revise la documentación de la clase Math, ubicada en el paquete java.lang para el método sqrt(). */
public class tiempo {
  int num;
  double aux,g=9.81;
  String resultado;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }
  public String formula(){
    aux=(Math.sqrt((2*num)/g));
    resultado = String.valueOf(aux);
    return resultado;
  }
}
