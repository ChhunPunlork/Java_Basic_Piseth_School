package com.piseth.java.school;

import org.springframework.boot.autoconfigure.jersey.JerseyProperties.Type;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.piseth.customs.Piseth;
import com.piseth.java.school.sofware.Sofware;

@Configuration
//@ComponentScan(basePackages = {"com.piseth.java.school"})
//@ComponentScan(basePackageClasses = {Sofware.class, IndexModel.class})
@ComponentScan(basePackageClasses = {Sofware.class, IndexModel.class}, includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Piseth.class}))
public class MyBean {
	
}
