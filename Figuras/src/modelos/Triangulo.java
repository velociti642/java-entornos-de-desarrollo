package modelos;

public class Triangulo {



    private double base;
    private double altura;

    public Triangulo() {
    	this.base = 1;
    	this.altura = 2;
    }
    
    /**
     * @param base 
     * @param altura
     */
    public void Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    /**
     * @return
     */
    public double getBase() {
        return this.base;
    }

    /**
     * @return
     */
    public double getAltura() {
        return this.altura;
    }

    /**
     * @return
     */
    public double getArea() {
        return (this.base * this.altura) / 2;
    }

    /**
     * @param base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

}