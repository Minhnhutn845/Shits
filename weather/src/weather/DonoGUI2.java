import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Time;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingConstants;

import javax.swing.JSeparator;
import javax.swing.JPanel;

public class DonoGUI2 {
	

	//Temperature variables.
	private static double curTempO;
	private static double curTempI;
	//Humidity variables.
	private static double curHumO;
	private static double curHumI;
	//Random number generator.
	private static Random rand;
	private static NumberFormat f;
	
	private static double totalRainHrs;
	private static double totalRainDays;
	private static double totalRainMths;
	private static double rainRateHrs;
	private static double rainRateDays;
	private static double rainRateMths;
	private String[] forecasts = {"Foggy", "Rainy", "Cloudy", "Sunny", "Windy"};
	private String[] moonphase = {"New Moon", "Waxing Crescent", "First Quarter", "Waxing Gibbous Moon", "Full Moon", "Wanning Gibbous", "Last Quarter", "Waning Crescent"};
	private String[] headings = {"N", "NNE", "NE", "ENE", "E", "ESE",  "SE",  "SSE", "S", "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW"};
	private int rainShift;
	private double highWind;
	private int windShift;
	private JFrame frame;
	private double curWind;
	
	private static JButton WxCenButton;
	private static JButton graphButton;
	private static JButton hilowButton;
	private static JButton timeButton;
	private static JButton alarmButton;
	private static JButton tempButton;
	private static JButton humidityButton;
	private static JButton windButton;
	private static JButton rainButton;
	private static JButton barometerButton;
	
	private static JLabel insideTemp;
	private static JLabel outsideTemp;
	private static JLabel insideLabel;
	private static JLabel outsideLabel;
	private static JLabel currentTimeLabel;
	private static JLabel sunriseTime;
	private static JLabel separator;
	private static JLabel sunsetLabel;
	private static JLabel hiTimeLabel;
	private static JLabel lowTimeLabel;
	private static JLabel windspd;
	private static JLabel currewindLabel;
	private static JLabel averageWindLabel;
	private static JLabel avgwindSpd;
	private static JLabel hiWindLabel;
	private static JLabel windLabel;
	
	private static JLabel highWindSpd;
	private static JLabel timeLabel;
	private static JLabel insideHum;
	private static JLabel outsideHum;
	private static JLabel moonLabel;
	private static JLabel moonPhaseLabel;
	private static JLabel expectedWeather;
	private static JLabel weatherPrediction;
	private static JLabel chillLabel;
	private static JLabel lblWindchill;
	private static JLabel heatLabel;
	private static JLabel lblHeatindex;
	private static JLabel tempLabel;
	private static JLabel rainfallLabel;
	private static JLabel totalRainLabel;
	
	
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
					DonoGUI2 window = new DonoGUI2();
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
	public DonoGUI2() {
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
		
		JLabel currentTimeLabel = new JLabel(DateFormat.getDateTimeInstance().format(new Date()));
		currentTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		currentTimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		currentTimeLabel.setBounds(62, 28, 170, 17);
		frame.getContentPane().add(currentTimeLabel);
		
		JLabel sunriseTime = new JLabel("07:" + (45 + (rand.nextInt(6) - 3)) );
		sunriseTime.setHorizontalAlignment(SwingConstants.CENTER);
		sunriseTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sunriseTime.setBounds(72, 52, 45, 14);
		frame.getContentPane().add(sunriseTime);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 0, 1, 2);
		frame.getContentPane().add(separator);
		
		JLabel sunsetLabel = new JLabel("16:" + (50 + (rand.nextInt(8) - 4)) );
		sunsetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sunsetLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sunsetLabel.setBounds(169, 52, 48, 14);
		frame.getContentPane().add(sunsetLabel);
		
		JLabel hiTimeLabel = new JLabel((48 + (rand.nextInt(5) - 2)) + "F");
		hiTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hiTimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hiTimeLabel.setBounds(70, 73, 48, 14);
		frame.getContentPane().add(hiTimeLabel);
		
