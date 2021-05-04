/*

{1,2,3,4,5}
{"hello","goodby","why?"}
{1.3,42.3,45.3}

*/

public class Project2_2{
   
   public static void main(String[] args){
      
   // datatype[] name = {data1,data2,data3};
               //  0,1,2,3,4,5,6
      // int[] arr = {1,1,2,3,5,8,13,21,233,2323,2323,3434};
    //int arr[] = {1,1,2,3,5,8,13,21,233,2323,2323,3434};

      // arr[0] = 2;
      // System.out.print(arr.length);
      // System.out.print(arr[2]);

      // {a,b,c,d} --> {b,c,d,a}

      int[] arr = {1,1,2,3,5,8,13,21,233,2323,2323,3434};

      for (int i = 0; i<arr.length; i++){
         System.out.println(arr[i]);
     }

      // int temp;
      int temp1 = arr[arr.length-1]; // if you want to access the last element in array,
                                     // USE arr[arr.length-1]
      for(int i = 0; i < arr.length; i++){
         if(i==0){
            arr[arr.length-1] = arr[0];
         }else{
            arr[i-1] = arr[i];
         }
         // temp = arr[i];
      }

      for (int i = 0; i<arr.length; i++){
         System.out.println(arr[i]);
     }
   }
   
}
