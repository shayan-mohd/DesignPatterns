package BehavioralDesignPattern.Strategy;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public int[] sort(int[] arr) {
        System.out.println("sorting by quick sort");
        return new int[0];
    }
}
