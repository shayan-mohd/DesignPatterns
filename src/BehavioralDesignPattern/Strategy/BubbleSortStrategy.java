package BehavioralDesignPattern.Strategy;

public class BubbleSortStrategy implements SortingStrategy{

    @Override
    public int[] sort(int[] arr) {
        System.out.println("Sorted by bubble sort");
        return new int[0];
    }
}
