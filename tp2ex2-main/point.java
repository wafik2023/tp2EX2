public class point {
    int ord;
    int abs;
    static int nombre=1;
    int numero=nombre;
    point()
    {
        abs=0;
        ord=0;
        nombre++;
    }
    void setCoordonnePoint(int u,int v){

        abs=u;
        ord=v;

    }
    void  translate(int u,int v)
    {
        abs=abs+u;
        ord=ord+v;
    }
    void affichepoint (){

        System.out.println("les coordonne = ("+ord+","+abs+")");
    }
    boolean origine(){
         if ((abs==0)&&(ord==0))

             return true;
        else
            return false;


    }
    boolean egale (point q ){

        if((this.abs==q.abs)&&(this.ord==q.ord))
            return true;
        else
            return false;


    }
    point(int u,int v){
        this.abs=u;
        this.ord=v;
        nombre++;


    }
     void setCoordonnePoint(point p){


        abs=p.abs;
        ord=p.ord;

     }
     point symetric ()
     {
         int abs1=-abs;
         int ord1=-ord;

        point sym= new point(abs1,ord1);
        return sym;
     }













}
