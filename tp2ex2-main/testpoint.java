public class testpoint {
    public static void main(String[] args) {

        point p=new point(1,0);
        point q=new point(0,0);

        p.affichepoint();
        if (p.origine())
        {
            System.out.println("les cooredonnee de la point  ("+p.abs+"," +p.ord+")donc null");
        }
        else{
            System.out.println("les cooredonnee de la point p = ("+p.abs+"," +p.ord+") donc  not null");

        }
        if ( p.egale(p)){
            System.out.println("les deux points  egaux");}
            else{
            System.out.println("les deux points ne pas egaux");



        }
        System.out.println("le nombre de point ="+point.nombre);






    }

}
