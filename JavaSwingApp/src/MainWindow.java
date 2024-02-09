import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("GUI Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