		JLabel lowTimeLabel = new JLabel((40 + (rand.nextInt(16) - 8)) + "F");
		lowTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lowTimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lowTimeLabel.setBounds(169, 72, 48, 17);
		frame.getContentPane().add(lowTimeLabel);
		
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
		
		JLabel moonPhaseLabel = new JLabel(moonphase[rand.nextInt(moonphase.length)]);
		moonPhaseLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		moonPhaseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		moonPhaseLabel.setBounds(229, 55, 107, 14);
		frame.getContentPane().add(moonPhaseLabel);
		
		JLabel tempLabel = new JLabel("Temperature");
		tempLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tempLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		tempLabel.setBounds(396, 10, 87, 16);
		frame.getContentPane().add(tempLabel);
		
		JLabel lblSunrise = new JLabel("Sunrise");
		lblSunrise.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunrise.setFont(new Font("Verdana", Font.BOLD, 10));
		lblSunrise.setBounds(23, 55, 48, 14);
		frame.getContentPane().add(lblSunrise);
		
		JLabel lblSunset = new JLabel("Sunset");
		lblSunset.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunset.setFont(new Font("Verdana", Font.BOLD, 10));
		lblSunset.setBounds(118, 55, 48, 14);
		frame.getContentPane().add(lblSunset);
		
		JLabel lblHi = new JLabel("Hi");
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setFont(new Font("Verdana", Font.BOLD, 10));
		lblHi.setBounds(23, 75, 48, 14);
		frame.getContentPane().add(lblHi);
		
		JLabel lblLow = new JLabel("Low");
		lblLow.setHorizontalAlignment(SwingConstants.CENTER);
		lblLow.setFont(new Font("Verdana", Font.BOLD, 10));
		lblLow.setBounds(118, 75, 48, 14);
		frame.getContentPane().add(lblLow);
		
		//---------------------------------- EDIT START (MINH) --------------------------------------------------
		

		//Random number generator that defines a starting temperature.
		curTempO = rand.nextInt(200) + rand.nextDouble();
		curTempI = rand.nextInt(200) + rand.nextDouble();
		//Random number generator that defines a starting humidity in percentage.
		curHumO = Math.random() * 100;
		curHumI = Math.random() * 100;
		//Random number generator that defines a starting total rainfall in inches.
		totalRainDays = (Math.random() * 10) + 2;
		totalRainHrs = (Math.random() * 3);
		totalRainMths = totalRainDays + 1.2;
		rainRateDays = totalRainDays / 25;
		rainRateHrs = totalRainHrs / 25;
		rainRateMths = totalRainMths / 25;
		rainShift = 1;
		windShift = rand.nextInt(headings.length);
		curWind = rand.nextDouble() + 5;
		highWind = 0.0;
		
		JPanel windPanel = new JPanel();
		windPanel.setBounds(12, 256, 324, 193);
		frame.getContentPane().add(windPanel);
		windPanel.setLayout(null);
		
		JLabel windLabel_1 = new JLabel("Wind Speed");
		windLabel_1.setBounds(105, 8, 79, 16);
		windPanel.add(windLabel_1);
		windLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(199, 8, 10, 10);
		windPanel.add(panel_1);
		
