/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_09;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class SEMANA_09 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    
    ArrayList<String> lista = new ArrayList<String>();
    
    lista.add("hola");
    lista.add("que");
    lista.add("tal");
    lista.add("estas");
    lista.add("hoy");
    
    for (int i=0;i<lista.size();i++) {
      
      System.out.println(lista.get(i));
    }
  }
}
