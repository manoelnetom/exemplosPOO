package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Filho;
import negocio.Pessoa;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Arvore {

	private JFrame frame;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arvore window = new Arvore();
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
	public Arvore() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Pessoa joao=new Filho("Sr. Joao",null);
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(joao);


		JTextArea txtLinhagem = new JTextArea();
		txtLinhagem.setBounds(32, 133, 364, 79);
		frame.getContentPane().add(txtLinhagem);
		
		JComboBox cmbPessoas = new JComboBox();
		cmbPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==cmbPessoas) {
					//cmbPessoas.removeAllItems();
					Pessoa selecionado = pessoas.get(cmbPessoas.getSelectedIndex());
					while(selecionado.getPai()!=null) {
						txtLinhagem.insert(selecionado.getNome()+ "\n", 0);
						selecionado=selecionado.getPai();
					}
				}
			}
		});
		cmbPessoas.addItem(joao.getNome());
		cmbPessoas.setBounds(32, 43, 146, 27);
		frame.getContentPane().add(cmbPessoas);

		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(184, 47, 61, 16);
		frame.getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(232, 42, 164, 26);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JCheckBox checkBoxMasculino = new JCheckBox("Masculino");
		checkBoxMasculino.setBounds(32, 110, 128, 23);
		frame.getContentPane().add(checkBoxMasculino);

		JCheckBox checkBoxFeminino = new JCheckBox("Feminino");
		checkBoxFeminino.setBounds(298, 110, 98, 23);
		frame.getContentPane().add(checkBoxFeminino);


		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btCadastrar) {	
					Pessoa pai = pessoas.get(cmbPessoas.getSelectedIndex());
					String nome = txtNome.getText();
					String sexo = "Masculino";
					if(checkBoxFeminino.isSelected()) {
						sexo = "Feminino";
					}
					try {
						Pessoa filho = pai.cadastrarFilho(nome, sexo);
						pessoas.add(filho);
						cmbPessoas.addItem(filho.getNome());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null,"Naitomorto nao tem filho");
					}
				}

			}
		});
		btCadastrar.setBounds(169, 104, 117, 29);
		frame.getContentPane().add(btCadastrar);
	}
}
