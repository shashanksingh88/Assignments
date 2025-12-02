package com.miniProject;

import java.sql.*;
import java.util.Scanner;

public class StudentImpl implements IStudent {
    Scanner sc = new Scanner(System.in);
    IConnection iconn = new ConnectionImpl();

    @Override
    public void insertStudent() {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        try (Connection con = iconn.getConnection()) {
            String query = "INSERT INTO student(name, age) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            int rows = ps.executeUpdate();
            System.out.println(rows + " student inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertMultipleStudents() {
        System.out.print("How many students to insert? ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) insertStudent();
    }

    @Override
    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new age: ");
        int age = sc.nextInt(); sc.nextLine();

        try (Connection con = iconn.getConnection()) {
            String query = "UPDATE student SET name=?, age=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " student updated!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateMultipleStudents() {
        System.out.print("How many students to update? ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) updateStudent();
    }

    @Override
    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt(); sc.nextLine();

        try (Connection con = iconn.getConnection()) {
            String query = "DELETE FROM student WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " student deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteMultipleStudents() {
        System.out.print("How many students to delete? ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) deleteStudent();
    }

    @Override
    public void showStudents() {
        try (Connection con = iconn.getConnection()) {
            String query = "SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("ID\tName\tAge");
            System.out.println("--------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

