/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POO
 * Prof. Fausto Maranhão Ayres
 **********************************/

package appswing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Produto;
import regras_negocio.Fachada;


public class TelaProdutos {
	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton button_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_4;
	private JTextField textField_1;
	private JButton button;
	private JButton button_2;
	private JButton button_3;

	private JTextField textField;
	private JButton button_4;

	/**
	 * Launch the application.
	 */
	//	public static void main(String[] args) {
	//		EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				try {
	//					TelaReuniao window = new TelaReuniao();
	//					window.frame.setVisible(true);
	//				} catch (Exception e) {
	//					e.printStackTrace();
	//				}
	//			}
	//		});
	//	}

	/**
	 * Create the application.
	 */
	public TelaProdutos() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				listagem();
			}
		});
		frame.setTitle("Produtos");
		frame.setBounds(100, 100, 575, 340);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 11, 315, 172);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setGridColor(Color.BLACK);
		table.setRequestFocusEnabled(false);
		table.setFocusable(false);
		table.setBackground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setRowSelectionAllowed(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setShowGrid(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		button_1 = new JButton("Apagar Selecionado");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (table.getSelectedRow() >= 0){
						String nome = (String) table.getValueAt( table.getSelectedRow(), 0);
						//confirmação
						Object[] options = { "Confirmar", "Cancelar" };
						int escolha = JOptionPane.showOptionDialog(null, "Confirma exclusão "+nome, "Alerta",
								JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
						if(escolha == 0) {
							Fachada.apagarProduto(nome);
							label.setText("exclusão realizada");
							listagem();
						}
						else
							label.setText("exclusão cancelada");
					}
					else
						label.setText("selecione uma linha");
				}
				catch(Exception erro) {
					label.setText(erro.getMessage());
				}
			}
		});
		button_1.setBounds(380, 49, 160, 23);
		frame.getContentPane().add(button_1);

		label = new JLabel("");
		label.setForeground(Color.RED);
		label.setBounds(26, 276, 514, 14);
		frame.getContentPane().add(label);

		label_1 = new JLabel("nome:");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(26, 220, 71, 14);
		frame.getContentPane().add(label_1);

		label_2 = new JLabel("pre\u00E7o:");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(26, 245, 71, 14);
		frame.getContentPane().add(label_2);

		label_4 = new JLabel("selecione uma linha");
		label_4.setBounds(26, 181, 315, 14);
		frame.getContentPane().add(label_4);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 243, 105, 20);
		frame.getContentPane().add(textField_1);

		button = new JButton("Criar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(textField.getText().isEmpty() ||  textField_1.getText().isEmpty()) {
						label.setText("campo vazio");
						return;
					}
					String nome = textField.getText();
					String preco = textField_1.getText();
					Fachada.criarProduto(nome, Double.parseDouble(preco));
					label.setText("produto criado");
					listagem();
				}
				catch(Exception ex) {
					label.setText(ex.getMessage());
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(208, 216, 95, 23);
		frame.getContentPane().add(button);

		button_2 = new JButton("Remover da Prateleira");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (table.getSelectedRow() >= 0){
						String nome = (String) table.getValueAt( table.getSelectedRow(), 0);
						Fachada.removerProdutoPrateleira(nome);
						label.setText("removeu da prateleita de " + nome);
						listagem();
					}
					else
						label.setText("selecione uma linha");
				}
				catch(Exception erro) {
					label.setText(erro.getMessage());
				}

			}
		});
		button_2.setToolTipText("");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_2.setBounds(380, 119, 160, 23);
		frame.getContentPane().add(button_2);

		button_3 = new JButton("Inserir na Prateleira");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (table.getSelectedRow() >= 0){
						String nome = (String) table.getValueAt( table.getSelectedRow(), 0);
						String id = JOptionPane.showInputDialog("id da prateleira");
						Fachada.inserirProdutoPrateleira(Integer.parseInt(id), nome);
						label.setText("inseriu na prateleita " + id);
						listagem();
					}
					else
						label.setText("selecione uma linha");
				}
				catch(Exception erro) {
					label.setText(erro.getMessage());
				}
			}
		});
		button_3.setToolTipText("");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_3.setBounds(380, 83, 160, 23);
		frame.getContentPane().add(button_3);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(81, 218, 105, 20);
		frame.getContentPane().add(textField);
		
		button_4 = new JButton("Listar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listagem();
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_4.setBounds(380, 14, 160, 23);
		frame.getContentPane().add(button_4);

		frame.setVisible(true);

	}

	public void listagem () {
		try{
			List<Produto> lista = Fachada.listarProdutos();

			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("Nome");
			model.addColumn("Preco");
			model.addColumn("Prateleira");
			for(Produto p : lista)
				if(p.getPrateleira()==null)
					model.addRow(new Object[]{  p.getNome(), p.getPreco(), "sem prateleira" });
				else
					model.addRow(new Object[]{  p.getNome(), p.getPreco(), p.getPrateleira().getId() });

			table.setModel(model);
			label_4.setText("resultados: "+lista.size()+ " linhas  - selecione uma linha");
			
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 		//desabilita
			table.getColumnModel().getColumn(1).setMaxWidth(50);	
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); //habilita
		}
		catch(Exception erro){
			label.setText(erro.getMessage());
		}
	}
}
