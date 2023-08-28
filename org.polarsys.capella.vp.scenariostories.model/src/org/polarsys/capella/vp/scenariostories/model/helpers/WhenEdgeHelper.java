package org.polarsys.capella.vp.scenariostories.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.WhenEdge;

/**
 * @generated
 */
public class WhenEdgeHelper {

	private static final WhenEdgeHelper instance = new WhenEdgeHelper();

	/**
	 * @generated
	 */
	public static WhenEdgeHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(WhenEdge object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}