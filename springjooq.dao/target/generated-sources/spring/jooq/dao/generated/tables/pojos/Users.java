/**
 * This class is generated by jOOQ
 */
package spring.jooq.dao.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users implements java.io.Serializable {

	private static final long serialVersionUID = -1492881961;

	private java.lang.Integer id;
	private java.lang.String  username;
	private java.lang.String  password;
	private java.lang.String  email;
	private java.lang.Integer addressId;

	public Users() {}

	public Users(
		java.lang.Integer id,
		java.lang.String  username,
		java.lang.String  password,
		java.lang.String  email,
		java.lang.Integer addressId
	) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.addressId = addressId;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getUsername() {
		return this.username;
	}

	public void setUsername(java.lang.String username) {
		this.username = username;
	}

	public java.lang.String getPassword() {
		return this.password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(java.lang.Integer addressId) {
		this.addressId = addressId;
	}
}