package jdbc;

import java.sql.*;
import java.util.Scanner;

public class StudentManagement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }

    
    static void addStudent() {

        String sql = "INSERT INTO students (name, age, department) VALUES (?, ?, ?)";

        try (Connection con = jdbc.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Enter department: ");
            String department = sc.nextLine();

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, department);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student added successfully!");
            }

        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    
    static void viewStudents() {

        String sql = "SELECT * FROM students";

        try (Connection con = jdbc.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n===== STUDENT RECORDS =====");

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println("---------------------------");
                System.out.println("ID         : " + rs.getInt("id"));
                System.out.println("Name       : " + rs.getString("name"));
                System.out.println("Age        : " + rs.getInt("age"));
                System.out.println("Department : " + rs.getString("department"));
            }

            if (!found) {
                System.out.println("No student records found.");
            }

        } catch (SQLException e) {
            System.out.println("Error viewing students: " + e.getMessage());
        }
    }

    
    static void searchStudent() {

        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection con = jdbc.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    System.out.println("\nStudent Found!");
                    System.out.println("ID         : " + rs.getInt("id"));
                    System.out.println("Name       : " + rs.getString("name"));
                    System.out.println("Age        : " + rs.getInt("age"));
                    System.out.println("Department : " + rs.getString("department"));

                } else {
                    System.out.println("Student not found!");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error searching student: " + e.getMessage());
        }
    }

    
    static void updateStudent() {

        String sql = "UPDATE students SET name = ?, age = ?, department = ? WHERE id = ?";

        try (Connection con = jdbc.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter student ID to update: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter new name: ");
            String name = sc.nextLine();

            System.out.print("Enter new age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Enter new department: ");
            String department = sc.nextLine();

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, department);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student ID not found!");
            }

        } catch (SQLException e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    
    static void deleteStudent() {

        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = jdbc.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter student ID to delete: ");
            int id = Integer.parseInt(sc.nextLine());

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student ID not found!");
            }

        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}