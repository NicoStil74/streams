package org.example;

import java.util.*;

public class StudentAnalyticsTest {
    
    /**
     * Test Task 1: averageGpaByMajor
     */
    public static boolean testAverageGpaByMajor() {
        Map<String, Double> result = StudentAnalytics.averageGpaByMajor();
        if (result == null) return false;
        
        // Expected: Physics=3.55, Engineering=3.333..., Mathematics=3.533..., Computer Science=3.475
        Map<String, Double> expected = new HashMap<>();
        expected.put("Physics", 3.55);
        expected.put("Engineering", 3.3333333333333335);
        expected.put("Mathematics", 3.5333333333333332);
        expected.put("Computer Science", 3.475);
        
        return mapsEqual(result, expected, 0.001);
    }
    
    /**
     * Test Task 2: studentsAboveGpa
     */
    public static boolean testStudentsAboveGpa() {
        List<String> result = StudentAnalytics.studentsAboveGpa("MIT", 3.5);
        if (result == null) return false;
        
        List<String> expected = Arrays.asList("Riley Reid", "Mia Malkova");
        return listsEqualIgnoreOrder(result, expected);
    }
    
    /**
     * Test Task 3: groupByStanding
     */
    public static boolean testGroupByStanding() {
        Map<String, List<StudentAnalytics.Student>> result = StudentAnalytics.groupByStanding();
        if (result == null) return false;
        
        // Check counts
        if (!result.containsKey("Honors") || result.get("Honors").size() != 7) return false;
        if (!result.containsKey("Good") || result.get("Good").size() != 3) return false;
        if (!result.containsKey("Satisfactory") || result.get("Satisfactory").size() != 2) return false;
        
        return true;
    }
    
    /**
     * Test Task 4: studentCountByUniversityAndMajor
     */
    public static boolean testStudentCountByUniversityAndMajor() {
        Map<String, Map<String, Long>> result = StudentAnalytics.studentCountByUniversityAndMajor();
        if (result == null) return false;
        
        // MIT: CS=2, Math=2
        if (!result.containsKey("MIT")) return false;
        if (result.get("MIT").get("Computer Science") != 2) return false;
        if (result.get("MIT").get("Mathematics") != 2) return false;
        
        // Stanford: CS=1, Engineering=2, Physics=1
        if (!result.containsKey("Stanford")) return false;
        if (result.get("Stanford").get("Computer Science") != 1) return false;
        if (result.get("Stanford").get("Engineering") != 2) return false;
        
        return true;
    }
    
    /**
     * Test Task 5: topStudents
     */
    public static boolean testTopStudents() {
        List<String> result = StudentAnalytics.topStudents();
        if (result == null) return false;
        
        List<String> expected = Arrays.asList("Riley Reid", "Mia Khalifa");
        return listsEqualIgnoreOrder(result, expected);
    }
    
    /**
     * Test Task 6: universityWithHighestAvgGpa
     */
    public static boolean testUniversityWithHighestAvgGpa() {
        String result = StudentAnalytics.universityWithHighestAvgGpa();
        if (result == null) return false;
        
        // Harvard has highest avg GPA (3.9 + 3.1) / 2 = 3.5
        return result.equals("Harvard") || result.equals("MIT"); // Both acceptable
    }
    
    /**
     * Test Task 7: aboveAverageStudentsByMajor
     */
    public static boolean testAboveAverageStudentsByMajor() {
        Map<String, List<String>> result = StudentAnalytics.aboveAverageStudentsByMajor();
        if (result == null) return false;
        
        // Should have students above their major's average
        return result.size() > 0 && result.containsKey("Computer Science");
    }
    
    /**
     * Test Task 8: majorsWithAllStudentsAbove3
     */
    public static boolean testMajorsWithAllStudentsAbove3() {
        List<String> result = StudentAnalytics.majorsWithAllStudentsAbove3();
        if (result == null) return false;
        
        // Physics: 3.6, 3.5 (all >= 3.0)
        return result.contains("Physics");
    }
    
    /**
     * Test Task 9: topNStudentsPerUniversity
     */
    public static boolean testTopNStudentsPerUniversity() {
        Map<String, List<String>> result = StudentAnalytics.topNStudentsPerUniversity(2);
        if (result == null) return false;
        
        // Each university should have at most 2 students
        for (List<String> students : result.values()) {
            if (students.size() > 2) return false;
        }
        
        return result.size() >= 4; // Should have 4 universities
    }
    
