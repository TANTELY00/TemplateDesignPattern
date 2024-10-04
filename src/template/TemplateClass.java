package template;

public abstract class TemplateClass {
    public  double templateMethode(){

        // c'est le template de l'algorithme : tous les detaills de l'algorithme sont dans la classe derivée
        int n = operation1();
        double somme = 0 ;
        for (int i = 0 ; i<n ; i++){
            somme += operation2();
        }
        return somme;
    }

    protected   abstract double operation2();

    protected abstract int operation1();
}
