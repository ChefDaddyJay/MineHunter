import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MinePlanter {
    static ArrayList<MineBox> boxes = new ArrayList<>();

    public static void plantMines(Container grid, int gridSize) {
        for(int x = 0; x < gridSize; x++) {
            for(int y = 0; y < gridSize; y++) {
                MineBox box = new MineBox(new Random().nextBoolean(), false);
                boxes.add(box);
                grid.add(box);
            }
        }
    }
}
