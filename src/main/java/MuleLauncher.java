import org.mule.api.MuleContext;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;


public class MuleLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		DefaultMuleContextFactory muleContextFactory = new DefaultMuleContextFactory();
		SpringXmlConfigurationBuilder configBuilder = new SpringXmlConfigurationBuilder("points-loyalty-program-api.xml");
		MuleContext muleContext = muleContextFactory.createMuleContext(configBuilder);
		muleContext.start();

	}

}
