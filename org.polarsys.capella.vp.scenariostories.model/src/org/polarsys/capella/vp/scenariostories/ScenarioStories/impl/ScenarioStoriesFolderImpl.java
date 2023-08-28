
package org.polarsys.capella.vp.scenariostories.ScenarioStories.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioContainer;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioStoriesFolder;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioStoriesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.ScenarioStories.impl.ScenarioStoriesFolderImpl#getOwnedScenarios <em>Owned Scenarios</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.ScenarioStories.impl.ScenarioStoriesFolderImpl#getDiagramUIDs <em>Diagram UI Ds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioStoriesFolderImpl extends NamedElementImpl implements ScenarioStoriesFolder {

	/**
	 * The cached value of the '{@link #getOwnedScenarios() <em>Owned Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioContainer> ownedScenarios;

	/**
	 * The cached value of the '{@link #getDiagramUIDs() <em>Diagram UI Ds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramUIDs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> diagramUIDs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioStoriesFolderImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioStoriesPackage.Literals.SCENARIO_STORIES_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ScenarioContainer> getOwnedScenarios() {

		if (ownedScenarios == null) {
			ownedScenarios = new EObjectContainmentEList<ScenarioContainer>(ScenarioContainer.class, this,
					ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__OWNED_SCENARIOS);
		}
		return ownedScenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<String> getDiagramUIDs() {

		if (diagramUIDs == null) {
			diagramUIDs = new EDataTypeUniqueEList<String>(String.class, this,
					ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__DIAGRAM_UI_DS);
		}
		return diagramUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__OWNED_SCENARIOS:
			return ((InternalEList<?>) getOwnedScenarios()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__OWNED_SCENARIOS:
			return getOwnedScenarios();
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__DIAGRAM_UI_DS:
			return getDiagramUIDs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__OWNED_SCENARIOS:
			getOwnedScenarios().clear();
			getOwnedScenarios().addAll((Collection<? extends ScenarioContainer>) newValue);
			return;
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__DIAGRAM_UI_DS:
			getDiagramUIDs().clear();
			getDiagramUIDs().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__OWNED_SCENARIOS:
			getOwnedScenarios().clear();
			return;
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__DIAGRAM_UI_DS:
			getDiagramUIDs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__OWNED_SCENARIOS:
			return ownedScenarios != null && !ownedScenarios.isEmpty();
		case ScenarioStoriesPackage.SCENARIO_STORIES_FOLDER__DIAGRAM_UI_DS:
			return diagramUIDs != null && !diagramUIDs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (diagramUIDs: "); //$NON-NLS-1$
		result.append(diagramUIDs);
		result.append(')');
		return result.toString();
	}

} //ScenarioStoriesFolderImpl