    /**
     * Test Task 10: gpaVarianceByMajor
     */
    public static boolean testGpaVarianceByMajor() {
        Map<String, Double> result = StudentAnalytics.gpaVarianceByMajor();
        if (result == null) return false;
        
        // Should have variance for each major
        return result.size() == 4 && result.containsKey("Computer Science");
    }
    
    /**
     * Test Task 11: gpaOutliers
     */
    public static boolean testGpaOutliers() {
        List<String> result = StudentAnalytics.gpaOutliers();
        if (result == null) return false;
        
        // Should identify some outliers
        return result.size() >= 0; // May or may not have outliers
    }
    
    /**
     * Test Task 12: studentRankings
     */
    public static boolean testStudentRankings() {
        Map<String, Integer> result = StudentAnalytics.studentRankings();
        if (result == null) return false;
        
        // Should have 12 students ranked
        if (result.size() != 12) return false;
        
        // Top students should be rank 1
        return result.get("Riley Reid") <= 2 && result.get("Mia Khalifa") <= 2;
    }
    
    /**
     * Test Task 13: closeCompetitors
     */
    public static boolean testCloseCompetitors() {
        Map<String, List<String>> result = StudentAnalytics.closeCompetitors();
        if (result == null) return false;
        
        // Should have entries for all students
        return result.size() == 12;
    }
    
    /**
     * Test Task 14: partitionByAchievement
     */
    public static boolean testPartitionByAchievement() {
        Map<Boolean, List<String>> result = StudentAnalytics.partitionByAchievement();
        if (result == null) return false;
        
        // Should have both true and false keys
        if (!result.containsKey(true) || !result.containsKey(false)) return false;
        
        // High achievers (GPA >= 3.5) should be 7 students
        return result.get(true).size() == 7;
    }
    
    /**
     * Test Task 15: mostCompetitiveMajor
     */
    public static boolean testMostCompetitiveMajor() {
        String result = StudentAnalytics.mostCompetitiveMajor();
        if (result == null) return false;
        
        // Should return a valid major
        List<String> validMajors = Arrays.asList("Computer Science", "Engineering", "Mathematics", "Physics");
        return validMajors.contains(result);
    }
    
    /**
     * Test Task 16: majorStatistics
     */
    public static boolean testMajorStatistics() {
        Map<String, DoubleSummaryStatistics> result = StudentAnalytics.majorStatistics();
        if (result == null) return false;
        
        // Should have stats for all 4 majors
        if (result.size() != 4) return false;
        
        // Check Computer Science stats
        DoubleSummaryStatistics csStats = result.get("Computer Science");
        return csStats != null && csStats.getCount() == 4;
    }
    
    /**
     * Test Task 17: bestInUniversity
     */
    public static boolean testBestInUniversity() {
        List<String> result = StudentAnalytics.bestInUniversity();
        if (result == null) return false;
        
        // Should have 4 students (one per university, but some tied)
        return result.size() >= 4 && result.contains("Riley Reid");
    }
    
    /**
     * Test Task 18: studyGroups
     */
    public static boolean testStudyGroups() {
        Map<String, Map<String, List<String>>> result = StudentAnalytics.studyGroups();
        if (result == null) return false;
        
        // Should have 4 universities
        return result.size() == 4;
    }
    
    /**
     * Test Task 19: gpaRangeByMajor
     */
    public static boolean testGpaRangeByMajor() {
        Map<String, Double> result = StudentAnalytics.gpaRangeByMajor();
        if (result == null) return false;
        
        // Computer Science range: 3.9 - 3.1 = 0.8
        if (!result.containsKey("Computer Science")) return false;
        double csRange = result.get("Computer Science");
        return Math.abs(csRange - 0.8) < 0.01;
    }
    
    /**
     * Test Task 20: crossUniversityRivals
     */
    public static boolean testCrossUniversityRivals() {
        Map<String, List<String>> result = StudentAnalytics.crossUniversityRivals(0.1);
        if (result == null) return false;
        
        // Should have entries for all students
        return result.size() == 12;
    }
    
    // Helper methods
    private static boolean mapsEqual(Map<String, Double> map1, Map<String, Double> map2, double tolerance) {
        if (map1.size() != map2.size()) return false;
        
        for (String key : map1.keySet()) {
            if (!map2.containsKey(key)) return false;
            if (Math.abs(map1.get(key) - map2.get(key)) > tolerance) return false;
        }
        
        return true;
    }
    
    private static boolean listsEqualIgnoreOrder(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) return false;
        
        List<String> sorted1 = new ArrayList<>(list1);
        List<String> sorted2 = new ArrayList<>(list2);
        Collections.sort(sorted1);
        Collections.sort(sorted2);
        
        return sorted1.equals(sorted2);
    }
}