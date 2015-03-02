import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.transport.NullPayload;
import org.junit.Test;

import javax.management.ObjectName;
import org.mule.module.management.agent.JmxServerNotificationAgent;
import org.mule.module.management.support.JmxSupport;

import static org.junit.Assert.*;

public class MulakaFunctionalTestCase extends FunctionalTestCase {

    protected String getConfigResources() {
        return "./src/main/app/mule-config.xml";
    }

//    @Test
    public void muleStatistics() throws Exception {

//        Prueba 1
//        MuleClient client = muleContext.getClient();
//
//        //He puesto junit 4.9 para que funcione el test
//        assertNotNull(client);
//
//        String serverId = muleContext.getConfiguration().getId();
//        ObjectName listenerObjectName = ObjectName.getInstance(JmxSupport.DEFAULT_JMX_DOMAIN_PREFIX + "." + serverId + ":" + JmxServerNotificationAgent.LISTENER_JMX_OBJECT_NAME);
//
//        assertNotNull(listenerObjectName);


    }

//    @Test
//    public void productservice() throws Exception {
//        MuleClient client = muleContext.getClient();
//
//        String productAsJson = "{\"name\":\"Widget\", \"price\": 9.99, \"weight\": 1.0, \"sku\":\"abcd-12345\"}";
//        //<co id="lis_02_product_test-1"/>
//
//        client.dispatch("http://localhost:8080/products",
//                productAsJson, null); //<co id="lis_02_product_test-2"/>
//
//
//        MuleMessage result = client.request("jms://products",
//                RECEIVE_TIMEOUT); //<co id="lis_02_product_test-3"/>
//        assertNotNull(result); //<co id="lis_02_product_test-4"/>
//        assertNull(result.getExceptionPayload());
//        assertFalse(result.getPayload() instanceof NullPayload);
//        assertEquals(productAsJson, result.getPayloadAsString()); //<co id="lis_02_product_test-5"/>
//    }

}

//<start id="lis_02_product_test"/>

//public class MulakaFunctionalTestCase extends FunctionalTestCase {
//
//    protected String getConfigResources() {
//        return "./src/main/app/product_registration.xml";
//    }
//
//    @Test
//    public void productservice() throws Exception {
//        MuleClient client = muleContext.getClient();
//
//        assertNull(client);
//
//        String productAsJson = "{\"name\":\"Widget\", \"price\": 9.99, \"weight\": 1.0, \"sku\":\"abcd-12345\"}";
//        //<co id="lis_02_product_test-1"/>
//
//        client.dispatch("http://localhost:8080/products",
//                    productAsJson, null); //<co id="lis_02_product_test-2"/>
//
//
//        MuleMessage result = client.request("jms://products",
//                        RECEIVE_TIMEOUT); //<co id="lis_02_product_test-3"/>
//        assertNotNull(result); //<co id="lis_02_product_test-4"/>
//        assertNull(result.getExceptionPayload());
//        assertFalse(result.getPayload() instanceof NullPayload);
//        assertEquals(productAsJson, result.getPayloadAsString()); //<co id="lis_02_product_test-5"/>
//    }
//}

//<end id="lis_02_product_test"/>

