package com.github.sovaalexandr.split_array_with_same_average;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SplitArrayWithSameAverageTypical
{
    public boolean splitArraySameAverage(int[] A) {
        int aL = A.length;
        if (aL == 1) return false;

        int aSum = 0;
        for (int x: A) aSum += x;

        int g = greatestCommonDivisor(aSum, aL);
        Point mu = new Point(-(aSum/g), aL/g);
        // A[i] -> fracAdd(A[i], mu)
        List<Point> A2 = new ArrayList();
        for (int x: A)
            A2.add(fracAdd(new Point(x, 1), mu));

        Set<Point> left = new HashSet();
        left.add(A2.get(0));
        for (int i = 1; i < aL/2; ++i) {
            Set<Point> left2 = new HashSet();
            Point z = A2.get(i);
            left2.add(z);
            for (Point p: left) {
                left2.add(p);
                left2.add(fracAdd(p, z));
            }
            left = left2;
        }

        if (left.contains(new Point(0, 1))) return true;

        Set<Point> right = new HashSet();
        right.add(A2.get(aL-1));
        for (int i = aL/2; i < aL-1; ++i) {
            Set<Point> right2 = new HashSet();
            Point z = A2.get(i);
            right2.add(z);
            for (Point p: right) {
                right2.add(p);
                right2.add(fracAdd(p, z));
            }
            right = right2;
        }

        if (right.contains(new Point(0, 1))) return true;

        Point sleft = new Point(0, 1);
        for (int i = 0; i < aL/2; ++i)
            sleft = fracAdd(sleft, A2.get(i));

        Point sright = new Point(0, 1);
        for (int i = aL/2; i < aL; ++i)
            sright = fracAdd(sright, A2.get(i));

        for (Point ha: left) {
            Point ha2 = new Point(-ha.x, ha.y);
            if (right.contains(ha2) && (!ha.equals(sleft) || !ha2.equals(sright)))
                return true;
        }
        return false;
    }

    public Point fracAdd(Point A, Point B) {
        int numer = A.x * B.y + B.x * A.y;
        int denom = A.y * B.y;
        int g = greatestCommonDivisor(numer, denom);
        numer /= g;
        denom /= g;

        if (denom < 0) {
            numer *= -1;
            denom *= -1;
        }

        return new Point(numer, denom);
    }

    public int greatestCommonDivisor(int a, int b) {
        if (b==0) return a;
        return greatestCommonDivisor(b, a%b);
    }
}
