import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.spring.entity.Person;

@Configuration
@ComponentScan(basePackages = {"com.spring.dao"})
@EnableTransactionManagement
//Enables Spring's annotation-driven transaction management capability, similar to the support found in Spring's <tx:*> XML namespace. 
// To be used on @Configurationclasses to configure traditional, imperative transaction management orreactive transaction management. 
public class PersonConfig 
{
	@Bean
	public DataSource getDataSource() 
	{
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring_orm");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		
		return driverManagerDataSource;
	}
	
	@Bean
	public SessionFactory getSessionFactory() 
	{
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		// Set DataSource
		localSessionFactoryBean.setDataSource(getDataSource());
		
		// Set Hibernate Properties
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		localSessionFactoryBean.setHibernateProperties(properties);
		
		// Set Annotated/Entity classes		
		localSessionFactoryBean.setAnnotatedClasses(Person.class);
		
		try 
		{
			localSessionFactoryBean.afterPropertiesSet();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
				
		return localSessionFactoryBean.getObject();
	}
	
	@Bean
	public HibernateTemplate getHibernateTemplate()
	{
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory((SessionFactory) getSessionFactory());
		
		return hibernateTemplate;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager() 
	{
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		
		hibernateTransactionManager.setSessionFactory(getSessionFactory());
		
		return hibernateTransactionManager;
	}
}
