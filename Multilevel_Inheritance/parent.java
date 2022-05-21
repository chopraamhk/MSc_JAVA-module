//inheritance (evolution of horse)
class parent
 { 
   String hname;
   String stage;
   double length;
   double period;
   void getparent(String h, String s, double l, double p)
   {
     hname=h;
     stage=s;
     length=l;
     period=p;
    }
   
   void display()
   {
    System.out.println("name of the horse is " +hname);
    System.out.println("Stage is " +stage);
    System.out.println("length of the horse is " +length);
    System.out.println("time period is (in million years ago) " +period);
   }
}     
    
