
package org.polarsys.capella.vp.scenariostories.ScenarioStories.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.vp.scenariostories.ScenarioStories.*;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioStoriesPackage
 * @generated
 */
public class ScenarioStoriesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScenarioStoriesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioStoriesSwitch() {
		if (modelPackage == null) {
			modelPackage = ScenarioStoriesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER: {
			ScenarioStoriesFolder scenarioStoriesFolder = (ScenarioStoriesFolder) theEObject;
			T result = caseScenarioStoriesFolder(scenarioStoriesFolder);
			if (result == null)
				result = caseNamedElement(scenarioStoriesFolder);
			if (result == null)
				result = caseElementExtension(scenarioStoriesFolder);
			if (result == null)
				result = caseAbstractNamedElement(scenarioStoriesFolder);
			if (result == null)
				result = caseCapellaElement(scenarioStoriesFolder);
			if (result == null)
				result = caseTraceableElement(scenarioStoriesFolder);
			if (result == null)
				result = casePublishableElement(scenarioStoriesFolder);
			if (result == null)
				result = caseModelElement(scenarioStoriesFolder);
			if (result == null)
				result = caseExtensibleElement(scenarioStoriesFolder);
			if (result == null)
				result = caseElement(scenarioStoriesFolder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.SCENARIO_CONTAINER: {
			ScenarioContainer scenarioContainer = (ScenarioContainer) theEObject;
			T result = caseScenarioContainer(scenarioContainer);
			if (result == null)
				result = caseNamedElement(scenarioContainer);
			if (result == null)
				result = caseAbstractNamedElement(scenarioContainer);
			if (result == null)
				result = caseCapellaElement(scenarioContainer);
			if (result == null)
				result = caseTraceableElement(scenarioContainer);
			if (result == null)
				result = casePublishableElement(scenarioContainer);
			if (result == null)
				result = caseModelElement(scenarioContainer);
			if (result == null)
				result = caseExtensibleElement(scenarioContainer);
			if (result == null)
				result = caseElement(scenarioContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.ABSTRACT_STORY_COMPONENT: {
			AbstractStoryComponent abstractStoryComponent = (AbstractStoryComponent) theEObject;
			T result = caseAbstractStoryComponent(abstractStoryComponent);
			if (result == null)
				result = caseNamedElement(abstractStoryComponent);
			if (result == null)
				result = caseAbstractNamedElement(abstractStoryComponent);
			if (result == null)
				result = caseCapellaElement(abstractStoryComponent);
			if (result == null)
				result = caseTraceableElement(abstractStoryComponent);
			if (result == null)
				result = casePublishableElement(abstractStoryComponent);
			if (result == null)
				result = caseModelElement(abstractStoryComponent);
			if (result == null)
				result = caseExtensibleElement(abstractStoryComponent);
			if (result == null)
				result = caseElement(abstractStoryComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.BASIC_EVENT: {
			BasicEvent basicEvent = (BasicEvent) theEObject;
			T result = caseBasicEvent(basicEvent);
			if (result == null)
				result = caseAbstractStoryComponent(basicEvent);
			if (result == null)
				result = caseNamedElement(basicEvent);
			if (result == null)
				result = caseAbstractNamedElement(basicEvent);
			if (result == null)
				result = caseCapellaElement(basicEvent);
			if (result == null)
				result = caseTraceableElement(basicEvent);
			if (result == null)
				result = casePublishableElement(basicEvent);
			if (result == null)
				result = caseModelElement(basicEvent);
			if (result == null)
				result = caseExtensibleElement(basicEvent);
			if (result == null)
				result = caseElement(basicEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.BASIC_ELEMENT: {
			BasicElement basicElement = (BasicElement) theEObject;
			T result = caseBasicElement(basicElement);
			if (result == null)
				result = caseAbstractStoryComponent(basicElement);
			if (result == null)
				result = caseNamedElement(basicElement);
			if (result == null)
				result = caseAbstractNamedElement(basicElement);
			if (result == null)
				result = caseCapellaElement(basicElement);
			if (result == null)
				result = caseTraceableElement(basicElement);
			if (result == null)
				result = casePublishableElement(basicElement);
			if (result == null)
				result = caseModelElement(basicElement);
			if (result == null)
				result = caseExtensibleElement(basicElement);
			if (result == null)
				result = caseElement(basicElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.BASIC_GROUP: {
			BasicGroup basicGroup = (BasicGroup) theEObject;
			T result = caseBasicGroup(basicGroup);
			if (result == null)
				result = caseAbstractStoryComponent(basicGroup);
			if (result == null)
				result = caseNamedElement(basicGroup);
			if (result == null)
				result = caseAbstractNamedElement(basicGroup);
			if (result == null)
				result = caseCapellaElement(basicGroup);
			if (result == null)
				result = caseTraceableElement(basicGroup);
			if (result == null)
				result = casePublishableElement(basicGroup);
			if (result == null)
				result = caseModelElement(basicGroup);
			if (result == null)
				result = caseExtensibleElement(basicGroup);
			if (result == null)
				result = caseElement(basicGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.BASIC_EDGE: {
			BasicEdge basicEdge = (BasicEdge) theEObject;
			T result = caseBasicEdge(basicEdge);
			if (result == null)
				result = caseAbstractStoryComponent(basicEdge);
			if (result == null)
				result = caseNamedElement(basicEdge);
			if (result == null)
				result = caseAbstractNamedElement(basicEdge);
			if (result == null)
				result = caseCapellaElement(basicEdge);
			if (result == null)
				result = caseTraceableElement(basicEdge);
			if (result == null)
				result = casePublishableElement(basicEdge);
			if (result == null)
				result = caseModelElement(basicEdge);
			if (result == null)
				result = caseExtensibleElement(basicEdge);
			if (result == null)
				result = caseElement(basicEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.WHEN_EDGE: {
			WhenEdge whenEdge = (WhenEdge) theEObject;
			T result = caseWhenEdge(whenEdge);
			if (result == null)
				result = caseBasicEdge(whenEdge);
			if (result == null)
				result = caseAbstractStoryComponent(whenEdge);
			if (result == null)
				result = caseNamedElement(whenEdge);
			if (result == null)
				result = caseAbstractNamedElement(whenEdge);
			if (result == null)
				result = caseCapellaElement(whenEdge);
			if (result == null)
				result = caseTraceableElement(whenEdge);
			if (result == null)
				result = casePublishableElement(whenEdge);
			if (result == null)
				result = caseModelElement(whenEdge);
			if (result == null)
				result = caseExtensibleElement(whenEdge);
			if (result == null)
				result = caseElement(whenEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.GIVEN_EDGE: {
			GivenEdge givenEdge = (GivenEdge) theEObject;
			T result = caseGivenEdge(givenEdge);
			if (result == null)
				result = caseBasicEdge(givenEdge);
			if (result == null)
				result = caseAbstractStoryComponent(givenEdge);
			if (result == null)
				result = caseNamedElement(givenEdge);
			if (result == null)
				result = caseAbstractNamedElement(givenEdge);
			if (result == null)
				result = caseCapellaElement(givenEdge);
			if (result == null)
				result = caseTraceableElement(givenEdge);
			if (result == null)
				result = casePublishableElement(givenEdge);
			if (result == null)
				result = caseModelElement(givenEdge);
			if (result == null)
				result = caseExtensibleElement(givenEdge);
			if (result == null)
				result = caseElement(givenEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.THEN_EDGE: {
			ThenEdge thenEdge = (ThenEdge) theEObject;
			T result = caseThenEdge(thenEdge);
			if (result == null)
				result = caseBasicEdge(thenEdge);
			if (result == null)
				result = caseAbstractStoryComponent(thenEdge);
			if (result == null)
				result = caseNamedElement(thenEdge);
			if (result == null)
				result = caseAbstractNamedElement(thenEdge);
			if (result == null)
				result = caseCapellaElement(thenEdge);
			if (result == null)
				result = caseTraceableElement(thenEdge);
			if (result == null)
				result = casePublishableElement(thenEdge);
			if (result == null)
				result = caseModelElement(thenEdge);
			if (result == null)
				result = caseExtensibleElement(thenEdge);
			if (result == null)
				result = caseElement(thenEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioStoriesPackage.AND_EDGE: {
			AndEdge andEdge = (AndEdge) theEObject;
			T result = caseAndEdge(andEdge);
			if (result == null)
				result = caseBasicEdge(andEdge);
			if (result == null)
				result = caseAbstractStoryComponent(andEdge);
			if (result == null)
				result = caseNamedElement(andEdge);
			if (result == null)
				result = caseAbstractNamedElement(andEdge);
			if (result == null)
				result = caseCapellaElement(andEdge);
			if (result == null)
				result = caseTraceableElement(andEdge);
			if (result == null)
				result = casePublishableElement(andEdge);
			if (result == null)
				result = caseModelElement(andEdge);
			if (result == null)
				result = caseExtensibleElement(andEdge);
			if (result == null)
				result = caseElement(andEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioStoriesFolder(ScenarioStoriesFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioContainer(ScenarioContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Story Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Story Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStoryComponent(AbstractStoryComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicEvent(BasicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicElement(BasicElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicGroup(BasicGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicEdge(BasicEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenEdge(WhenEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGivenEdge(GivenEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThenEdge(ThenEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndEdge(AndEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishableElement(PublishableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapellaElement(CapellaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementExtension(ElementExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ScenarioStoriesSwitch
