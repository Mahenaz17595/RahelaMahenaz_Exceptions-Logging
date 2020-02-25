package com.epam;

import java.lang.Math;
import java.util.Scanner;
import java.util.logging.*;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
public class Interest {
	//private static final Logger INFO =  LogManager.getLogger(Interest.class);
	public static void calculateInterest()
	{
		Logger LOGGER  = Logger.getLogger(Interest.class.getName()); 

		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter the principle amount :");
		try {
			double princpleamount=sc.nextDouble();
			LOGGER.info("Enter the time period :");
			double timeperiod=sc.nextDouble();
			LOGGER.info("Enter the rate of interest per annum :");
			double rateofinterest=sc.nextDouble();
			LOGGER.info("Simple Interest is :"+(princpleamount*timeperiod*rateofinterest)/100);
			LOGGER.info("Compound Interest is :"+((princpleamount*Math.pow(1+(rateofinterest/100),timeperiod))-princpleamount));
			} catch (Exception e) {
				LOGGER.info("Enter a valid input ... ");
				}
		}
	}