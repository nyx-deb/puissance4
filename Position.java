import java.security.PrivateKey;

public class Position {

 private   int abscisse;
  private  int ordonnee;
   private String couleur;
   public Position(){ 
    abscisse=0;
    ordonnee=0;
    couleur="vert";

   }

   public Position(String couleur){ 
    abscisse=0;
    ordonnee=0;
    this.couleur=couleur;
    
   }
public Position(int abscisse,int ordonnee,String couleur){ 
    this.abscisse=abscisse;
    this.ordonnee=ordonnee;
    this.couleur=couleur;
    
   }
   public int getAbscisse(){
    return abscisse;
   }
   public void setAbscisse(int abscisse){
    this.abscisse=abscisse;
   }
}