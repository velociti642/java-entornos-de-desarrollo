package modelos;


import java.util.*;

/**
 * 
 */
public class Rectangulo {

    /**
     * Default constructor
     */
    private int base;
    private int altura;

    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    /**
     * 
     * @param base 
     * @param altura
     */
    public void Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Devuelve el área del rectangulo según la fórmula
     * @return
     */
    public int getArea() {
        return this.base * this.altura;
    }

    /**
     * @return
     */
    public int getPerimetro() {
        return 2*base + 2*altura;
    }

    /**
     * @return
     */
    public int getBase() {
        return this.base;
    }

    /**
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return this.altura;
    }

    /**
     * @param base
     */
    public void setBase(int base) {
    	this.base = base;
    }

    /**
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

}