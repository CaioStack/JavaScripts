package SnakeGame;

import javax.swing.*;

public class IniciarJogo extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new IniciarJogo());
    }

    IniciarJogo() {
        TelaJogo tela = new TelaJogo();
        
        add(tela);
        setTitle("Jogo da Cobrinha - Snake game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        // Pede o foco para garantir que o teclado responda imediatamente
        tela.requestFocusInWindow();
    }
}