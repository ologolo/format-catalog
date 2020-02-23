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
				.mediaType("text/plain")
				.build(),
			c.createLocalized("formatted-text")
				.extensions("txt")
				.mediaType("text/plain")
				.build(),
			c.createLocalized("xml")
				.extensions("xml")
				.mediaType("application/xml")
				.build(),
			c.createLocalized("dtbook")
				.extensions("xml")
				.mediaType("application/x-dtbook+xml")
				.build(),
			c.createLocalized("epub")
				.extensions("epub")
				.mediaType("application/epub+zip")
				.build(),
			c.createLocalized("xhtml")
				.extensions("xhtml")
				.mediaType("application/xhtml+xml")
				.build(),
			c.createLocalized("html")
				.extensions("html")
				.mediaType("text/html")
				.build(),
			c.createLocalized("pef")
				.extensions("pef")
				.mediaType("application/x-pef+xml")
				.build(),
			c.createLocalized("odt")
				.extensions("odt")
				.mediaType("application/vnd.oasis.opendocument.text")
				.build(),
			c.createLocalized("docx")
				.extensions("docx")
				.mediaType("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
				.build(),
			c.createLocalized("obfl")
				.extensions("obfl")
				.mediaType("application/x-obfl+xml")
				.build(),
			c.createLocalized("markdown")
				.extensions("md")
				.mediaType("text/markdown")
				.build(),
			c.createLocalized("jpeg")
				.extensions("jpg", "jpeg")
				.mediaType("image/jpeg")
				.build(),
			c.createLocalized("png")
				.extensions("png")
				.mediaType("image/png")
				.build(),
			c.createLocalized("plantuml")
				.extensions("puml")
				.build()
		);
	}

	List<FormatDetails> get() {
		return details;
	}

}
