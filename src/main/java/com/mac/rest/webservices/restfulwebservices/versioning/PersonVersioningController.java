/**
 * 
 */
package com.mac.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
public class PersonVersioningController {
	
	
	/* ################################################## */
	// URI versioning
	/* ################################################## */
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("mac Jaya");
	}

	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("ma", "Jaya"));
	}

	/* ################################################## */
	// Parameter versioning
	/* ################################################## */
	@GetMapping(value = "person/param", params = "version=1")
	public PersonV1 paramV1() {
		return new PersonV1("mac Jaya");
	}

	@GetMapping(value = "person/param", params = "version=2")
	public PersonV2 paramnV2() {
		return new PersonV2(new Name("ma", "Jaya"));
	}

	/* ################################################## */
	// Header versioning
	/* ################################################## */
	@GetMapping(value = "person/header", headers = "X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("mac Jaya");
	}

	@GetMapping(value = "person/header", headers = "X-API-VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("ma", "Jaya"));
	}

	/* ################################################## */
	// Media type versioning
	/* ################################################## */
	@GetMapping(value = "person/produces", produces = "application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		return new PersonV1("mac Jaya");
	}

	@GetMapping(value = "person/produces", produces = "application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		return new PersonV2(new Name("ma", "Jaya"));
	}
}
