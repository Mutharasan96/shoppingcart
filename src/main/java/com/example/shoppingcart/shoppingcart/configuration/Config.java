package com.example.shoppingcart.shoppingcart.configuration;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

// @Configuration
public class Config {

    // @Value("${spring.datasource.url}")
    // private String url;

    // public Config(){
    //     DataSource dbSource = new HikariDataSource();

    //     try{
    //         dbSource.getConnection("postgres", "postgres");
    //         dbSource.createConnectionBuilder().build();
            
    //     }catch(SQLException error){
    //         System.out.println(error);
    //     }
    // }

}
