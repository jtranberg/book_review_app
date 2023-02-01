package com.bookreview;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBFunctions {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn=null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Connection Established");
            } else {
                System.out.println("Failed connection.");
            }
            }catch(Exception e){
                System.out.println(e);
            }
            return conn;
        }
           public  void createTable(Connection conn, String table_name){
                Statement statement;
                try{
                    String query="create table "+table_name+"(empid Serial,User_id varchar(50),name varchar(200), Bio varchar(300),primary key(empid));";
                    statement=conn.createStatement();
                    statement.executeUpdate(query);
                    System.out.println("Table created.");
                }catch  (Exception e){
                      System.out.println(e);
               }
           }
            public void insert_row(Connection conn, String table_name, String name,String bio,  Integer Auth_ID) {
        Statement statement;
        try{
            String query=String.format("insert into %s(name,bio,Auth_ID) values('%s','%s');",table_name,name,bio,Auth_ID);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void insert_row(Connection conn, String table_name, Integer Book_id, String title, String Author,String description, Integer publication_date, String Cover_image, String Reviews,  Integer PRIMARY_KEY) {
        Statement statement;
        try{
            String query=String.format("insert into %s(Book_id,title,Author,Description, Publication_date, Cover_image); values('%s','%s');", table_name,Book_id,title,Author,description, publication_date, Cover_image);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    }
