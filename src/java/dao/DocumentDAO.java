/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Document;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author Aleyna
 */
public class DocumentDAO extends DBConnection {

    public List<Document> findAll() {
        List<Document> dList = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from document";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Document d = new Document();
                d.setId(rs.getInt("id"));
                d.setFilePath(rs.getString("filePath"));
                d.setFileName(rs.getString("fileName"));
                d.setFileType(rs.getString("fileType"));
                dList.add(d);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return dList;
    }
    
    public void insert(Document d){
         try {
            Statement st = this.connect().createStatement();
            String query = "insert into document (filePath, fileName, fileType) values ('" + d.getFilePath() + "','" + d.getFileName() + "','" + d.getFileType() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}