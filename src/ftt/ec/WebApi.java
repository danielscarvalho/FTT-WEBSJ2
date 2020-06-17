package ftt.ec;

import static spark.Spark.*;

public class WebApi {
	//WEB API - Microserviços
	//https://maven.apache.org/
	//https://mvnrepository.com/
	//http://sparkjava.com/
	//http://localhost:4567/hello
	
	public static void main(String[] args) {

		System.out.println("WEB API running " + new java.util.Date());
		System.out.println("Vai Corinthians!!!");
		
		//Código da WEB API como microservices
		get("/hello", (req, res) -> "Hello World");
		get("/timao", (req, res) -> "Vai Corinthians!!");
		get("/", (req, res) -> "WEB API: " + new java.util.Date());
		//post()
		//delete()
			
	}

}
