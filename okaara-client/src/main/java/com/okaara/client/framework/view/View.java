package com.okaara.client.framework.view;

import org.gwtbootstrap3.client.ui.constants.IconType;

import com.google.gwt.user.client.ui.Widget;

public interface View {

	String getHeading();
	
	IconType getIconType();

	Widget getWiget();
}
