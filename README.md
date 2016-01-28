	 This is an example of spring mvc with Servlet3. Specifically, this example demonstrates the java based web cofiguration, i.e replacing web.xml with a java class.
	com.harsha.spring.mvc.config.WebDotXmlSubstitute extends org.springframework.web.servlet.support.AbstractDispatcherServletInitializer and overrides createServletApplicationContext(), createRootApplicationContext(), getServletMappings() to set up the spring web application context. Since this basic application does not have the root application context, null is returned in createRootApplicationContext();

	I have tried deploying this app with the embedded tomcat container but failed. 
 


Changes...