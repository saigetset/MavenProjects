package com.sai;

/**
 * Hello world!
 *
 */
//following is the command to add the jar from specified location to local repository 
//mvn install:install-file -Dfile=C:\Users\krish\Desktop\PrintApp-1.0.jar -DgroupId=sai -DartifactId=PrintSai -Dversion=1.0 -Dpackaging=jar
//Add the jar/pom to any other project and use App.print() to test it
public class App 
{
	public static void print() {
		System.out.println("Hello Sai!!!");
	}
    public static void main( String[] args )
    {
    }
}
