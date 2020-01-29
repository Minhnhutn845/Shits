
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

/**
 * Draft GUI Console
 * @author Sukhraj Kaur
 *
 */
public class GuiConsole {
	
	//----------------- EDIT START ------------------------------------------------------------------------------------------------------
	
	//Predefining labels so they can be accessed by TimerTask classes.
	private static JLabel oTempLabel = new JLabel("", JLabel.LEFT);
	private static JLabel iTempLabel = new JLabel("", JLabel.RIGHT);
	private static JLabel oHumLabel = new JLabel("", JLabel.LEFT);
	private static JLabel iHumLabel = new JLabel("", JLabel.RIGHT);
	private static JLabel baroLabel = new JLabel("", JLabel.CENTER);
	//Temperature variables.
	private static double curTempO;
	private static double curTempI;
	//Humidity variables.
	private static double curHumO;
	private static double curHumI;
	//Random number generator.
	private static Random rand;
	
	//----------------- EDIT End ------------------------------------------------------------------------------------------------------
	
	public static void main(String[] theArgs) {
		
		//----------------- EDIT START ------------------------------------------------------------------------------------------------------
		
		baroLabel.setText("Barometric Pressure: --");
		
		rand = new Random();
		//Random number generator that defines a starting temperature.
		curTempO = rand.nextInt(200) + rand.nextDouble();
		curTempI = rand.nextInt(200) + rand.nextDouble();
		
		//Random number generator that defines a starting humidity in percentage.
		curHumO = Math.random() * 100.00;
		curHumI = Math.random() * 100.00;
		
		Timer oTempTimer = new Timer();
		Timer iTempTimer = new Timer();
		TimerTask oTempTask = new OTempTask();
		TimerTask iTempTask = new ITempTask();
		//Timer objects that updates outside and inside temperature every predefined second(s).
		oTempTimer.schedule(oTempTask, 0, 10000); //Changes every 10s.
		iTempTimer.schedule(iTempTask, 0, 60000); //Changes every 60s.
		
		Timer oHumTimer = new Timer();
		Timer iHumTimer = new Timer();
		TimerTask oHumTask = new OHumTask();
		TimerTask iHumTask = new IHumTask();
		//Timer objects that updates outside and inside humidity every predefined second(s).
		oHumTimer.schedule(oHumTask, 0, 50000); //Changes every 50s.
		iHumTimer.schedule(iHumTask, 0, 60000); //Changes every 60s.
		
		//----------------- EDIT END --------------------------------------------------------------------------------------------------------
		
		createGUI();
	}
	
