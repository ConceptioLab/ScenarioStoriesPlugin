
package org.polarsys.capella.vp.scenariostories.scenariostories.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.scenariostories.scenariostories.AbstractStoryComponent;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioContainer;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.scenariostories.impl.ScenarioContainerImpl#getOwnedComponents <em>Owned Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioContainerImpl extends NamedElementImpl implements ScenarioContainer {

	/**
	 * The cached value of the '{@link #getOwnedComponents() <em>Owned Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStoryComponent> ownedComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioContainerImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenariostoriesPackage.Literals.SCENARIO_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractStoryComponent> getOwnedComponents() {

		if (ownedComponents == null) {
			ownedComponents = new EObjectContainmentEList<AbstractStoryComponent>(AbstractStoryComponent.class, this,
					ScenariostoriesPackage.SCENARIO_CONTAINER__OWNED_COMPONENTS);
		}
		return ownedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScenariostoriesPackage.SCENARIO_CONTAINER__OWNED_COMPONENTS:
			return ((InternalEList<?>) getOwnedComponents()).basicRemove(otherEnd, msgs);
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
		case ScenariostoriesPackage.SCENARIO_CONTAINER__OWNED_COMPONENTS:
			return getOwnedComponents();
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
		case ScenariostoriesPackage.SCENARIO_CONTAINER__OWNED_COMPONENTS:
			getOwnedComponents().clear();
			getOwnedComponents().addAll((Collection<? extends AbstractStoryComponent>) newValue);
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
		case ScenariostoriesPackage.SCENARIO_CONTAINER__OWNED_COMPONENTS:
			getOwnedComponents().clear();
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
		case ScenariostoriesPackage.SCENARIO_CONTAINER__OWNED_COMPONENTS:
			return ownedComponents != null && !ownedComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioContainerImpl