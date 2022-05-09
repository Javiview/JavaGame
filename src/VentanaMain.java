import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class VentanaMain extends JFrame implements ActionListener{
    
    private JPanel inicio;
    private JButton btnEmpezar,btnSalir,btnConfig,btnLider;
    private int WIDTH = 800;
    private int HEIGHT = 600;
    public VentanaMain(){
        // Ventana principal -> de inicio
        componentes();
        readConfig();

        //config
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("JavaGame");//POSIBLE VARIABLE


    }
    public void componentes() {
        
        inicio = new JPanel();
        add(inicio);
        //BOTONES
        btnEmpezar = new JButton();
        btnEmpezar.setBounds(20, 500, 100, 50);//RELATIVO
        btnEmpezar.setText("Empezar");
        add(btnEmpezar);
        btnEmpezar.addActionListener(this);

        btnSalir = new JButton();
        btnSalir.setBounds(680, 500, 100, 50);//RELATIVO
        btnSalir.setText("Salir");
        add(btnSalir);
        btnSalir.addActionListener(this);

        btnConfig = new JButton();
        btnConfig.setBounds(300, 500, 100, 50);//RELATIVO
        btnConfig.setText("Ajustes");
        add(btnConfig);
        btnConfig.addActionListener(this);

        btnLider = new JButton();
        btnLider.setBounds(500, 500, 100, 50);//RELATIVO
        btnLider.setText("Lider");
        add(btnLider);
        btnLider.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(btnEmpezar)){
            System.out.println("Se ha pulsado el botón Empezar");
            //SOLO PRUEBAS
            
            
        }
        
        if(e.getSource().equals(btnSalir)){
            System.exit(0);
        }
        if(e.getSource().equals(btnConfig)){
            System.out.println("Se ha pulsado el botón Config");
            this.dispose();
            new VentanaConfig(WIDTH,HEIGHT);
        }
        if(e.getSource().equals(btnLider)){
            System.out.println("Se ha pulsado el botón Lider");
        
        }
        
    }

    public void readConfig() {
        String filePath = "./bin/configuracion/config.properties";
        Properties properties= new Properties();
    try {
        properties.load(new BufferedInputStream(new FileInputStream(filePath)));
        WIDTH = Integer.parseInt(properties.getProperty("WIDTH"));
        HEIGHT = Integer.parseInt(properties.getProperty("HEIGHT"));

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

}
