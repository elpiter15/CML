package org.eclipse.sirius.example.xtextwidget;

import java.util.function.Consumer;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.xtext.dockercompose.ui.internal.DockercomposeActivator;

import com.google.inject.Injector;

public class XtextPartialViewerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private EEFCustomWidgetDescription description;
	
	private XtextPartialViewerWidget xtextPartialEditorWidget;
	
	private XtextPartialViewerController controller;
	
	private Consumer<Object> newValueConsumer;
	
	
	public XtextPartialViewerLifecycleManager(
			EEFCustomWidgetDescription controlDescription,
			IVariableManager variableManager, 
			IInterpreter interpreter, 
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = controlDescription;
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		Injector injector = DockercomposeActivator.getInstance().getInjector(DockercomposeActivator.ORG_XTEXT_EXAMPLE_DOCKERCOMPOSE_DOCKERCOMPOSE);
		xtextPartialEditorWidget = new XtextPartialViewerWidget(parent, injector, SWT.BORDER | SWT.H_SCROLL);
		Control control = xtextPartialEditorWidget.getControl();
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.heightHint = 14 * 12;
		gridData.widthHint = 300;
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		control.setLayoutData(gridData);
		
		this.controller = new XtextPartialViewerController(description, variableManager, interpreter, editingContextAdapter);
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		
		this.newValueConsumer = (newValue) -> this.xtextPartialEditorWidget.update((EObject)newValue);
		this.controller.onNewValue(this.newValueConsumer);
	}
	
	@Override
	public void refresh() {
		super.refresh();
		this.controller.refresh();
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		this.controller.removeValueConsumer();
		this.newValueConsumer = null;
	}

	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	@Override
	protected Control getValidationControl() {
		return this.xtextPartialEditorWidget.getControl();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void setEnabled(boolean enabled) {
		// Not handled.
	}

}
