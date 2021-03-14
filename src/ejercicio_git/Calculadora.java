/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_git;

/**
 *
 * @author Pablo
 */
public class Calculadora {

  private int num1;
 
    private int num2;

    
    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int suma() {
        int result = num1 + num2;
        return result;
    }

    public int resta() {
        int result = num1 - num2;
        return result;
    }

    public int multiplicar() {
        int result = num1 * num2;
        return result;
    }

    public void hola() {
       
    }
  public String adios(){
      return "Cambio en github"
  }

<<<<<<< HEAD

public  void rama2(){
=======
>>>>>>> 0e9161caf8d73b0aee708e8cb99ef160578f08da
}

}

