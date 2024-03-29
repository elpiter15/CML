/**
 */
package dockercompose.provider;

import dockercompose.util.DockercomposeAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DockercomposeItemProviderAdapterFactory extends DockercomposeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockercomposeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.DockerCompose} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerComposeItemProvider dockerComposeItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.DockerCompose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDockerComposeAdapter() {
		if (dockerComposeItemProvider == null) {
			dockerComposeItemProvider = new DockerComposeItemProvider(this);
		}

		return dockerComposeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Service} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceItemProvider serviceItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceAdapter() {
		if (serviceItemProvider == null) {
			serviceItemProvider = new ServiceItemProvider(this);
		}

		return serviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Network} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkItemProvider networkItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkAdapter() {
		if (networkItemProvider == null) {
			networkItemProvider = new NetworkItemProvider(this);
		}

		return networkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Volume} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeItemProvider volumeItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumeAdapter() {
		if (volumeItemProvider == null) {
			volumeItemProvider = new VolumeItemProvider(this);
		}

		return volumeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Config} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigItemProvider configItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Config}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigAdapter() {
		if (configItemProvider == null) {
			configItemProvider = new ConfigItemProvider(this);
		}

		return configItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Secret} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretItemProvider secretItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecretAdapter() {
		if (secretItemProvider == null) {
			secretItemProvider = new SecretItemProvider(this);
		}

		return secretItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Device} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceItemProvider deviceItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceAdapter() {
		if (deviceItemProvider == null) {
			deviceItemProvider = new DeviceItemProvider(this);
		}

		return deviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.DNS} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DNSItemProvider dnsItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.DNS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDNSAdapter() {
		if (dnsItemProvider == null) {
			dnsItemProvider = new DNSItemProvider(this);
		}

		return dnsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.VolumeDriverOpt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeDriverOptItemProvider volumeDriverOptItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.VolumeDriverOpt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumeDriverOptAdapter() {
		if (volumeDriverOptItemProvider == null) {
			volumeDriverOptItemProvider = new VolumeDriverOptItemProvider(this);
		}

		return volumeDriverOptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.VolumeLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeLabelItemProvider volumeLabelItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.VolumeLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumeLabelAdapter() {
		if (volumeLabelItemProvider == null) {
			volumeLabelItemProvider = new VolumeLabelItemProvider(this);
		}

		return volumeLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.NetworkLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLabelItemProvider networkLabelItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.NetworkLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkLabelAdapter() {
		if (networkLabelItemProvider == null) {
			networkLabelItemProvider = new NetworkLabelItemProvider(this);
		}

		return networkLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.NetworkDriverOpt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkDriverOptItemProvider networkDriverOptItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.NetworkDriverOpt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkDriverOptAdapter() {
		if (networkDriverOptItemProvider == null) {
			networkDriverOptItemProvider = new NetworkDriverOptItemProvider(this);
		}

		return networkDriverOptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.IPAM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMItemProvider ipamItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.IPAM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIPAMAdapter() {
		if (ipamItemProvider == null) {
			ipamItemProvider = new IPAMItemProvider(this);
		}

		return ipamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.IPAMOption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMOptionItemProvider ipamOptionItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.IPAMOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIPAMOptionAdapter() {
		if (ipamOptionItemProvider == null) {
			ipamOptionItemProvider = new IPAMOptionItemProvider(this);
		}

		return ipamOptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.VolumeConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeConnectorItemProvider volumeConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.VolumeConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumeConnectorAdapter() {
		if (volumeConnectorItemProvider == null) {
			volumeConnectorItemProvider = new VolumeConnectorItemProvider(this);
		}

		return volumeConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Dependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyItemProvider dependencyItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.ConfigConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigConnectorItemProvider configConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.ConfigConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigConnectorAdapter() {
		if (configConnectorItemProvider == null) {
			configConnectorItemProvider = new ConfigConnectorItemProvider(this);
		}

		return configConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.SecretConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretConnectorItemProvider secretConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.SecretConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecretConnectorAdapter() {
		if (secretConnectorItemProvider == null) {
			secretConnectorItemProvider = new SecretConnectorItemProvider(this);
		}

		return secretConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.NetworkConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkConnectorItemProvider networkConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.NetworkConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkConnectorAdapter() {
		if (networkConnectorItemProvider == null) {
			networkConnectorItemProvider = new NetworkConnectorItemProvider(this);
		}

		return networkConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.NetworkAddress} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkAddressItemProvider networkAddressItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.NetworkAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkAddressAdapter() {
		if (networkAddressItemProvider == null) {
			networkAddressItemProvider = new NetworkAddressItemProvider(this);
		}

		return networkAddressItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Alias} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasItemProvider aliasItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Alias}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAliasAdapter() {
		if (aliasItemProvider == null) {
			aliasItemProvider = new AliasItemProvider(this);
		}

		return aliasItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.IPAMAddress} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMAddressItemProvider ipamAddressItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.IPAMAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIPAMAddressAdapter() {
		if (ipamAddressItemProvider == null) {
			ipamAddressItemProvider = new IPAMAddressItemProvider(this);
		}

		return ipamAddressItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.IPAMConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPAMConfigItemProvider ipamConfigItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.IPAMConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIPAMConfigAdapter() {
		if (ipamConfigItemProvider == null) {
			ipamConfigItemProvider = new IPAMConfigItemProvider(this);
		}

		return ipamConfigItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockercompose.EnvironmentVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentVariableItemProvider environmentVariableItemProvider;

	/**
	 * This creates an adapter for a {@link dockercompose.EnvironmentVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentVariableAdapter() {
		if (environmentVariableItemProvider == null) {
			environmentVariableItemProvider = new EnvironmentVariableItemProvider(this);
		}

		return environmentVariableItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (dockerComposeItemProvider != null) dockerComposeItemProvider.dispose();
		if (serviceItemProvider != null) serviceItemProvider.dispose();
		if (networkItemProvider != null) networkItemProvider.dispose();
		if (volumeItemProvider != null) volumeItemProvider.dispose();
		if (configItemProvider != null) configItemProvider.dispose();
		if (secretItemProvider != null) secretItemProvider.dispose();
		if (deviceItemProvider != null) deviceItemProvider.dispose();
		if (dnsItemProvider != null) dnsItemProvider.dispose();
		if (volumeDriverOptItemProvider != null) volumeDriverOptItemProvider.dispose();
		if (volumeLabelItemProvider != null) volumeLabelItemProvider.dispose();
		if (networkLabelItemProvider != null) networkLabelItemProvider.dispose();
		if (networkDriverOptItemProvider != null) networkDriverOptItemProvider.dispose();
		if (ipamItemProvider != null) ipamItemProvider.dispose();
		if (ipamOptionItemProvider != null) ipamOptionItemProvider.dispose();
		if (volumeConnectorItemProvider != null) volumeConnectorItemProvider.dispose();
		if (dependencyItemProvider != null) dependencyItemProvider.dispose();
		if (configConnectorItemProvider != null) configConnectorItemProvider.dispose();
		if (secretConnectorItemProvider != null) secretConnectorItemProvider.dispose();
		if (networkConnectorItemProvider != null) networkConnectorItemProvider.dispose();
		if (networkAddressItemProvider != null) networkAddressItemProvider.dispose();
		if (aliasItemProvider != null) aliasItemProvider.dispose();
		if (ipamAddressItemProvider != null) ipamAddressItemProvider.dispose();
		if (ipamConfigItemProvider != null) ipamConfigItemProvider.dispose();
		if (portItemProvider != null) portItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (environmentVariableItemProvider != null) environmentVariableItemProvider.dispose();
	}

}
