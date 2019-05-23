package org.daisy.streamline.formats.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.daisy.streamline.api.details.FormatDetails;

public enum LocalizedFormatDetailsList {
	DEFAULT(Locale.getDefault());

	private final List<FormatDetails> details;
	private LocalizedFormatDetailsList(Locale loc) {
		LocalizedFormatDetailsCreator c = new LocalizedFormatDetailsCreator(loc);
		details = Arrays.asList(
			c.createLocalized("text")
				.extensions("txt")
				.build(),
			c.createLocalized("formatted-text")
				.extensions("txt")
				.build(),
			c.createLocalized("xml")
				.extensions("xml")
				.build(),
			c.createLocalized("dtbook")
				.extensions("xml")
				.build(),
			c.createLocalized("epub")
				.extensions("epub")
				.build(),
			c.createLocalized("xhtml")
				.extensions("xhtml")
				.build(),
			c.createLocalized("html")
				.extensions("html")
				.build(),
			c.createLocalized("pef")
				.extensions("pef")
				.build(),
			c.createLocalized("odt")
				.extensions("odt")
				.build(),
			c.createLocalized("docx")
				.extensions("docx")
				.build()
		);
	}

	List<FormatDetails> get() {
		return details;
	}

}
