package usingjcapi;

import java.util.Comparator;

public class BalanceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        TrafficCard c1 = (TrafficCard) o1;
        TrafficCard c2 = (TrafficCard) o2;

        return Float.compare(c1.mBalance, c2.mBalance);
    }
}
