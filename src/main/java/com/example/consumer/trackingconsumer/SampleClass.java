
package com.example.consumer.trackingconsumer;

import org.springframework.stereotype.Service;

import com.example.tracking.trackinglibrary.annotations.Monitor;

@Service
public class SampleClass {

	@Monitor
    public void method1() {
        System.out.println("Method 1 executed.");
    }

}
