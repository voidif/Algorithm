import java.util.ArrayList;
import java.util.Scanner;

public class quickSort {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      ArrayList<Integer> array = new ArrayList<>();
      for(int i = 0; i < num; i++){
         array.add(in.nextInt());
      }
      sort(array, 0, num - 1);
      for(int tmp : array){
         System.out.print(tmp + " ");
      }
   }

   //quicksort
   //key: choose first number and move later pointer first
   //key: choose last number and move prior first
   public static void sort(ArrayList<Integer> array, int begin, int end){
         if(end <= begin){
            return;
         }
         int indexFirst = begin;
         int indexLast = end;
         int baseNum = array.get(begin);
         while(indexFirst < indexLast){
            if(array.get(indexLast) >= baseNum && indexFirst < indexLast){
               indexLast --;
               continue;
            }
            if(array.get(indexFirst) <= baseNum && indexFirst < indexLast){
               indexFirst ++;
               continue;
            }
            int tmp = array.get(indexFirst);
            array.set(indexFirst, array.get(indexLast));
            array.set(indexLast, tmp);
         }
         array.set(begin, array.get(indexFirst));
         array.set(indexFirst, baseNum);
         sort(array, begin, indexFirst - 1);
         sort(array, indexFirst + 1, end);
      }

}




