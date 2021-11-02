package ss12.java_collection.bai_tap;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		int priceDifference = (int) (o1.getPrice() - o2.getPrice());
		if(priceDifference == 0 ) {
			return o1.getNameProduct().compareTo(o2.getNameProduct());
		}
		return priceDifference;
	}
	
}
