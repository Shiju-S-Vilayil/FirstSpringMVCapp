package sample123;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitilizer  extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] 
				{

		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {

				Appconfig.class

				};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
				"/"
		};
	}

}
