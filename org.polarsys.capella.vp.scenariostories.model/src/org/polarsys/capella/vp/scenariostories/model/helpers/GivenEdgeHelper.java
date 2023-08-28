package org.polarsys.capella.vp.scenariostories.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.GivenEdge;

/**
 * @generated
 */
public class GivenEdgeHelper {

	private static final GivenEdgeHelper instance = new GivenEdgeHelper();

	/**
	 * @generated
	 */
	public static GivenEdgeHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(GivenEdge object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}