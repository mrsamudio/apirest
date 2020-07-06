/**
 * 
 */
package co.ingsamudio.apirest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Entidad user relacionada con la tabla "user" en base de datos
 * @author ingsamudio
 * @version %I%, %G%, %U% 
 * @since 0.1
 */
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="created_at")
	@CreationTimestamp
	private Date createdAt;
	
	@Column(name="updated_at")
	@UpdateTimestamp
	private Date updatedAt;
	
	/**
	 * Constructor por defecto vacio
	 */
	public User() {}
	
	/**
	 * Constructor que permite inicializar el id, correo electrónico y contraseña
	 * @param id
	 * @param email
	 * @param password
	 */
	public User(int id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}

	/**
	 * Método get
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método set
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método get del campo correo
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Método set del campo correo
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método get de contraseña
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Método set de contraseña
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Método get para obtener la fecha en que el campo fué creado
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * Método set para establecer la fecha en que el campo fué creado
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * Método set para obtener la fecha en que el campo fué actualizado
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Método set para establecer la fecha en que el campo fué actualizado
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + 
				", email=" + email + 
				", password=" + password +
				", createdAt=" + createdAt +
				", updatedAt=" + updatedAt +
				"]";
	}
}
