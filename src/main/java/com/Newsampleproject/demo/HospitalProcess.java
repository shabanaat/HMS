package com.Newsampleproject.demo;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class patient {
	String patient_id, patient_name, problem, sex, location;
	int age;

	void new_patient() {
		Scanner input = new Scanner(System.in);
		System.out.print("patient_id:-");
		patient_id = input.nextLine();
		System.out.print("patient_name:-");
		patient_name = input.nextLine();
		System.out.print("problem:-");
		problem = input.nextLine();
		System.out.print("sex:-");
		sex = input.nextLine();
		System.out.print("location:-");
		location = input.nextLine();
		System.out.print("age:-");
		age = input.nextInt();
		
		 String url = "jdbc:mysql://localhost:3306/patient_registry";
	        String user = "root";
	        String password = "root";
	 
	 
	        try {
	        	Class.forName("com.mysql.jdbc.Driver");  
	            Connection conn = DriverManager.getConnection(url, user, password);
	 
	            String sql = "INSERT INTO `patient_list`(`patient_id`, `patient_name`, `problem`, `sex`, `location`,`age`) VALUES (?,?,?,?,?,?)";

	            PreparedStatement statement = conn.prepareStatement(sql);
	            statement.setString(1, patient_id);
	            statement.setString(2, patient_name);
	            statement.setString(3, problem);
	            statement.setString(4, sex); 
	            statement.setString(5, location);
	            statement.setInt(6, age);
	 
	            int row = statement.executeUpdate();
	           
	            conn.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } 
	}

	void patient_info() {
		System.out.println(
				patient_id + "\t" + patient_name + " \t" + problem + " \t" + sex + "  \t" + location + "\t" + age);
	}
}

public class HospitalProcess {
		

	public static void main(String args[]) {

		System.out.println("-----");
		System.out.println(" HOSPITAL PROCESS ");
		System.out.println("------");

		patient[] p = new patient[25];

		int i;
		int count2 = 8;
		for (i = 0; i < 25; i++)

			p[i] = new patient();

		p[0].patient_id = "12";
		p[0].patient_name = "a";
		p[0].problem = "fever";
		p[0].sex = "male";
		p[0].location = "chennai";
		p[0].age = 30;
		p[1].patient_id = "13";
		p[1].patient_name = "b";
		p[1].problem = "cold";
		p[1].sex = "female";
		p[1].location = "andhra";
		p[1].age = 23;
		p[2].patient_id = "14";
		p[2].patient_name = "c";
		p[2].problem = "head ache";
		p[2].sex = "male";
		p[2].location = "bluru";
		p[2].age = 45;
		p[3].patient_id = "15";
		p[3].patient_name = "d";
		p[3].problem = "cold";
		p[3].sex = "female";
		p[3].location = "cochi";
		p[3].age = 25;
		p[4].patient_id = "16";
		p[4].patient_name = "e";
		p[4].problem = "fever";
		p[4].sex = "male";
		p[4].location = "chennai";
		p[4].age = 25;
		p[5].patient_id = "17";
		p[5].patient_name = "f";
		p[5].problem = "cold";
		p[5].sex = "female";
		p[5].location = "andhra";
		p[5].age = 25;
		p[6].patient_id = "18";
		p[6].patient_name = "g";
		p[6].problem = "fever";
		p[6].sex = "male";
		p[6].location = "bluru";
		p[6].age = 25;
		p[7].patient_id = "19";
		p[7].patient_name = "h";
		p[7].problem = "head ache";
		p[7].sex = "female";
		p[7].location = "chennai";
		p[7].age = 25;
		p[8].patient_id = "20";
		p[8].patient_name = "i";
		p[8].problem = "fever";
		p[8].sex = "male";
		p[8].location = "canada";
		p[8].age = 25;
		p[9].patient_id = "21";
		p[9].patient_name = "j";
		p[9].problem = "head ache";
		p[9].sex = "female";
		p[9].location = "bluru";
		p[9].age = 25;

		Scanner input = new Scanner(System.in);

		int choice, j, c1, status = 1, s1 = 1;
		while (status == 1) {
			System.out.println("\n  MAIN MENU");
			System.out.println("-------");
			System.out.println("PATIENT REGISTRY");
			System.out.println("-------");

			choice = input.nextInt();
			switch (choice) {

			case 1: {
				System.out.println("-------");
				System.out.println(" PATIENT SECTION");
				System.out.println("--------");
				s1 = 1;
				while (s1 == 1) {
					System.out.println("1.new entry\n2.Patient list");
					c1 = input.nextInt();
					switch (c1) {
					case 1: {
						p[count2].new_patient();
						count2++;
						break;
					}
					case 2: {
						System.out.println("------------");
						System.out.println("patient_id \t patient_name \t problem \t sex \t location \t age");
						System.out.println("------------");
						for (j = 0; j < count2; j++) {
							p[j].patient_info();
						}
						break;
					}
					}

					break;
				}
			}

			}

		}
	}
}
