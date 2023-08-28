
package org.polarsys.capella.vp.scenariostories.ScenarioStories;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioStoriesPackage
 * @generated
 */
public interface ScenarioStoriesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioStoriesFactory eINSTANCE = org.polarsys.capella.vp.scenariostories.ScenarioStories.impl.ScenarioStoriesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	ScenarioStoriesFolder createScenarioStoriesFolder();

	/**
	 * Returns a new object of class '<em>Scenario Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Container</em>'.
	 * @generated
	 */
	ScenarioContainer createScenarioContainer();

	/**
	 * Returns a new object of class '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Event</em>'.
	 * @generated
	 */
	BasicEvent createBasicEvent();

	/**
	 * Returns a new object of class '<em>Basic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Element</em>'.
	 * @generated
	 */
	BasicElement createBasicElement();

	/**
	 * Returns a new object of class '<em>Basic Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Group</em>'.
	 * @generated
	 */
	BasicGroup createBasicGroup();

	/**
	 * Returns a new object of class '<em>Basic Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Edge</em>'.
	 * @generated
	 */
	BasicEdge createBasicEdge();

	/**
	 * Returns a new object of class '<em>When Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Edge</em>'.
	 * @generated
	 */
	WhenEdge createWhenEdge();

	/**
	 * Returns a new object of class '<em>Given Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Given Edge</em>'.
	 * @generated
	 */
	GivenEdge createGivenEdge();

	/**
	 * Returns a new object of class '<em>Then Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Then Edge</em>'.
	 * @generated
	 */
	ThenEdge createThenEdge();

	/**
	 * Returns a new object of class '<em>And Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Edge</em>'.
	 * @generated
	 */
	AndEdge createAndEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScenarioStoriesPackage getScenarioStoriesPackage();

} //ScenarioStoriesFactory
