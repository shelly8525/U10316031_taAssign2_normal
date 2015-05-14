import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.border.TitledBorder;

public class CircleCalculator extends JFrame {
	private JTextField JRadius = new JTextField(10);
	private JTextField JLength = new JTextField(10);
	private JTextField JLength1 = new JTextField(10);
	
	private JTextField JArea = new JTextField();
	private JTextField JArea1 = new JTextField();
	private JTextField JArea2 = new JTextField();
	
	private JTextField JPerimeter = new JTextField();
	private JTextField JPerimeter1 = new JTextField();
	private JTextField JPerimeter2 = new JTextField();
	
	private JButton calculator = new JButton("計算");
	private JButton calculator1 = new JButton("計算");
	private JButton calculator2 = new JButton("計算");
	
	private JButton clean = new JButton("清除");
	private JButton clean1 = new JButton("清除");
	private JButton clean2 = new JButton("清除");
	
	public CircleCalculator(){
		JPanel P1 = new JPanel();
		JPanel P2 = new JPanel();
		JPanel P3 = new JPanel();
		
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
		
		P1.add(p2,BorderLayout.CENTER);
		P1.add(p3,BorderLayout.SOUTH);
		
		JPanel p21 = new JPanel(new FlowLayout());
		p21.add(new JLabel("Length:"));
		p21.add(JLength);
		p21.add(calculator1);
		p21.add(clean1);
		
		JPanel p22 = new JPanel(new GridLayout(2,2,2,2));
		p22.add(new JLabel("The area is:"));
		p22.add(JArea1);
		p22.add(new JLabel("The perimeter is:"));
		p22.add(JPerimeter1);
		
		P2.add(p21,BorderLayout.CENTER);
		P2.add(p22,BorderLayout.SOUTH);
		
		JPanel p31 = new JPanel(new FlowLayout());
		p21.add(new JLabel("Length1:"));
		p21.add(JLength1);
		p21.add(calculator2);
		p21.add(clean2);
		
		JPanel p32 = new JPanel(new GridLayout(2,2,2,2));
		p32.add(new JLabel("The area is:"));
		p32.add(JArea2);
		p32.add(new JLabel("The perimeter is:"));
		p32.add(JPerimeter2);
		
		P3.add(p31,BorderLayout.CENTER);
		P3.add(p32,BorderLayout.SOUTH);
		
		P1.setBorder(new TitledBorder("Circle:"));
		P2.setBorder(new TitledBorder("Square:"));
		P3.setBorder(new TitledBorder("Triangle:"));
		
		add(P1,BorderLayout.NORTH);
		add(P2,BorderLayout.CENTER);
		add(P3,BorderLayout.SOUTH);
		
		
		calculator.addActionListener(new ButtonListener1());
		clean.addActionListener(new ButtonListener2());
		
		calculator1.addActionListener(new ButtonListener21());
		clean1.addActionListener(new ButtonListener22());
		
		calculator2.addActionListener(new ButtonListener21());
		clean2.addActionListener(new ButtonListener22());
	}
	
	private class ButtonListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			double radius = Double.parseDouble(JRadius.getText());
			double area;
			double perimeter;
			
			area = radius * radius * Math.PI;
			perimeter = 2* radius * Math.PI;
			
			JArea.setText(String.format("%.2f",area));
			JPerimeter.setText(String.format("%.2f",perimeter));
		}
	}
	
	private class ButtonListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			JRadius.setText("");
			JArea.setText("");
			JPerimeter.setText("");
		}
	}
	
	private class ButtonListener21 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			double length = Double.parseDouble(JLength.getText());
			double area1;
			double perimeter1;
			
			area1 = length * length;
			perimeter1 = 4* length;
			
			JArea1.setText(String.format("%.2f",area1));
			JPerimeter1.setText(String.format("%.2f",perimeter1));
		}
	}
	
	private class ButtonListener22 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			JLength.setText("");
			JArea1.setText("");
			JPerimeter1.setText("");
		}
	}
	
	public static void main(String[] args){
		CircleCalculator frame = new CircleCalculator();
		frame.pack();
		frame.setSize(700,800);
		frame.setTitle("U10316031_GeoCalculate");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
