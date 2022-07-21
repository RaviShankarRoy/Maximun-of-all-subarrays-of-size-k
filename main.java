import java.util.*;
import java.io.*;
import java.lang.*;
class main(){
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- >0){
      int n = sc.nextInt();
      int k = sc.nextInt(0);
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      ArrayList <Integer> res = new Solution().max_of_subarrys(arr,n,k);
      for(int i=0;i<res.size();i++)
          System.out.print(res.get(i)+" ");
      System.out.println();
    }
  }
}
