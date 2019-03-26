package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.controller.TestController;

@SpringBootApplication
@ComponentScan(basePackageClasses=TestController.class)
public class App 
{
	
	//Si impossible de charger la classe : 
	// Maven/UpdateProject puis Project/clean
	//Run as configurations 

	//http://localhost:8181/test?value=6296
	//Port de Jenkins c'est 8181
	//Par VirtualBox c'est 1080
    public static void main( String[] args )
    {
        try {
        	SpringApplication.run(App.class, args);
        	System.out.println("Application démarrée");
        	
        } catch (Exception e) {
        	System.out.println("Erreur application !");
        }
    }
}
