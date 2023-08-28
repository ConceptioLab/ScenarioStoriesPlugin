package org.polarsys.capella.vp.scenariostories.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.AndEdge;

/**
 * @generated
 */
public class AndEdgeHelper {

	private static final AndEdgeHelper instance = new AndEdgeHelper();

	/**
	 * @generated
	 */
	public static AndEdgeHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(AndEdge object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}