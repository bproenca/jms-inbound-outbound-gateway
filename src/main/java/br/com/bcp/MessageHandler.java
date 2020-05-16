package br.com.bcp;

import org.springframework.messaging.Message;

public class MessageHandler {

	public String convertToUpperCase(Message<?> message){
		System.out.println("#2 Convert message");
		System.out.println("Original message: " + message.getPayload());
		String convertedMessage = message.getPayload().toString().toUpperCase();
		System.out.println("Converted message: " + convertedMessage);
		
		return convertedMessage;
	}
	
	public void checkResult(Message<?> message){
		System.out.println("#3 Check result: " + message);
	}
	
}
