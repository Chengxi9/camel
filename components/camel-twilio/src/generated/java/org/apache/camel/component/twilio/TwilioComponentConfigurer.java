/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TwilioComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("configuration", org.apache.camel.component.twilio.TwilioConfiguration.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("restClient", com.twilio.http.TwilioRestClient.class);
        map.put("accountSid", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("username", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TwilioComponent target = (TwilioComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accountsid":
        case "accountSid": target.setAccountSid(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.twilio.TwilioConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "restclient":
        case "restClient": target.setRestClient(property(camelContext, com.twilio.http.TwilioRestClient.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accountsid":
        case "accountSid": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.twilio.TwilioConfiguration.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "restclient":
        case "restClient": return com.twilio.http.TwilioRestClient.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        TwilioComponent target = (TwilioComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accountsid":
        case "accountSid": return target.getAccountSid();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return target.getPassword();
        case "restclient":
        case "restClient": return target.getRestClient();
        case "username": return target.getUsername();
        default: return null;
        }
    }
}

