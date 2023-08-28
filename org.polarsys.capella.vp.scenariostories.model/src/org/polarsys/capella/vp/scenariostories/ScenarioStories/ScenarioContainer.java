
package org.polarsys.capella.vp.scenariostories.ScenarioStories;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioContainer#getOwnedComponents <em>Owned Components</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioStoriesPackage#getScenarioContainer()
 * @model
 * @generated
 */

public interface ScenarioContainer extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Owned Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.scenariostories.ScenarioStories.AbstractStoryComponent}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Components</em>' containment reference list.
	 * @see org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioStoriesPackage#getScenarioContainer_OwnedComponents()
	 * @model containment="true"
	 * @generated
	 */

	EList<AbstractStoryComponent> getOwnedComponents();

} // ScenarioContainer
