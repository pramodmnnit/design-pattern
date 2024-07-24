package com.design.pattern.structuraldesignpattern.facadepattern;

import java.sql.Connection;

public class OracleHelper {

  public OracleHelper() {}

  public static Connection getOracleDBConnection() {
    System.out.println("Oracle db connection");
    return null;
  }

  public void generateOraclePDFReport(String tableName, Connection connection) {
    System.out.println("Generating Oracle pdf report");
  }

  public void generateOracleHtmlReport(String tableName, Connection connection) {
    System.out.println("Generating Oracle Html report");
  }
}
