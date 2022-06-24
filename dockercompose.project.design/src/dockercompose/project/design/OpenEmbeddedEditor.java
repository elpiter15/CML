package dockercompose.project.design;

import org.xtext.dockercompose.ui.internal.DockercomposeActivator;
import org.obeonetwork.dsl.viewpoint.xtext.support.action.OpenXtextEmbeddedEditor;

import com.google.inject.Injector;

public class OpenEmbeddedEditor extends OpenXtextEmbeddedEditor {

	@Override
	protected Injector getInjector() {
		 return  DockercomposeActivator.getInstance().getInjector("org.xtext.dockercompose.CML");
	}

}
