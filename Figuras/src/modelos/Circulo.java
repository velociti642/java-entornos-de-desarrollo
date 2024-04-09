package modelos;

public class Circulo {

    private double radio;
    
    /**
     * Default constructor
     */
    public Circulo() {
    	this.radio = 3;
    }
    /**
     * @param radio
     */
    public void Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return
     */
    public double getRadio() {
        return this.radio;
    }

    /**
     * @return
     */
    public double getPerimetro() {
        // TODO implement here
        return Math.PI * (this.radio * 2);
    }

    /**
     * @return
     */
    public double getArea() {
        // TODO implement here
        return Math.PI * (this.radio * this.radio);
    }

    /**
     * @param radio
     */
    public void setRadio(int radio) {
        // TODO implement here
    }

}