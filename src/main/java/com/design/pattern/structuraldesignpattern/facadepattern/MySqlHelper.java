package com.design.pattern.structuraldesignpattern.facadepattern;
import java.sql.Connection;

public class MySqlHelper {

  public MySqlHelper(){}

  public static Connection getMysqlDBConnection(){
    System.out.println("Mysql db connection");
    return null;
  }

  public void generateMySqlPDFReport(String tableName, Connection connection){
    System.out.println("Generating mysql pdf report");
  }

  public void generateMySqlHtmlReport(String tableName, Connection connection){
    System.out.println("Generating mysql Html report");
  }


}
