package com.pricingmodule;

/*
According to my assumption of the given problem we need to calculate the production cost of the cycle . 
we need to take inputs from customer what parts are required , and prepare  a high level cycle.
As it is given  that , the prices  of the parts preparing for the cycle varies with period of time  need to develop the code 
that dynamically calculates the cost of preparing the cycle .

*/

import java.util.HashMap;
import java.util.Scanner;

public class PricingModule {

	String frame = "Frame";
	String handle_bar_with_brakes = "handle_bar_with_brakes";
	String seating = "seating";
	String wheels = "wheels";
	String chain_assembly = "chain_assembly";
	int totalprice;

	// to store the customers choice y/N
	char fram_val;
	char handle_bar_with_brake_val;
	char seating_val;
	char wheels_val;
	char chain_assembly_val;

//Here i am taking the price of each parts as staic and calculate the price of production of cycle 
	public HashMap getPrices() {
		HashMap<String, Integer> itemsPrice = new HashMap();
		itemsPrice.put(frame, 350);
		itemsPrice.put(handle_bar_with_brakes, 550);
		itemsPrice.put(seating, 960);
		itemsPrice.put(wheels, 636);
		itemsPrice.put(chain_assembly, 1025);

		return itemsPrice;
	}

//Takes input from user and calculate price 
	public void calculatePrice() {

		Scanner sc = new Scanner(System.in);

		System.out.println("please Select the parts of cycle to be included");
		System.out.println("-------------------------------------------------------");
		System.out.println("plz Enter Y/N \n");

		// getting the prices and products which i have declared statically above

		HashMap pricelist = getPrices();
		System.out.println("Frame : " + pricelist.get(frame));
		fram_val = sc.next().charAt(0);
		System.out.println("handle bar with brakes : " + pricelist.get(handle_bar_with_brakes));
		handle_bar_with_brake_val = sc.next().charAt(0);
		System.out.println("seating : " + pricelist.get(seating));
		seating_val = sc.next().charAt(0);
		System.out.println("wheels : " + pricelist.get(wheels));
		wheels_val = sc.next().charAt(0);
		System.out.println("chain assembly : " + pricelist.get(chain_assembly));
		chain_assembly_val = sc.next().charAt(0);

		// Displaying the user selected choice and detailed price of product with total
		// cost of production of cycle
		System.out.println("Items you have selected are ");
		if (fram_val == 'Y' || fram_val == 'y') {
			System.out.println("Frame : " + pricelist.get(frame));
			totalprice = totalprice + (int) pricelist.get(frame);
		}
		if (handle_bar_with_brake_val == 'Y' || handle_bar_with_brake_val == 'y') {
			System.out.println("handle bar with brakes : " + pricelist.get(handle_bar_with_brakes));
			totalprice = totalprice + (int) pricelist.get(handle_bar_with_brakes);
		}
		if (seating_val == 'Y' || seating_val == 'y') {
			System.out.println("seating : " + pricelist.get(seating));
			totalprice = totalprice + (int) pricelist.get(seating);
		}
		if (wheels_val == 'y' || wheels_val == 'Y') {
			System.out.println("wheels : " + pricelist.get(wheels));
			totalprice = totalprice + (int) pricelist.get(wheels);
		}
		if (chain_assembly_val == 'y' || chain_assembly_val == 'Y') {
			System.out.println("chain assembly : " + pricelist.get(chain_assembly));
			totalprice = totalprice + (int) pricelist.get(chain_assembly);
		}
		System.out.println("total price for  production is :: " + totalprice + "rs");
	}

	public static void main(String[] args) {
		PricingModule module = new PricingModule();
		module.calculatePrice();

	}

}
