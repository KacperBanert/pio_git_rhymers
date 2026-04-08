package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    private static final int UNINITIALIZED_TOTAL = -1;
    public static final int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];

    private int total = UNINITIALIZED_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == UNINITIALIZED_TOTAL;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}