/**
 * 
 */
package com.mac.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * @author Administrator
 *
 */
@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public MappingJacksonValue retriveSomeBean() {

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

		SomeBean someBean = new SomeBean("Value1", "Value2", "Value3");
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		mapping.setFilters(filters);
		return mapping;
	}

	@GetMapping("/filtering-list")
	public List<SomeBean> retriveListOfSomeBeans() {
		return Arrays.asList(new SomeBean("Value1", "Value2", "Value3"), new SomeBean("Value1", "Value2", "Value3"),
				new SomeBean("Value1", "Value2", "Value3"), new SomeBean("Value1", "Value2", "Value3"));
	}
}
