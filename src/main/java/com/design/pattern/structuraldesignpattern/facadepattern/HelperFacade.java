package com.design.pattern.structuraldesignpattern.facadepattern;

import java.sql.Connection;

public class HelperFacade {

  public static void generateReport(DBType dbType, ReportType reportType, String tableName){
    Connection con;
    switch (dbType){
      case MYSQL:
        con = MySqlHelper.getMysqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        switch(reportType){
          case HTML:
            mySqlHelper.generateMySqlHtmlReport(tableName, con);
            break;
          case PDF:
            mySqlHelper.generateMySqlPDFReport(tableName, con);
            break;
        }
        break;
      case ORACLE:
        con = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        switch(reportType){
          case HTML:
            oracleHelper.generateOracleHtmlReport(tableName, con);
            break;
          case PDF:
            oracleHelper.generateOraclePDFReport(tableName, con);
            break;
        }
        break;
    }
  }

  public enum DBType {
    MYSQL, ORACLE
  }
  public enum ReportType {
    HTML, PDF
  }
}
