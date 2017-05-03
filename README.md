# CMPE 275
# Lab 0 - Spring HelloWorld

In this lab, you build a HelloWorld Java console application with Spring’s application context. 

You will create a greeting bean with the ID “greeter”, which must be specified in your application context’s configuration file, named beans.xml. The class of the greeting bean implements the following interface:

  interface Greeter {
	void setName(String name); // name of the author
	String getGreeting();
  }

The value of the name property should be specified in beans.xml as well. 

After instantiating the application context, get the greeting bean by its ID, call its getGreeting() method to get the greeting message, and print it on the console.

If the author is Alice, the greeting message should be “Hello world from Alice!” 

Please add proper Java Documents, and include a Instructions.txt file that contains your name, student ID, email address, and a brief instruction on how to run your app.
