package org.polarsys.capella.vp.scenariostories.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicGroup;

/**
 * @generated
 */
public class BasicGroupHelper {

	private static final BasicGroupHelper instance = new BasicGroupHelper();

	/**
	 * @generated
	 */
	public static BasicGroupHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(BasicGroup object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}