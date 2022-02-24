/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author david
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo Java !!!!");
        Persona per1 = new Persona();
        per1.setNombre("David Gomez ");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("tacos al pastor");

        Persona per2 = new Persona();
        per2.setNombre("carlos ");
        System.out.println("Nombre per 2: " + per2.getNombre());
        per2.comer("pizza");

        
        Automovil bocho = new Automovil();
        bocho.setMarca("VW ");
        System.out.println("Marca: "+ bocho.getMarca());
        bocho.setSubMarca("sedan");
        System.out.println("Submarca: "+bocho.getSubMarca());
        bocho.setModelo(1970);
        System.out.println("Modelo: "+bocho.getModelo());
        bocho.setColor(Color.blue);
        
        Automovil akura  = new Automovil();
        akura.setMarca("akura");
        System.out.println("Marca: "+ akura.getMarca());
        akura.setSubMarca("NSX");
        System.out.println("Submarca: "+akura.getSubMarca());
        akura.setModelo(2013);
        System.out.println("Modelo: "+akura.getModelo());
        akura.setColor(Color.gray);
        System.out.println("color:" +akura.getColor());
        
        Automovil Mustang = new Automovil();
        Mustang.setMarca("Ford");
        System.out.println("Marca: "+Mustang.getMarca());
        Mustang.setSubMarca("Mustang");
        System.out.println("Submarca: "+Mustang.getSubMarca());
        Mustang.setModelo(2010);
        System.out.println("Modelo: "+Mustang.getModelo());
        Mustang.setColor(Color.yellow);
        System.out.println("Color: "+Mustang.getColor());
        
        
        
        
        
        
        
        
      
        
        
    }

}