	public static void createGUI() {
		JFrame frame = new JFrame("Vantage Vue");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		
		mainPanel.setLayout(new GridLayout(1,1));
		
		
		JPanel console = new JPanel();
		console.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JPanel buttonPane = new JPanel();
		buttonPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		mainPanel.add(console);
		mainPanel.add(buttonPane);
		
		JButton time = new JButton("Time & Date");
		JButton temp = new JButton("Temperature");
		JButton hum = new JButton("Humidity");
		JButton baro = new JButton("Barometric Pressure");
		JButton rain = new JButton("Rain");
		JButton graph = new JButton("Graph");
		JButton moon = new JButton("Moon");
		JButton wind = new JButton("Wind");
		
		buttonPane.add(time);
		buttonPane.add(temp);
		buttonPane.add(hum);
		buttonPane.add(baro);
		buttonPane.add(rain);
		buttonPane.add(graph);
		buttonPane.add(moon);
		buttonPane.add(wind);
		
		//----------------- EDIT START ------------------------------------------------------------------------------------------------------
		
		/**
		 * Barometric Pressure button function.
		 * Uses a random number generator between 0-1 to determine the label output (/\ = less than 0.33, 
		 * \/ = greater than 0.33, -- = the rest).
		 */
		baro.addActionListener(e -> {
			double check = Math.random();
			if (check < 0.33) {
				baroLabel.setText("Barometric Pressure: /\\");
			} else if (check > 0.66) {
				baroLabel.setText("Barometric Pressure: \\/");
			} else {
				baroLabel.setText("Barometric Pressure: --");
			}
		});
		
		/**
		 * Temperature button function.
		 * Uses a random number generator between 0-1 to determine the temperature changes
		 * for both outside and inside temperature (rise = less than 0.5, fall = greater than 0.5).
		 */
		temp.addActionListener(e -> {
			double check = Math.random();
			if (check < 0.5) {
				oTempLabel.setText("Temperature Outside: " + (curTempO + Math.random()) + "F");
				iTempLabel.setText("Temperature Inside: " + (curTempI + Math.random()) + "F");
			} else {
				oTempLabel.setText("Temperature Outside: " + (curTempO - Math.random()) + "F");
				iTempLabel.setText("Temperature Inside: " + (curTempI - Math.random()) + "F");
			}
		});
		
		/**
		 * Humidity button function.
		 * Uses a random number generator between 0-1 to determine the humidity changes
		 * for both outside and inside humidity (rise = less than 0.5, fall = greater than 0.5).
		 */
		hum.addActionListener(e -> {
			double check = Math.random();
			if (check < 0.5) {
				oHumLabel.setText("Humidity Outside: " + (curHumO + Math.random()) + "%");
				iHumLabel.setText("Humidity Inside: " + (curHumI + Math.random()) + "%");
			} else {
				oHumLabel.setText("Humidity Outside: " + (curHumO - Math.random()) + "%");
				iHumLabel.setText("Humidity Inside: " + (curHumI - Math.random()) + "%");
			}
		});
		
		// Add barometric pressure label to the console panel.
		console.add(baroLabel);
		// Add temperature labels to the console panel.
		console.add(oTempLabel);
		console.add(iTempLabel);
		//Add humidity labels to the console panel.
		console.add(oHumLabel);
		console.add(iHumLabel);
		
		//----------------- EDIT END ------------------------------------------------------------------------------------------------------
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}
	
	//----------------- EDIT START ------------------------------------------------------------------------------------------------------
	
	/**
	 * 
	 * @author Minh
	 * Outside temperature TimerTask that changes the outside temperature every predefined second(s).
	 *
	 */
	static class OTempTask extends TimerTask {
		public void run() {
			double check = Math.random();
			if (check < 0.5) {
				oTempLabel.setText("Temperature Outside: " + (curTempO + Math.random()) + "F");
			} else {
				oTempLabel.setText("Temperature Outside: " + (curTempO - Math.random()) + "F");
			}
		}
	}
	
	/**
	 * 
	 * @author Minh
	 * Inside temperature TimerTask that changes the inside temperature every predefined second(s).
	 *
	 */
	static class ITempTask extends TimerTask {
		public void run() {
			double check = Math.random();
			if (check < 0.5) {
				iTempLabel.setText("Temperature Inside: " + (curTempI + Math.random()) + "F");
			} else {
				iTempLabel.setText("Temperature Inside: " + (curTempI - Math.random()) + "F");
			}
		}
	}
	
	/**
	 * 
	 * @author Minh
	 * Outside humidity TimerTask that changes the outside humidity every predefined second(s).
	 */
	static class OHumTask extends TimerTask {
		public void run() {
			double check = Math.random();
			if (check < 0.5) {
				oHumLabel.setText("Humidity Outside: " + (curHumO + Math.random()) + "%");
			} else {
				oHumLabel.setText("Humidity Outside: " + (curHumO - Math.random()) + "%");
			}
		}
	}
	
	/**
	 * 
	 * @author Minh
	 * Inside humidity TimerTask that changes the Inside humidity every predefined second(s).
	 */
	static class IHumTask extends TimerTask {
		public void run() {
			double check = Math.random();
			if (check < 0.5) {
				iHumLabel.setText("Humidity Inside: " + (curHumI + Math.random()) + "%");
			} else {
				iHumLabel.setText("Humidity Inside: " + (curHumI - Math.random()) + "%");
			}
		}
	}
	
	//----------------- EDIT END ------------------------------------------------------------------------------------------------------

}
