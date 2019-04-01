/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cercle;

public class Cercle{
/**
 *
 * @author gmayo
 */     
    /**
     * @param args the command line arguments
     */
      
    private float x;
    private float y;
    Cercle(float xx, float yy)
    {
        x=xx;
        y=yy;  
    }

    public Cercle()
    {
        
    }
     
    public Cercle(Cercle cercle)
    {
        this.x = cercle.x;
        this.y = cercle.y;
    }

    @Override
    public String toString() {
        return "Cercle{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cercle other = (Cercle) obj;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
            return false;
        }
        if (Float.floatToIntBits(this.y) != Float.floatToIntBits(other.y)) {
            return false;
        }
        return true;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
        
}
    

