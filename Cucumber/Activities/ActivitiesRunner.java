package testRunners;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "stepDefinitions")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@activity5")
@ConfigurationParameter(
		key = Constants.PLUGIN_PROPERTY_NAME,
		value = "pretty, html:Reports/HTML_Report.html, junit:Reports/XML_Report.xml, json:Reports/JSON_Report.json"
		)

/*
 * @ConfigurationParameter( key = Constants.FILTER_TAGS_PROPERTY_NAME, value =
 * "@activity1")
 */

  @ConfigurationParameter( key = Constants.FILTER_TAGS_PROPERTY_NAME, value =
  "@activity2" )
 

@ConfigurationParameter( key = Constants.FILTER_TAGS_PROPERTY_NAME, value =
		"@activity3" )

@ConfigurationParameter( key = Constants.FILTER_TAGS_PROPERTY_NAME, value =
		"@activity4" )


@ConfigurationParameter(
		key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@activity5"
		)
public class ActivitiesRunner {}