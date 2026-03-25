package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int REJECT_COUNT = 0;
    int totalRejected = REJECT_COUNT;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
