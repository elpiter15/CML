/**
 */
package dockercompose.provider;


import dockercompose.DockercomposeFactory;
import dockercompose.DockercomposePackage;
import dockercompose.Service;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dockercompose.Service} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
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

			addNamePropertyDescriptor(object);
			addBuildPropertyDescriptor(object);
			addCpu_countPropertyDescriptor(object);
			addCommandPropertyDescriptor(object);
			addContainer_namePropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addInitPropertyDescriptor(object);
			addRead_onlyPropertyDescriptor(object);
			addRestartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_name_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_build_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_build_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__BUILD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpu_countPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_cpu_count_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_cpu_count_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__CPU_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_command_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_command_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__COMMAND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainer_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_container_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_container_name_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__CONTAINER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_image_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_init_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_init_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__INIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRead_onlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_read_only_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_read_only_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_restart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_restart_feature", "_UI_Service_type"),
				 DockercomposePackage.Literals.SERVICE__RESTART,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__DEVICES);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__DNS);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__DEPENDS_ON);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__VOLUMES);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__CONFIGS);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__SECRETS);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__NETWORKS);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__PORTS);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__LINKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Service.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Service"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Service)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Service_type") :
			getString("_UI_Service_type") + " " + label;
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

		switch (notification.getFeatureID(Service.class)) {
			case DockercomposePackage.SERVICE__NAME:
			case DockercomposePackage.SERVICE__BUILD:
			case DockercomposePackage.SERVICE__CPU_COUNT:
			case DockercomposePackage.SERVICE__COMMAND:
			case DockercomposePackage.SERVICE__CONTAINER_NAME:
			case DockercomposePackage.SERVICE__IMAGE:
			case DockercomposePackage.SERVICE__INIT:
			case DockercomposePackage.SERVICE__READ_ONLY:
			case DockercomposePackage.SERVICE__RESTART:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DockercomposePackage.SERVICE__DEVICES:
			case DockercomposePackage.SERVICE__DNS:
			case DockercomposePackage.SERVICE__DEPENDS_ON:
			case DockercomposePackage.SERVICE__VOLUMES:
			case DockercomposePackage.SERVICE__CONFIGS:
			case DockercomposePackage.SERVICE__SECRETS:
			case DockercomposePackage.SERVICE__NETWORKS:
			case DockercomposePackage.SERVICE__PORTS:
			case DockercomposePackage.SERVICE__LINKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__DEVICES,
				 DockercomposeFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__DNS,
				 DockercomposeFactory.eINSTANCE.createDNS()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__DNS,
				 DockercomposeFactory.eINSTANCE.createNetworkAddress()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__DEPENDS_ON,
				 DockercomposeFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__VOLUMES,
				 DockercomposeFactory.eINSTANCE.createVolumeConnector()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__CONFIGS,
				 DockercomposeFactory.eINSTANCE.createConfigConnector()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__SECRETS,
				 DockercomposeFactory.eINSTANCE.createSecretConnector()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__NETWORKS,
				 DockercomposeFactory.eINSTANCE.createNetworkConnector()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__PORTS,
				 DockercomposeFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(DockercomposePackage.Literals.SERVICE__LINKS,
				 DockercomposeFactory.eINSTANCE.createLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DockerComposeEditPlugin.INSTANCE;
	}

}
