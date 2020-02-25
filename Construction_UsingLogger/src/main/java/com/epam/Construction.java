package com.epam;

import java.util.Scanner;
import java.util.logging.Logger;


import org.apache.logging.log4j.LogManager;

public class Construction {

	public static void CostCalculation() {
		Logger LOGGER  = Logger.getLogger(Construction.class.getName()); 

		Scanner sc= new Scanner(System.in);
		LOGGER.info("CONSTRUCTION COST ESTIMATION");
		LOGGER.info("Variants Available");
		LOGGER.info("1. Construction with standard materials");
		LOGGER.info("2. Construction with above standard materials");
		LOGGER.info("3. Construction with high standard materials");
		LOGGER.info("4. Construction with high standard materials and fully automated");
		LOGGER.info("Enter your choice: ");
		try {
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		LOGGER.info("Enter the area of house: ");
		LOGGER.info("Cost ="+sc.nextDouble()*1200 +" INR");
		break;
		case 2:
		LOGGER.info("Enter the area of house: ");
		LOGGER.info("Cost ="+sc.nextDouble()*1500 +" INR");
		break;
		case 3:
		LOGGER.info("Enter the area of house: ");
		LOGGER.info("Cost ="+sc.nextDouble()*1800 +" INR");
		break;
		case 4:
		LOGGER.info("Enter the area of house: ");
		LOGGER.info("Cost ="+sc.nextDouble()*2500 +" INR");
		break;
		default:
		LOGGER.info("Enter a valid input ... ");

		}}

		catch (Exception e) {

		LOGGER.info("Enter a valid input ... ");

		}
		sc.close();
		}
		}