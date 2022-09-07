/**
 */
package dockercompose.util;

import dockercompose.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dockercompose.DockercomposePackage
 * @generated
 */
public class DockercomposeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DockercomposeValidator INSTANCE = new DockercomposeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dockercompose";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No self links' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__NO_SELF_LINKS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Image or build' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__IMAGE_OR_BUILD = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different volumes' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__DIFFERENT_VOLUMES = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different links' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__DIFFERENT_LINKS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different networks' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__DIFFERENT_NETWORKS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different dependencies' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__DIFFERENT_DEPENDENCIES = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different environment variables' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__DIFFERENT_ENVIRONMENT_VARIABLES = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No self dependencies' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__NO_SELF_DEPENDENCIES = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different secrets' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__DIFFERENT_SECRETS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different labels' of 'Network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORK__DIFFERENT_LABELS = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different driver opts' of 'Network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORK__DIFFERENT_DRIVER_OPTS = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different labels' of 'Volume'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLUME__DIFFERENT_LABELS = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different driver opts' of 'Volume'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLUME__DIFFERENT_DRIVER_OPTS = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different configs' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__DIFFERENT_CONFIGS = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'File or external' of 'Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIG__FILE_OR_EXTERNAL = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'External name' of 'Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIG__EXTERNAL_NAME = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'File or external' of 'Secret'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECRET__FILE_OR_EXTERNAL = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'External name' of 'Secret'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECRET__EXTERNAL_NAME = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Correct Ip Format' of 'DNS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DNS__CORRECT_IP_FORMAT = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Any property' of 'IPAM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IPAM__ANY_PROPERTY = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different options' of 'IPAM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IPAM__DIFFERENT_OPTIONS = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different aliases' of 'Network Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORK_CONNECTOR__DIFFERENT_ALIASES = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Any property' of 'IPAM Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IPAM_CONFIG__ANY_PROPERTY = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different addresses' of 'IPAM Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IPAM_CONFIG__DIFFERENT_ADDRESSES = 24;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 24;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockercomposeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DockercomposePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DockercomposePackage.DOCKER_COMPOSE:
				return validateDockerCompose((DockerCompose)value, diagnostics, context);
			case DockercomposePackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case DockercomposePackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case DockercomposePackage.VOLUME:
				return validateVolume((Volume)value, diagnostics, context);
			case DockercomposePackage.CONFIG:
				return validateConfig((Config)value, diagnostics, context);
			case DockercomposePackage.SECRET:
				return validateSecret((Secret)value, diagnostics, context);
			case DockercomposePackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case DockercomposePackage.DNS:
				return validateDNS((DNS)value, diagnostics, context);
			case DockercomposePackage.VOLUME_DRIVER_OPT:
				return validateVolumeDriverOpt((VolumeDriverOpt)value, diagnostics, context);
			case DockercomposePackage.VOLUME_LABEL:
				return validateVolumeLabel((VolumeLabel)value, diagnostics, context);
			case DockercomposePackage.NETWORK_LABEL:
				return validateNetworkLabel((NetworkLabel)value, diagnostics, context);
			case DockercomposePackage.NETWORK_DRIVER_OPT:
				return validateNetworkDriverOpt((NetworkDriverOpt)value, diagnostics, context);
			case DockercomposePackage.IPAM:
				return validateIPAM((IPAM)value, diagnostics, context);
			case DockercomposePackage.IPAM_OPTION:
				return validateIPAMOption((IPAMOption)value, diagnostics, context);
			case DockercomposePackage.VOLUME_CONNECTOR:
				return validateVolumeConnector((VolumeConnector)value, diagnostics, context);
			case DockercomposePackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case DockercomposePackage.CONFIG_CONNECTOR:
				return validateConfigConnector((ConfigConnector)value, diagnostics, context);
			case DockercomposePackage.SECRET_CONNECTOR:
				return validateSecretConnector((SecretConnector)value, diagnostics, context);
			case DockercomposePackage.NETWORK_CONNECTOR:
				return validateNetworkConnector((NetworkConnector)value, diagnostics, context);
			case DockercomposePackage.NETWORK_ADDRESS:
				return validateNetworkAddress((NetworkAddress)value, diagnostics, context);
			case DockercomposePackage.ALIAS:
				return validateAlias((Alias)value, diagnostics, context);
			case DockercomposePackage.IPAM_ADDRESS:
				return validateIPAMAddress((IPAMAddress)value, diagnostics, context);
			case DockercomposePackage.IPAM_CONFIG:
				return validateIPAMConfig((IPAMConfig)value, diagnostics, context);
			case DockercomposePackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case DockercomposePackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case DockercomposePackage.ENVIRONMENT_VARIABLE:
				return validateEnvironmentVariable((EnvironmentVariable)value, diagnostics, context);
			case DockercomposePackage.RESTART_POLICY:
				return validateRestartPolicy((RestartPolicy)value, diagnostics, context);
			case DockercomposePackage.ACCESS_MODE:
				return validateAccessMode((AccessMode)value, diagnostics, context);
			case DockercomposePackage.MOUNT_TYPE:
				return validateMountType((MountType)value, diagnostics, context);
			case DockercomposePackage.PROPAGATION_TYPE:
				return validatePropagationType((PropagationType)value, diagnostics, context);
			case DockercomposePackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDockerCompose(DockerCompose dockerCompose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dockerCompose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_different_secrets(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_no_self_links(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_image_or_build(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_different_configs(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_different_volumes(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_different_networks(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_different_links(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_different_dependencies(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_different_environment_variables(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_no_self_dependencies(service, diagnostics, context);
		return result;
	}

	/**
	 * Validates the no_self_dependencies constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_no_self_dependencies(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.no_self_dependencies(diagnostics, context);
	}

	/**
	 * Validates the different_secrets constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_different_secrets(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.different_secrets(diagnostics, context);
	}

	/**
	 * Validates the no_self_links constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_no_self_links(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.no_self_links(diagnostics, context);
	}

	/**
	 * Validates the different_configs constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_different_configs(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.different_configs(diagnostics, context);
	}

	/**
	 * Validates the image_or_build constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_image_or_build(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.image_or_build(diagnostics, context);
	}

	/**
	 * Validates the different_volumes constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_different_volumes(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.different_volumes(diagnostics, context);
	}

	/**
	 * Validates the different_links constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_different_links(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.different_links(diagnostics, context);
	}

	/**
	 * Validates the different_networks constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_different_networks(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.different_networks(diagnostics, context);
	}

	/**
	 * Validates the different_dependencies constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_different_dependencies(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.different_dependencies(diagnostics, context);
	}

	/**
	 * Validates the different_environment_variables constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_different_environment_variables(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return service.different_environment_variables(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_different_driver_opts(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_different_labels(network, diagnostics, context);
		return result;
	}

	/**
	 * Validates the different_driver_opts constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_different_driver_opts(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return network.different_driver_opts(diagnostics, context);
	}

	/**
	 * Validates the different_labels constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_different_labels(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return network.different_labels(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolume(Volume volume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(volume, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validateVolume_different_driver_opts(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validateVolume_different_labels(volume, diagnostics, context);
		return result;
	}

	/**
	 * Validates the different_driver_opts constraint of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolume_different_driver_opts(Volume volume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return volume.different_driver_opts(diagnostics, context);
	}

	/**
	 * Validates the different_labels constraint of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolume_different_labels(Volume volume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return volume.different_labels(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfig(Config config, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(config, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(config, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(config, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(config, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(config, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(config, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(config, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(config, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(config, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfig_external_name(config, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfig_file_or_external(config, diagnostics, context);
		return result;
	}

	/**
	 * Validates the external_name constraint of '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfig_external_name(Config config, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return config.external_name(diagnostics, context);
	}

	/**
	 * Validates the file_or_external constraint of '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfig_file_or_external(Config config, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return config.file_or_external(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecret(Secret secret, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(secret, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecret_external_name(secret, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecret_file_or_external(secret, diagnostics, context);
		return result;
	}

	/**
	 * Validates the external_name constraint of '<em>Secret</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecret_external_name(Secret secret, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return secret.external_name(diagnostics, context);
	}

	/**
	 * Validates the file_or_external constraint of '<em>Secret</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecret_file_or_external(Secret secret, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return secret.file_or_external(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDNS(DNS dns, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dns, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dns, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dns, diagnostics, context);
		if (result || diagnostics != null) result &= validateDNS_correctIpFormat(dns, diagnostics, context);
		return result;
	}

	/**
	 * Validates the correctIpFormat constraint of '<em>DNS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDNS_correctIpFormat(DNS dns, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dns.correctIpFormat(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeDriverOpt(VolumeDriverOpt volumeDriverOpt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(volumeDriverOpt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeLabel(VolumeLabel volumeLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(volumeLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkLabel(NetworkLabel networkLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkDriverOpt(NetworkDriverOpt networkDriverOpt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkDriverOpt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAM(IPAM ipam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ipam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validateIPAM_different_options(ipam, diagnostics, context);
		if (result || diagnostics != null) result &= validateIPAM_any_property(ipam, diagnostics, context);
		return result;
	}

	/**
	 * Validates the different_options constraint of '<em>IPAM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAM_different_options(IPAM ipam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ipam.different_options(diagnostics, context);
	}

	/**
	 * Validates the any_property constraint of '<em>IPAM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAM_any_property(IPAM ipam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ipam.any_property(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAMOption(IPAMOption ipamOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipamOption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeConnector(VolumeConnector volumeConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(volumeConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigConnector(ConfigConnector configConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecretConnector(SecretConnector secretConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secretConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkConnector(NetworkConnector networkConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkConnector_different_aliases(networkConnector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the different_aliases constraint of '<em>Network Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkConnector_different_aliases(NetworkConnector networkConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkConnector.different_aliases(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkAddress(NetworkAddress networkAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkAddress, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkAddress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkAddress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkAddress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkAddress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkAddress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkAddress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkAddress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkAddress, diagnostics, context);
		if (result || diagnostics != null) result &= validateDNS_correctIpFormat(networkAddress, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlias(Alias alias, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alias, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAMAddress(IPAMAddress ipamAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipamAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAMConfig(IPAMConfig ipamConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ipamConfig, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validateIPAMConfig_different_addresses(ipamConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validateIPAMConfig_any_property(ipamConfig, diagnostics, context);
		return result;
	}

	/**
	 * Validates the different_addresses constraint of '<em>IPAM Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAMConfig_different_addresses(IPAMConfig ipamConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ipamConfig.different_addresses(diagnostics, context);
	}

	/**
	 * Validates the any_property constraint of '<em>IPAM Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAMConfig_any_property(IPAMConfig ipamConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ipamConfig.any_property(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentVariable(EnvironmentVariable environmentVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestartPolicy(RestartPolicy restartPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessMode(AccessMode accessMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMountType(MountType mountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropagationType(PropagationType propagationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DockercomposeValidator
