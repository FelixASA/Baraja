public class Card {
    // instance variables - replace the example below with your own
    private int valor;
    private String figura;

    public Card()
    {
        valor=0;
        figura="Trebol";
    }
    /**
     * Constructor for objects of class Card
     */
    public Card(int valor,String figura)
    {
        // initialise instance variables
        this.valor=valor;
        this.figura=figura;
    }

    public String toString()
    {
        String valorC;
        switch(valor){
            case 1: valorC="A";
                break;
            case 11: valorC="J";
                break;
            case 12: valorC="Q";
                break;
            case 13: valorC="K";
                break;
            default: valorC=valor+"";
                break;
        }
        return valorC+" de "+figura;
    }
    public void setValor(int valor)
    {
        this.valor=valor;
    }
    public int getValor()
    {
        return valor;
    }
    public void setFigura(String figura)
    {
        this.figura=figura;
    }
    public String getFigura()
    {
        return figura;
    }
}