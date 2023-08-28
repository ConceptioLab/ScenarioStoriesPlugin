
package org.polarsys.capella.vp.scenariostories.ScenarioStories.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.common.lib.IdGenerator;

import org.polarsys.capella.vp.scenariostories.ScenarioStories.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioStoriesFactoryImpl extends EFactoryImpl implements ScenarioStoriesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScenarioStoriesFactory init() {
		try {
			ScenarioStoriesFactory theScenarioStoriesFactory = (ScenarioStoriesFactory) EPackage.Registry.INSTANCE
					.getEFactory(ScenarioStoriesPackage.eNS_URI);
			if (theScenarioStoriesFactory != null) {
				return theScenarioStoriesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScenarioStoriesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioStoriesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER:
			return createScenarioStoriesFolder();
		case ScenarioStoriesPackage.SCENARIO_CONTAINER:
			return createScenarioContainer();
		case ScenarioStoriesPackage.BASIC_EVENT:
			return createBasicEvent();
		case ScenarioStoriesPackage.BASIC_ELEMENT:
			return createBasicElement();
		case ScenarioStoriesPackage.BASIC_GROUP:
			return createBasicGroup();
		case ScenarioStoriesPackage.BASIC_EDGE:
			return createBasicEdge();
		case ScenarioStoriesPackage.WHEN_EDGE:
			return createWhenEdge();
		case ScenarioStoriesPackage.GIVEN_EDGE:
			return createGivenEdge();
		case ScenarioStoriesPackage.THEN_EDGE:
			return createThenEdge();
		case ScenarioStoriesPackage.AND_EDGE:
			return createAndEdge();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioStoriesFolder createScenarioStoriesFolder() {
		ScenarioStoriesFolderImpl scenarioStoriesFolder = new ScenarioStoriesFolderImpl();
		//begin-capella-code
		scenarioStoriesFolder.setId(IdGenerator.createId());
		//end-capella-code
		return scenarioStoriesFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioContainer createScenarioContainer() {
		ScenarioContainerImpl scenarioContainer = new ScenarioContainerImpl();
		//begin-capella-code
		scenarioContainer.setId(IdGenerator.createId());
		//end-capella-code
		return scenarioContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEvent createBasicEvent() {
		BasicEventImpl basicEvent = new BasicEventImpl();
		//begin-capella-code
		basicEvent.setId(IdGenerator.createId());
		//end-capella-code
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicElement createBasicElement() {
		BasicElementImpl basicElement = new BasicElementImpl();
		//begin-capella-code
		basicElement.setId(IdGenerator.createId());
		//end-capella-code
		return basicElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicGroup createBasicGroup() {
		BasicGroupImpl basicGroup = new BasicGroupImpl();
		//begin-capella-code
		basicGroup.setId(IdGenerator.createId());
		//end-capella-code
		return basicGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEdge createBasicEdge() {
		BasicEdgeImpl basicEdge = new BasicEdgeImpl();
		//begin-capella-code
		basicEdge.setId(IdGenerator.createId());
		//end-capella-code
		return basicEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenEdge createWhenEdge() {
		WhenEdgeImpl whenEdge = new WhenEdgeImpl();
		//begin-capella-code
		whenEdge.setId(IdGenerator.createId());
		//end-capella-code
		return whenEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GivenEdge createGivenEdge() {
		GivenEdgeImpl givenEdge = new GivenEdgeImpl();
		//begin-capella-code
		givenEdge.setId(IdGenerator.createId());
		//end-capella-code
		return givenEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThenEdge createThenEdge() {
		ThenEdgeImpl thenEdge = new ThenEdgeImpl();
		//begin-capella-code
		thenEdge.setId(IdGenerator.createId());
		//end-capella-code
		return thenEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndEdge createAndEdge() {
		AndEdgeImpl andEdge = new AndEdgeImpl();
		//begin-capella-code
		andEdge.setId(IdGenerator.createId());
		//end-capella-code
		return andEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioStoriesPackage getScenarioStoriesPackage() {
		return (ScenarioStoriesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScenarioStoriesPackage getPackage() {
		return ScenarioStoriesPackage.eINSTANCE;
	}

	//begin-capella-code

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ScenarioStoriesFolder createScenarioStoriesFolder(String name_p) {
		ScenarioStoriesFolder scenarioStoriesFolder = createScenarioStoriesFolder();
		scenarioStoriesFolder.setName(name_p);
		return scenarioStoriesFolder;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ScenarioContainer createScenarioContainer(String name_p) {
		ScenarioContainer scenarioContainer = createScenarioContainer();
		scenarioContainer.setName(name_p);
		return scenarioContainer;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public BasicEvent createBasicEvent(String name_p) {
		BasicEvent basicEvent = createBasicEvent();
		basicEvent.setName(name_p);
		return basicEvent;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public BasicElement createBasicElement(String name_p) {
		BasicElement basicElement = createBasicElement();
		basicElement.setName(name_p);
		return basicElement;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public BasicGroup createBasicGroup(String name_p) {
		BasicGroup basicGroup = createBasicGroup();
		basicGroup.setName(name_p);
		return basicGroup;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public BasicEdge createBasicEdge(String name_p) {
		BasicEdge basicEdge = createBasicEdge();
		basicEdge.setName(name_p);
		return basicEdge;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public WhenEdge createWhenEdge(String name_p) {
		WhenEdge whenEdge = createWhenEdge();
		whenEdge.setName(name_p);
		return whenEdge;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public GivenEdge createGivenEdge(String name_p) {
		GivenEdge givenEdge = createGivenEdge();
		givenEdge.setName(name_p);
		return givenEdge;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ThenEdge createThenEdge(String name_p) {
		ThenEdge thenEdge = createThenEdge();
		thenEdge.setName(name_p);
		return thenEdge;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public AndEdge createAndEdge(String name_p) {
		AndEdge andEdge = createAndEdge();
		andEdge.setName(name_p);
		return andEdge;
	}

	//end-capella-code
} //ScenarioStoriesFactoryImpl