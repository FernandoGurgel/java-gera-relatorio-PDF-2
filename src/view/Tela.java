package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;

public class Tela extends JPanel implements ActionListener{
	
	JFrame frame = new JFrame("Tela de Cadastro");
	JLabel jLabel = new JLabel("Nome");
	JTextField txtnome = new JTextField();
	JButton btnSalva = new JButton("Salvar!");
	JButton btnFecha = new JButton("Sair!");
	JButton btnLista = new JButton("Sair!");
	
	
	public void criartela() {
		
		add(jLabel);
		add(txtnome);
		add(btnSalva);
		add(btnFecha);
		setLayout(null);
		jLabel.setBounds(10, 10, 100, 30);
		txtnome.setBounds(10, 40, 100, 30);
		btnSalva.setBounds(10, 70, 100, 30);
		btnFecha.setBounds(120, 70, 100, 30);
		frame.setBounds(300, 300, 400, 200);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		btnSalva.addActionListener(this);
		btnFecha.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnSalva){
			Controlador controlador = new Controlador();
			controlador.setsalvar(txtnome.getText());
		}
		if (e.getSource() == btnFecha){
			this.fechar();
		}
		
	}

	private void fechar() {
		
		if(JOptionPane.showConfirmDialog(null, "Deseja Fechar?", "Atencao", JOptionPane.YES_NO_OPTION)==0){
			System.exit(0);
		}
	}

}
