package BehavioralDesignPattern.Strategy;

public class SortingContext {

    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy =  sortingStrategy;
    }
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy =  sortingStrategy;
    }

    public int[] processSort(int[] arr) {
       return  sortingStrategy.sort(arr);
    }
}
