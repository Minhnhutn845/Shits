
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingConstants;

import javax.swing.JSeparator;

public class DonoGUI {
	
	//---------------------------------- EDIT START (MINH) --------------------------------------------------
	//Temperature variables.
	private static double curTempO;
	private static double curTempI;
	//Humidity variables.
	private static double curHumO;
	private static double curHumI;
	//Random number generator.
	private static Random rand;
	private static NumberFormat f;

	//---------------------------------- EDIT END (MINH) ----------------------------------------------------
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//---------------------------------- EDIT START (MINH) --------------------------------------------------
		rand = new Random();
		f = new DecimalFormat("#0.0");
		
		//---------------------------------- EDIT END (MINH) ----------------------------------------------------
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonoGUI window = new DonoGUI();
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
	public DonoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 606, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton WxCenButton = new JButton("WxCen");
		WxCenButton.setBounds(49, 496, 89, 23);
		frame.getContentPane().add(WxCenButton);
		
		JButton graphButton = new JButton("GRAPH");
		graphButton.setBounds(148, 496, 89, 23);
		frame.getContentPane().add(graphButton);
		
		JButton hilowButton = new JButton("HI / LOW");
		hilowButton.setBounds(247, 496, 89, 23);
		frame.getContentPane().add(hilowButton);
		
		JButton timeButton = new JButton("TIME");
		timeButton.setBounds(346, 496, 89, 23);
		frame.getContentPane().add(timeButton);
		
		JButton alarmButton = new JButton("ALARM");
		alarmButton.setBounds(445, 496, 89, 23);
		frame.getContentPane().add(alarmButton);
		
		JButton tempButton = new JButton("TEMP");
		tempButton.setBounds(49, 462, 89, 23);
		frame.getContentPane().add(tempButton);
		
		JButton humidityButton = new JButton("HUM");
		humidityButton.setBounds(148, 462, 89, 23);
		frame.getContentPane().add(humidityButton);
		
		JButton windButton = new JButton("WIND");
		windButton.setBounds(247, 462, 89, 23);
		frame.getContentPane().add(windButton);
		
		JButton rainButton = new JButton("RAIN");
		rainButton.setBounds(346, 462, 89, 23);
		frame.getContentPane().add(rainButton);
		
		JButton barometerButton = new JButton("BAR");
		barometerButton.setBounds(445, 462, 89, 23);
		frame.getContentPane().add(barometerButton);
		
		JLabel insideTemp = new JLabel("insideTemp");
		insideTemp.setHorizontalAlignment(SwingConstants.CENTER);
		insideTemp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		insideTemp.setBounds(346, 28, 89, 17);
		frame.getContentPane().add(insideTemp);
		
		JLabel outsideTemp = new JLabel("outsideTemp");
		outsideTemp.setHorizontalAlignment(SwingConstants.CENTER);
		outsideTemp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		outsideTemp.setBounds(445, 28, 89, 17);
		frame.getContentPane().add(outsideTemp);
		
		JLabel insideLabel = new JLabel("inside");
		insideLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		insideLabel.setHorizontalAlignment(SwingConstants.CENTER);
		insideLabel.setBounds(356, 54, 79, 14);
		frame.getContentPane().add(insideLabel);
		
		JLabel outsideLabel = new JLabel("outside");
		outsideLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		outsideLabel.setHorizontalAlignment(SwingConstants.CENTER);
		outsideLabel.setBounds(455, 54, 79, 14);
		frame.getContentPane().add(outsideLabel);
		
		JLabel currentTimeLabel = new JLabel("time");
		currentTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		currentTimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		currentTimeLabel.setBounds(49, 29, 89, 14);
		frame.getContentPane().add(currentTimeLabel);
		
		JLabel dateLabel = new JLabel("date");
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setBounds(148, 29, 89, 17);
		frame.getContentPane().add(dateLabel);
		
