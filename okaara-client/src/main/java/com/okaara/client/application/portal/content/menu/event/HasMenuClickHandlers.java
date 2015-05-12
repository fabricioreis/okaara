package com.okaara.client.application.portal.content.menu.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;
import com.okaara.client.application.portal.content.menu.event.MenuItemClickEvent.MenuItemClickHandler;

public interface HasMenuClickHandlers extends HasHandlers {
	HandlerRegistration addMenuItemClickHandler(MenuItemClickHandler handler);
}
