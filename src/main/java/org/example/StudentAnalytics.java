package org.example;

import java.io.*;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;




public final class StudentAnalytics {
    public record Student(
            String name,
            int age,
            String major,
            String university,
            double gpa,
            int creditsCompleted,
            String academicStanding
    ) {}
    private static final List<Student> STUDENTS = new ArrayList<>();

    /**
     * Reads student data from a text file and populates the STUDENTS list.
     *
     * @param uri path to the data file
     */
    public static void readStudents(URI uri) {
        try (FileInputStream fis = new FileInputStream(new File(uri))) {
            BufferedReader reader = new BufferedReader( new InputStreamReader(fis));

            // TODO: Parse each line and create Student objects


        } catch (FileNotFoundException e) {
            throw new RuntimeException("Could not find the data file!");
        } catch (IOException e) {
            throw new RuntimeException("Could not read the data file!");
        }
    }

    /**
     * Task 1: Calculate average GPA by major
     *
     * @return Map of major -> average GPA
     */
    public static Map<String, Double> averageGpaByMajor() {
        // TODO: Group students by major and calculate average GPA
        return null;
    }

    /**
     * Task 2: Find all students at a specific university with GPA above threshold
     *
     * @param university the university name
     * @param minGpa     minimum GPA threshold
     * @return List of student names
     */
    public static List<String> studentsAboveGpa(String university, double minGpa) {
        // TODO: Filter by university and GPA, return names
        return null;
    }

    /**
     * Task 3: Group students by academic standing
     *
     * @return Map of academic standing -> list of students
     */
    public static Map<String, List<Student>> groupByStanding() {
        // TODO: Group by academicStanding field
        return null;
    }

    /**
     * Task 4: Count students per university and major
     *
     * @return Map of university -> (major -> count)
     */
    public static Map<String, Map<String, Long>> studentCountByUniversityAndMajor() {
        // TODO: Nested grouping by university, then major, then count
        return null;
    }

    /**
     * Task 5: Find the student(s) with highest GPA
     *
     * @return List of student names with max GPA
     */
    public static List<String> topStudents() {
        // TODO: Find max GPA, then filter students with that GPA
        return null;
    }

    public static void main(String[] args) throws Exception {
        // Test your implementation
        readStudents(StudentAnalytics.class.getClassLoader().getResource("scratch.txt").toURI());


        System.out.println("=== Average GPA by Major ===");
        System.out.println(averageGpaByMajor());

        System.out.println("\n=== MIT Students with GPA >= 3.5 ===");
        System.out.println(studentsAboveGpa("MIT", 3.5));

        System.out.println("\n=== Students by Standing ===");
        System.out.println(groupByStanding());

        System.out.println("\n=== Student Count by University and Major ===");
        System.out.println(studentCountByUniversityAndMajor());

        System.out.println("\n=== Top Students ===");
        System.out.println(topStudents());
    }
}
