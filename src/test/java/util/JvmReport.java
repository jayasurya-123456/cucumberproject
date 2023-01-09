package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generateJvmReport(String jsonpath) {
	File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\JvmReport");
Configuration con = new Configuration(f, "MavenProject");
List<String> li = new ArrayList<String>();
li.add(jsonpath);
ReportBuilder r = new ReportBuilder(li, con);
r.generateReports();
}
}
