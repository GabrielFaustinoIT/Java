//GABRIEL FAUSTINO - CB3005399

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.UUID;


public class Calculadora implements ActionListener {
    
	private JFrame frame = new JFrame();
	private JTextField t1 = new JTextField(12);
	private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JButton b3 = new JButton();
    private JButton b4 = new JButton();
    private JButton b5 = new JButton();
    private JButton b6 = new JButton();
    private JButton b7 = new JButton();
    private JButton b8 = new JButton();
    private JButton b9 = new JButton();
    private JButton b0 = new JButton();
    private JButton badi = new JButton();
    private JButton bsub = new JButton();
    private JButton bmult = new JButton();
    private JButton bdiv = new JButton();
    private JButton bigual = new JButton();
    private JButton bponto = new JButton();
    private JButton bclear = new JButton();
    private JPanel p = new JPanel();
	private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    float v1i = 0;
    float v2i = 0;
    String v1s = "0";
    String tipoOp = "";
      
        
        Calculadora(){

            b0.setText("0");
            b1.setText("1");
            b2.setText("2");
            b3.setText("3");
            b4.setText("4");
            b5.setText("5");
            b6.setText("6");
            b7.setText("7");
            b8.setText("8");
            b9.setText("9");
            bclear.setText("C");
            badi.setText("+");
            bsub.setText("-");
            bdiv.setText("/");
            bmult.setText("*");
            bponto.setText(".");
            bigual.setText("=");
            t1.setText("0");
            t1.setEditable(false);
            b0.addActionListener(this);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            badi.addActionListener(this);
            bmult.addActionListener(this);
            bsub.addActionListener(this);
            bdiv.addActionListener(this);
            bponto.addActionListener(this);
            bigual.addActionListener(this);
            bclear.addActionListener(this);
            

            frame.setSize(220,240);
            frame.setLocation(200,200);
            frame.setTitle("Calculadora");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1.add(t1);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bdiv);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bmult);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(bsub);
        p2.add(b0);
        p2.add(bponto);
        p2.add(bigual);
        p2.add(badi);
        p2.setLayout(new GridLayout(4,4,0,0));
        p3.add(bclear);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        frame.add(p);
        frame.setVisible(true);



        }
    

        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            try{
                
                if("1".equals(command)){
                if(v1s == "0"){
                    v1s = "1";                    
                }
                else{
                    v1s += "1";
                }
                v1i = Float.parseFloat(v1s);   
                t1.setText(v1s);  
                }
            if("2".equals(command)){
                if(v1s == "0"){
                    v1s = "2";                    
                }
                else{
                    v1s += "2";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if("3".equals(command)){
                if(v1s == "0"){
                    v1s = "3";                    
                }
                else{
                    v1s += "3";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if("4".equals(command)){
                if(v1s == "0"){
                    v1s = "4";                    
                }
                else{
                    v1s += "4";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if("5".equals(command)){
                if(v1s == "0"){
                    v1s = "5";                    
                }
                else{
                    v1s += "5";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if("6".equals(command)){
                if(v1s == "0"){
                    v1s = "6";                    
                }
                else{
                    v1s += "6";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if("7".equals(command)){
                if(v1s == "0"){
                    v1s = "7";                    
                }
                else{
                    v1s += "7";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if("8".equals(command)){
                if(v1s == "0"){
                    v1s = "8";                    
                }
                else{
                    v1s += "8";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if("9".equals(command)){
                if(v1s == "0"){
                    v1s = "9";                    
                }
                else{
                    v1s += "9";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if("0".equals(command)){
                if(v1s == "0"){
                    v1s = "0";                    
                }
                else{
                    v1s += "0";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);     
            }
            if(".".equals(command)){
                
                if(v1s == "0"){
                    v1s = "0.";                    
                }
                else{
                    v1s += ".";
                }           
                v1i = Float.parseFloat(v1s); 
                t1.setText(v1s);       
            }
            if("C".equals(command)){

                v1s = "0";                    
                v1i = 0;
                v2i = 0;
                t1.setText(v1s);     
            }
            if("+".equals(command)){

                v2i = Float.parseFloat(v1s);             
                v1i = 0;
                v1s = "0";
                tipoOp = "soma";
                t1.setText(v1s);     
            }
            if("-".equals(command)){

                v2i = Float.parseFloat(v1s);             
                v1i = 0;
                v1s = "0";
                tipoOp = "sub";
                t1.setText(v1s);   
            }
            if("*".equals(command)){

                v2i = Float.parseFloat(v1s);             
                v1i = 0;
                v1s = "0";
                tipoOp = "mult";
                t1.setText(v1s);    
            }
            if("/".equals(command)){

                v2i = Float.parseFloat(v1s);             
                v1i = 0;
                v1s = "0";
                tipoOp = "div";
                t1.setText(v1s);     
            }
            if("=".equals(command)){

                if(tipoOp == "soma"){
                    v1i = v2i + v1i;
                    v1s = String.valueOf(v1i);
                }    
                if(tipoOp == "sub"){
                    v1i = v2i - v1i;
                    v1s = String.valueOf(v1i);
                }  
                if(tipoOp == "mult"){
                    v1i = v2i * v1i;
                    v1s = String.valueOf(v1i);
                }  
                if(tipoOp == "div"){
                    v1i = v2i / v1i;
                    v1s = String.valueOf(v1i);
                }                
            }
            }
            catch(Exception ex){
             v1s = "0";                    
             v1i = 0;
             v2i = 0;
             JOptionPane.showMessageDialog(null, String.valueOf(ex));
            }
            finally {
                 t1.setText(v1s); 
            }
            
                   
            
        }

	public static void main(String[] args) {
	    
	 Calculadora c = new Calculadora();
	    
	    
	}
}
