package com.okaara.client.application.user;

import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.html.Div;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.okaara.client.framework.view.View;

public class ListUserUX extends Composite implements View{

	private static ListUserUXUiBinder uiBinder = GWT.create(ListUserUXUiBinder.class);

	interface ListUserUXUiBinder extends UiBinder<Widget, ListUserUX> {
	}

	protected @UiField Div content;

	public ListUserUX() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("newUser")
	public void onClickNewUser(ClickEvent event) {
		content.clear();
		content.add(new FormUser());
	}

	public static ListUserUX create() {
		return GWT.create(ListUserUX.class);
	}

	@Override
	public String getHeading() {
		return "Lista de Usuários";
	}

	@Override
	public Widget getWiget() {
		return this;
	}

	@Override
	public IconType getIconType() {
		return IconType.USERS;
	}

}
