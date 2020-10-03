import structs.DecorStruct;
import structs.NailPolishStruct;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Interface implements ActionListener, ListSelectionListener {
	
	JFrame window;
	JPanel header, body;
	
	NailPolishPicker npp = new NailPolishPicker();
	DecorPicker dp = new DecorPicker();
	
	NailPolishStruct basePolish;
	DecorStruct decor;
	
	JList<String> inventoryList;
	
	// header stuff
	JButton randomize, customize, done;
	
	// body stuff
	JLabel image;
	JPanel selectionPanel;
	JPanel selectionDisplay;
	JLabel selectedPolish, selectedDecor;
	JButton polish, how_much, type, details;
	JPanel listPanel;
	JScrollPane scrollypoly;
	JButton select;
	
	Color color_for_headings = new Color(100, 182, 172);
	Color color_for_unpressed_buttons = new Color(218, 255, 239);
	Color color_for_major_pressed_button = new Color(140, 138, 147);
	Color color_for_minor_pressed_button = new Color(129, 108, 97);
	
	Font textFont = new Font(Font.SERIF, Font.BOLD, 20);
	Font finalFont = new Font(Font.SERIF, Font.BOLD, 30);
	
	Border border = new LineBorder(Color.white, 1, true);
	
	public Interface() throws IOException {
		window = new JFrame("manicure for chidi");
		window.setLayout(new BorderLayout());
		
		createSections();
		createTitle();
		createButtons();
		createImage("chidi.jpg");
		createSelectionPanel();
		createSelectionDisplay();
		
		window.pack();
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void createSections() {
		header = new JPanel(new BorderLayout());
		header.setBorder(border);
		window.add(header, BorderLayout.NORTH);
		
		body = new JPanel(new BorderLayout());
		body.setBackground(color_for_headings);
		window.add(body, BorderLayout.CENTER);
	}
	
	public void createTitle() {
		JPanel title = new JPanel(new GridLayout(2, 1));
		title.setBorder(border);
		JPanel label1 = new JPanel(new FlowLayout());
		JPanel label2 = new JPanel(new FlowLayout());
		
		label1.setBackground(color_for_headings);
		label2.setBackground(color_for_headings);
		
		JLabel a = new JLabel("    M");
		JLabel b = new JLabel("anicure ");
		
		JLabel c = new JLabel("for ");
		JLabel d = new JLabel("C");
		JLabel e = new JLabel("hidi");
		
		Font reg = new Font(Font.MONOSPACED, Font.PLAIN, 45);
		Font regI = new Font(Font.MONOSPACED, Font.ITALIC, 45);
		Font regB = new Font(Font.MONOSPACED, Font.BOLD, 45);
		
		a.setFont(regB);
		b.setFont(regI);
		c.setFont(reg);
		d.setFont(regB);
		e.setFont(reg);
		
		label1.add(a);
		label1.add(b);
		label2.add(c);
		label2.add(d);
		label2.add(e);
		
		title.add(label1);
		title.add(label2);
		header.add(title, BorderLayout.WEST);
	}
	
	public void createButtons() {
		JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
		
		randomize = new JButton("Randomize");
		customize = new JButton("Customize");
		done = new JButton("Done!");
		
		Font buttonFont = new Font(Font.MONOSPACED, Font.BOLD, 25);
		
		randomize.setFont(buttonFont);
		customize.setFont(buttonFont);
		done.setFont(buttonFont);
		
		randomize.setBackground(color_for_unpressed_buttons);
		customize.setBackground(color_for_unpressed_buttons);
		done.setBackground(color_for_unpressed_buttons);
		
		randomize.addActionListener(this);
		customize.addActionListener(this);
		done.addActionListener(this);
		
		buttonPanel.add(randomize);
		buttonPanel.add(customize);
		buttonPanel.add(done);
		
		header.add(buttonPanel, BorderLayout.CENTER);
		customize.setEnabled(false);
		done.setEnabled(false);
	}
	
	public void createImage(String filename) throws IOException {
		Image i = ImageIO.read(getClass().getResource(filename));
		ImageIcon img = new ImageIcon(i);
		image = new JLabel(img);
		body.add(image, BorderLayout.WEST);
	}
	
	public void createSelectionPanel() {
		selectionPanel = new JPanel(new BorderLayout());
		
		JPanel buttonPanel = new JPanel(new GridLayout(4, 1));
		
		polish = new JButton("Polish");
		how_much = new JButton("How Much");
		type = new JButton("Type");
		details = new JButton("Details");
		
		Font buttonFont = new Font(Font.MONOSPACED, Font.BOLD, 20);
		
		polish.setFont(buttonFont);
		how_much.setFont(buttonFont);
		type.setFont(buttonFont);
		details.setFont(buttonFont);
		
		revertMinorButtonColors();
		
		polish.addActionListener(this);
		how_much.addActionListener(this);
		type.addActionListener(this);
		details.addActionListener(this);
		
		buttonPanel.add(polish);
		buttonPanel.add(how_much);
		buttonPanel.add(type);
		buttonPanel.add(details);
		
		selectionPanel.add(buttonPanel, BorderLayout.EAST);
		
		listPanel = new JPanel(new BorderLayout());
		
		select = new JButton("Select");
		select.setFont(buttonFont);
		select.setBackground(color_for_major_pressed_button);
		select.addActionListener(this);
		
		listPanel.add(select, BorderLayout.SOUTH);
		allowMinorButtons(false);
		
		scrollypoly = new JScrollPane();
		
		listPanel.add(scrollypoly, BorderLayout.CENTER);
		
		selectionPanel.add(listPanel, BorderLayout.CENTER);
		
		body.add(selectionPanel, BorderLayout.CENTER);
	}
	
	public void createSelectionDisplay() {
		selectionDisplay = new JPanel(new GridLayout(2, 1));
		selectionDisplay.setBackground(color_for_headings);
		selectionDisplay.setBorder(border);
		
		selectedPolish = new JLabel("Base Polish: ");
		selectedDecor = new JLabel("Decor: ");
		
		selectedPolish.setFont(textFont);
		selectedDecor.setFont(textFont);
		
		selectedPolish.setHorizontalAlignment(SwingConstants.CENTER);
		selectedDecor.setHorizontalAlignment(SwingConstants.CENTER);
		
		selectionDisplay.add(selectedPolish);
		selectionDisplay.add(selectedDecor);
		
		body.add(selectionDisplay, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == randomize) {
			customize.setEnabled(true);
			done.setEnabled(true);
			customize.setBackground(color_for_unpressed_buttons);
			createOptionList(new DefaultListModel<>());	// DON'T REMOVE! looks useless but clears scrollypoly
			revertMinorButtonColors();
			allowMinorButtons(false);
			
			basePolish = npp.choosePolish(true);
			decor = dp.chooseDecor();
			
			changePolishText(basePolish.toString());
			changeDecorText(decor.toString());
		} else if (e.getSource() == customize) {
			customize.setBackground(color_for_major_pressed_button);
			makeCustomizable();
		} else if (e.getSource() == done) {
			if (!decor.getDecorDetails().equals("[unselected]") && done.getText().equals("Done!")) {
				customize.setBackground(color_for_unpressed_buttons);
				done.setBackground(color_for_major_pressed_button);
				
				randomize.setEnabled(false);
				customize.setEnabled(false);
				
				body.removeAll();
				
				selectedPolish.setText("<html><p style=\"width:500px\"><center>" + selectedPolish.getText() + "</center></p></html>");
				selectedDecor.setText("<html><p style=\"width:500px\"><center>" + selectedDecor.getText() + "</center></p></html>");
				
				selectedPolish.setFont(finalFont);
				selectedDecor.setFont(finalFont);
				
				selectionDisplay.removeAll();
				selectionDisplay.add(selectedPolish);
				selectionDisplay.add(selectedDecor);
				
				selectionDisplay.setBorder(new EmptyBorder(0, 0, 0, 0));
				
				body.add(selectionDisplay, BorderLayout.CENTER);
				
				try {
					createImage("chidi2.png");
					image.setBorder(new LineBorder(color_for_headings, 50));
					window.validate();
				} catch (IOException ioException) {
					ioException.printStackTrace();
				}
			}
		} else if (e.getSource() == polish) {
			changeMinorButtonColors(polish);
			DefaultListModel<String> options = new DefaultListModel<>();
			for (NailPolishStruct item : npp.getPolishInventory()) {
				options.addElement(item.toString());
			}
			createOptionList(options);
		} else if (e.getSource() == how_much) {
			changeMinorButtonColors(how_much);
			DefaultListModel<String> options = new DefaultListModel<>();
			for (String item : dp.howMuchOptions) {
				options.addElement(item);
			}
			createOptionList(options);
		} else if (e.getSource() == type) {
			changeMinorButtonColors(type);
			DefaultListModel<String> options = new DefaultListModel<>();
			for (String item : dp.decorTypeOptions) {
				options.addElement(item);
			}
			createOptionList(options);
		} else if (e.getSource() == details) {
			changeMinorButtonColors(details);
			DefaultListModel<String> options = new DefaultListModel<>();
			ArrayList<String> specificOptions = null;
			switch (decor.getDecorType()) {
				case "stamping":
					specificOptions = dp.stampingPlateOptions;
					//todo add stamping polishes
					break;
				case "topper polish":
					specificOptions = new ArrayList<>();
					for (NailPolishStruct thingy : npp.getPolishInventory()) {
						if (thingy.isTopper()) specificOptions.add(thingy.toString());
					}
					break;
				case "gems":
					specificOptions = dp.gemOptions;
					break;
				case "glitter":
					specificOptions = dp.glitterOptions;
					break;
				case "nail vinyls":
					specificOptions = dp.vinylOptions;
					break;
				case "stickers":
					specificOptions = dp.stickerOptions;
					break;
				case "hand-drawn":
					specificOptions = dp.handDrawnOptions;
					break;
			}
			if (specificOptions != null) {
				for (String item : specificOptions) {
					options.addElement(item);
				}
			}
			createOptionList(options);
		} else if (e.getSource() == select) {
			String selected = inventoryList.getSelectedValue();
			
			if (polish.getBackground().equals(color_for_minor_pressed_button)) {
				basePolish = npp.getPolishInventory().get(inventoryList.getSelectedIndex());
			} else if (how_much.getBackground().equals(color_for_minor_pressed_button)) {
				decor.setHowMuch(selected);
			} else if (type.getBackground().equals(color_for_minor_pressed_button)) {
				if (!decor.getDecorType().equals(selected)) {
					decor.setDecorType(selected);
					decor.setDecorDetails("[unselected]");
				}
			} else if (details.getBackground().equals(color_for_minor_pressed_button)) {
				decor.setDecorDetails(selected);
			}
			
			changePolishText(basePolish.toString());
			changeDecorText(decor.toString());
		}
	}
	
	private void makeCustomizable() {
		allowMinorButtons(true);
		polish.doClick();
	}
	
	private void allowMinorButtons(boolean b) {
		polish.setEnabled(b);
		how_much.setEnabled(b);
		type.setEnabled(b);
		details.setEnabled(b);
	}
	
	private void changeMinorButtonColors(JButton selected) {
		revertMinorButtonColors();
		selected.setBackground(color_for_minor_pressed_button);
	}
	
	private void revertMinorButtonColors() {
		polish.setBackground(color_for_unpressed_buttons);
		how_much.setBackground(color_for_unpressed_buttons);
		type.setBackground(color_for_unpressed_buttons);
		details.setBackground(color_for_unpressed_buttons);
	}
	
	private void createOptionList(DefaultListModel<String> inventory) {
		listPanel.remove(scrollypoly);
		inventoryList = new JList<>(inventory);
		inventoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		inventoryList.addListSelectionListener(this);
		scrollypoly = new JScrollPane(inventoryList);
		listPanel.add(scrollypoly, BorderLayout.CENTER);
		listPanel.validate();
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {}
	
	public void changePolishText(String newPolish) {
		selectedPolish.setText("Base polish: " + newPolish);
	}
	
	public void changeDecorText(String newDecor) {
		selectedDecor.setText("Decor: " + newDecor);
	}
	
}

//todo restart button after done?