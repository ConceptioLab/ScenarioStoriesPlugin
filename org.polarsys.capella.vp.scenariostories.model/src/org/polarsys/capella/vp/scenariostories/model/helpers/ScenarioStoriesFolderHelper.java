package org.polarsys.capella.vp.scenariostories.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioStoriesFolder;

/**
 * @generated
 */
public class ScenarioStoriesFolderHelper {

	private static final ScenarioStoriesFolderHelper instance = new ScenarioStoriesFolderHelper();

	/**
	 * @generated
	 */
	public static ScenarioStoriesFolderHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ScenarioStoriesFolder object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}