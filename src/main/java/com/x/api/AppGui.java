package com.x.api;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.SwingWorker;
import org.apache.commons.io.FileUtils;
import com.x.api.core.Item;
import com.x.api.core.ServiceSearch;

/**
 * 
 * @author Emmanuel PESENTI
 *
 *         27 nov. 2016
 */
public class AppGui {
	private JFrame				frame					= null;
	private JPanel				panQ					= null;
	private JLabel				labQ					= null;
	private JTextField		txtQ					= null;
	private JLabel				labNb					= null;
	private JButton				cmdSearch			= null;
	private JTextPane			textpane			= null;
	private JScrollPane		scrollerList	= null;
	private JList<Item>		list					= null;
	private JLabel				statut				= null;
	private JSplitPane		splitPane			= null;
	private JPanel				panel					= null;
	private JScrollPane		scrollerArea	= null;
	private JLabel				labFileName		= null;
	private JLabel				labMessage		= null;
	private JTextPane			labApropos		= null;
	private JToolBar			toolBar				= null;
	private JButton				cmdHelpQuery	= null;
	private JButton				cmdOpenFile		= null;
	private JButton				button				= null;
	//
	private ApiBoamp			api						= null;
	private JToggleButton	tglbtnXml;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// PropertyConfigurator.configure(AppGui.class.getClassLoader().getResource("log4j.properties"));
		String fileFormat = "xml";// MainHelper.getParam("-fileFormat", args, "xml"); // xml par default
		ApiBoamp api = new ApiBoamp(fileFormat);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AppGui(api);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppGui(ApiBoamp api) {
		initialize();

		StringBuilder html = new StringBuilder();
		html.append("<HTML><BODY>");
		html.append("<h1>Usage</h1>");
		html.append("<h2>Exemple d'utilisation de l'API BOAMP</h2>");
		html.append("<p>Cette application java swing permet d'illustrer simplement l'usage de l'API BOAMP de la DILA.<br>");
		html.append("Elle est mise à disposition à titre d'exemple, afin de pallier au syndrome de la page blanche.<br>");
		html.append(" - Utilisez votre API pour acceder aux annonces de marché public...</p>");
		html.append("<h2><FONT style='BACKGROUND-COLOR: #FFCCCC'> Soyez créatif !!</FONT></h2>");
		html.append(" - Créez votre propre application. <br>");
		html.append(" - Définissez vos propres stratégies d'accès pour des résultats impressionnants.<br><br>");
		html.append("<h2><FONT style='BACKGROUND-COLOR: #FFCCCC'> Simplifiez vous la vie !!</FONT></h2>");
		html.append(" - Automatisez les tâches de base au moyen de scripts, <br> - optimisez vos propres fonctions.<br>");
		html.append("<ul>");
		html.append("<li><a href='http://opendata.prod.ext.dila.fr/opendata/swagger-ui.html#/'>Site de référence pour tester votre api</a></li>");
		html.append("<li><a href='http://schemas.journal-officiel.gouv.fr/schemabook/boamp/Boamp_v010.xsd'>Schema Boamp_v010</a></li>");
		html.append("<li><a href='http://schemas.journal-officiel.gouv.fr/schemabook/boamp/Boamp_v110.xsd'>Schema Boamp_v110</a></li>");
		html.append("<li><a href='http://schemas.journal-officiel.gouv.fr/schemabook/boamp/Boamp_v230.xsd'>Schema Boamp_v230</a></li>");
		html.append("</BODY></HTML>");

		labApropos = new JTextPane();
		labApropos.setContentType("text/html");
		labApropos.setText(html.toString());
		addListener(labApropos);
		JOptionPane.showMessageDialog(this.frame, labApropos, "A propos", JOptionPane.INFORMATION_MESSAGE);

		this.api = api;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				quitterPurger();
			}
		});
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);

		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AppGui.class.getResource("/com/sun/javafx/scene/web/skin/Bold_16x16_JFX.png")));
		frame.setTitle(" - Boamp API");
		frame.setBounds(100, 100, 638, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(5, 5));
		frame.getContentPane().add(getPanQ(), BorderLayout.NORTH);
		frame.getContentPane().add(getSplitPane(), BorderLayout.CENTER);
		frame.getContentPane().add(getLabFileName(), BorderLayout.SOUTH);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private JPanel getPanQ() {
		if (panQ == null) {
			panQ = new JPanel();
			panQ.setLayout(new BorderLayout(5, 5));
			panQ.add(getLabQ(), BorderLayout.WEST);
			panQ.add(getTxtQ(), BorderLayout.CENTER);
			panQ.add(getCmdSearch(), BorderLayout.EAST);
			panQ.add(getStatut(), BorderLayout.SOUTH);
			panQ.add(getToolBar(), BorderLayout.NORTH);
		}
		return panQ;
	}

	private JLabel getLabQ() {
		if (labQ == null) {
			labQ = new JLabel("Critères");
			labQ.setLabelFor(getTxtQ());
		}
		return labQ;
	}

	private JTextField getTxtQ() {
		if (txtQ == null) {
			txtQ = new JTextField();
			txtQ.setText("source_cat: v2 dateparution:2016/01/09");
			txtQ.setColumns(10);
		}
		return txtQ;
	}

	private JTextPane getTextPane() {
		if (textpane == null) {
			textpane = new JTextPane();
			textpane.setContentType("text/xml");
			textpane.setEditable(false);
		}
		return textpane;
	}

	private JScrollPane getScrollerList() {
		if (scrollerList == null) {
			scrollerList = new JScrollPane();
			scrollerList.setViewportView(getList());
		}
		return scrollerList;
	}

	private JList<Item> getList() {
		if (list == null) {
			list = new JList<Item>();
			list.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Item item = getList().getSelectedValue();
					if (item != null) {
						String idAnnonce = item.getValue();
						File fileAvis = new File(api.getLocalCache(), idAnnonce + ".xml");
						if (fileAvis.exists()) {
							getLabFileName().setText(fileAvis.getAbsolutePath());
							String xmlStr = readFile(fileAvis.getAbsolutePath(), Charset.forName("UTF-8"));
							getTextPane().setText(xmlStr);
							getTextPane().updateUI();
						}
						else
							new WorkerGet().execute();
					}

					getCmdOpenFile().setEnabled(true);
				}
			});
			list.setValueIsAdjusting(true);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			DefaultListModel<Item> model = new DefaultListModel<Item>();
			list.setModel(model);
			list.setForeground(Color.lightGray);

		}
		return list;

	}

	private JSplitPane getSplitPane() {
		if (splitPane == null) {
			splitPane = new JSplitPane();
			splitPane.setContinuousLayout(true);
			splitPane.setRightComponent(getScrollPane_1());
			splitPane.setLeftComponent(getPanel());
		}
		return splitPane;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(5, 5));
			panel.add(getScrollerList(), BorderLayout.CENTER);
			panel.add(getLabNb(), BorderLayout.NORTH);
		}
		return panel;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollerArea == null) {
			scrollerArea = new JScrollPane();
			scrollerArea.setViewportView(getTextPane());
		}
		return scrollerArea;
	}

	private DefaultListModel<Item> getListModel() {
		return (DefaultListModel<Item>) getList().getModel();
	}

	private JLabel getLabNb() {
		if (labNb == null) {
			labNb = new JLabel("aucune annonce trouvée");
			labNb.setForeground(Color.blue);
		}
		return labNb;
	}

	private JButton getCmdSearch() {
		if (cmdSearch == null) {
			cmdSearch = new JButton();
			cmdSearch.setText("Search");
			cmdSearch.setSelectedIcon(new ImageIcon(AppGui.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Bold-Black.png")));
			cmdSearch.setIcon(new ImageIcon(AppGui.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Bold.png")));
			cmdSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getCmdOpenFile().setEnabled(false);
					new WorkerSearch().execute();
				}
			});
		}
		return cmdSearch;
	}

	private JLabel getStatut() {
		if (statut == null) {
			statut = new JLabel();
			statut.setText("-");
			statut.setLabelFor(getList());
			statut.setForeground(Color.RED);
		}
		return statut;
	}

	private String readFile(String path, Charset encoding) {
		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(path));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return new String(encoded, encoding);
	}

	private class WorkerSearch extends SwingWorker<Integer, Integer> {

		private boolean preconditionSearch() {
			boolean result = true;
			String critere = getTxtQ().getText();

			if (critere.equals("")) {
				result = result && false;
				String message = "Il faut définir une requête avec des critères exalead !!";
				JOptionPane.showMessageDialog(AppGui.this.getTxtQ(), message, "Attention", JOptionPane.OK_OPTION);
			}

			if (critere.length() > 164) {
				result = result && false;
				String message = "La requete est trop longue. Le serveur : Error Code 500";
				JOptionPane.showMessageDialog(AppGui.this.getTxtQ(), message, "Attention", JOptionPane.OK_OPTION);
			}

			AppGui.this.getTextPane().setText("");
			AppGui.this.getList().removeAll();

			return result;
		}

		@Override
		protected Integer doInBackground() throws Exception {
			int nbItemsExistants = 0;
			String critere = getTxtQ().getText();

			// Précondition de Search
			if (preconditionSearch()) {
				getStatut().setText("Requête en cours sur le servveur de la DILA");
				List<Item> foundItems = api.search(critere);
				getStatut().setText("");
				getLabNb().setText("");

				DefaultListModel<Item> model = new DefaultListModel<Item>();
				for (Item item : foundItems) {
					model.addElement(item);
				}
				getList().setModel(model);
				getStatut().setText("Requête servie ...");

				int found = getListModel().getSize();
				getLabNb().setText(found + " annonces trouvées");

				nbItemsExistants = ServiceSearch.getNbItemsExistants();
				if (nbItemsExistants > 1000) {
					getStatut().setText(String.format("Liste bridée intentionnellement à %s avis.", found));
					getLabNb().setText(nbItemsExistants + " annonces trouvées");
				}
			}
			return nbItemsExistants;
		}
	}

	private class WorkerGet extends SwingWorker<Void, Integer> {

		private boolean preconditionGET() {
			boolean result = true;
			return result;
		}

		@Override
		protected Void doInBackground() throws Exception {

			// Précondition de GET
			if (preconditionGET()) {
				Item item = getList().getSelectedValue();
				String idAnnonce = item.getValue();
				String version = item.getVersion();
				getStatut().setForeground(Color.red);
				getStatut().setText("Chargement de l'annonce " + idAnnonce + " en version " + version);

				if (item.getAvis() == null)
					item = api.get(item);
				String avis = item.getAvis();
				getStatut().setForeground(Color.blue);
				getStatut().setText("Annonce " + idAnnonce + " en version " + version + " trouvée...");
				item.setAvis(avis);
				getTextPane().setText(avis);
				getTextPane().validate();
				File fileAvis = new File(api.getLocalCache(), idAnnonce + ".xml");
				FileUtils.writeStringToFile(fileAvis, avis, Charset.forName("UTF-8"));
			}
			return null;
		}
	}

	private JLabel getLabFileName() {
		if (labFileName == null) {
			labFileName = new JLabel("");
			labFileName.setIcon(new ImageIcon(AppGui.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaPlayDisabled.png")));
		}
		return labFileName;
	}

	private JToolBar getToolBar() {
		if (toolBar == null) {
			toolBar = new JToolBar();
			toolBar.setFloatable(false);
			toolBar.add(getCmdHelpQuery());
			toolBar.add(getCmdOpenFile());
			toolBar.add(getButton());
			toolBar.add(getTglbtnXml());
		}
		return toolBar;
	}

	private JButton getCmdOpenFile() {
		if (cmdOpenFile == null) {
			cmdOpenFile = new JButton("");
			cmdOpenFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Item item = getList().getSelectedValue();
					if (item != null) {

						if (Desktop.isDesktopSupported()) {

							if (Desktop.getDesktop().isSupported(java.awt.Desktop.Action.OPEN)) {
								File file = new File(getLabFileName().getText());
								try {
									Runtime.getRuntime().exec("C:/Program Files/Altova/XMLSpy2016/XMLSpy.exe " + file.getAbsolutePath());
									// java.awt.Desktop.getDesktop().open(file);
								}
								catch (IOException exc) {
									System.out.println("Exception: " + exc.toString());
								}
							}
							else {
								System.out.println("La fonction OPEN n'est pas supportée par votre Système d'exploitation");
							}
						}
						else {
							System.out.println("La fonction Desktop n'est pas supportée par votre Système d'exploitation");
						}
					}

				}
			});
			cmdOpenFile.setEnabled(false);
			cmdOpenFile.setToolTipText("Ouvrir le fichier selectionné dans votre éditeur système");
			cmdOpenFile.setIcon(new ImageIcon(AppGui.class.getResource("/com/sun/deploy/uitoolkit/impl/fx/ui/resources/image/graybox_error.png")));
		}
		return cmdOpenFile;
	}

	/**
	 * Listener sur le JLabel
	 * 
	 * @param lb_url
	 */
	private void addListener(Component lb_url) {
		lb_url.addMouseListener(new MouseAdapter() {
			// Click sur le lien
			public void mouseClicked(MouseEvent e) {
				int y = e.getY();
				try {
					if (y > 320 && y < 340) {
						labApropos.setCursor(new Cursor(Cursor.HAND_CURSOR));
						Desktop.getDesktop().browse(new URI("http://opendata.prod.ext.dila.fr/opendata/swagger-ui.html#/"));
					}
					if (y > 340 && y < 350) {
						Desktop.getDesktop().browse(new URI("http://schemas.journal-officiel.gouv.fr/schemabook/boamp/Boamp_v010.xsd"));
					}
					if (y > 360 && y < 375) {
						Desktop.getDesktop().browse(new URI("http://schemas.journal-officiel.gouv.fr/schemabook/boamp/Boamp_v110.xsd"));
					}
					if (y > 375 && y < 390) {
						Desktop.getDesktop().browse(new URI("http://schemas.journal-officiel.gouv.fr/schemabook/boamp/Boamp_v230.xsd"));
					}
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		});
	}

	private JButton getButton() {
		if (button == null) {
			button = new JButton("");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(AppGui.this.frame, labMessage, "Error!", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			button.setToolTipText("Informations");
			button.setIcon(new ImageIcon(AppGui.class.getResource("/com/sun/javafx/scene/web/skin/Italic_16x16_JFX.png")));
		}
		return button;
	}

	private JButton getCmdHelpQuery() {
		if (cmdHelpQuery == null) {
			cmdHelpQuery = new JButton("");
			cmdHelpQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(AppGui.this.frame, labApropos, "Error!", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			cmdHelpQuery.setToolTipText("Aide au requetage Exalead");
			cmdHelpQuery.setIcon(new ImageIcon(AppGui.class.getResource("/com/sun/javafx/scene/web/skin/UnorderedListBullets_16x16_JFX.png")));
		}
		return cmdHelpQuery;
	}

	private void quitterPurger() {
		File cache = api.getLocalCache();
		int size = cache.listFiles().length;
		if (size > 0) {
			String message = String.format("Voulez-vous purger votre Cache ?%nSi oui, %s fichiers seront supprimés", size);
			int rep = JOptionPane.showConfirmDialog(AppGui.this.getTxtQ(), message, "Attention", JOptionPane.YES_NO_OPTION);
			if (rep == JOptionPane.YES_OPTION) {
				getListModel().removeAllElements();
				getList().updateUI();
				FileUtils.deleteQuietly(api.getLocalCache());
			}
		}
	}

	private JToggleButton getTglbtnXml() {
		if (tglbtnXml == null) {
			tglbtnXml = new JToggleButton("xml");
			tglbtnXml.setSelected(true);
			tglbtnXml.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tglbtnXml.isSelected()) {
						tglbtnXml.setText("xml");
						textpane.setContentType("text/xml");
					}
					else {
						tglbtnXml.setText("text");
						textpane.setContentType("text/html");
					}

					Item item = getList().getSelectedValue();
					if (item != null) {
						String avis = item.getAvis();
						textpane.setText(avis);
						textpane.updateUI();
					}
				}
			});
		}
		return tglbtnXml;
	}
}
