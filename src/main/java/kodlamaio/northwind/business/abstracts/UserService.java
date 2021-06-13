package kodlamaio.northwind.business.abstracts;


import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.Result;

public interface UserService {
	
	Result add(User user);
	
	DataResult<User> findByEmail(String email);

}
