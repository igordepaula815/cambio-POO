public class Real extends Moeda {



    Real(double Valor) {
        super(Valor);

    }



    @Override
    void info() {
        System.out.println("Real : " + String.format("%.2f ", Valor) );


    }







    @Override
    public double Converter() {
        return Valor;

    }

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


