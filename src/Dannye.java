public class Dannye {
    private String god;
    private String model;
    private double sena;
    private  String svet;

    public Dannye(String god, String model, double sena, String svet) {
        this.god = god;
        this.model = model;
        this.sena = sena;
        this.svet = svet;
    }

    public String getGod() {
        return god;
    }

    public void setGod(String god) {
        this.god = god;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSena() {
        return sena;
    }

    public void setSena(double sena) {
        this.sena = sena;
    }

    public String getSvet() {
        return svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }

    @Override
    public String toString() {
        return "Dannye{" +
                "god='" + god + '\'' +
                ", model='" + model + '\'' +
                ", sena=" + sena +
                ", svet='" + svet + '\'' +
                '}';
    }
}

