public  class IR {
    static int salaire;
    private static double[] tranches = {0,30000,50000,60000,80000,180000};

    static double[] tauxIR = {0,0.1,0.2,0.3,0.34,0.38};


    public static double getIR(double s) {
        double salaire = s * 12;


        for (int i = 1; i < tranches.length; i++) {
            for (int j=1;j < tauxIR.length; j++){
            if (salaire < tranches[i] && salaire > tranches[i-1])
                return tauxIR[j];
        }}
        return tauxIR[5];
    }}

