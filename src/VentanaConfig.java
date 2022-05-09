import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConfig extends JFrame implements ActionListener{

    JButton btnAtras;

    JPanel ajustes;
    public VentanaConfig(int WIDTH,int HEIGHT){
        componentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("Ajustes");
        
        
    }

    private void componentes() {

        btnAtras = new JButton();
        btnAtras.setBounds(680, 500, 100, 50);//RELATIVO
        btnAtras.setText("Atras");
        add(btnAtras);
        btnAtras.addActionListener(this);
        
    }
    private void writeConfig() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnAtras)){
            this.dispose();
            new VentanaMain();
            
        }
        
    }
    
}
