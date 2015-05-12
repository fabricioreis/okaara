package com.okaara.client.application.portal.content.menu.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.okaara.client.application.portal.content.menu.event.MenuItemClickEvent.MenuItemClickHandler;
import com.okaara.client.framework.view.View;

public class MenuItemClickEvent extends GwtEvent<MenuItemClickHandler> {

	public interface MenuItemClickHandler extends EventHandler {
		void onMenuItemClick(MenuItemClickEvent event);
	}

	public MenuItemClickEvent() {
	}

	public MenuItemClickEvent(View view) {
		this.view = view;
	}

	private View view;

	private static final Type<MenuItemClickHandler> TYPE = new Type<MenuItemClickHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<MenuItemClickHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<MenuItemClickHandler> getType() {
		return TYPE;
	}

	@Override
	protected void dispatch(MenuItemClickHandler handler) {
		handler.onMenuItemClick(this);
	}

	public View getView() {
		return view;
	}
}
