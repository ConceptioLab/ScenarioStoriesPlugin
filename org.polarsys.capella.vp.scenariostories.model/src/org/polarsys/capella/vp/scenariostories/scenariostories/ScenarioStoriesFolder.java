
package org.polarsys.capella.vp.scenariostories.scenariostories;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Stories Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioStoriesFolder#getOwnedScenarios <em>Owned Scenarios</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioStoriesFolder#getDiagramUIDs <em>Diagram UI Ds</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#getScenarioStoriesFolder()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/oa/6.0.0#//OperationalAnalysis'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore#//OperationalAnalysis'"
 * @generated
 */

public interface ScenarioStoriesFolder extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Owned Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioContainer}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Scenarios</em>' containment reference list.
	 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#getScenarioStoriesFolder_OwnedScenarios()
	 * @model containment="true"
	 * @generated
	 */

	EList<ScenarioContainer> getOwnedScenarios();

	/**
	 * Returns the value of the '<em><b>Diagram UI Ds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram UI Ds</em>' attribute list.
	 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#getScenarioStoriesFolder_DiagramUIDs()
	 * @model
	 * @generated
	 */

	EList<String> getDiagramUIDs();

} // ScenarioStoriesFolder
