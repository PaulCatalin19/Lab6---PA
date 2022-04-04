import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {
    final MainFrame frame;

    //create all buttons (Load, Exit, etc.)
    JButton b1 = new JButton("Load");
    JButton b2 = new JButton("Save");
    JButton b3 = new JButton("Exit");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 4));

        //add all buttons
        add(b1);
        add(b2);
        add(b3);

        //configure listeners for all buttons
        b3.addActionListener(this::exitGame);
    }

    private void exitGame(ActionEvent e) {
        frame.dispose();
    }

}
