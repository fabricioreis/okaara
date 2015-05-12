package com.okaara.client.application.portal.content;

import org.gwtbootstrap3.client.ui.html.Span;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.okaara.client.application.portal.content.menu.event.MenuItemClickEvent;
import com.okaara.client.framework.view.View;

public class Content extends Composite {

	private static ContentUXUiBinder uiBinder = GWT.create(ContentUXUiBinder.class);

	interface ContentUXUiBinder extends UiBinder<Widget, Content> {
	}

	protected @UiField FlowPanel storageView;
	protected @UiField Span pageHead;
	protected @UiField Element icon;

	public Content() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	/**
	 * Método utilizado para adicionar uma pagina no centro da tela do portal
	 * 
	 * @param widget
	 */
	private void setContainer(View view) {
		storageView.clear();
		storageView.add(view.getWiget());
		pageHead.setText(view.getHeading());
		icon.setClassName("fa " + view.getIconType().getCssName());
	}

	@UiHandler("menu")
	public void onMenuItemClick(MenuItemClickEvent event) {
		setContainer(event.getView());
	}

}
