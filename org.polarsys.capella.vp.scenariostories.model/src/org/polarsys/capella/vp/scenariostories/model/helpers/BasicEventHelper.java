package org.polarsys.capella.vp.scenariostories.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEvent;

/**
 * @generated
 */
public class BasicEventHelper {

	private static final BasicEventHelper instance = new BasicEventHelper();

	/**
	 * @generated
	 */
	public static BasicEventHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(BasicEvent object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}