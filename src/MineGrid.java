import javax.swing.*;
import java.awt.*;

public class MineGrid extends JPanel {
    public MineGrid(int size) {
        this.setLayout(new GridLayout(size, size));
        this.setBackground(Color.BLUE);
        MinePlanter.plantMines(this, size);
    }
}
