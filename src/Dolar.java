public class  Dolar extends Moeda {

    Dolar(double Valor) {
        super(Valor);

    }

    @Override
    void info() {
        System.out.println("Dolar: " + String.format("%.2f", Valor));
    }

    @Override
    public double Converter() {
        return Valor * 4.0 ;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;


    }







}



