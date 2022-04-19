package ar.edu.unju.fi.model;
/*10.- Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.*/
public class secuencia4 {
  int num;
  String aux;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }
  public String secu(){
    String resultado="";
    while(num>=160){
      aux=String.valueOf(num);
      resultado= resultado + " " + aux;
      num=num-20;
    }
    return resultado;
  }
}
