 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JoaoVitor
 * @version 1.0 Beta
 * @since 28/05/2017 - 12:29
 */
public class Pessoa {
    private double peso;

    public Pessoa() {
    }

    public Pessoa(double peso) {
        
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    /**
     * 
     * @return peso em marte
     */
    public double pesoMarte(){
        return peso / 10 * 0.38;
    }
    /**
     * 
     * @return peso em mercurio
     */
    public double pesoMercurio(){
        return peso / 10 * 0.38;
    }
    /**
     * 
     * @return peso em venus
     */
    public double pesoVenus(){
        return peso / 10 * 0.91;
    }
    /**
     * 
     * @return peso em jupiter
     */
    public double pesoJupiter(){
        return peso / 10 * 2.34;
    }
    /**
     * 
     * @return peso em saturno
     */
    public double pesoSaturno(){
        return peso / 10 * 1.06;
    }
    /**
     * 
     * @return peso em netuno
     */
    public double pesoNetuno(){
        return peso / 10 * 1.19;
    }
    /**
     * 
     * @return peso em plutao
     */
    public double pesoPlutão(){
        return peso / 10 * 0.06;
    }
    /**
     * 
     * @return peso em Urano
     */
    public double pesoUrano(){
        return peso  / 10 * 1.17;
    }

    @Override
    public String toString() {
        return   "\nSeu peso em Marte é: "+pesoMarte()
                +"\nSeu peso em Mercurio é: "+pesoMercurio()
                +"\nSeu peso em Netuno é: "+pesoNetuno()
                +"\nSeu peso em Jupiter é: "+pesoJupiter()
                +"\nSeu peso em Saturno é: "+pesoSaturno()
                +"\nSeu peso em Plutão é: "+pesoPlutão()
                +"\nSeu peso em Venus é: "+pesoVenus()
                +"\nSeu peso em Urano é: "+pesoUrano();
    }//fecha to string
}//fecha class
