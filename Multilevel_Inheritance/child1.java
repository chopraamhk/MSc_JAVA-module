//child class1 inheritance (evolution of horse)
public class child1 extends child
 {
   String hname;
   String stage;
   double length;
   double period;
  
   void getchild1(String h, String s, double l, double p)
   {
    hname=h;
    stage=s;
    length=l;
    period=p;
   }
   
   void display()
   {
    super.display();
    System.out.println("Next horse was " +hname);
    System.out.println("stage of the horse was " +stage);
    System.out.println("length of the horse was " +length);
    System.out.println("Period was (in-million-years-ago) " +period);
   }
 }
