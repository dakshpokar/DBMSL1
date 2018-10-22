import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class EDJava {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Welcome to Encode Decode Program");
		System.out.println("1. Encode an Object");
		System.out.println("2. Decode an Object");
		System.out.println("Enter your choice: ");
		Integer choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter the name of the person: ");
			String name = sc.nextLine();
			System.out.println("Enter the Amount of money invested in Stock: ");
			Integer price = sc.nextInt();
			System.out.println("Enter the Quantity of stocks: ");
			Integer quantity = sc.nextInt();
			System.out.println(new EDJava().encodeObject(name, price, quantity));
			break;
		case 2:
			System.out.println("Enter your JSONObject: ");
			String object = sc.nextLine();
			String o = new EDJava().decodeObject(object);
			System.out.println(o);
			
		}
		
	}
	public JSONObject encodeObject(String name, Integer price, Integer quantity){
		JSONObject o = new JSONObject();
		o.put("name", name);
		o.put("price", price);
		o.put("quantity", quantity);
		return o;
	}
	public String decodeObject(String object){
			JSONObject jsonObj = (JSONObject)JSONValue.parse(object);
		  String name = (String) jsonObj.get("name");
		  Integer price = (Integer) jsonObj.get("price");
		  Integer quantity = (Integer) jsonObj.get("quantity");
		  return (name + " " + price + " " + quantity);
	}
}
