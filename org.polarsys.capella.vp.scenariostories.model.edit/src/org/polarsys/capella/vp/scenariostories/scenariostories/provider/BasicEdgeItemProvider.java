
package org.polarsys.capella.vp.scenariostories.scenariostories.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.capella.vp.scenariostories.scenariostories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

/**
 * This is the item provider adapter for a {@link org.polarsys.capella.vp.scenariostories.scenariostories.BasicEdge} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicEdgeItemProvider extends AbstractStoryComponentItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor sourceComponentPropertyDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor targetComponentPropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEdgeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process ScenariostoriesPackage.Literals.BASIC_EDGE__SOURCE_COMPONENT
			if (sourceComponentPropertyDescriptor != null) {
				Object sourceComponentValue = eObject.eGet(ScenariostoriesPackage.Literals.BASIC_EDGE__SOURCE_COMPONENT,
						true);
				if (sourceComponentValue != null && sourceComponentValue instanceof EObject && ModelExtensionHelper
						.getInstance(eObject).isExtensionModelDisabled((EObject) sourceComponentValue)) {
					itemPropertyDescriptors.remove(sourceComponentPropertyDescriptor);
				} else if (sourceComponentValue == null && ExtensionModelManager.getAnyType(eObject,
						ScenariostoriesPackage.Literals.BASIC_EDGE__SOURCE_COMPONENT) != null) {
					itemPropertyDescriptors.remove(sourceComponentPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(sourceComponentPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(sourceComponentPropertyDescriptor);
				}
			}
			// Process ScenariostoriesPackage.Literals.BASIC_EDGE__TARGET_COMPONENT
			if (targetComponentPropertyDescriptor != null) {
				Object targetComponentValue = eObject.eGet(ScenariostoriesPackage.Literals.BASIC_EDGE__TARGET_COMPONENT,
						true);
				if (targetComponentValue != null && targetComponentValue instanceof EObject && ModelExtensionHelper
						.getInstance(eObject).isExtensionModelDisabled((EObject) targetComponentValue)) {
					itemPropertyDescriptors.remove(targetComponentPropertyDescriptor);
				} else if (targetComponentValue == null && ExtensionModelManager.getAnyType(eObject,
						ScenariostoriesPackage.Literals.BASIC_EDGE__TARGET_COMPONENT) != null) {
					itemPropertyDescriptors.remove(targetComponentPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(targetComponentPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(targetComponentPropertyDescriptor);
				}
			}
		}
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourceComponentPropertyDescriptor(object);
			addTargetComponentPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceComponentPropertyDescriptor(Object object) {
		// begin-extension-code
		sourceComponentPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BasicEdge_sourceComponent_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_BasicEdge_sourceComponent_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_BasicEdge_type"), //$NON-NLS-1$
				ScenariostoriesPackage.Literals.BASIC_EDGE__SOURCE_COMPONENT, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(sourceComponentPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Target Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetComponentPropertyDescriptor(Object object) {
		// begin-extension-code
		targetComponentPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BasicEdge_targetComponent_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_BasicEdge_targetComponent_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_BasicEdge_type"), //$NON-NLS-1$
				ScenariostoriesPackage.Literals.BASIC_EDGE__TARGET_COMPONENT, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(targetComponentPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This returns BasicEdge.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BasicEdge")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((BasicEdge) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_BasicEdge_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}