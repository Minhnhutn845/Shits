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
		
		JLabel moonPhaseLabel = new JLabel(moonphase[rand.nextInt(moonphase.length)]);
		moonPhaseLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		moonPhaseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		moonPhaseLabel.setBounds(229, 55, 107, 14);
		frame.getContentPane().add(moonPhaseLabel);
		
		JLabel expectedWeather = new JLabel("Weather Today");
		expectedWeather.setHorizontalAlignment(SwingConstants.CENTER);
		expectedWeather.setFont(new Font("Tahoma", Font.BOLD, 11));
		expectedWeather.setBounds(247, 122, 89, 16);
		frame.getContentPane().add(expectedWeather);
		
		JLabel weatherPrediction = new JLabel(forecasts[rand.nextInt(forecasts.length)]);
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
		barChangeLabel.setBounds(455, 257, 49, 15);
		frame.getContentPane().add(barChangeLabel);
		
		JLabel yesterTemp = new JLabel(f.format(Math.random() * 10) + "F");
		yesterTemp.setHorizontalAlignment(SwingConstants.CENTER);
		yesterTemp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		yesterTemp.setBounds(396, 274, 29, 16);
		frame.getContentPane().add(yesterTemp);
		
		JLabel yesterBar = new JLabel(f.format(Math.random() * 2) + "inHg");
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