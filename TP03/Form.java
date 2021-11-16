//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;

public class Form implements ActionListener {
    
        private JFrame frame = new JFrame();
	private JLabel l1 = new JLabel("Numero:");
	private JTextField t1 = new JTextField(12);
        private JLabel l2 = new JLabel("Nome:");
	private JTextField t2 = new JTextField(12);
        private JLabel l3 = new JLabel("Sexo:");
	private JTextField t3 = new JTextField(12);
        private JLabel l4 = new JLabel("Idade:");
	private JTextField t4 = new JTextField(12);
	private JButton b1 = new JButton();
        private JButton b2 = new JButton();
        private JButton b3 = new JButton();
        private JButton b4 = new JButton();
        private JPanel p = new JPanel();
	private JPanel p1 = new JPanel();
        private JPanel p2 = new JPanel();
        private Pessoa umaPessoa = new Pessoa();
        private GridLayout grid = new GridLayout(4, 2, 10, 10);
        
        Form(){
            b1.setText("OK");
            b2.setText("Limpar");
            b3.setText("Mostrar");
            b4.setText("Sair");
	    b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
	    t1.setEditable(false);
            
	    frame.setSize(360,220);
	    frame.setLocation(200,200);
	    frame.setTitle("TP03 - LP2I4");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
	    p1.add(l1);
            p1.add(t1);
            p1.add(l2);
            p1.add(t2);
            p1.add(l3);
            p1.add(t3);
            p1.add(l4);
            p1.add(t4);
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            p2.add(b4);
            p1.setLayout(new GridLayout(4,2,10,10));  
            p.add(p1);
            p.add(p2);
            frame.add(p);
            
	    frame.setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if("OK".equals(command)){
                String teste2 = t2.getText();
                String teste3 = t3.getText();
                String teste4 = t4.getText();
                if(teste3.charAt(0) == 'F' || teste3.charAt(0) == 'M'){
                    if(!teste2.equals("") && !teste3.equals("") && !teste4.equals("")){                 
                        umaPessoa = new Pessoa(t2.getText(),t3.getText().charAt(0),Integer.parseInt(t4.getText()));
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");                    
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                    }               
                }
                else{
                    JOptionPane.showMessageDialog(null, "O sexo precisa der M ou F");
                }
                
            }
            if("Limpar".equals(command)){
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                //t2.setText("mudou");
            }
            if("Mostrar".equals(command)){
                t1.setText(String.valueOf(umaPessoa.getKp()));
                t2.setText(umaPessoa.getNome());
                t3.setText(String.valueOf(umaPessoa.getSexo()));
                t4.setText(String.valueOf(umaPessoa.getIdade()));
            }
            if("Sair".equals(command)){
                frame.dispose();                
            }
            
        }
        
        public static void main(String[] args) {
	    
	    Form f = new Form();
	    
	    
	}
        
}
