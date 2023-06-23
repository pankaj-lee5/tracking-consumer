package com.example.consumer.trackingconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan({"com.example.consumer", "com.example.tracking.trackinglibrary.annotations"})
public class TrackingConsumerApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TrackingConsumerApplication.class);
	// Get an instance of SampleClass from the context
    SampleClass sample = context.getBean(SampleClass.class);

    // Call the annotated methods
    sample.method1();

    // Close the application context
    context.close();
	}
	
}
