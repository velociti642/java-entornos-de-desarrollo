package modelos;

public class Rectangulo extends Figura{

    /**
     * Default constructor
     */
    private int base;
    private int altura;

    /*
     * Constructor por defecto. Crea un rectangulo con base y altura 1, en metros
     */
    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    /**
     * Constructor que crea un rectangulo con la base y la altura especificas, en metros
     * 
     * @param base		la base del rectangulo, en metros
     * @param altura	la altura del rectangulo, en metros
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        // TODO implement here
        return this.altura;
    }

    public void setBase(int base) {
    	this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @see modelos.Figura#area()
     */
    @Override
    public double area() {
    	return this.base * this.altura;
    }
    /**
     * @see modelos.Figura#perimetro()
     */
    @Override
    public double perimetro() {
    	return 2*base + 2*altura;
    }
}