import java.time.LocalDate;

public abstract class Employe extends IR implements IEmploye {
    // attribuits
    private static int mtle;
    private String nom;
    private int dateNaissance;
    private int dateEmbauche;
    private double salaireBase;
    private int count = 0;

    static LocalDate date = LocalDate.now();

    // constructer

    public Employe(String nom, int dateNaissance, int dateEmbauche, double salaireBase) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaireBase = salaireBase;
        this.mtle = count++;
    }

    public Employe(){
        nom="";
        dateNaissance=0;
        dateEmbauche=0;
        salaireBase=0;
        mtle = count++;
    }

    // setter && getter

    public static int getMtle() {
        return mtle;
    }

    public static void setMtle(int mtle) {
        Employe.mtle = mtle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getDateEmbauche() {
        return dateEmbauche;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static LocalDate getDate() {
        return date;
    }

    public static void setDate(LocalDate date) {
        Employe.date = date;
    }

    public void setDateEmbauche(int dateEmbauche) {
        int age=this.age();
        try{
            if (age<16){
                throw(new Exception("age erreur !"));
            }
            this.dateEmbauche = dateEmbauche;
        }
        catch (Exception e) {
            System.out.println("age erreur !");
        }
    }
    @Override
    public int age() {
        return date.getYear() - dateNaissance;
    }

    @Override
    public int andciennete() {
        return date.getYear() - dateEmbauche;
    }

    @Override
    public int dateRetraite(int ageRetraite) {
        return dateNaissance + ageRetraite;
    }
    public abstract double salaireAPayer();

    // method tostring
    public String toString() {
        return "les information de lemployer : "+ "\n" +
                "   -nom='" + nom + '\n' +
                "   -dateNaissance=" + dateNaissance +'\n' +
                "   -dateEmbauche=" + dateEmbauche +'\n' +
                "   -salaireBase=" + salaireBase +'\n' +
                "   -mtleActuelle=" + mtle;
    }

    // method equals
    public boolean equals(Employe e) {
       if(mtle == e.mtle)
           return  true;
       else
           return false;
    }
}
