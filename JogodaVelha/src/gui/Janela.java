package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Jogo;
import negocio.QuadradoMagico;
import negocio.Velha;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class Janela {

	private JFrame frame;
	private JTextField txtP11;
	private JTextField txtP12;
	private JTextField txtP13;
	private JTextField txtP21;
	private JTextField txtP22;
	private JTextField txtP23;
	private JTextField txtP31;
	private JTextField txtP32;
	private JTextField txtP33;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		Jogo jogo=null;
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btNovo = new JButton("Novo");
		btNovo.setBounds(179, 163, 117, 29);
		frame.getContentPane().add(btNovo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Velha");
		rdbtnNewRadioButton.setBounds(309, 19, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Quadrado");
		rdbtnNewRadioButton_1.setBounds(306, 63, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		ButtonGroup group =new ButtonGroup();
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		
		txtP11 = new JTextField();
		txtP11.setBounds(29, 18, 65, 26);
		frame.getContentPane().add(txtP11);
		txtP11.setColumns(10);
		
		txtP12 = new JTextField();
		txtP12.setColumns(10);
		txtP12.setBounds(131, 18, 65, 26);
		frame.getContentPane().add(txtP12);
		
		txtP13 = new JTextField();
		txtP13.setColumns(10);
		txtP13.setBounds(229, 18, 65, 26);
		frame.getContentPane().add(txtP13);
		
		txtP21 = new JTextField();
		txtP21.setColumns(10);
		txtP21.setBounds(29, 62, 65, 26);
		frame.getContentPane().add(txtP21);
		
		txtP22 = new JTextField();
		txtP22.setColumns(10);
		txtP22.setBounds(131, 62, 65, 26);
		frame.getContentPane().add(txtP22);
		
		txtP23 = new JTextField();
		txtP23.setColumns(10);
		txtP23.setBounds(229, 62, 65, 26);
		frame.getContentPane().add(txtP23);
		
		txtP31 = new JTextField();
		txtP31.setColumns(10);
		txtP31.setBounds(29, 100, 65, 26);
		frame.getContentPane().add(txtP31);
		
		txtP32 = new JTextField();
		txtP32.setColumns(10);
		txtP32.setBounds(131, 100, 65, 26);
		frame.getContentPane().add(txtP32);
		
		txtP33 = new JTextField();
		txtP33.setColumns(10);
		txtP33.setBounds(229, 100, 65, 26);
		frame.getContentPane().add(txtP33);
		
		JButton btJogar = new JButton("Jogar");
		btJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogo.setP11(txtP11.getText());
				jogo.setP12(txtP12.getText());
				jogo.setP13(txtP13.getText());
				
				jogo.setP21(txtP21.getText());
				jogo.setP22(txtP22.getText());
				jogo.setP23(txtP23.getText());
				
				jogo.setP31(txtP31.getText());
				jogo.setP32(txtP32.getText());
				jogo.setP33(txtP33.getText());
				
				String resultado=jogo.getResultado();
				
				JOptionPane.showMessageDialog(null, resultado);
				
			}
		});
		btJogar.setBounds(22, 163, 117, 29);
		frame.getContentPane().add(btJogar);
		
		
	}
}
