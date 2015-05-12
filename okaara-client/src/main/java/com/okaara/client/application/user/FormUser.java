package com.okaara.client.application.user;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FormUser extends Composite {

	private static FormUserUiBinder uiBinder = GWT.create(FormUserUiBinder.class);

	interface FormUserUiBinder extends UiBinder<Widget, FormUser> {
	}

	public FormUser() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
