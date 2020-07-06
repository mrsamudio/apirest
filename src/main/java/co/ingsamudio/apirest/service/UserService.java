/**
 * 
 */
package co.ingsamudio.apirest.service;

import java.util.List;

import co.ingsamudio.apirest.controller.UserRestController;
import co.ingsamudio.apirest.dao.UserDAO;
import co.ingsamudio.apirest.entity.User;

/**
 * Interfaz intermedia entre {@link UserDAO} y {@link UserRestController}
 * @author ingsamudio
 * @version %I%, %G%, %U% 
 * @see UserDAO
 * @since 0.1
 */
public interface UserService {
	
	public List<User> findAll();
	
	public User findById(int id);
	
	public void save(User user);
	
	public void deleteById(int id);

}
