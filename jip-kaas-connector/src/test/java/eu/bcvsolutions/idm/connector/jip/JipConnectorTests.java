package eu.bcvsolutions.idm.connector.jip;

import static org.junit.Assert.assertNotNull;

import java.util.Collections;

import org.identityconnectors.framework.api.APIConfiguration;
import org.identityconnectors.framework.api.ConnectorFacade;
import org.identityconnectors.framework.api.ConnectorFacadeFactory;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.OperationOptionsBuilder;
import org.identityconnectors.framework.common.objects.Uid;
import org.identityconnectors.test.common.TestHelpers;
import org.junit.Test;

public class JipConnectorTests {

	protected JipConfiguration newConfiguration() {
		return new JipConfiguration();
	}

	protected ConnectorFacade newFacade() {
		ConnectorFacadeFactory factory = ConnectorFacadeFactory.getInstance();
		APIConfiguration impl = TestHelpers.createTestConfiguration(JipConnector.class, newConfiguration());
		impl.getResultsHandlerConfiguration().setFilteredResultsHandlerInValidationMode(true);
		return factory.newInstance(impl);
	}

	// TODO make more test this one was generated.
//    @Test
//    public void basic() {
//        Uid created = newFacade().create(
//                ObjectClass.ACCOUNT,
//                Collections.<Attribute>emptySet(),
//                new OperationOptionsBuilder().build());
//        assertNotNull(created);
//    }
}
