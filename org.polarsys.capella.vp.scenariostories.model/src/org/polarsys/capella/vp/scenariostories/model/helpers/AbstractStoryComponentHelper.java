package org.polarsys.capella.vp.scenariostories.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.scenariostories.scenariostories.AbstractStoryComponent;

/**
 * @generated
 */
public class AbstractStoryComponentHelper {

	private static final AbstractStoryComponentHelper instance = new AbstractStoryComponentHelper();

	/**
	 * @generated
	 */
	public static AbstractStoryComponentHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(AbstractStoryComponent object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}