package com.design.pattern.structuraldesignpattern.facadepattern;
import java.sql.Connection;
public class FacadePatternTest {

  public static void main(String []args){
    String tableName="Employee";

    //generating MySql HTML report and Oracle PDF report without using Facade
    Connection con = MySqlHelper.getMysqlDBConnection();
    MySqlHelper mySqlHelper = new MySqlHelper();
    mySqlHelper.generateMySqlHtmlReport(tableName, con);

    Connection con1 = OracleHelper.getOracleDBConnection();
    OracleHelper oracleHelper = new OracleHelper();
    oracleHelper.generateOraclePDFReport(tableName, con1);

    //generating MySql HTML report and Oracle PDF report using Facade
    HelperFacade.generateReport(HelperFacade.DBType.MYSQL, HelperFacade.ReportType.HTML, tableName);
    HelperFacade.generateReport(HelperFacade.DBType.ORACLE, HelperFacade.ReportType.PDF, tableName);
  }
}
