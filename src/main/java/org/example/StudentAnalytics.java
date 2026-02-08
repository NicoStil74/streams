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