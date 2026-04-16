package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca stos liczb całkowitych o stałej pojemności CAPACITY
 */
public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    private static final int UNINITIALIZED_TOTAL = -1;
    public static final int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];

    private int total = UNINITIALIZED_TOTAL;

    /**
     * Dodaje liczbe na szczyt stosu
     * @param in liczba do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza pustość stosu
     * @return Zwraca true jeżeli stos jest pusty
     */
    public boolean callCheck() {
        return total == UNINITIALIZED_TOTAL;
    }

    /**
     * Sprawdza stan zapełnienia stosu
     * @return Zwraca true w przypadku zapelnienia
     */
    public boolean isFull() {
        return total == CAPACITY-1;
    }

    /**
     * Zwraca element ze szczytu stosu
     * @return Zwraca element ze szczytu stosu lub -1 w przypadku braku
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Zdejmuje element ze szczytu stosu
     * @return Zwraca element ze szczytu lub -1 w przypadku braku
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

    /**
     * Zwraca liczbę elementów na stosie
     * @return Zwraca liczbe elementów
     */
    public int getTotal() {
        return total;
    }

}