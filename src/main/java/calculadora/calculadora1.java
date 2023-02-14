/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Oscar
 */
public class calculadora1 {
    String marca;
    int Rsuma, Rresta, Rmultiplicacion;
    float Rdivision;
    
    public calculadora1(){
    marca =  "casio";
    Rsuma = 0;
    Rresta = 0;
    Rmultiplicacion = 0;
    Rdivision = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRsuma() {
        return Rsuma;
    }

    public void setRsuma(int Rsuma) {
        this.Rsuma = Rsuma;
    }

    public int getRresta() {
        return Rresta;
    }

    public void setRresta(int Rresta) {
        this.Rresta = Rresta;
    }

    public int getRmultiplicacion() {
        return Rmultiplicacion;
    }

    public void setRmultiplicacion(int Rmultiplicacion) {
        this.Rmultiplicacion = Rmultiplicacion;
    }

    public float getRdivision() {
        return Rdivision;
    }

    public void setRdivision(float Rdivision) {
        this.Rdivision = Rdivision;
    }
    
    
    
    public int Suma(int op1,int op2) {
       Rsuma =  (op1 + op2);
        System.out.println("La suma es: " + Rsuma);
       return Rsuma;
}
    public int Resta(int op1,int op2) {
       Rresta =  (op1 - op2);
        System.out.println("La resta es: " + Rresta);
       return Rresta;
}   
       public int Multiplicacion(int op1,int op2) {
       Rmultiplicacion =  (op1 * op2);
       System.out.println("La multiplicacion es: " + Rmultiplicacion);
       return Rmultiplicacion;
}
       public float Division(int op1,int op2) {
       Rdivision =  (op1/ op2);
       System.out.println("La division es: " + Rdivision);
       return Rdivision;
       
}
}
