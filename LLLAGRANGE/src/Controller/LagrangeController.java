package Controller;

import Model.LagrangeInterpolation;
import Model.Polynom;
import Model.Point;
import View.ConsoleView;

import java.io.IOException;

public class LagrangeController {
    private ConsoleView consoleView;

    public LagrangeController(ConsoleView consoleView) {
        this.consoleView = consoleView;
    }

    public void start() throws IOException {
        Point[] points = consoleView.ReadPoints();
        Polynom lagrange = LagrangeInterpolation.Interpolate(points);
        consoleView.WritePolynomial(lagrange);
    }
}


