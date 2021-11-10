package hrms.northwind.business.abstracts;

import hrms.northwind.core.entities.User;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;

public interface UserService {

		Result add(User user);
		
		DataResult<User> getByEmail(String email);

}
