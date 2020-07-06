/**
 * 
 */
package co.ingsamudio.apirest.dao;

import java.util.List;
import co.ingsamudio.apirest.entity.User;

/**
 * Interfaz que permite la conexión con la tabla user en la base de datos
 * @author ingsamudio
 * @version %I%, %G%, %U% 
 * @since 0.1
 */
public interface UserDAO {
	
	/**
	 * Lista todos los usuarios registrados
	 * @return List<User>
	 */
	public List<User> findAll();
	
	/**
	 * Retorna un solo usuario con id especifico
	 * @param id
	 * @return user
	 */
	public User findById(int id);
	
	/**
	 * Guarda o actualiza un usuario
	 * @param user
	 */
	public void save(User user);
	
	/**
	 * Borra un solo usuario con id especifico
	 * @param id
	 */
	public void deleteById(int id);

}
