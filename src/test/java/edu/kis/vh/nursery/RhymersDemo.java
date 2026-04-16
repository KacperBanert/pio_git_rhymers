package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.defaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static final int RAND_RANGE = 20;
    public static final int INDEX = 3;
    public static final int LIMIT = 15;
    public static final int RHYMER_COUNT = 3;

    public static void main(String[] args) {
        RhymersFactory factory = new defaultRhymersFactory();

        testRhymers(factory);

    }

    private static void testRhymers(RhymersFactory factory) {
        defaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};

        for (int i = 1; i < LIMIT; i++)
            for (int j = 0; j < RHYMER_COUNT; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < LIMIT; i++)
            rhymers[INDEX].countIn(rn.nextInt(RAND_RANGE));


        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[INDEX]).reportRejected());
    }

}