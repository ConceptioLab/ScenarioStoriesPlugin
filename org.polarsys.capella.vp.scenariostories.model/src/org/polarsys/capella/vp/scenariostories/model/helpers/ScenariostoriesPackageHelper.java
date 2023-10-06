/**
 * <copyright>
 *
 * </copyright>
 */

package org.polarsys.capella.vp.scenariostories.model.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioStoriesFolder;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioContainer;
import org.polarsys.capella.vp.scenariostories.scenariostories.AbstractStoryComponent;
import org.polarsys.capella.vp.scenariostories.scenariostories.BasicEvent;
import org.polarsys.capella.vp.scenariostories.scenariostories.BasicElement;
import org.polarsys.capella.vp.scenariostories.scenariostories.BasicGroup;
import org.polarsys.capella.vp.scenariostories.scenariostories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.WhenEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.GivenEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.ThenEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.AndEdge;

/**
 * @generated 
 */
public class ScenariostoriesPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof ScenarioStoriesFolder) {
			ret = ScenarioStoriesFolderHelper.getInstance().doSwitch((ScenarioStoriesFolder) object, feature);
		}
		if (ret == null && object instanceof ScenarioContainer) {
			ret = ScenarioContainerHelper.getInstance().doSwitch((ScenarioContainer) object, feature);
		}
		if (ret == null && object instanceof AbstractStoryComponent) {
			ret = AbstractStoryComponentHelper.getInstance().doSwitch((AbstractStoryComponent) object, feature);
		}
		if (ret == null && object instanceof BasicEvent) {
			ret = BasicEventHelper.getInstance().doSwitch((BasicEvent) object, feature);
		}
		if (ret == null && object instanceof BasicElement) {
			ret = BasicElementHelper.getInstance().doSwitch((BasicElement) object, feature);
		}
		if (ret == null && object instanceof BasicGroup) {
			ret = BasicGroupHelper.getInstance().doSwitch((BasicGroup) object, feature);
		}
		if (ret == null && object instanceof BasicEdge) {
			ret = BasicEdgeHelper.getInstance().doSwitch((BasicEdge) object, feature);
		}
		if (ret == null && object instanceof WhenEdge) {
			ret = WhenEdgeHelper.getInstance().doSwitch((WhenEdge) object, feature);
		}
		if (ret == null && object instanceof GivenEdge) {
			ret = GivenEdgeHelper.getInstance().doSwitch((GivenEdge) object, feature);
		}
		if (ret == null && object instanceof ThenEdge) {
			ret = ThenEdgeHelper.getInstance().doSwitch((ThenEdge) object, feature);
		}
		if (ret == null && object instanceof AndEdge) {
			ret = AndEdgeHelper.getInstance().doSwitch((AndEdge) object, feature);
		}
		return ret;
	}

}
