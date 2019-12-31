package What.Tree;


/**
 * Write a description of class ArrayConstruct here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree2
{
    public static void main(String[] args)throws InterruptedException {
       
       byte [] anArray = new byte [17];
       
                
       for(;;){
                anArray[8] = 0;
                anArray[7] = 0;
                anArray[9] = 0;
                
       System.out.println();
       for(byte i=0; i<2; i++){
       for(byte j=0; j<17; j++){
       Thread.sleep(3,6); System.out.print("0");  }  
       System.out.println();}
       
       
       
       
       for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}
       
           for(byte i=0; i<3; i++)
           {
        if (anArray[8] == 0){                                  
            anArray[8] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
            
        
            if (anArray[8] == 1){
            anArray[7] =+1;
            anArray[9] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
            
            if (anArray[7] == 1){
            anArray[6] =+1;
            anArray[10] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
            
            if (anArray[6] == 1){
            anArray[5] =+1;
            anArray[11] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
            
            if (anArray[5] == 1){
            anArray[4] =+1;
            anArray[12] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
            
            if (anArray[4] == 1){
            anArray[3] =+1;
            anArray[13] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
            
            
            if (anArray[3] == 1){
            anArray[2] =+1;
            anArray[14] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
            
            
            if (anArray[2] == 1){
            anArray[1] =+1;
            anArray[15] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
            
            
            if (anArray[1] == 1){
            anArray[0] =+1;
            anArray[16] =+1;
            System.out.println();
            for (byte item : anArray){Thread.sleep(3,6); System.out.print(item);}}
        
               anArray[0] = 0;
               anArray[1] = 0;
               anArray[2] = 0;
               anArray[3] = 0;
               anArray[4] = 0;
               anArray[5] = 0;
               anArray[6] = 0;
               anArray[7] = 0;
               anArray[8] = 0;
               anArray[9] = 0;
               anArray[10] = 0;
               anArray[11] = 0;
               anArray[12] = 0;
               anArray[13] = 0;
               anArray[14] = 0;
               anArray[15] = 0;
               anArray[16] = 0;
               
               
            
        }
        for(byte i=0; i<3; i++){
        Thread.sleep(3,6); System.out.println();
        
        for (byte item : anArray){
           
                anArray[8] = 1;
                anArray[7] = 1;
                anArray[9] = 1;
                Thread.sleep(3,6); System.out.print(item);

            }
        }
    }

}
            
}
            

       



