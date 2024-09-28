package BehavioralDesignPattern.Strategy;

public class Main {

   public static void main(String[] arg){
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        sortingContext.processSort(new int[]{2,3,1,3,4,4});

       sortingContext.setSortingStrategy(new QuickSortStrategy());
       sortingContext.processSort(new int[]{2,3,1,3,4,4});
    }

}