		JLabel sunriseTime = new JLabel("sunrise");
		sunriseTime.setHorizontalAlignment(SwingConstants.CENTER);
		sunriseTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sunriseTime.setBounds(49, 52, 89, 14);
		frame.getContentPane().add(sunriseTime);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 0, 1, 2);
		frame.getContentPane().add(separator);
		
		JLabel sunsetLabel = new JLabel("sunset");
		sunsetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sunsetLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sunsetLabel.setBounds(148, 52, 89, 14);
		frame.getContentPane().add(sunsetLabel);
		
		JLabel hiTimeLabel = new JLabel("high");
		hiTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hiTimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hiTimeLabel.setBounds(49, 73, 89, 14);
		frame.getContentPane().add(hiTimeLabel);
		
		JLabel lowTimeLabel = new JLabel("low");
		lowTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lowTimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lowTimeLabel.setBounds(148, 72, 89, 17);
		frame.getContentPane().add(lowTimeLabel);
		
		JLabel windspd = new JLabel("windspd");
		windspd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		windspd.setHorizontalAlignment(SwingConstants.CENTER);
		windspd.setBounds(49, 148, 89, 28);
		frame.getContentPane().add(windspd);
		
		JLabel winddir = new JLabel("winddir");
		winddir.setHorizontalAlignment(SwingConstants.CENTER);
		winddir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		winddir.setBounds(148, 148, 89, 28);
		frame.getContentPane().add(winddir);
		
		JLabel currwindLabel = new JLabel("current");
		currwindLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		currwindLabel.setBounds(35, 135, 48, 14);
		frame.getContentPane().add(currwindLabel);
		
		JLabel averageWindLabel = new JLabel("average");
		averageWindLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		averageWindLabel.setBounds(35, 187, 48, 14);
		frame.getContentPane().add(averageWindLabel);
		
		JLabel avgWindSpd = new JLabel("windspd");
		avgWindSpd.setHorizontalAlignment(SwingConstants.CENTER);
		avgWindSpd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		avgWindSpd.setBounds(49, 202, 89, 28);
		frame.getContentPane().add(avgWindSpd);
		
		JLabel hiWindLabel = new JLabel("high");
		hiWindLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		hiWindLabel.setBounds(140, 187, 48, 14);
		frame.getContentPane().add(hiWindLabel);
		
		JLabel windLabel = new JLabel("Wind Speed");
		windLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		windLabel.setBounds(108, 121, 80, 16);
		frame.getContentPane().add(windLabel);
		
		JLabel highWindSpd = new JLabel("windspd");
		highWindSpd.setHorizontalAlignment(SwingConstants.CENTER);
		highWindSpd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		highWindSpd.setBounds(148, 202, 89, 28);
		frame.getContentPane().add(highWindSpd);
		
		JLabel timeLabel = new JLabel("Time");
		timeLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setBounds(118, 11, 48, 14);
		frame.getContentPane().add(timeLabel);
		
		JLabel insideHum = new JLabel("insideHum");
		insideHum.setHorizontalAlignment(SwingConstants.CENTER);
		insideHum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		insideHum.setBounds(346, 79, 89, 17);
		frame.getContentPane().add(insideHum);
		
		JLabel outsideHum = new JLabel("outsideHum");
		outsideHum.setHorizontalAlignment(SwingConstants.CENTER);
		outsideHum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		outsideHum.setBounds(445, 79, 89, 17);
		frame.getContentPane().add(outsideHum);
		
		JLabel moonLabel = new JLabel("Moon Phase");
		moonLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		moonLabel.setHorizontalAlignment(SwingConstants.CENTER);
		moonLabel.setBounds(247, 28, 68, 16);
		frame.getContentPane().add(moonLabel);
		
		JLabel moonPhaseLabel = new JLabel("phase");
		moonPhaseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		moonPhaseLabel.setBounds(236, 55, 89, 17);
		frame.getContentPane().add(moonPhaseLabel);
		
		JLabel expectedWeather = new JLabel("Weather Today");
		expectedWeather.setHorizontalAlignment(SwingConstants.CENTER);
		expectedWeather.setFont(new Font("Tahoma", Font.BOLD, 11));
		expectedWeather.setBounds(247, 122, 89, 16);
		frame.getContentPane().add(expectedWeather);
		
		JLabel weatherPrediction = new JLabel("forecast");
		weatherPrediction.setFont(new Font("Tahoma", Font.PLAIN, 12));
		weatherPrediction.setHorizontalAlignment(SwingConstants.CENTER);
		weatherPrediction.setBounds(247, 148, 89, 17);
		frame.getContentPane().add(weatherPrediction);
		
		JLabel chillLabel = new JLabel("chill");
		chillLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chillLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		chillLabel.setBounds(236, 187, 48, 14);
		frame.getContentPane().add(chillLabel);
		
		JLabel lblWindchill = new JLabel("windchill");
		lblWindchill.setHorizontalAlignment(SwingConstants.CENTER);
		lblWindchill.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWindchill.setBounds(247, 202, 89, 28);
		frame.getContentPane().add(lblWindchill);
		
		JLabel heatLabel = new JLabel("heat index");
		heatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		heatLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		heatLabel.setBounds(219, 236, 65, 15);
		frame.getContentPane().add(heatLabel);
		
		JLabel lblHeatindex = new JLabel("heatindex");
		lblHeatindex.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeatindex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHeatindex.setBounds(257, 252, 68, 20);
		frame.getContentPane().add(lblHeatindex);
		
		JLabel tempLabel = new JLabel("Temperature");
		tempLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tempLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		tempLabel.setBounds(396, 10, 87, 16);
		frame.getContentPane().add(tempLabel);
		
		JLabel rainfallLabel = new JLabel("Rainfall");
		rainfallLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rainfallLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		rainfallLabel.setBounds(396, 121, 80, 16);
		frame.getContentPane().add(rainfallLabel);
		
		JLabel totalRainLabel = new JLabel("total");
		totalRainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		totalRainLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		totalRainLabel.setBounds(371, 136, 48, 14);
		frame.getContentPane().add(totalRainLabel);
		
		JLabel totalRainNum = new JLabel("totalrain");
		totalRainNum.setHorizontalAlignment(SwingConstants.CENTER);
		totalRainNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		totalRainNum.setBounds(398, 152, 58, 20);
		frame.getContentPane().add(totalRainNum);
		
		JLabel rainRateLabel = new JLabel("rate");
		rainRateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rainRateLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		rainRateLabel.setBounds(371, 173, 48, 14);
		frame.getContentPane().add(rainRateLabel);
		
		JLabel rainRateNum = new JLabel("totalrain");
		rainRateNum.setHorizontalAlignment(SwingConstants.CENTER);
		rainRateNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rainRateNum.setBounds(396, 188, 58, 20);
		frame.getContentPane().add(rainRateNum);
		
		JLabel twentyFourHrLbl = new JLabel("24 Hour Difference");
		twentyFourHrLbl.setHorizontalAlignment(SwingConstants.CENTER);
		twentyFourHrLbl.setFont(new Font("Verdana", Font.BOLD, 12));
		twentyFourHrLbl.setBounds(382, 235, 129, 16);
		frame.getContentPane().add(twentyFourHrLbl);
		
		JLabel tempChangeLabel = new JLabel("temp");
		tempChangeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tempChangeLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		tempChangeLabel.setBounds(387, 256, 48, 14);
		frame.getContentPane().add(tempChangeLabel);
		
		JLabel barChangeLabel = new JLabel("bar");
		barChangeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		barChangeLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		barChangeLabel.setBounds(455, 257, 48, 14);
		frame.getContentPane().add(barChangeLabel);
		
		JLabel yesterTemp = new JLabel("temp");
		yesterTemp.setHorizontalAlignment(SwingConstants.CENTER);
		yesterTemp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		yesterTemp.setBounds(396, 274, 29, 16);
		frame.getContentPane().add(yesterTemp);
		
		JLabel yesterBar = new JLabel("pressure");
		yesterBar.setHorizontalAlignment(SwingConstants.CENTER);
		yesterBar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		yesterBar.setBounds(455, 274, 50, 16);
		frame.getContentPane().add(yesterBar);
		
		JLabel barTrendLabel = new JLabel("Bar Trend");
		barTrendLabel.setHorizontalAlignment(SwingConstants.CENTER);
		barTrendLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		barTrendLabel.setBounds(486, 121, 80, 16);
		frame.getContentPane().add(barTrendLabel);
		
		JLabel baroTrend = new JLabel("fallrisestable");
		baroTrend.setHorizontalAlignment(SwingConstants.CENTER);
		baroTrend.setFont(new Font("Tahoma", Font.PLAIN, 16));
		baroTrend.setBounds(496, 152, 58, 20);
		frame.getContentPane().add(baroTrend);
		
		//---------------------------------- EDIT START (MINH) --------------------------------------------------
		

		//Random number generator that defines a starting temperature.
		curTempO = rand.nextInt(200) + rand.nextDouble();
		curTempI = rand.nextInt(200) + rand.nextDouble();
		//Random number generator that defines a starting humidity in percentage.
		curHumO = Math.random() * 100;
		curHumI = Math.random() * 100;
		
		//Button functions start here >>>>>>>
		/*
		 * Barometric Pressure button function.
		 * Uses a random number generator between 0-1 to determine the label output (/\ = less than 0.33, 
		 * \/ = greater than 0.33, -- = the rest).
		 */
		barometerButton.addActionListener(e -> {
			double check = Math.random();
			if (check < 0.33) {
				baroTrend.setText("/\\");
			} else if (check > 0.66) {
				baroTrend.setText("\\/");
			} else {
				baroTrend.setText("--");
			}
		});
		
		/*
		 * Humidity button function.
		 * Uses a random number generator between 0-1 to determine the humidity changes
		 * for both outside and inside humidity (rise = less than 0.5, fall = greater than 0.5).
		 */
		humidityButton.addActionListener(e -> {
			double check = Math.random();
			if (check < 0.5) {
				outsideHum.setText(f.format((curHumO + Math.random())) + "%");
				insideHum.setText(f.format((curHumI + Math.random())) + "%");
			} else {
				outsideHum.setText(f.format((curHumO - Math.random())) + "%");
				insideHum.setText(f.format((curHumI - Math.random())) + "%");
			}
		});
		
		/*
		 * Temperature button function.
		 * Uses a random number generator between 0-1 to determine the temperature changes
		 * for both outside and inside temperature (rise = less than 0.5, fall = greater than 0.5).
		 */
		tempButton.addActionListener(e -> {
			double check = Math.random();
			if (check < 0.5) {
				outsideTemp.setText(f.format((curTempO + Math.random())) + "F");
				insideTemp.setText(f.format((curTempI + Math.random())) + "F");
			} else {
				outsideTemp.setText(f.format((curTempO - Math.random())) + "F");
				insideTemp.setText(f.format((curTempI - Math.random())) + "F");
			}
		});
		
		//Timer Task shenanigans start here >>>>>>>
		Timer oTempTimer = new Timer();
		Timer iTempTimer = new Timer();
		TimerTask oTempTask = new TimerTask() {
			public void run() {
				double check = Math.random();
				if (check < 0.5) {
					outsideTemp.setText(f.format((curTempO + Math.random())) + "F");
				} else {
					outsideTemp.setText(f.format((curTempO - Math.random())) + "F");
				}
			}
		};
		TimerTask iTempTask = new TimerTask() {
			public void run() {
				double check = Math.random();
				if (check < 0.5) {
					insideTemp.setText(f.format((curTempI + Math.random())) + "F");
				} else {
					insideTemp.setText(f.format((curTempI - Math.random())) + "F");
				}
			}
		};
		//Timer objects that update outside and inside temperature every predefined second(s).
		oTempTimer.schedule(oTempTask, 0, 10000); //Changes every 10s.
		iTempTimer.schedule(iTempTask, 0, 60000); //Changes every 60s.
		
		Timer oHumTimer = new Timer();
		Timer iHumTimer = new Timer();
		TimerTask oHumTask = new TimerTask() {
			public void run() {
				double check = Math.random();
				if (check < 0.5) {
					outsideHum.setText(f.format((curHumO + Math.random())) + "%");
				} else {
					outsideHum.setText(f.format((curHumO - Math.random())) + "%");
				}
			}
		};
		TimerTask iHumTask = new TimerTask() {
			public void run() {
				double check = Math.random();
				if (check < 0.5) {
					insideHum.setText(f.format((curHumI + Math.random())) + "%");
				} else {
					insideHum.setText(f.format(curHumI - (Math.random())) + "%");
				}
			}
		};
		//Timer objects that update outside and inside humidity every predefined second(s).
		oHumTimer.schedule(oHumTask, 0, 50000); //Changes every 50s.
		iHumTimer.schedule(iHumTask, 0, 60000); //Changes every 60s.
	
		Timer baroTimer = new Timer();
		TimerTask baroTask = new TimerTask() {
			public void run() {
				double check = Math.random();
				if (check < 0.3) {
					baroTrend.setText("/\\");
				} else if (check > 0.6) {
					baroTrend.setText("\\/");
				} else {
					baroTrend.setText("--");
				}
			}
		};
		//Timer object that updates barometer pressure every predefined second(s).
		baroTimer.schedule(baroTask, 0, 10000); //CHanges every 10s.
		
		//---------------------------------- EDIT END (MINH) ----------------------------------------------------
	}
	
}
