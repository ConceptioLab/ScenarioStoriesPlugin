
package org.polarsys.capella.vp.scenariostories.scenariostories;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.scenariostories.BasicEdge#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.scenariostories.BasicEdge#getTargetComponent <em>Target Component</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#getBasicEdge()
 * @model
 * @generated
 */

public interface BasicEdge extends AbstractStoryComponent {

	/**
	 * Returns the value of the '<em><b>Source Component</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Component</em>' reference.
	 * @see #setSourceComponent(AbstractStoryComponent)
	 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#getBasicEdge_SourceComponent()
	 * @model
	 * @generated
	 */

	AbstractStoryComponent getSourceComponent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.scenariostories.scenariostories.BasicEdge#getSourceComponent <em>Source Component</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Component</em>' reference.
	 * @see #getSourceComponent()
	 * @generated
	 */

	void setSourceComponent(AbstractStoryComponent value);

	/**
	 * Returns the value of the '<em><b>Target Component</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Component</em>' reference.
	 * @see #setTargetComponent(AbstractStoryComponent)
	 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#getBasicEdge_TargetComponent()
	 * @model
	 * @generated
	 */

	AbstractStoryComponent getTargetComponent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.scenariostories.scenariostories.BasicEdge#getTargetComponent <em>Target Component</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Component</em>' reference.
	 * @see #getTargetComponent()
	 * @generated
	 */

	void setTargetComponent(AbstractStoryComponent value);

} // BasicEdge
