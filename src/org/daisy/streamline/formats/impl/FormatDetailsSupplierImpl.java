package org.daisy.streamline.formats.impl;

import java.util.List;

import org.daisy.streamline.api.details.FormatDetails;
import org.daisy.streamline.api.details.FormatDetailsSupplier;
import org.osgi.service.component.annotations.Component;

@Component
public class FormatDetailsSupplierImpl implements FormatDetailsSupplier {

	@Override
	public List<FormatDetails> listDetails() {
		return LocalizedFormatDetailsList.DEFAULT.get();
	}

}
