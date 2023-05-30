import java.io.*; 
public class product
{
	String pcode;
	String pname;
	int price;
	public product(String pcode_get, String pname_get, int price_get)
	{
	pcode = pcode_get;
	pname = pname_get;
	price = price_get;
	}
	 
	public static void main(String args[])
        {
    
          	product p_1 = new product("A123", "TV", 20000);
		product p_2 = new product("B123", "RADIO", 12000);
		product p_3 = new product("C123", "DVD", 15000);
		if (p_1.price <= p_3.price && p_1.price <= p_2.price)
			System.out.println("Lowest product price & product name :"+p_1.price +p_1.pname  );
		if (p_3.price <= p_1.price && p_3.price <= p_2.price)
			System.out.println("Lowest product price & product name  : " + p_3.price +p_3.pname );
		if (p_2.price <= p_3.price && p_2.price <= p_1.price)
			System.out.println("Lowest product price & product name  : " + p_2.price +p_2.pname);
			 
			}
			 
}




