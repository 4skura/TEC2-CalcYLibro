public class Libro {
    private String Titulo;
    private String Autor;
    private int Nopag;
    private int AnioPub;

    public Libro(){
        Titulo = "Harry Potter";
        Autor = "J.K.Roowling";
        Nopag = 250;
        AnioPub = 1999;

    }

    public void pasarPag(){
        System.out.println("Pasar de Pagina");
    }

    public void retrocederPag(){
        System.out.println("Retrocedite una pagina");
    }


    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }
    public String getTitulo(){
        return Titulo;
    } 

    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    public String getAutor(){
        return Autor;
    } 

    public void setNopag(int Nopag){
        this.Nopag = Nopag;
    }
    public int getNopag(){
        return Nopag;
    } 

    public void setAnioPub(int AnioPub){
        this.AnioPub = AnioPub;
    }
    public int getAnioPub(){
        return AnioPub;
    } 


}
