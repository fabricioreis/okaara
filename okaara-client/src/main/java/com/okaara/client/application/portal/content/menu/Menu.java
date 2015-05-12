package com.okaara.client.application.portal.content.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.okaara.client.application.portal.content.menu.event.HasMenuClickHandlers;
import com.okaara.client.application.portal.content.menu.event.MenuItemClickEvent;
import com.okaara.client.application.portal.content.menu.event.MenuItemClickEvent.MenuItemClickHandler;
import com.okaara.client.application.user.ListUserUX;

public class Menu extends Composite implements HasMenuClickHandlers {

	private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);

	interface MenuUiBinder extends UiBinder<Widget, Menu> {
	}

	private HandlerManager handlerManager = new HandlerManager(this);

	public Menu() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	protected void onLoad() {
		initSidebar();
	}

	private native void initSidebar()/*-{
		$wnd.$(".has_sub > a").click(function(e) {
			e.preventDefault();
			var menu_li = $wnd.$(this).parent("li");
			var menu_ul = $wnd.$(this).next("ul");

			if (menu_li.hasClass("open")) {
				menu_ul.slideUp(350);
				menu_li.removeClass("open")
			} else {
				$wnd.$("#nav > li > ul").slideUp(350);
				$wnd.$("#nav > li").removeClass("open");
				menu_ul.slideDown(350);
				menu_li.addClass("open");
			}
		});
	}-*/;

	@UiHandler("usuarios")
	public void onClickUsuarios(ClickEvent event) {
		handlerManager.fireEvent(new MenuItemClickEvent(ListUserUX.create()));
	}

	@UiHandler("exemplo1")
	public void onClickExemplo1(ClickEvent event) {
//		handlerManager.fireEvent(new MenuItemClickEvent(new Heading(HeadingSize.H1, "Exemplo1")));
	}

	@UiHandler("exemplo2")
	public void onClickExemplo2(ClickEvent event) {
//		handlerManager.fireEvent(new MenuItemClickEvent(new Heading(HeadingSize.H2, "Exemplo2")));
	}

	@UiHandler("exemplo3")
	public void onClickExemplo3(ClickEvent event) {
//		handlerManager.fireEvent(new MenuItemClickEvent(new Heading(HeadingSize.H3, "Exemplo3")));
	}

	@UiHandler("exemplo4")
	public void onClickExemplo4(ClickEvent event) {
//		handlerManager.fireEvent(new MenuItemClickEvent(new Heading(HeadingSize.H4, "Exemplo4")));
	}

	@Override
	public HandlerRegistration addMenuItemClickHandler(MenuItemClickHandler handler) {
		return handlerManager.addHandler(MenuItemClickEvent.getType(), handler);
	}

}
