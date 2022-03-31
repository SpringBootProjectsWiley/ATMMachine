import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[]) {
		ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		SavingsAccount savings=(SavingsAccount)factory.getBean("savings");
		System.out.println(savings);
		
		SalaryAccount salary=(SalaryAccount)factory.getBean("salary");
		System.out.println(salary);
		
		CustomEventPublisher cvp = (CustomEventPublisher) factory.getBean("customEventPublisher");
		      
		if(savings.withdraw(1000000)) {
			cvp.publish(1000000,savings);
		}else {
			System.out.println("Limit Exceeded!");
		}
		
		if(salary.withdraw(100000)) {
			cvp.publish(100000,salary);
		}else {
			System.out.println("Transaction terminated!");
		}
	}
}
