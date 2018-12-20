package eu.bcvsolutions.idm.connector.jip;

import org.identityconnectors.common.StringUtil;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.exceptions.ConfigurationException;
import org.identityconnectors.framework.spi.AbstractConfiguration;
import org.identityconnectors.framework.spi.ConfigurationProperty;

/**
 * Configuration for JIP/KAAS connector
 * @author Roman Kučera
 */
public class JipConfiguration extends AbstractConfiguration {

    private String host;
    private String username;
    private GuardedString password;
    private String subject;
    private String object;

    @ConfigurationProperty(displayMessageKey = "host.display",
            helpMessageKey = "host.help", order = 1, required = true)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @ConfigurationProperty(displayMessageKey = "username.display",
            helpMessageKey = "username.help", order = 2, required = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @ConfigurationProperty(displayMessageKey = "password.display",
            helpMessageKey = "password.help", order = 3, confidential = true, required = true)
    public GuardedString getPassword() {
        return password;
    }

    public void setPassword(GuardedString password) {
        this.password = password;
    }

    @ConfigurationProperty(displayMessageKey = "subject.display",
            helpMessageKey = "subject.help", order = 5, required = true)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject != null) {
            this.subject = subject.trim();
        } else {
            this.subject = subject;
        }
    }

    @ConfigurationProperty(displayMessageKey = "object.display",
            helpMessageKey = "object.help", order = 6, required = true)
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public void validate() {
        if (StringUtil.isBlank(getHost())) {
            throw new ConfigurationException("Host must not be blank!");
        }
        if (StringUtil.isBlank(getUsername())) {
            throw new ConfigurationException("Username must not be blank!");
        }
        if (getPassword() == null) {
            throw new ConfigurationException("Password must not be blank!");
        }
        if (StringUtil.isBlank(getSubject())) {
            throw new ConfigurationException("Subject must not be blank!");
        }
    }

    public JipConfiguration() {
    }

    /**
     * Format the connector message
     *
     * @param key key of the message
     * @return return the formated message
     */
    public String getMessage(String key) {
        return getConnectorMessages().format(key, key);
    }

}
