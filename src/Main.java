import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mine Hunter!");
        frame.setSize(500, 500);

        MineGrid grid = new MineGrid(5);
        frame.add(grid);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
