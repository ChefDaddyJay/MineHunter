import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MineBox extends JButton {
    public static final ImageIcon MINE = new ImageIcon("images/skull-48.png");
    public boolean isMine, isOpen;

    public MineBox(boolean isMine, boolean isOpen) {
        this.isMine = isMine;
        this.isOpen = isOpen;
        this.addActionListener(e -> {
            MineBox.this.setEnabled(!MineBox.this.isEnabled());
            if(isMine) {
                MineBox.this.setIcon(MineBox.MINE);
            } else {
                MineBox.this.setFont(new Font("Arial", Font.BOLD, 40));
                MineBox.this.setText("#");
            }
        });
    }
}
