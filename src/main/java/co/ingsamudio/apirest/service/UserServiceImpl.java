/**
 * 
 */
package co.ingsamudio.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ingsamudio.apirest.dao.UserDAO;
import co.ingsamudio.apirest.entity.User;

/**
 * Clase que implementa la interfaz intermedia {@link UserService}
 * @author ingsamudio
 * @version %I%, %G%, %U% 
 * @see UserService
 * @since 0.1
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;

	@Override
	public List<User> findAll() {
		List<User> listUsers = userDAO.findAll();
		return listUsers;
	}

	@Override
	public User findById(int id) {
		User user = userDAO.findById(id);
		return user;
	}

	@Override
	public void save(User user) {
		userDAO.save(user);
	}

	@Override
	public void deleteById(int id) {
		userDAO.deleteById(id);
	}
	
	
}
