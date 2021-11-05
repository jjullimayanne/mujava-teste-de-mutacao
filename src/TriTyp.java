import java.io.Serializable;

public class TriTyp implements Serializable
{
  public int i, j, k;
  public int trityp;
  public static int SCALENE = 1, ISOSCELES = 2, EQUILATERAL = 3, NOT_A_TRIANGLE = 4; 
  
  public TriTyp()
  {
  }
  
  public void setI(int v) { 
    i=v; 
  }
  
  public void setJ(int v) { 
    j=v; 
  }
  
  public void setK(int v) { 
    k=v; 
  }
  
  /**
   * 
   * @return 1 if scalene; 2 if isosceles; 3 if equilateral; 4 if not a triangle
   */
  public void type() {
    if (i==j) { trityp=trityp+1; }
    if (i==k) { trityp=trityp+2; }
    if (j==k) { trityp=trityp+3; }
    
    if (i<=0 || j<=0 || k<=0) {
      trityp=4;
      return;
    } 
    if (trityp==0) 
    {
      if (i+j<=k || j+k<=i || i+k<=j) {
        trityp=4;
        return;   // No es un triangulo
      } else {
        trityp=1; // No tiene lados iguales
        return;
      }
    }
    if (trityp>3) {
      trityp=3;  // Equilatero
    } else if (trityp==1 && i+j>k) 
    {
      trityp=2; 
    } else if (trityp==2 && i+k>j) 
    {
      trityp=2;
    } else if (trityp==3 && j+k>i) 
    {
      trityp=2;
    } else {
      trityp=4;
    }
  }

  
  public boolean equals(Object o) 
  {
    if (!(o instanceof TriTyp)) return false;
    TriTyp t=(TriTyp) o;
    return (i==t.i && j==t.j && k==t.k && trityp==t.trityp);
  }
  
  public String toString() 
  {
    String s= i + "-" + j + "-" + k + ": " + trityp;
    return s;
  }
  
  /*public static void main(String[] args) 
  {
    int a=2;
    a=a--+1;
    System.out.println("a=" + a);
  }*/
}
