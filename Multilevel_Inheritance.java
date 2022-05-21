//main class
import java.util.*;
class evolution
 {
   public static void main(String args[]) throws Exception
    {
     int i=0;
     String[] hn=new String[3];
     String[] hs=new String[3];
     double[] hp=new double[3];
     double[] hl=new double[3];
    
     Scanner S = new Scanner(System.in);

     System.out.println("Enter the name of horses - ");   
       for(i=0; i<3; i++)
        {
          hn[i]=S.nextLine();
        }

 
     System.out.println("Enter the stage in which it was found - ");
         for(i=0; i<3; i++)
        {
          hs[i]=S.nextLine();
        }
 
  
     System.out.println("Enter the period (in million years ago) - ");
         for(i=0; i<3; i++)
        {
          hp[i]=S.nextDouble();
        }
  
   
     System.out.println("Enter the length (in mm) - ");
         for(i=0; i<3; i++) 
         {
           hl[i]=S.nextDouble();
         }
        
     child1 evo=new child1();
     evo.getparent(hn[0],hs[0],hp[0],hl[0]);
     evo.getchild(hn[1],hs[1],hp[1],hl[1]);
     evo.getchild1(hn[2],hs[2],hp[2],hl[2]);
     evo.display();
   }
} 
