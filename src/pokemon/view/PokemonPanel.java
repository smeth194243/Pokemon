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
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		//this.pokemonIcon new ImageIcon(getClass().getResource("--------.png"));
		this.updateButton = new JButton("Update the stats!");
		this.nameField = new JTextField(25);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.pokedexSelector = new JComboBox(new String [] {"egg", "geodude", "pika", "rattata"});
		this.advancedLabel = new JLabel("Advanced information:");
		this.combatLabel = new JLabel("Combat Points:");
		this.healthLabel = new JLabel("Health Points:");
		this.speedLabel = new JLabel("Speed Rate:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.nameLabel = new JLabel("My name is:");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.DARK_GRAY);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);


		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(pokedexSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
		this.add(advancedArea);
		this.add(advancedLabel);
		this.add(pokemonLabel);
		this.add(updateButton);
		
	}
	
	private void setupLayout()
	{
		
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
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation()
						+ "\n\n" + baseController.getPokedex.get(selected).getClass().getSimpleName());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getClass().getSimpleName());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		updateButton.addActionListener(new ActionListener()
		{
				
		});
		
		this.addMouseListener(new MouseListener() 
		{
			public void mouseEntered(MouseEvent entered)
			{
	//			JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the program." );
			}
			
			public void mouseReleased(MouseEvent released)
			{
	//			System.out.println("Released");
			}
			
			public void mouseExited(MouseEvent exited)
			{
	//			JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse exited the program." );
			}
			
			public void mouseClicked(MouseEvent clicked)
			{
	//			System.out.println("Clicked");
			}
			
			public void mousePressed(MouseEvent pressed)
			{
	//			System.out.println("Pressed");
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
				{
					public void mouseDragged(MouseEvent dragged)
					{
						
					}
					
					public void mouseMoved(MouseEvent moved)
					{
						if(Math.abs(moved.getX() - updateButton.getX()) < 5 || (Math.abs(moved.getY() - updateButton.getY()) <5))
						{
							updateButton.setLocation(moved.getX()  + 10,  moved.getY() - 10 );
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
		else if (data.contains("Grass"))
		{
			this.setBackground(Color.GREEN);
		}
		else if (data.contains("Water"))
		{
			this.setBackground(Color.BLUE);
		}
		else if (data.contains("Rock"))
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
		
	}
	
	private boolean isValidDouble(String input)
	{
		
	}
	
	
}
