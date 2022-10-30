public class Formateur extends Employe {
    private int heureSup;
    private static double remunerationHSup=70.00;

    // constructer

    public Formateur(String nom, int dateNaissance, int dateEmbauche, double salaireBase, int heureSup) {
        super(nom, dateNaissance, dateEmbauche, salaireBase);
        this.heureSup = heureSup;
    }

    public Formateur(int heureSup) {
        this.heureSup = heureSup;
    }

    public Formateur(){
        heureSup=0;
    }

    public static double getRemunerationHSup() {
        return remunerationHSup;
    }

    public int getHeureSup() {
        return heureSup;
    }

    public void setHeureSup(int heureSup) {
        this.heureSup = heureSup;
    }

    public static void setRemunerationHSup(double remunerationHSup) {
        Formateur.remunerationHSup = remunerationHSup;
    }

    @Override
    public String toString() {
        return "les information du formateure est : "+"\n"+
                super.toString()+"\n"+
                "   -nombre d'haure de travaille est : " + heureSup ;

    }
    @Override
    public double salaireAPayer(){
        return (this.getSalaireBase() + heureSup*remunerationHSup) * (1 - getIR(this.getSalaireBase()));
    }
}
