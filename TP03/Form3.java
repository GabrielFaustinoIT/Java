//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;

public class Form3 implements ActionListener {
    
        private JFrame frame = new JFrame();
	private JLabel l1 = new JLabel("Numero:");
	private JTextField t1 = new JTextField(12);
        private JLabel l2 = new JLabel("Nome:");
	private JTextField t2 = new JTextField(12);
        private JLabel l3 = new JLabel("Sexo:");
        private JRadioButton mas, fem;
        private RadioButtonHandler handler;        
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
        private JPanel pr = new JPanel();
        private Pessoa umaPessoa = new Pessoa();
        private GridLayout grid = new GridLayout(4, 2, 10, 10);
        
        Form3(){
            b1.setText("OK");
            b2.setText("Limpar");
            b3.setText("Mostrar");
            b4.setText("Sair");
	    b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
	    t1.setEditable(false);
            handler = new RadioButtonHandler();
            mas = new JRadioButton("M", true);
            fem = new JRadioButton("F", false);
            
            mas.addItemListener(handler);
            fem.addItemListener(handler);
            
	    frame.setSize(360,260);
	    frame.setLocation(200,200);
	    frame.setTitle("TP03 - LP2I4");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
	    p1.add(l1);
            p1.add(t1);
            p1.add(l2);
            p1.add(t2);
            p1.add(l3);
            pr.add(mas);
            pr.add(fem);
            p1.add(pr);
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
                String teste4 = t4.getText();
                    if(!teste2.equals("") && !teste4.equals("")){ 
                        char sexo = 't';
                        if(mas.isSelected()){
                            sexo = 'M';
                        }
                        if(fem.isSelected()){
                            sexo = 'F';
                        }
                        umaPessoa = new Pessoa(t2.getText(),sexo,Integer.parseInt(t4.getText()));
                        t1.setText("");
                        t2.setText("");
                        t4.setText("");                                 
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
                if(umaPessoa.getSexo() == 'M'){
                    mas.setSelected(true);
                    fem.setSelected(false);
                }
                if(umaPessoa.getSexo() == 'F'){
                    mas.setSelected(false);
                    fem.setSelected(true);
                }
                t2.setText(umaPessoa.getNome());
                t4.setText(String.valueOf(umaPessoa.getIdade()));
            }
            if("Sair".equals(command)){
                frame.dispose();                
            }
            
        }
        
        private class RadioButtonHandler implements ItemListener
            {
                @Override
                public void itemStateChanged(ItemEvent event)
                {
                if(mas.isSelected()){
                    fem.setSelected(false);
                } 
                else{
                    mas.setSelected(false);
                }
                   
                }
        }
        public void itemStateChanged(ItemEvent event) {
            
  }
        
        public static void main(String[] args) {
	    
	    Form3 f = new Form3();
	    
	    
	}
        
}
