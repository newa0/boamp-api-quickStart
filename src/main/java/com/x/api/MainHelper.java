package com.x.api;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author Gabriel Arena
 *
 *         27 nov. 2016
 */
public class MainHelper {

	private static Log logger = LogFactory.getLog(MainHelper.class);

	/**
	 * @param key
	 *          : key of parameter whose format expected is key=value
	 * @param args
	 * @return
	 */
	public static String getParam(String key, String[] args) {
		if (key == null) {
			throw new RuntimeException("key is expected");
		}

		String value = null;

		try {
			Configuration config = new PropertiesConfiguration("Boamp-api-QuickStart.properties");
			value = config.getString(key);
		}
		catch (Exception e) {
			// if not exist, don't throw exception
		}

		for (String arg : args) {
			if (arg != null && arg.startsWith(key)) {
				if (arg.split("=") != null && arg.split("=").length == 2) {
					value = arg.split("=")[1];
					break;
				}
				else {
					throw new RuntimeException("key is expected with format key=value");
				}
			}
		}

		if (value == null) {
			value = System.getProperty(key);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Parameter '" + key + "' retrieved with value '" + value + "'");
		}

		return value;
	}

	public static String getParam(String key, String[] args, String defaultvalue) {
		String value = getParam(key, args);
		if (StringUtils.isEmpty(value)) {
			if (logger.isDebugEnabled()) {
				logger.debug("Parameter '" + key + "' is null, default value is returned : '" + defaultvalue + "'");
			}
			return defaultvalue;
		}
		else {
			return value;
		}
	}

	public static String getParamInt(String key, String[] args, String defaultvalue) {
		String value = getParam(key, args);
		if (StringUtils.isEmpty(value)) {
			if (logger.isDebugEnabled()) {
				logger.debug("Parameter '" + key + "' is null, default value is returned : '" + defaultvalue + "'");
			}
			return defaultvalue;
		}
		else {
			return value;
		}
	}

	public static int getParamInt(String key, String[] args, int defaultvalue) {
		String value = getParam(key, args);
		if (StringUtils.isEmpty(value)) {
			if (logger.isDebugEnabled()) {
				logger.debug("Parameter '" + key + "' is null, default value is returned : '" + defaultvalue + "'");
			}
			return defaultvalue;
		}
		else {
			return Integer.parseInt(value);
		}
	}

	public static boolean getParamBool(String key, String[] args, boolean defaultvalue) {
		String value = getParam(key, args);
		if (StringUtils.isEmpty(value)) {
			if (logger.isDebugEnabled()) {
				logger.debug("Parameter '" + key + "' is null, default value is returned : '" + defaultvalue + "'");
			}
			return defaultvalue;
		}
		else {
			return Boolean.parseBoolean(value);
		}
	}
}
