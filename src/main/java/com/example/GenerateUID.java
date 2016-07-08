package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.UUID;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class GenerateUID extends HttpServlet 
{
  @Override 
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException
  {
	  GenerateUID obj = new GenerateUID();
      System.out.println("Unique ID : " + obj.generateUniqueKey());
      response.getOutputStream().print(obj.generateUniqueKey());
      response.getOutputStream().print("<TD>" + "<input type=\"button\" id=" + "0" + " value=\"DELETE\" name=\"button" + "7" + "\" onClick=\"verwijderen(" + "0" + ")\">" + "</TD>");//here is the problem situated
		
  }
  
  public String generateUniqueKey(){
	   	
  	String id = UUID.randomUUID().toString();
  	return id;
  	
  }
}