		JLabel currwindLabel = new JLabel("current");
		currwindLabel.setBounds(12, 32, 48, 14);
		windPanel.add(currwindLabel);
		currwindLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel windspd_1 = new JLabel("windspd");
		windspd_1.setBounds(22, 50, 89, 28);
		windPanel.add(windspd_1);
		windspd_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		windspd_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel averageWindLabel_1 = new JLabel("average");
		averageWindLabel_1.setBounds(12, 92, 48, 14);
		windPanel.add(averageWindLabel_1);
		averageWindLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel avgWindSpd = new JLabel("windspd");
		avgWindSpd.setBounds(22, 108, 89, 28);
		windPanel.add(avgWindSpd);
		avgWindSpd.setHorizontalAlignment(SwingConstants.CENTER);
		avgWindSpd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel winddir = new JLabel("winddir");
		winddir.setBounds(123, 50, 89, 28);
		windPanel.add(winddir);
		winddir.setHorizontalAlignment(SwingConstants.CENTER);
		winddir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel hiWindLabel_1 = new JLabel("high");
		hiWindLabel_1.setBounds(123, 92, 48, 14);
		windPanel.add(hiWindLabel_1);
		hiWindLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel highWindSpd_1 = new JLabel("windspd");
		highWindSpd_1.setBounds(123, 108, 89, 28);
		windPanel.add(highWindSpd_1);
		highWindSpd_1.setHorizontalAlignment(SwingConstants.CENTER);
		highWindSpd_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel expectedWeather_1 = new JLabel("Weather Today");
		expectedWeather_1.setBounds(224, 32, 89, 16);
		windPanel.add(expectedWeather_1);
		expectedWeather_1.setHorizontalAlignment(SwingConstants.CENTER);
		expectedWeather_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel weatherPrediction_1 = new JLabel(forecasts[rand.nextInt(forecasts.length)]);
		weatherPrediction_1.setBounds(224, 57, 89, 17);
		windPanel.add(weatherPrediction_1);
		weatherPrediction_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		weatherPrediction_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel chillLabel_1 = new JLabel("chill");
		chillLabel_1.setBounds(209, 92, 48, 14);
		windPanel.add(chillLabel_1);
		chillLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		chillLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel lblWindchill_1 = new JLabel("windchill");
		lblWindchill_1.setBounds(223, 108, 89, 28);
		windPanel.add(lblWindchill_1);
		lblWindchill_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWindchill_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel heatLabel_1 = new JLabel("heat index");
		heatLabel_1.setBounds(212, 142, 89, 15);
		windPanel.add(heatLabel_1);
		heatLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		heatLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel lblHeatindex_1 = new JLabel("heatindex");
		lblHeatindex_1.setBounds(233, 160, 68, 20);
		windPanel.add(lblHeatindex_1);
		lblHeatindex_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeatindex_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel rainPanel = new JPanel();
		rainPanel.setBounds(356, 249, 220, 200);
		frame.getContentPane().add(rainPanel);
		rainPanel.setLayout(null);
		
		JLabel yesterTemp = new JLabel(f.format(Math.random() * 10) + "F");
		yesterTemp.setBounds(36, 171, 29, 16);
		rainPanel.add(yesterTemp);
		yesterTemp.setHorizontalAlignment(SwingConstants.CENTER);
		yesterTemp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel tempChangeLabel = new JLabel("temp");
		tempChangeLabel.setBounds(28, 150, 48, 14);
		rainPanel.add(tempChangeLabel);
		tempChangeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tempChangeLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel barChangeLabel = new JLabel("bar");
		barChangeLabel.setBounds(109, 150, 49, 15);
		rainPanel.add(barChangeLabel);
		barChangeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		barChangeLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel yesterBar = new JLabel(f.format(Math.random() * 2) + "inHg");
		yesterBar.setBounds(109, 171, 50, 16);
		rainPanel.add(yesterBar);
		yesterBar.setHorizontalAlignment(SwingConstants.CENTER);
		yesterBar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel twentyFourHrLbl = new JLabel("24 Hour Difference");
		twentyFourHrLbl.setBounds(29, 131, 129, 16);
		rainPanel.add(twentyFourHrLbl);
		twentyFourHrLbl.setHorizontalAlignment(SwingConstants.CENTER);
		twentyFourHrLbl.setFont(new Font("Verdana", Font.BOLD, 12));
		
