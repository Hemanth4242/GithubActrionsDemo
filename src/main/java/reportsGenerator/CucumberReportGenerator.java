package reportsGenerator;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.Collections;
import java.util.List;
// Jsut testing
/**
 * Simple standalone generator that reads the cucumber json and produces HTML reports
 * using net.masterthought.cucumber.ReportBuilder.
 */
public class CucumberReportGenerator {

    public static void main(String[] args) {
        // location of generated cucumber JSON file(s)
        File reportOutputDirectory = new File("target/cucumber-reports");
        List<String> jsonFiles = Collections.singletonList("target/cucumber.json");

        // Project name that will appear in the report
        Configuration config = new Configuration(reportOutputDirectory, "CuCumberJava");

        // Optional: add classification info, build number, etc.
        config.addClassifications("Platform", System.getProperty("os.name"));
        config.addClassifications("Java Version", System.getProperty("java.version"));

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        reportBuilder.generateReports();

        System.out.println("Cucumber report generation completed. Output: " + reportOutputDirectory.getAbsolutePath());
    }
}
