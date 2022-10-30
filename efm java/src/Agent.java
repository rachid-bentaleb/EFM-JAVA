public class Agent extends Employe {
    private double primeResponsabilite;

    public Agent(String nom, int dateNaissance, int dateEmbauche, double salaireBase, double primeResponsabilite) {
        super(nom, dateNaissance, dateEmbauche, salaireBase);
        this.primeResponsabilite = primeResponsabilite;
    }

    public Agent(double primeResponsabilite) {
        this.primeResponsabilite = primeResponsabilite;
    }

    @Override
    public double salaireAPayer(){
        return (this.getSalaireBase()+primeResponsabilite)*(1-getIR(this.getSalaireBase()));
    }
}
