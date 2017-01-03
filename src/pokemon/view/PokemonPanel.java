package pokemon.view;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import pokemon.controller.PokemonController;
import java.awt.Dimension;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox<String> pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel nickNameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField nickNameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		//this.pokemonIcon new ImageIcon(getClass().getResource("--------.png"));
		this.updateButton = new JButton("Update the stats!");
		this.nameField = new JTextField(25);
		this.nickNameField = new JTextField(20);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.pokedexSelector = new JComboBox(baseController.buildPokedexText());
		this.advancedLabel = new JLabel("Advanced information:");
		this.combatLabel = new JLabel("Combat Points:");
		this.healthLabel = new JLabel("Health Points:");
		this.speedLabel = new JLabel("Speed Rate:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.nameLabel = new JLabel("My name is:");
		this.nickNameLabel = new JLabel("Nick Name:");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		
		setupComponents();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupComponents()
	{
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		numberField.setEditable(false);
		nameField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
	}
	private void setupPanel()
	{
		super.setLayout(baseLayout);
		
		this.setSize(1000, 850);
		this.setBackground(Color.LIGHT_GRAY);
		
		super.add(updateButton);
		super.add(nameField);
		super.add(nickNameField);
		super.add(healthField);
		super.add(combatField);
		super.add(numberField);
		super.add(advancedArea);
		super.add(pokedexSelector);
		super.add(advancedLabel);
		super.add(nickNameLabel);
		super.add(healthLabel);
		super.add(combatLabel);
		super.add(numberLabel);
		super.add(nameLabel);
		super.add(pokemonLabel);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 60, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 6, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 6, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, nameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, 0, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -44, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -6, SpringLayout.NORTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 5, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, 0, SpringLayout.SOUTH, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 0, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 0, SpringLayout.WEST, pokemonLabel);
	}
	
	
	
	private void setupDropdown()
	{
		
	}
	
	private void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getCombatPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation()
						+ "\n\n" + baseController.getPokedex().get(selected).getClass().getSimpleName());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getClass().getSimpleName());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		updateButton.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent selection)
				{
					if(isValidInteger(combatField.getText())
							&& isValidInteger(healthField.getText()) && isValidDouble(speedField.getText()))
					{
						int selected = pokedexSelector.getSelectedIndex();
								
						baseController.updateSelected(selected,
																				nameField.getText(),
																				Integer.parseInt(combatField.getText()),
																				Integer.parseInt(healthField.getText()),
																				Double.parseDouble(speedField.getText()));
					}
				}
		});
		
		
	}

	private void setRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		
	}
	
	private void changeColorBasedOnData(String data)
	{
		if (data.contains("Eletric"))
		{
			this.setBackground(Color.YELLOW);
		}
		else if (data.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
		else if (data.contains("Bug"))
		{
			this.setBackground(Color.GREEN);
		}
		else if (data.contains("Water"))
		{
			this.setBackground(Color.BLUE);
		}
		else if (data.contains("Flying"))
		{
			this.setBackground(Color.GRAY);
		}
		else
		{
			this.setBackground(Color.ORANGE);
		}
		repaint();
	}



	
	private void changeImageDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "PokeBall";
		String extension = ".png";
		try{
			pokemonIcon = new ImageIcon(this.getClass().getResource(path + name + extension));
		}catch(NullPointerException missingFile){
			pokemonIcon = new ImageIcon(this.getClass().getResource(path + defaultName + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		pokemonLabel.setText("My name is: " + name);
		repaint();
	}
	
	private boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException e)
		{
			valid = false;
		}
		return valid;
	}
	
	private boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch(NumberFormatException e)
		{
			valid = false;
		}
		return valid;
	}
	
	
	
	
	
	
}
