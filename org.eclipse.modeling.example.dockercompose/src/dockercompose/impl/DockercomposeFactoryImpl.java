/**
 */
package dockercompose.impl;

import dockercompose.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockercomposeFactoryImpl extends EFactoryImpl implements DockercomposeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockercomposeFactory init() {
		try {
			DockercomposeFactory theDockercomposeFactory = (DockercomposeFactory)EPackage.Registry.INSTANCE.getEFactory(DockercomposePackage.eNS_URI);
			if (theDockercomposeFactory != null) {
				return theDockercomposeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockercomposeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockercomposeFactoryImpl() {
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
			case DockercomposePackage.DOCKER_COMPOSE: return createDockerCompose();
			case DockercomposePackage.SERVICE: return createService();
			case DockercomposePackage.NETWORK: return createNetwork();
			case DockercomposePackage.VOLUME: return createVolume();
			case DockercomposePackage.CONFIG: return createConfig();
			case DockercomposePackage.SECRET: return createSecret();
			case DockercomposePackage.DEVICE: return createDevice();
			case DockercomposePackage.DNS: return createDNS();
			case DockercomposePackage.VOLUME_DRIVER_OPT: return createVolumeDriverOpt();
			case DockercomposePackage.VOLUME_LABEL: return createVolumeLabel();
			case DockercomposePackage.NETWORK_LABEL: return createNetworkLabel();
			case DockercomposePackage.NETWORK_DRIVER_OPT: return createNetworkDriverOpt();
			case DockercomposePackage.IPAM: return createIPAM();
			case DockercomposePackage.IPAM_OPTION: return createIPAMOption();
			case DockercomposePackage.VOLUME_CONNECTOR: return createVolumeConnector();
			case DockercomposePackage.DEPENDENCY: return createDependency();
			case DockercomposePackage.CONFIG_CONNECTOR: return createConfigConnector();
			case DockercomposePackage.SECRET_CONNECTOR: return createSecretConnector();
			case DockercomposePackage.NETWORK_CONNECTOR: return createNetworkConnector();
			case DockercomposePackage.NETWORK_ADDRESS: return createNetworkAddress();
			case DockercomposePackage.ALIAS: return createAlias();
			case DockercomposePackage.IPAM_ADDRESS: return createIPAMAddress();
			case DockercomposePackage.IPAM_CONFIG: return createIPAMConfig();
			case DockercomposePackage.PORT: return createPort();
			case DockercomposePackage.LINK: return createLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DockercomposePackage.RESTART_POLICY:
				return createRestartPolicyFromString(eDataType, initialValue);
			case DockercomposePackage.ACCESS_MODE:
				return createAccessModeFromString(eDataType, initialValue);
			case DockercomposePackage.MOUNT_TYPE:
				return createMountTypeFromString(eDataType, initialValue);
			case DockercomposePackage.PROPAGATION_TYPE:
				return createPropagationTypeFromString(eDataType, initialValue);
			case DockercomposePackage.CONDITION:
				return createConditionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DockercomposePackage.RESTART_POLICY:
				return convertRestartPolicyToString(eDataType, instanceValue);
			case DockercomposePackage.ACCESS_MODE:
				return convertAccessModeToString(eDataType, instanceValue);
			case DockercomposePackage.MOUNT_TYPE:
				return convertMountTypeToString(eDataType, instanceValue);
			case DockercomposePackage.PROPAGATION_TYPE:
				return convertPropagationTypeToString(eDataType, instanceValue);
			case DockercomposePackage.CONDITION:
				return convertConditionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerCompose createDockerCompose() {
		DockerComposeImpl dockerCompose = new DockerComposeImpl();
		return dockerCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Secret createSecret() {
		SecretImpl secret = new SecretImpl();
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNS createDNS() {
		DNSImpl dns = new DNSImpl();
		return dns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeDriverOpt createVolumeDriverOpt() {
		VolumeDriverOptImpl volumeDriverOpt = new VolumeDriverOptImpl();
		return volumeDriverOpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeLabel createVolumeLabel() {
		VolumeLabelImpl volumeLabel = new VolumeLabelImpl();
		return volumeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLabel createNetworkLabel() {
		NetworkLabelImpl networkLabel = new NetworkLabelImpl();
		return networkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkDriverOpt createNetworkDriverOpt() {
		NetworkDriverOptImpl networkDriverOpt = new NetworkDriverOptImpl();
		return networkDriverOpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPAM createIPAM() {
		IPAMImpl ipam = new IPAMImpl();
		return ipam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPAMOption createIPAMOption() {
		IPAMOptionImpl ipamOption = new IPAMOptionImpl();
		return ipamOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeConnector createVolumeConnector() {
		VolumeConnectorImpl volumeConnector = new VolumeConnectorImpl();
		return volumeConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigConnector createConfigConnector() {
		ConfigConnectorImpl configConnector = new ConfigConnectorImpl();
		return configConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecretConnector createSecretConnector() {
		SecretConnectorImpl secretConnector = new SecretConnectorImpl();
		return secretConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkConnector createNetworkConnector() {
		NetworkConnectorImpl networkConnector = new NetworkConnectorImpl();
		return networkConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkAddress createNetworkAddress() {
		NetworkAddressImpl networkAddress = new NetworkAddressImpl();
		return networkAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPAMAddress createIPAMAddress() {
		IPAMAddressImpl ipamAddress = new IPAMAddressImpl();
		return ipamAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPAMConfig createIPAMConfig() {
		IPAMConfigImpl ipamConfig = new IPAMConfigImpl();
		return ipamConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartPolicy createRestartPolicyFromString(EDataType eDataType, String initialValue) {
		RestartPolicy result = RestartPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestartPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode createAccessModeFromString(EDataType eDataType, String initialValue) {
		AccessMode result = AccessMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountType createMountTypeFromString(EDataType eDataType, String initialValue) {
		MountType result = MountType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMountTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagationType createPropagationTypeFromString(EDataType eDataType, String initialValue) {
		PropagationType result = PropagationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropagationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createConditionFromString(EDataType eDataType, String initialValue) {
		Condition result = Condition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockercomposePackage getDockercomposePackage() {
		return (DockercomposePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockercomposePackage getPackage() {
		return DockercomposePackage.eINSTANCE;
	}

} //DockercomposeFactoryImpl
