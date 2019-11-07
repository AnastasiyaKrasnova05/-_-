package View;

import Model.Polynom;
import Model.Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class ConsoleView {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Point[] ReadPoints() throws IOException {
        System.out.println("Введи точки в одну строку\n");
        String s = reader.readLine();
        String[] strNumbers = s.split(" ");
        Point[] points = new Point[strNumbers.length / 2];
        for (int i = 0; i <points.length ; i++) {
            double x = Double.parseDouble(strNumbers[2*i]);
            double y = Double.parseDouble(strNumbers[2*i+1]);
            points[i] = new Point(x, y);
        }
        return points;
    }

    public void WritePolynomial(Polynom p) {
        System.out.println(p);
    }
}
