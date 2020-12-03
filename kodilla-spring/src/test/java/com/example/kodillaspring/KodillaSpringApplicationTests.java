package com.example.kodillaspring;

import com.example.kodillaspring.shape.Circle;
import com.example.kodillaspring.shape.Shape;
import com.example.kodillaspring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {
	@Test
	void testCircleLoadedIntoContainer(){
	//Given
	ApplicationContext context=new AnnotationConfigApplicationContext("com.example.kodillaspring");

	Shape shape = context.getBean(Circle.class);

	//When
	String name = shape.getName();

	//Then
	 assertEquals("This is a Circle",name);
}


	@Test
	void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example.kodillaspring");
		Shape shape = context.getBean(Triangle.class);

		//When
		String name = shape.getName();

		//Then
		assertEquals("This is a Triangle", name);
	}
	@Test
	void contextLoads() {
	}

}
