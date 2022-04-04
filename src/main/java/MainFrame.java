import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("My Game");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //create the components
        configPanel = new ConfigPanel(this);
        canvas = new DrawingPanel(this);
        controlPanel = new ControlPanel(this);

        setLayout(new BorderLayout());

        //arrange the components in the container (frame)
        add(canvas, BorderLayout.CENTER);
        add(configPanel, BorderLayout.PAGE_START);
        add(controlPanel, BorderLayout.PAGE_END);

        //invoke the layout manager
        pack();
    }

}
