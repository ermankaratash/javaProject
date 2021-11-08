package hrms.northwind.business.abstracts;

import java.util.List;
import hrms.northwind.entities.concretes.Product;

public interface ProductService {
	
	List<Product> getAll();

}
