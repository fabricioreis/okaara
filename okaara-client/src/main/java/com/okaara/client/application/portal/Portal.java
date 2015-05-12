package com.okaara.client.application.portal;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Portal extends Composite {

	private static PortalUXUiBinder uiBinder = GWT.create(PortalUXUiBinder.class);

	interface PortalUXUiBinder extends UiBinder<Widget, Portal> {
	}

	public Portal() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
