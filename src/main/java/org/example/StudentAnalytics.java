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

    /**
     * Task 6: Find the university with the highest average GPA
     * 
     * @return University name with highest average GPA
     */
    public static String universityWithHighestAvgGpa() {
        // TODO: Group by university, calculate avg GPA, find max
        return null;
    }

    /**
     * Task 7: Get students who have above-average GPA in their major
     * 
     * @return Map of major -> list of above-average students
     */
    public static Map<String, List<String>> aboveAverageStudentsByMajor() {
        // TODO: Calculate avg per major, filter students above avg, group by major
        return null;
    }

    /**
     * Task 8: Find majors where ALL students have GPA above 3.0
     * 
     * @return List of major names
     */
    public static List<String> majorsWithAllStudentsAbove3() {
        // TODO: Group by major, use allMatch() to check if all students GPA >= 3.0
        return null;
    }

    /**
     * Task 9: Get the top N students by GPA from each university
     * 
     * @param n number of top students per university
     * @return Map of university -> list of top N student names
     */
    public static Map<String, List<String>> topNStudentsPerUniversity(int n) {
        // TODO: Group by university, sort by GPA desc, limit to n, map to names
        return null;
    }

    /**
     * Task 10: Calculate GPA variance (spread) by major
     * Variance = average of squared differences from mean
     * 
     * @return Map of major -> GPA variance
     */
    public static Map<String, Double> gpaVarianceByMajor() {
        // TODO: Calculate variance for each major
        return null;
    }

    /**
     * Task 11: Find students who are "outliers" (GPA is 1+ standard deviation from major average)
     * 
     * @return List of student names who are outliers (high or low)
     */
    public static List<String> gpaOutliers() {
        // TODO: Calculate avg and std dev per major, filter students outside 1 std dev
        return null;
    }

    /**
     * Task 12: Create a "leaderboard" - rank students by GPA with their rank number
     * 
     * @return Map of student name -> rank (1 = highest GPA)
     */
    public static Map<String, Integer> studentRankings() {
        // TODO: Sort by GPA desc, assign rank numbers
        return null;
    }

    /**
     * Task 13: Find "competitor pairs" - students in same major with GPA difference < 0.1
     * 
     * @return Map of student name -> list of close competitors
     */
    public static Map<String, List<String>> closeCompetitors() {
        // TODO: For each student, find others in same major with GPA diff < 0.1
        return null;
    }

    /**
     * Task 14: Partition students into "high achievers" (GPA >= 3.5) and others
     * 
     * @return Map with Boolean keys (true = high achievers, false = others)
     */
    public static Map<Boolean, List<String>> partitionByAchievement() {
        // TODO: Use partitioningBy with GPA >= 3.5 predicate
        return null;
    }

    /**
     * Task 15: Find the "most competitive" major (highest GPA standard deviation)
     * 
     * @return Major name with highest variance
     */
    public static String mostCompetitiveMajor() {
        // TODO: Use gpaVarianceByMajor(), find major with max variance
        return null;
    }

    /**
     * Task 16: Calculate cumulative statistics for each major
     * Returns: count, sum, min, average, max
     * 
     * @return Map of major -> DoubleSummaryStatistics
     */
    public static Map<String, DoubleSummaryStatistics> majorStatistics() {
        // TODO: Group by major, use summarizingDouble()
        return null;
    }

    /**
     * Task 17: Find students who are "best in university" (highest GPA at their university)
     * 
     * @return List of student names
     */
    public static List<String> bestInUniversity() {
        // TODO: Find max GPA per university, filter students with that GPA
        return null;
    }

    /**
     * Task 18: Create "study groups" - group students by university AND standing
     * 
     * @return Map of university -> (standing -> student names)
     */
    public static Map<String, Map<String, List<String>>> studyGroups() {
        // TODO: Nested grouping by university, then standing, map to names
        return null;
    }

    /**
     * Task 19: Find the "GPA gap" - difference between highest and lowest GPA in each major
     * 
     * @return Map of major -> GPA range (max - min)
     */
    public static Map<String, Double> gpaRangeByMajor() {
        // TODO: Group by major, calculate max - min GPA
        return null;
    }

    /**
     * Task 20: Find "cross-university rivals" - students with same major, similar GPA, different universities
     * 
     * @param gpaTolerance how close GPAs must be (e.g., 0.05)
     * @return Map of student -> list of rival names
     */
    public static Map<String, List<String>> crossUniversityRivals(double gpaTolerance) {
        // TODO: For each student, find others with same major, different uni, similar GPA
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
        
        // Advanced tasks (uncomment when ready to test)
        /*
        System.out.println("\n=== Task 6: University with Highest Avg GPA ===");
        System.out.println(universityWithHighestAvgGpa());

        System.out.println("\n=== Task 7: Above-Average Students by Major ===");
        System.out.println(aboveAverageStudentsByMajor());

        System.out.println("\n=== Task 8: Majors Where ALL Students Above 3.0 ===");
        System.out.println(majorsWithAllStudentsAbove3());

        System.out.println("\n=== Task 9: Top 2 Students Per University ===");
        System.out.println(topNStudentsPerUniversity(2));

        System.out.println("\n=== Task 10: GPA Variance by Major ===");
        System.out.println(gpaVarianceByMajor());

        System.out.println("\n=== Task 11: GPA Outliers ===");
        System.out.println(gpaOutliers());

        System.out.println("\n=== Task 12: Student Rankings ===");
        studentRankings().forEach((name, rank) -> 
            System.out.println(rank + ". " + name));

        System.out.println("\n=== Task 13: Close Competitors ===");
        closeCompetitors().entrySet().stream()
            .filter(e -> !e.getValue().isEmpty())
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        System.out.println("\n=== Task 14: Partition by Achievement ===");
        System.out.println(partitionByAchievement());

        System.out.println("\n=== Task 15: Most Competitive Major ===");
        System.out.println(mostCompetitiveMajor());

        System.out.println("\n=== Task 16: Major Statistics ===");
        majorStatistics().forEach((major, stats) -> 
            System.out.println(major + ": " + stats));

        System.out.println("\n=== Task 17: Best in University ===");
        System.out.println(bestInUniversity());

        System.out.println("\n=== Task 18: Study Groups ===");
        System.out.println(studyGroups());

        System.out.println("\n=== Task 19: GPA Range by Major ===");
        System.out.println(gpaRangeByMajor());

        System.out.println("\n=== Task 20: Cross-University Rivals ===");
        crossUniversityRivals(0.1).entrySet().stream()
            .filter(e -> !e.getValue().isEmpty())
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
        */
    }
}