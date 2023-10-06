
package org.polarsys.capella.vp.scenariostories.scenariostories;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.scenariostories.scenariostories.BasicGroup#getOwnedComponents <em>Owned Components</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#getBasicGroup()
 * @model
 * @generated
 */

public interface BasicGroup extends AbstractStoryComponent {

	/**
	 * Returns the value of the '<em><b>Owned Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.scenariostories.scenariostories.AbstractStoryComponent}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Components</em>' containment reference list.
	 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#getBasicGroup_OwnedComponents()
	 * @model containment="true"
	 * @generated
	 */

	EList<AbstractStoryComponent> getOwnedComponents();

} // BasicGroup
