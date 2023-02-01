package com.bookreview;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.Statement;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
 public class Main {
	 public static void main(String[] args) {
		 System.out.println("Welcome to our Book Revieing App");
		 DBFunctions db=new DBFunctions();
		 Connection conn=db.connect_to_db( "bookReview",  "postgres",  "JayTranberg");
//		 db.createTable(conn, "Author");
//		 db.createTable(conn, "Book");
//		 db.createTable(conn, "User");
//		 db.insert_row(conn,  "Author", "Jay",  "wonderful book" , 1245);
	 }


}
