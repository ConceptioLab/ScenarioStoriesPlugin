
package org.polarsys.capella.vp.scenariostories.ScenarioStories.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.vp.scenariostories.ScenarioStories.AbstractStoryComponent;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.ScenarioStories.ScenarioStoriesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.ScenarioStories.impl.BasicEdgeImpl#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.ScenarioStories.impl.BasicEdgeImpl#getTargetComponent <em>Target Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicEdgeImpl extends AbstractStoryComponentImpl implements BasicEdge {

	/**
	 * The cached value of the '{@link #getSourceComponent() <em>Source Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceComponent()
	 * @generated
	 * @ordered
	 */
	protected AbstractStoryComponent sourceComponent;

	/**
	 * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponent()
	 * @generated
	 * @ordered
	 */
	protected AbstractStoryComponent targetComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicEdgeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioStoriesPackage.Literals.BASIC_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractStoryComponent getSourceComponent() {

		if (sourceComponent != null && sourceComponent.eIsProxy()) {
			InternalEObject oldSourceComponent = (InternalEObject) sourceComponent;
			sourceComponent = (AbstractStoryComponent) eResolveProxy(oldSourceComponent);
			if (sourceComponent != oldSourceComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScenarioStoriesPackage.BASIC_EDGE__SOURCE_COMPONENT, oldSourceComponent, sourceComponent));
			}
		}
		return sourceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractStoryComponent basicGetSourceComponent() {

		return sourceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSourceComponent(AbstractStoryComponent newSourceComponent) {

		AbstractStoryComponent oldSourceComponent = sourceComponent;
		sourceComponent = newSourceComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioStoriesPackage.BASIC_EDGE__SOURCE_COMPONENT,
					oldSourceComponent, sourceComponent));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractStoryComponent getTargetComponent() {

		if (targetComponent != null && targetComponent.eIsProxy()) {
			InternalEObject oldTargetComponent = (InternalEObject) targetComponent;
			targetComponent = (AbstractStoryComponent) eResolveProxy(oldTargetComponent);
			if (targetComponent != oldTargetComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScenarioStoriesPackage.BASIC_EDGE__TARGET_COMPONENT, oldTargetComponent, targetComponent));
			}
		}
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractStoryComponent basicGetTargetComponent() {

		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTargetComponent(AbstractStoryComponent newTargetComponent) {

		AbstractStoryComponent oldTargetComponent = targetComponent;
		targetComponent = newTargetComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioStoriesPackage.BASIC_EDGE__TARGET_COMPONENT,
					oldTargetComponent, targetComponent));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScenarioStoriesPackage.BASIC_EDGE__SOURCE_COMPONENT:
			if (resolve)
				return getSourceComponent();
			return basicGetSourceComponent();
		case ScenarioStoriesPackage.BASIC_EDGE__TARGET_COMPONENT:
			if (resolve)
				return getTargetComponent();
			return basicGetTargetComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ScenarioStoriesPackage.BASIC_EDGE__SOURCE_COMPONENT:
			setSourceComponent((AbstractStoryComponent) newValue);
			return;
		case ScenarioStoriesPackage.BASIC_EDGE__TARGET_COMPONENT:
			setTargetComponent((AbstractStoryComponent) newValue);
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
		case ScenarioStoriesPackage.BASIC_EDGE__SOURCE_COMPONENT:
			setSourceComponent((AbstractStoryComponent) null);
			return;
		case ScenarioStoriesPackage.BASIC_EDGE__TARGET_COMPONENT:
			setTargetComponent((AbstractStoryComponent) null);
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
		case ScenarioStoriesPackage.BASIC_EDGE__SOURCE_COMPONENT:
			return sourceComponent != null;
		case ScenarioStoriesPackage.BASIC_EDGE__TARGET_COMPONENT:
			return targetComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //BasicEdgeImpl