/**
 * 
 */
package co.ingsamudio.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.ingsamudio.apirest.entity.User;
import co.ingsamudio.apirest.service.UserService;

/**
 * Clase encargada de gestionar las peticiones de la API 
 * <p>
 * 
 * @author ingsamudio
 * @version %I%, %G%, %U% 
 * @since 0.1
 *
 */
@RestController //Se indica que es un controlador rest
@RequestMapping("/api") //Esta es la raiz de la url, es decir http://localhost:8080/api
public class UserRestController {

	@Autowired //se inyecta el servicio para hacer uso de el
	private UserService userService;
	
	/**
	 * Petición GET para obtener todos los usuarios registrados 
	 * en la url http://host:8080/api/users/
	 * @return
	 */
	@GetMapping("/users") 
	public List<User> findAll(){
		return userService.findAll();
	}
	
	/**
	 * Peticion get para obtener un usuario 
	 * http://host:8080/api/users/1
	 * @param userId
	 * @return
	 */
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId) {
		User user = userService.findById(userId);
		
		if(user == null)
			throw new RuntimeException("User id not found " + userId);
		
		return user;
	}
	
	/**
	 * Petición POST para guardar usuarios
	 * http://host:8080/api/users
	 * @param user
	 * @return
	 */
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		user.setId(0);
		userService.save(user);
		
		return user;
	}
	
	/**
	 * Petición PUT para actualizar usuarios
	 * http://host:8080/api/users
	 * @param user
	 * @return
	 */
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		userService.save(user);
		return user;
	}
	
	/**
	 * Petición Delete de un usuario especifico
	 * http://host:8080/api/users/1
	 * @param userId
	 * @return
	 */
	@DeleteMapping("users/{userId}")
	public String deleteUser(@PathVariable int userId) {
		User user = userService.findById(userId);
		if(user == null)
			throw new RuntimeException("User id not found -" + userId);
		
		userService.deleteById(userId);
		
		return "Delted user id -" + userId;
	}
	
}
