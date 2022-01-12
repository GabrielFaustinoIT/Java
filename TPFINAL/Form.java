//Gabriel Faustino - 3005399
 

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.google.gson.Gson;
public class Form implements ActionListener {
			
	private JFrame frame = new JFrame();	
	private JPanel p = new JPanel();	
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JButton b1 = new JButton();	
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();
	private JButton b4 = new JButton();
	  
	private JLabel l1 = new JLabel("Nome:");
	private JTextField t1 = new JTextField(12);
	
	private JLabel l2 = new JLabel("Idade:");
	private JTextField t2 = new JTextField(12);
	
	private JLabel l3 = new JLabel("Peso:");
	private JTextField t3 = new JTextField(12);
	
	private JLabel l4 = new JLabel("Altura:");
	private JTextField t4 = new JTextField(12);
	
	private JLabel l5 = new JLabel("Objetivo:");
	private JTextField t5 = new JTextField(12);
	
    Form(){
    	
	    frame.setSize(500,300);
	    frame.setLocation(200,200);
	    frame.setTitle("FINAL");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	  
	    p1.add(l1);
	    p1.add(t1);
	    p1.add(l2);
	    p1.add(t2);
	    p1.add(l3);
	    p1.add(t3);
	    p1.add(l4);
	    p1.add(t4);
	    p1.add(l5);
	    p1.add(t5);
	    p1.add(b1);
	    p1.add(b2);
	    p1.add(b3);
	    p1.add(b4);    
	    p1.setLayout(new GridLayout(9,0)); 
	    
	    b1.setText("Incluir");
        b2.setText("Limpar");
        b3.setText("Apresentar Dados");
        b4.setText("Sair");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
	    	    
	    p.add(p1);
	    	    
	    frame.add(p);
	    frame.setVisible(true);
    
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		Student students = new Student();
		StudentDAO dao = new StudentDAO();
			
		if("Incluir".equals(command)){
			
			
			students.setName(t1.getText());
			students.setAge(Integer.parseInt(t2.getText()));
			students.setWeight(Double.parseDouble(t3.getText()));
			students.setHeight(Double.parseDouble(t4.getText()));
			students.setGoal(t5.getText());
			
			dao.insert(students);
			JOptionPane.showMessageDialog(null, "O(a) aluno(a) "+t1.getText()+" foi cadastrado(a) com sucesso!");
		}
		else if("Limpar".equals(command)) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");

		}
		else if("Apresentar Dados".equals(command)) {
			Gson json=new Gson() ;
			students.setName(t1.getText());
			students.setAge(Integer.parseInt(t2.getText()));
			students.setWeight(Double.parseDouble(t3.getText()));
			students.setHeight(Double.parseDouble(t4.getText()));
			students.setGoal(t5.getText());
			String response = json.toJson(students);
			JOptionPane.showMessageDialog(null, response);
			
		}
		else if("Sair".equals(command)) {
			System.exit(0);
		}

		
	}
	
	
    public static void main(String[] args) {
	    
        
    Form f = new Form();
    
    
    }
}
