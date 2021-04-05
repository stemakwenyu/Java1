
package udemy;


public class Arrays {
    public static void main (String[]args){
        int[] oneDArray ={12, 30, 876};
        System.out.println(oneDArray[2]);
        
        int[][] multiDArray ={{12, 30, 876},{334,43, 65,2},{87,54,33}};
         System.out.println(multiDArray[2][1]);
         
         double[][] array = new double[2][2];
         array[2][1] = 2.6;
         System.out.println(multiDArray[1][2]);
         
         for(int Array = 0; Array<multiDArray.length; Array++) {
         for(int item=0; item<multiDArray.length; item++)
         {
             System.out.print(multiDArray[Array][item] + "\t");
         }
         System.out.println();
         }
    }
    
}
