package methodofexhaustion;

/**
 * ClassName MaxPoints<br>
 * Function <br>
 * <p>
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/19 23:03
 */
public class MaxPoints {
    public int maxPoints(Point[] points) {
        if (points == null) {
            return 0;
        }
        if (points.length < 3) {
            return points.length;
        }
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            int count = 0;
            long a = points[i].x;
            long b = points[i].y;
            long dx = a - points[i - 1].x;
            long dy = b - points[i - 1].y;
            if (dx == 0 && dy == 0) {
                for (Point point : points) {
                    if (point.x == a && point.y == b) {
                        count++;
                    }
                }
            } else {
                for (Point point : points) {
                    if ((point.x - a) * dy == (point.y - b) * dx) {
                        count++;
                    }
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }
}

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
}
