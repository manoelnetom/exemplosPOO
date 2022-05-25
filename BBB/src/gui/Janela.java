package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Paredao;
import negocio.Participante;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtPerdedor;
	private JTextField txtPart1;
	private JTextField txtPart2;

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
		
		Paredao bbb=new Paredao(new Participante("Juliana", "001"), new Participante("Dhomini", "002"));
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Participante:");
		lblNewLabel.setBounds(21, 35, 88, 16);
		frame.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(103, 30, 130, 26);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JComboBox cmbCodigo = new JComboBox();
		cmbCodigo.setModel(new DefaultComboBoxModel(new String[] {"001", "002"}));
		cmbCodigo.setBounds(312, 31, 88, 27);
		frame.getContentPane().add(cmbCodigo);
		
		JLabel lblNewLabel_1 = new JLabel("Código");
		lblNewLabel_1.setBounds(245, 35, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Votar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=txtNome.getText();
				String codigo=(String)cmbCodigo.getSelectedItem();
				if(nome.equalsIgnoreCase("")) {
					try {
						bbb.votaPorCodigo(codigo);
						JOptionPane.showMessageDialog(null, "Voto computado Codigo "+codigo);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "O Codigo escolhido nao existe");
					}
				}else {
					try {
						bbb.votaPorNome(nome);
						JOptionPane.showMessageDialog(null, "Voto computado em "+nome);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "O Nome digitado não existe");
					}
				}
			}
		});
		btnNewButton.setBounds(173, 86, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		txtPerdedor = new JTextField();
		txtPerdedor.setBounds(120, 185, 130, 26);
		frame.getContentPane().add(txtPerdedor);
		txtPerdedor.setColumns(10);
		

		txtPart1 = new JTextField();
		txtPart1.setBounds(130, 228, 66, 26);
		frame.getContentPane().add(txtPart1);
		txtPart1.setColumns(10);
		
		txtPart2 = new JTextField();
		txtPart2.setBounds(345, 228, 66, 26);
		frame.getContentPane().add(txtPart2);
		txtPart2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Resultado");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1) {
					txtPerdedor.setText(bbb.getPerdedor());
					txtPart1.setText(bbb.percentualPrimeiro()+" % ");
					txtPart2.setText(bbb.percentualSegundo()+" % ");
				}
			}
		});
		btnNewButton_1.setBounds(173, 144, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Perdedor:");
		lblNewLabel_2.setBounds(21, 190, 88, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Participante 1:");
		lblNewLabel_3.setBounds(21, 233, 106, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_4 = new JLabel("Participante 2:");
		lblNewLabel_4.setBounds(232, 233, 101, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		
	}
}
