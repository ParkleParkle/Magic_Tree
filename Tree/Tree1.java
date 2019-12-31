package What.Tree;


/**
 * Write a description of class Tree1 here.
 * 
 * @author (Parkle) 
 * @version (1.0 (17.11.2019))
 */
public class Tree1
{
   static String a = " ";
   static String b = "1";
   static String c = a+a;
   static String d = b+b;
   static String e = a+c;
   static String f = b+d;
   
   public static void main(String[] args)throws InterruptedException {
       
       for(;;){
       Thread.sleep(36);
       System.out.println(" ");
       Thread.sleep(36);
       for(byte i=0; i<3; i++)                        // make obj
   {Thread.sleep(36);
   System.out.println(c+e + e + e + e + a+c);
}
                        // Thread.sleep(35);
                        // System.out.println(c+e + e + "*" + e + e+c);
       Thread.sleep(36);
       System.out.println(c+e + e + b + e + e+c);
       Thread.sleep(36);
       System.out.println(c+c + e + d + b + e + c+c);
       Thread.sleep(36);
       System.out.println(c+a + e + d + f + e + a+c);
       
       for(byte i=0; i<3; i++)
       {Thread.sleep(36);
       System.out.println(c+e + b + f + f + e+c);
       Thread.sleep(36);
       System.out.println(c+c + f + f + f + c+c);
       Thread.sleep(36);
       System.out.println(c+a + d + f + f + f + a+c);
       Thread.sleep(36);
       System.out.println(c+f + f + f + f + b+c);
    };
   Thread.sleep(36);
   System.out.println(c+c + e + f + c + e+c);
   Thread.sleep(36);
   System.out.println(c+c + e + f + c + e+c);
   Thread.sleep(36);
   System.out.println(c+c + e + f + c + e+c);
   
   for(byte i=0; i<3; i++)                        // make obj
   {Thread.sleep(36);
   System.out.println(c+e + e + e + e + a+c);
}
}
}
}