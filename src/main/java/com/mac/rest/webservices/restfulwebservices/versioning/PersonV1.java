/**
 * 
 */
package com.mac.rest.webservices.restfulwebservices.versioning;

/**
 * @author Administrator
 *
 */
public class PersonV1 {
	private String name;

	/**
	 * 
	 */
	public PersonV1() {
		super();
	}

	/**
	 * @param name
	 */
	public PersonV1(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
