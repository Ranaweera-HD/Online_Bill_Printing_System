import java.util.*;
class bill{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String phNomber,custName;
		int basmathiQty,dhalQty,sugarQty,higlandQty,yoghurtQty,flourQty,soapQty;
		double basmathiPrice,dhalPrice,sugarPrice,higlandPrice,yoghurtPrice,flourPrice,soapPrice;
		double basmathiQtyPrice,dhalQtyPrice,sugarQtyPrice,higlandQtyPrice,yoghurtQtyPrice,flourQtyPrice,soapQtyPrice;
		double total,discount,price,cash,change;
		// double price1,price2,price3,price4,price5,price6,price7,price8,price9,price10,price11;
		// double newprice1,newprice2,newprice3,newprice4,newprice5,newprice6,newprice7,newprice8,newprice9,newprice10,newprice11;
		basmathiPrice = 250.00;
		dhalPrice = 180.00;
		sugarPrice = 150.00;
		higlandPrice = 1200.00;
		yoghurtPrice = 50.00;
		flourPrice = 120.00;
		soapPrice = 160.00;
		System.out.println("=============================================================================================");
		System.out.println("");
		System.out.println(" __          __  _                            _          _ __  __            _   ");
		System.out.println(" \\ \\        / / | |                          | |        (_)  \\/  |          | |  ");
		System.out.println("  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_ ");
		System.out.println("   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|");
		System.out.println("    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_ ");
		System.out.println("     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println("                                                                                 ");
		System.out.println("=============================================================================================");
		System.out.println("                                                                                 ");
		System.out.print("Enter Customer Phone Number - ");
		phNomber=input.next();
		System.out.println("");
		System.out.print("Enter Customer Name         - ");
		custName=input.next();
		System.out.println("");
		System.out.println("");
		System.out.println("=============================================================================================");
		System.out.println("");
		System.out.print("Basmathi Qty(Kg)     - ");
		basmathiQty=input.nextInt();
		System.out.println("");
		System.out.print("Dhal Qty(Kg)         - ");
		dhalQty=input.nextInt();
		System.out.println("");
		System.out.print("Sugar Qty(Kg)        - ");
		sugarQty=input.nextInt();
		System.out.println("");
		System.out.print("Higland Qty(Kg)      - ");
		higlandQty=input.nextInt();
		System.out.println("");
		System.out.print("Yoghurt Qty(Kg)      - ");
		yoghurtQty=input.nextInt();
		System.out.println("");
		System.out.print("Flour Qty(Kg)        - ");
		flourQty=input.nextInt();
		System.out.println("");
		System.out.print("Soap Qty(Kg)         - ");
		soapQty=input.nextInt();
		System.out.println("");
		basmathiQtyPrice = basmathiPrice*basmathiQty;
		dhalQtyPrice = dhalPrice*dhalQty;
		sugarQtyPrice = sugarPrice*sugarQty;
		higlandQtyPrice = higlandPrice*higlandQty;
		yoghurtQtyPrice = yoghurtPrice*yoghurtQty;
		flourQtyPrice = flourPrice*flourQty;
		soapQtyPrice = soapPrice*soapQty;
		System.out.println("");
		System.out.println("");
		System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|																				|");
		System.out.println("|					  _   __  __          _____ _______ 						|");
		System.out.println("|					 (_) |  \\/  |   /\\   |  __ \\__   __|						|");
		System.out.println("|					  _  | \\  / |  /  \\  | |__) | | |   						|");
		System.out.println("|					 | | | |\\/| | / /\\ \\ |  _  /  | |   						|");
		System.out.println("|					 | | | |  | |/ ____ \\| | \\ \\  | |   						|");
		System.out.println("|					 |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|   						|");
		System.out.println("|					    225,Ga11e Road, Panadura.							|");
		System.out.println("|					                                    						|");
		System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|\t\t\t\t\t\t# Tel  : "+phNomber+"\t\t\t\t\t\t\t|");
		System.out.println("|\t\t\t\t\t\t# Name : "+custName+"\t\t\t\t\t\t\t\t|");
		System.out.println("+-----------------------+-----------------------+---------------------------------------+------------------------------+");
		System.out.println("|\t\t\t|\tQty\t\t|\t\tUnit price\t\t|\t\tPrice\t\t|");
		System.out.println("+-----------------------+-----------------------+---------------------------------------+------------------------------+");
		System.out.println("|\t# Basmathi\t|\t"+basmathiQty+"\t\t|\t\t"+basmathiPrice+"\t\t\t|\t\t"+basmathiQtyPrice+"\t\t|");
		System.out.println("|\t\t\t|\t\t\t|\t\t\t\t\t|\t\t\t\t|");
		System.out.println("|\t# Dhal\t\t|\t"+dhalQty+"\t\t|\t\t"+dhalPrice+"\t\t\t|\t\t"+dhalQtyPrice+"\t\t|");
		System.out.println("|\t\t\t|\t\t\t|\t\t\t\t\t|\t\t\t\t|");
		System.out.println("|\t# Sugar\t\t|\t"+sugarQty+"\t\t|\t\t"+sugarPrice+"\t\t\t|\t\t"+sugarQtyPrice+"\t\t|");
		System.out.println("|\t\t\t|\t\t\t|\t\t\t\t\t|\t\t\t\t|");
		System.out.println("|\t# Higland\t|\t"+higlandQty+"\t\t|\t\t"+higlandPrice+"\t\t\t|\t\t"+higlandQtyPrice+"\t\t|");
		System.out.println("|\t\t\t|\t\t\t|\t\t\t\t\t|\t\t\t\t|");
		System.out.println("|\t# Yoghurt\t|\t"+yoghurtQty+"\t\t|\t\t"+yoghurtPrice+"\t\t\t|\t\t"+yoghurtQtyPrice+"\t\t|");
		System.out.println("|\t\t\t|\t\t\t|\t\t\t\t\t|\t\t\t\t|");
		System.out.println("|\t# Flour\t\t|\t"+flourQty+"\t\t|\t\t"+flourPrice+"\t\t\t|\t\t"+flourQtyPrice+"\t\t|");
		System.out.println("|\t\t\t|\t\t\t|\t\t\t\t\t|\t\t\t\t|");
		System.out.println("|\t# Soap\t\t|\t"+soapQty+"\t\t|\t\t"+soapPrice+"\t\t\t|\t\t"+soapQtyPrice+"\t\t|");
		System.out.println("|\t\t\t|\t\t\t|\t\t\t\t\t|\t\t\t\t|");
		total = basmathiQtyPrice+dhalQtyPrice+sugarQtyPrice+higlandQtyPrice+yoghurtQtyPrice+flourQtyPrice+soapQtyPrice;
		discount = (total/100)*10;
		price = total-discount;
		System.out.println("+-----------------------+-----------------------+---------------------------------------+------------------------------+");
		System.out.println("|\t\t\t\t\t\t|\tTotal\t\t\t\t|\t\t"+total+"\t\t|");
		System.out.println("|\t\t\t\t\t\t+---------------------------------------+------------------------------+");
		System.out.println("|\t\t\t\t\t\t|\tdiscount(10%)\t\t\t|\t\t"+discount+"\t\t|");
		System.out.println("|\t\t\t\t\t\t+---------------------------------------+------------------------------+");
		System.out.println("|\t\t\t\t\t\t|\tPrice\t\t\t\t|\t\t"+price+"\t\t|");
		System.out.println("+-----------------------------------------------+---------------------------------------+------------------------------+");
		System.out.println("");
		System.out.println("");
		System.out.print("Input Cash : ");
		cash=input.nextInt();
		change = cash-price;
		System.out.println("");
		System.out.println("+-------------------------------+------------------------------+");
		System.out.println("|\tNet Amount\t\t|\t"+price+"\t\t\t|");
		System.out.println("+-------------------------------+------------------------------+");
		System.out.println("|\tCash\t\t\t|\t"+cash+"\t\t\t|");
		System.out.println("+-------------------------------+------------------------------+");
		System.out.println("|\tChange\t\t\t|\t"+change+"\t\t\t|");      
		System.out.println("+-------------------------------+------------------------------+");
		System.out.println("");
		System.out.println("");
			System.out.println("				 +-----------------------------------------------------------------+");
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Value","No");
		System.out.println("				 +-----------------------------------------------------------------+");
		int Intchange = (int) change;
		int mod = Intchange%5000;
		int note = Intchange/5000;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.5000",note);
		System.out.println("				 +-----------------------------------------------------------------+");
		note = mod/2000;
		mod = mod%2000;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.2000",note);       
		System.out.println("				 +-----------------------------------------------------------------+");
		note = mod/1000;
		mod = mod%1000;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.1000",note);
		System.out.println("				 +-----------------------------------------------------------------+");
		note = mod/500;
		mod = mod%500;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.500",note);
		System.out.println("				 +-----------------------------------------------------------------+");
		note = mod/200;
		mod = mod%200;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.200",note);
		System.out.println("				 +-----------------------------------------------------------------+");        
		note = mod/100;
		mod = mod%100;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.100",note);
		System.out.println("				 +-----------------------------------------------------------------+");
		note = mod/50;
        mod = mod%50;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.50",note);
		System.out.println("				 +-----------------------------------------------------------------+");
		note = mod/20;
		mod = mod%20;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.20",note);
		System.out.println("				 +-----------------------------------------------------------------+");
		note = mod/10;
		mod = mod%10;        
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.10",note);
		System.out.println("				 +-----------------------------------------------------------------+");
		note = mod/5;
		mod = mod%5;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.5",note);
		System.out.println("				 +-----------------------------------------------------------------+");      
		note = mod/2;
		mod = mod%2;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.2",note);
		System.out.println("				 +-----------------------------------------------------------------+");      
		note = mod/1;
		mod = mod%1;
		System.out.printf(" %-31s | %-31s | %-29s |%n","","Rs.1",note);
		System.out.println("				 +-----------------------------------------------------------------+");      
		}
	}
