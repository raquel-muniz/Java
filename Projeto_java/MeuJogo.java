import javax.swing.*;

public class MeuJogo extends JFrame {
    public MeuJogo() {
        // Configurações da janela
        setTitle("Meu Jogo em Java");
        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        setVisible(true);
    }

    public static void main(String[] args) {
    new MeuJogo();
    }
}