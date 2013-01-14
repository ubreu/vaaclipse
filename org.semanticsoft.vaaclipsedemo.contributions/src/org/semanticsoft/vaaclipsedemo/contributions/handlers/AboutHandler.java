package org.semanticsoft.vaaclipsedemo.contributions.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class AboutHandler {
	@Execute
	public void execute(Application vaadinApp) {
		vaadinApp.getMainWindow().showNotification("Vaaclipse Contribution Demo");
	}
}