		JLabel barTrendLabel = new JLabel("Bar Trend");
		barTrendLabel.setBounds(128, 13, 80, 16);
		rainPanel.add(barTrendLabel);
		barTrendLabel.setHorizontalAlignment(SwingConstants.CENTER);
		barTrendLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		
		JLabel baroTrend = new JLabel("fallrisestable");
		baroTrend.setBounds(138, 55, 58, 20);
		rainPanel.add(baroTrend);
		baroTrend.setHorizontalAlignment(SwingConstants.CENTER);
		baroTrend.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel rainRateNum = new JLabel("totalrain");
		rainRateNum.setBounds(36, 91, 58, 20);
		rainPanel.add(rainRateNum);
		rainRateNum.setHorizontalAlignment(SwingConstants.CENTER);
		rainRateNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rainRateNum.setText(f.format(rainRateHrs) + "in");
		
		JLabel rainRateLabel = new JLabel("rate");
		rainRateLabel.setBounds(11, 76, 48, 14);
		rainPanel.add(rainRateLabel);
		rainRateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rainRateLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel totalRainNum = new JLabel("totalrain");
		totalRainNum.setBounds(38, 55, 58, 20);
		rainPanel.add(totalRainNum);
		totalRainNum.setHorizontalAlignment(SwingConstants.CENTER);
		totalRainNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		totalRainNum.setText(f.format(totalRainHrs) + "in");
		
		JLabel totalRainLabel_1 = new JLabel("total");
		totalRainLabel_1.setBounds(11, 39, 48, 14);
		rainPanel.add(totalRainLabel_1);
		totalRainLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		totalRainLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		
		JLabel rainfallLabel_1 = new JLabel("Rainfall");
		rainfallLabel_1.setBounds(36, 13, 80, 16);
		rainPanel.add(rainfallLabel_1);
		rainfallLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		rainfallLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		
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
		
		
		/*
		 * Rain button function.
		 * Shifts values between hours, days, and months values. 
		 * Static upon GUI initialization.
		 */
		rainButton.addActionListener(e -> {
			if (rainShift == 0) {
				totalRainNum.setText(f.format(totalRainHrs) + "in");
				rainRateNum.setText(f.format(rainRateHrs) + "in");	
				rainShift++;
			} else if (rainShift == 1) {
				totalRainNum.setText(f.format(totalRainDays) + "in");
				rainRateNum.setText(f.format(rainRateDays) + "in");	
				rainShift++;
			}else if (rainShift == 2) {
				totalRainNum.setText(f.format(totalRainMths) + "in");
				rainRateNum.setText(f.format(rainRateMths) + "in");		
				rainShift = 0;
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
				
				windShift += (rand.nextInt(3) - 1); //-----ryan edit------ Added wind direction shift to 50s timer to feel more organic
				if (windShift < 0) {
					windShift = headings.length - 1;
				} else if (windShift > headings.length) {
					windShift = 0;
				}
				winddir.setText(headings[windShift]);
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
		baroTimer.schedule(baroTask, 0, 10000); //Changes every 10s.
		
		//---------------------------------- EDIT END (MINH) ----------------------------------------------------
		/**
		 * Timer for the wind speed.
		 * Updates every 2.5s.
		 */
		Timer windTimer = new Timer();
		TimerTask windTask = new TimerTask() {
			public void run() {
				curWind += (rand.nextInt(4) - (rand.nextDouble() * 3));
				if (curWind > highWind) {
					highWind = curWind;
				}
				if (curWind > 0) {
					windspd_1.setText(f.format(curWind) + " MPH");
				}
				highWindSpd_1.setText(f.format(highWind) + " MPH");
				avgWindSpd.setText(f.format(highWind / 2) + " MPH");
			}
		};
		windTimer.schedule(windTask, 0, 2500); //Changes every 2.5s
	}
	
	Timer twoHalfSec = new Timer();
	Timer tenSec = new Timer();
	Timer fiftySec = new Timer();
	Timer sixtySec = new Timer();
	
	TimerTask twoHalfTask = new TimerTask() {
		public void run () {
			generateWindspeed();
		}
	};
	TimerTask tenTask = new TimerTask() {
		public void run() {
			
		}
	};
	TimerTask fiftyTask = new TimerTask() {
		public void run() {
			
		}
	};
	TimerTask sixtyTask = new TimerTask() {
		public void run() {
			
		}
	};
}