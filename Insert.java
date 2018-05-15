      //BENEFITS

String query = " insert into Benefits (Plan_ID, Covered_Flag,EHB_Flag,EHB_Variance_Reason,Quant_Serv_Lmt,Service, Bene_Description)"
        + " values (?, ?, ?, ?, ?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt (1, "");
      preparedStmt.setString (2, "");
      preparedStmt.setString   (3, “”);
      preparedStmt.setString(4, “”);
      preparedStmt.setString(5, “”);
      preparedStmt.setString (2, "");
      preparedStmt.setString (2, "");

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}

              Cost_sharing
      String query = " insert into Cost_sharing (Plan_ID, CSRVariationType,Adv_payment,IssuerActuarialValue)"
        + " values (?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt (1, "");
      preparedStmt.setString (2, "");
      preparedStmt.setString   (3, “”);
      preparedStmt.setString(4, “”);
      

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}
      String query = " insert into Exclusions (Benefit_service,MOOP_in_ecl,MOOP_out_excl,subj_to_ded_excl,PlanID)"
        + " values (?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, "");
      preparedStmt.setString (2, "");
      preparedStmt.setString   (3, “”);
      preparedStmt.setString(4, “”);
      preparedStmt.setInt(5, “”);
      

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}

                           //Plan

      String query = " insert into plan (Hios_Plan_ID,Plan_URL,Plan_type,QHP_Status,Status,Plan_name,Metal_|v|,Child_only_ID,Service_Area,EHB_Perc_Premium,Issuer_ID)"
        + " values (?, ?, ?, ?, ?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt (1, "");
      preparedStmt.setString (2, "");
      preparedStmt.setString   (3, “”);
      preparedStmt.setString(4, “”);
      preparedStmt.setString(5, “”);
      preparedStmt.setString (6, "");
      preparedStmt.setString (7, "");
      preparedStmt.setString   (8, “”);
      preparedStmt.setString(9, “”);
      preparedStmt.setString(10, “”);
      preparedStmt.setString (11, "");
      preparedStmt.setString (12, "");


      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}
