package com.epam;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Construction {
	private static final Logger LOGGER =  LogManager.getLogger(Construction.class);

	public static void CostCalculation() {
		Scanner sc= new Scanner(System.in);
		PrintStream p=new PrintStream(new FileOutputStream(FileDescriptor.out));
		//LOGGER.error();
		LOGGER.error("CONSTRUCTION COST ESTIMATION");
		//LOGGER.error();
		LOGGER.error("Variants Available");
		LOGGER.error("1. Construction with standard materials");
		LOGGER.error("2. Construction with above standard materials");
		LOGGER.error("3. Construction with high standard materials");
		LOGGER.error("4. Construction with high standard materials and fully automated");
		LOGGER.error("Enter your choice: ");
		try {
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		LOGGER.error("Enter the area of house: ");
		LOGGER.error("Cost ="+sc.nextDouble()*1200 +" INR");
		break;
		case 2:
		LOGGER.error("Enter the area of house: ");
		LOGGER.error("Cost ="+sc.nextDouble()*1500 +" INR");
		break;
		case 3:
		LOGGER.error("Enter the area of house: ");
		LOGGER.error("Cost ="+sc.nextDouble()*1800 +" INR");
		break;
		case 4:
		LOGGER.error("Enter the area of house: ");
		LOGGER.error("Cost ="+sc.nextDouble()*2500 +" INR");
		break;
		default:
		LOGGER.error("Enter a valid input ... ");

		}}

		catch (Exception e) {

		LOGGER.error("Enter a valid input ... ");

		}
		sc.close();
		}
		}