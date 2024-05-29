package sample123;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("sample123")
public class Appconfig  extends WebMvcConfigurerAdapter
{
	
	@Bean
	public InternalResourceViewResolver resolver() 
	{

	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

	viewResolver.setViewClass(JstlView.class);

	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp");

	return viewResolver;

	}

}
