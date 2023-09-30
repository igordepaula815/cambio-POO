public abstract  class  Moeda {

    double Valor;

    Moeda(double Valor) {
        this.Valor = Valor;


    }


    abstract void info();

    public abstract double Converter();


    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Moeda other = (Moeda) obj;
        return false;


    }


    public double converter() {
        // TODO Auto-generated method stub
        return 0;
    }
}


