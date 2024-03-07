package com.oops.basic;

public class Product {

	int Product_id;
	int Price;
	int quantity;
	public Product (int x,int y, int z) {
		this.Product_id=x;
		this.Price=y;
		this.quantity=z;
	}	
		// method
		
		public	int Highest_price_id(Product[]obj) {
			int max_price_id=0;
		for(int i=0;i<obj.length;i++) {
		}
		if(obj[i].price>max_price_id)
		{
			max_price_id=i;
			}
	
	return obj[max_price_id].Product_id;
		}
	}	
    public class Main {
	public static void main(String[] args) {
		Product p=new Product(x,y,z);
		Product obj[]=new Product[5];
	}

}
