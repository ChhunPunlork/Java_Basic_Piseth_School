package com.piseth.java.BeanLifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;

import com.piseth.custom.Piseth;
import com.piseth.software.ClassA;
import com.piseth.software.ClassB;
import com.piseth.software.ClassC;
import com.piseth.software.Software;

@Configuration
//@ComponentScan("com.piseth.java.BeanLifecycle")
//@ComponentScan(basePackages = {"com.piseth.java.BeanLifeCycle, com.piseth.software"})
//@ComponentScan(basePackageClasses = {IndexModel.class, Software.class},
//includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {ClassC.class, ClassB.class}),
//excludeFilters = @ComponentScan.Filter(classes = {Student.class}, type = FilterType.ASSIGNABLE_TYPE))
@ComponentScan(basePackageClasses = {IndexModel.class, Software.class}, excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Piseth.class}))
public class BeanConfig {
	//@Bean(initMethod = "Set up", destroyMethod = "clear")
	/*
	@Bean
	public Student getStudent() {
		Student student = new Student();
		return new Student();
	}
	@Bean
	@Lazy
	public Subject getSubject() {
		return new Subject();
	}
*/
	@Bean
	public String[] colors() {
		return new String[] {"white", "red", "yello"};
	}
}
