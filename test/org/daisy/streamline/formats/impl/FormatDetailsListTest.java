package org.daisy.streamline.formats.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FormatDetailsListTest {
	
	@Test
	public void test() {
		assertTrue(LocalizedFormatDetailsList.DEFAULT.get().stream()
				.map(v->v.getIdentifier().getIdentifier())
				.anyMatch(v->v.equals("text")));
	}

}
