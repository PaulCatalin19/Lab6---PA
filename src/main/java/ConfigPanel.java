import javax.swing.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    JSpinner spinner1;
    JSpinner spinner2;
    JButton button;
    int rows, cols;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //create the label
        label = new JLabel("Grid size:");

        //create spinners for rows and cols, and the button
        spinner1 = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        spinner2 = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        button = new JButton("Create");

        //add label, spinners, buttons etc.
        add(label); //JPanel uses FlowLayout by default
        add(spinner1);
        add(spinner2);
        add(button);

        rows = (int) spinner1.getValue();
        cols = (int) spinner2.getValue();
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
