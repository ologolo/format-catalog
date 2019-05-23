package org.daisy.streamline.formats.impl;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.daisy.streamline.api.details.FormatDetails;
import org.daisy.streamline.api.media.FormatIdentifier;

public class LocalizedFormatDetailsCreator {
	private static final Logger LOGGER = Logger.getLogger(LocalizedFormatDetailsCreator.class.getCanonicalName());
	private final ResourceBundle bundle;
	
	LocalizedFormatDetailsCreator(Locale loc) {
		bundle = ResourceBundle.getBundle(this.getClass().getPackage().getName() + ".messages", loc);	
	}

	FormatDetails.Builder createLocalized(String identifier) {
		FormatDetails.Builder ret = FormatDetails.with(FormatIdentifier.with(identifier));
		getLocalized(identifier+"-name").ifPresent(v->ret.displayName(v));
		getLocalized(identifier+"-desc").ifPresent(v->ret.description(v));
		return ret;
	}
	
	private Optional<String> getLocalized(String key) {
		try {
			return Optional.ofNullable(bundle.getString(key));
		} catch (MissingResourceException e) {
			if (LOGGER.isLoggable(Level.FINE)) {
				LOGGER.fine("No resource data for: " + key);
			}
		}
		return Optional.empty();
	}
}
