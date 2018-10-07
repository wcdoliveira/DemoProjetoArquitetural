package br.com.demoapp.apigateway.web.model;


public enum Status {
	
	PROCESSING(0),	ERROR(1), FINISHED(2);
	
	public int referenceCode;
	
	Status(int statusCode){
		referenceCode = statusCode;
	}
}