import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class CircleCalculator extends JFrame {
	private JTextField JRadius = new JTextField(10);
	private JTextField JArea = new JTextField();
	private JTextField JPerimeter = new JTextField();
	
	private JButton calculator = new JButton("­pºâ");
	private JButton clean = new JButton("²M°£");
	public CircleCalculator(){
		JPanel P1 = new JPanel();
		JPanel p1 = new JPanel();
		p1.add(new JLabel("Circle:"));
		
		JPanel p2 = new JPanel(new FlowLayout());
		p2.add(new JLabel("Radius:"));
		p2.add(JRadius);
		p2.add(calculator);
		p2.add(clean);
		
		JPanel p3 = new JPanel(new GridLayout(2,2,2,2));
		p3.add(new JLabel("The area is:"));
		p3.add(JArea);
		p3.add(new JLabel("The perimeter is:"));
		p3.add(JPerimeter);
		
		P1.add(p1,BorderLayout.NORTH);
		P1.add(p2,BorderLayout.CENTER);
		P1.add(p3,BorderLayout.SOUTH);
		add(P1);
		
		calculator.addActionListener(new ButtonListener1());
		clean.addActionListener(new ButtonListener2());
	}
	
	private class ButtonListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			
			
		}
	}
	
	private class ButtonListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			
			
		}
	}
	public static void main(String[] args){
		CircleCalculator frame = new CircleCalculator();
		frame.pack();
		frame.setSize(500,400);
		frame.setTitle("U10316031_GeoCalculate");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
