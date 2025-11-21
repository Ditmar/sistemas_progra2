import javax.swing.SwingUtilities;

import ui.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow("Hola");
        });
    }
}
