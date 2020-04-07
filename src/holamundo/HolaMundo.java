/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author RaulStifler
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carrito = new Carro();
        System.out.println(carrito.getColor());
        carrito.setColor("Rojo");
        System.out.println(carrito.getColor());
    }
    
}

class Carro {
    String color;
    double precio;
    String marca; 
    Carro (){
        this.color = "Blanco";
        this.precio = 100000;
        this.marca = "Seat";
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    
    public String getMarca() {
        return this.marca;
    }
    public double getPrecio() {
        return this.precio;
    }
}
