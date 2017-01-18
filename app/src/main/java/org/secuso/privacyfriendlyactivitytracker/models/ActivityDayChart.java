package org.secuso.privacyfriendlyactivitytracker.models;

import java.util.Map;

/**
 * Activity day chart model
 *
 * @author Tobias Neidig
 * @version 20160726
 */
public class ActivityDayChart {
    private String title;
    private Map<String, ActivityChartDataSet> steps;
    private Map<String, ActivityChartDataSet> distance;
    private Map<String, ActivityChartDataSet> calories;
    private Map<String, ActivityChartDataSet> speeds;
    private DataType displayedDataType;
    private int goal;
    public ActivityDayChart(Map<String, ActivityChartDataSet> steps, Map<String, ActivityChartDataSet> distance, Map<String, ActivityChartDataSet> calories, Map<String, ActivityChartDataSet> speeds, String title) {
        this.steps = steps;
        this.title = title;
        this.distance = distance;
        this.calories = calories;
        this.speeds = speeds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, ActivityChartDataSet> getSteps() {
        return steps;
    }

    public void setSteps(Map<String, ActivityChartDataSet> steps) {
        this.steps = steps;
    }

    public Map<String, ActivityChartDataSet> getDistance() {
        return distance;
    }

    public void setDistance(Map<String, ActivityChartDataSet> distance) {
        this.distance = distance;
    }

    public Map<String, ActivityChartDataSet> getCalories() {
        return calories;
    }

    public void setCalories(Map<String, ActivityChartDataSet> calories) {
        this.calories = calories;
    }

    public Map<String, ActivityChartDataSet> getSpeeds() {
        return speeds;
    }

    public void setSpeeds(Map<String, ActivityChartDataSet> speeds) {
        this.speeds = speeds;
    }

    public DataType getDisplayedDataType() {
        return displayedDataType;
    }

    public void setDisplayedDataType(DataType displayedDataType) {
        this.displayedDataType = displayedDataType;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public enum DataType {
        STEPS, DISTANCE, CALORIES, SPEED
    }
}
