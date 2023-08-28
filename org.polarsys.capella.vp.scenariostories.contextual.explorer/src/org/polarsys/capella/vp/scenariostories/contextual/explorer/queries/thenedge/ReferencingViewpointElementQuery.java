
// Generated on 12.05.2023 at 10:16:27 BRT by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.scenariostories.contextual.explorer.queries.thenedge;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;

import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;

import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;

/**
 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferencingViewpointElementQuery implements IQuery {

	/**
	* <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	* Default constructor
	* @generated
	*/
	public ReferencingViewpointElementQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		Resource resource = ((EObject) object_p).eResource();
		if (resource != null) {
			for (TreeIterator<EObject> iter = resource.getAllContents(); iter.hasNext();) {
				EObject eObject = iter.next();

				if (eObject instanceof BasicEdge) {
					BasicEdge referencingElement = (BasicEdge) eObject;
					if (referencingElement.getSourceComponent() != null
							&& referencingElement.getSourceComponent().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof BasicEdge) {
					BasicEdge referencingElement = (BasicEdge) eObject;
					if (referencingElement.getTargetComponent() != null
							&& referencingElement.getTargetComponent().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof BasicEdge) {
					BasicEdge referencingElement = (BasicEdge) eObject;
					if (referencingElement.getSourceComponent() != null
							&& referencingElement.getSourceComponent().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof BasicEdge) {
					BasicEdge referencingElement = (BasicEdge) eObject;
					if (referencingElement.getTargetComponent() != null
							&& referencingElement.getTargetComponent().equals(object_p))
						result.add(eObject);
				}
			}
		}
		return result;
	}

}