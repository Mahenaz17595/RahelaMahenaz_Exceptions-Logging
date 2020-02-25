package com.epam;

import java.lang.Math;
import java.util.Scanner;
import java.util.logging.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest {
	private static final Logger LOGGER =  LogManager.getLogger(Interest.class);
	public static void calculateInterest()
	{
		Scanner sc=new Scanner(System.in);
		LOGGER.error("Enter the principle amount :");
		try {
			double princpleamount=sc.nextDouble();
			LOGGER.error("Enter the time period :");
			double timeperiod=sc.nextDouble();
			LOGGER.error("Enter the rate of interest per annum :");
			double rateofinterest=sc.nextDouble();
			LOGGER.error("Simple Interest is :"+(princpleamount*timeperiod*rateofinterest)/100);
			LOGGER.error("Compound Interest is :"+((princpleamount*Math.pow(1+(rateofinterest/100),timeperiod))-princpleamount));
			} catch (Exception e) {
				LOGGER.error("Enter a valid input ... ");
				}
		}
	}