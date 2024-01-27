//Scrivere un programma che contenga una classe chiamata Forma
// ed un metodo chiamato calcolaArea()
// che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo
// che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.
//aggiungere una ulteriore classe chiamata Triangolo supportando
// poi il calcolo dell'area per quest'ultima figura
public class Main {
    public static void main(String[] args) {
        Rettangolo rectangle1 = new Rettangolo(10,3);
        System.out.println("Dati i seguenti dati di un rettangolo: ");
        System.out.println("Base " + rectangle1.getBase());
        System.out.println("Altezza " + rectangle1.getAltezza());
        System.out.print("l'area del rettangolo e' pari a: ");
        System.out.println(rectangle1.calcolaArea(rectangle1.getBase(),rectangle1.getAltezza()));

        Triangolo triangle1 = new Triangolo(10,3);
        System.out.println("Dati i seguenti dati di un triangolo: ");
        System.out.println("Base " + triangle1.getBase());
        System.out.println("Altezza " + triangle1.getAltezza());
        System.out.print("l'area del triangolo e' pari a: ");
        System.out.println(triangle1.calcolaArea(triangle1.getBase(),triangle1.getAltezza()));

    }
}