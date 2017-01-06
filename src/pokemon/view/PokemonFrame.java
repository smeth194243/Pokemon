package pokemon.view;

import javax.swing.JFrame;
import pokemon.controller.PokemonController;
import java.awt.Dimension;

public class PokemonFrame extends JFrame
{
	private PokemonController baseController;
	private PokemonPanel basePanel;
	
	public PokemonFrame(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new PokemonPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Pokemon");
		this.setSize(new Dimension(900,600));
		this.setResizable(false);
		this.setVisible(true);
	}

}
