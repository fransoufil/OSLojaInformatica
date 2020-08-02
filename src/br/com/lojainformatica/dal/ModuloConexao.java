/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lojainformatica.dal;

import java.sql.*;

/**
 *
 * @author Franz
 */
public class ModuloConexao {
    //metodo responsavel por estabelecer a conexao com o BD
    public static Connection conector(){
        
        java.sql.Connection conexao = null;
        
        //a linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        
        //armazenando informações do BD
        String url = "jdbc:mysql://localhost:3306/<nomebandodedados>";
        String user = "<usuariodobancodedados>";
        String password = "<senhabancodedados";
        
        //estabelecendo a conexao, escerve try ctrl+space enter constroi o tratamento da exceção
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
    
}
