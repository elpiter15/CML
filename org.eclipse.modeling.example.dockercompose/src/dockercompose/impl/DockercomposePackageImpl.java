/**
 */
package dockercompose.impl;

import dockercompose.AccessMode;
import dockercompose.Alias;
import dockercompose.Condition;
import dockercompose.Config;
import dockercompose.ConfigConnector;
import dockercompose.Dependency;
import dockercompose.Device;
import dockercompose.DockerCompose;
import dockercompose.DockercomposeFactory;
import dockercompose.DockercomposePackage;
import dockercompose.EnvironmentVariable;
import dockercompose.IPAMAddress;
import dockercompose.IPAMConfig;
import dockercompose.IPAMOption;
import dockercompose.Link;
import dockercompose.MountType;
import dockercompose.Network;
import dockercompose.NetworkAddress;
import dockercompose.NetworkConnector;
import dockercompose.NetworkDriverOpt;
import dockercompose.NetworkLabel;
import dockercompose.Port;
import dockercompose.PropagationType;
import dockercompose.RestartPolicy;
import dockercompose.Secret;
import dockercompose.SecretConnector;
import dockercompose.Service;
import dockercompose.Volume;
import dockercompose.VolumeConnector;
import dockercompose.VolumeDriverOpt;
import dockercompose.VolumeLabel;

import dockercompose.util.DockercomposeValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockercomposePackageImpl extends EPackageImpl implements DockercomposePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerComposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeDriverOptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDriverOptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipamOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipamAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipamConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restartPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mountTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propagationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dockercompose.DockercomposePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockercomposePackageImpl() {
		super(eNS_URI, DockercomposeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DockercomposePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockercomposePackage init() {
		if (isInited) return (DockercomposePackage)EPackage.Registry.INSTANCE.getEPackage(DockercomposePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDockercomposePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DockercomposePackageImpl theDockercomposePackage = registeredDockercomposePackage instanceof DockercomposePackageImpl ? (DockercomposePackageImpl)registeredDockercomposePackage : new DockercomposePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDockercomposePackage.createPackageContents();

		// Initialize created meta-data
		theDockercomposePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDockercomposePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DockercomposeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDockercomposePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockercomposePackage.eNS_URI, theDockercomposePackage);
		return theDockercomposePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDockerCompose() {
		return dockerComposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerCompose_Version() {
		return (EAttribute)dockerComposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerCompose_Services() {
		return (EReference)dockerComposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerCompose_Networks() {
		return (EReference)dockerComposeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerCompose_Volumes() {
		return (EReference)dockerComposeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerCompose_Configs() {
		return (EReference)dockerComposeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerCompose_Secrets() {
		return (EReference)dockerComposeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Build() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Cpu_count() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Command() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Container_name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Devices() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Dns() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Image() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Init() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Links() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Environment() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__No_self_links__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Read_only() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Restart() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Depends_on() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Volumes() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Configs() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Secrets() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Networks() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Ports() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__Image_or_build__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__Different_volumes__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__Different_links__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__Different_networks__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__Different_dependencies__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__Different_environment_variables__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__No_self_dependencies__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__Different_secrets__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getService__Different_configs__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Name() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Attachable() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Enable_ipv6() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Internal() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_External() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Network_name() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Labels() {
		return (EReference)networkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Driver_opts() {
		return (EReference)networkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Driver() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Ipam() {
		return (EReference)networkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNetwork__Different_labels__DiagnosticChain_Map() {
		return networkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNetwork__Different_driver_opts__DiagnosticChain_Map() {
		return networkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Driver() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_External() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Volume_name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolume_Driver_opts() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolume_Labels() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVolume__Different_labels__DiagnosticChain_Map() {
		return volumeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVolume__Different_driver_opts__DiagnosticChain_Map() {
		return volumeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_Name() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_File() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_External() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_Config_name() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfig__File_or_external__DiagnosticChain_Map() {
		return configEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfig__External_name__DiagnosticChain_Map() {
		return configEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecret() {
		return secretEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Name() {
		return (EAttribute)secretEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_File() {
		return (EAttribute)secretEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Environment() {
		return (EAttribute)secretEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_External() {
		return (EAttribute)secretEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Secret_name() {
		return (EAttribute)secretEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSecret__File_or_external__DiagnosticChain_Map() {
		return secretEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSecret__External_name__DiagnosticChain_Map() {
		return secretEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Value() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDNS() {
		return dnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNS_Dns1() {
		return (EAttribute)dnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNS_Dns2() {
		return (EAttribute)dnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNS_Dns3() {
		return (EAttribute)dnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNS_Dns4() {
		return (EAttribute)dnsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDNS__CorrectIpFormat__DiagnosticChain_Map() {
		return dnsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolumeDriverOpt() {
		return volumeDriverOptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeDriverOpt_Name() {
		return (EAttribute)volumeDriverOptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeDriverOpt_Value() {
		return (EAttribute)volumeDriverOptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolumeLabel() {
		return volumeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeLabel_Name() {
		return (EAttribute)volumeLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeLabel_Value() {
		return (EAttribute)volumeLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkLabel() {
		return networkLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLabel_Name() {
		return (EAttribute)networkLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLabel_Value() {
		return (EAttribute)networkLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkDriverOpt() {
		return networkDriverOptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkDriverOpt_Name() {
		return (EAttribute)networkDriverOptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkDriverOpt_Value() {
		return (EAttribute)networkDriverOptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIPAM() {
		return ipamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIPAM_Driver() {
		return (EAttribute)ipamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIPAM_Options() {
		return (EReference)ipamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIPAM_Configs() {
		return (EReference)ipamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIPAM__Any_property__DiagnosticChain_Map() {
		return ipamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIPAM__Different_options__DiagnosticChain_Map() {
		return ipamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIPAMOption() {
		return ipamOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIPAMOption_Name() {
		return (EAttribute)ipamOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIPAMOption_Value() {
		return (EAttribute)ipamOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolumeConnector() {
		return volumeConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolumeConnector_Volume() {
		return (EReference)volumeConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeConnector_Container_path() {
		return (EAttribute)volumeConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeConnector_Access_mode() {
		return (EAttribute)volumeConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeConnector_Type() {
		return (EAttribute)volumeConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeConnector_Read_only() {
		return (EAttribute)volumeConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeConnector_Nocopy() {
		return (EAttribute)volumeConnectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeConnector_Size() {
		return (EAttribute)volumeConnectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeConnector_Propagation() {
		return (EAttribute)volumeConnectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Service() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_Condition() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigConnector() {
		return configConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigConnector_Config() {
		return (EReference)configConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigConnector_Target() {
		return (EAttribute)configConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigConnector_Uid() {
		return (EAttribute)configConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigConnector_Gid() {
		return (EAttribute)configConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigConnector_Mode() {
		return (EAttribute)configConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecretConnector() {
		return secretConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecretConnector_Secret() {
		return (EReference)secretConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretConnector_Target() {
		return (EAttribute)secretConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretConnector_Uid() {
		return (EAttribute)secretConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretConnector_Gid() {
		return (EAttribute)secretConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretConnector_Mode() {
		return (EAttribute)secretConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkConnector() {
		return networkConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkConnector_Network() {
		return (EReference)networkConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkConnector_Priority() {
		return (EAttribute)networkConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkConnector_Ipv4_address() {
		return (EReference)networkConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkConnector_Link_local_ips() {
		return (EReference)networkConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkConnector_Aliases() {
		return (EReference)networkConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNetworkConnector__Different_aliases__DiagnosticChain_Map() {
		return networkConnectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkAddress() {
		return networkAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkAddress_NetId() {
		return (EAttribute)networkAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlias() {
		return aliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlias_Alias() {
		return (EAttribute)aliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIPAMAddress() {
		return ipamAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIPAMAddress_Name() {
		return (EAttribute)ipamAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIPAMAddress_Dns() {
		return (EReference)ipamAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIPAMConfig() {
		return ipamConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIPAMConfig_Gateway() {
		return (EReference)ipamConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIPAMConfig_Subnet() {
		return (EReference)ipamConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIPAMConfig_Ip_range() {
		return (EReference)ipamConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIPAMConfig_Aux_addresses() {
		return (EReference)ipamConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIPAMConfig__Any_property__DiagnosticChain_Map() {
		return ipamConfigEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIPAMConfig__Different_addresses__DiagnosticChain_Map() {
		return ipamConfigEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Value() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Service() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Alias() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentVariable() {
		return environmentVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentVariable_Name() {
		return (EAttribute)environmentVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentVariable_Value() {
		return (EAttribute)environmentVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRestartPolicy() {
		return restartPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessMode() {
		return accessModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMountType() {
		return mountTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropagationType() {
		return propagationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCondition() {
		return conditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockercomposeFactory getDockercomposeFactory() {
		return (DockercomposeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dockerComposeEClass = createEClass(DOCKER_COMPOSE);
		createEAttribute(dockerComposeEClass, DOCKER_COMPOSE__VERSION);
		createEReference(dockerComposeEClass, DOCKER_COMPOSE__SERVICES);
		createEReference(dockerComposeEClass, DOCKER_COMPOSE__NETWORKS);
		createEReference(dockerComposeEClass, DOCKER_COMPOSE__VOLUMES);
		createEReference(dockerComposeEClass, DOCKER_COMPOSE__CONFIGS);
		createEReference(dockerComposeEClass, DOCKER_COMPOSE__SECRETS);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEAttribute(serviceEClass, SERVICE__BUILD);
		createEAttribute(serviceEClass, SERVICE__CPU_COUNT);
		createEAttribute(serviceEClass, SERVICE__COMMAND);
		createEAttribute(serviceEClass, SERVICE__CONTAINER_NAME);
		createEReference(serviceEClass, SERVICE__DEVICES);
		createEReference(serviceEClass, SERVICE__DNS);
		createEAttribute(serviceEClass, SERVICE__IMAGE);
		createEAttribute(serviceEClass, SERVICE__INIT);
		createEAttribute(serviceEClass, SERVICE__READ_ONLY);
		createEAttribute(serviceEClass, SERVICE__RESTART);
		createEReference(serviceEClass, SERVICE__DEPENDS_ON);
		createEReference(serviceEClass, SERVICE__VOLUMES);
		createEReference(serviceEClass, SERVICE__CONFIGS);
		createEReference(serviceEClass, SERVICE__SECRETS);
		createEReference(serviceEClass, SERVICE__NETWORKS);
		createEReference(serviceEClass, SERVICE__PORTS);
		createEReference(serviceEClass, SERVICE__LINKS);
		createEReference(serviceEClass, SERVICE__ENVIRONMENT);
		createEOperation(serviceEClass, SERVICE___NO_SELF_LINKS__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___IMAGE_OR_BUILD__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___DIFFERENT_CONFIGS__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___DIFFERENT_VOLUMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___DIFFERENT_NETWORKS__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___DIFFERENT_LINKS__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___DIFFERENT_DEPENDENCIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___DIFFERENT_ENVIRONMENT_VARIABLES__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___NO_SELF_DEPENDENCIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___DIFFERENT_SECRETS__DIAGNOSTICCHAIN_MAP);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEAttribute(networkEClass, NETWORK__ATTACHABLE);
		createEAttribute(networkEClass, NETWORK__ENABLE_IPV6);
		createEAttribute(networkEClass, NETWORK__INTERNAL);
		createEAttribute(networkEClass, NETWORK__EXTERNAL);
		createEAttribute(networkEClass, NETWORK__NETWORK_NAME);
		createEReference(networkEClass, NETWORK__LABELS);
		createEReference(networkEClass, NETWORK__DRIVER_OPTS);
		createEAttribute(networkEClass, NETWORK__DRIVER);
		createEReference(networkEClass, NETWORK__IPAM);
		createEOperation(networkEClass, NETWORK___DIFFERENT_LABELS__DIAGNOSTICCHAIN_MAP);
		createEOperation(networkEClass, NETWORK___DIFFERENT_DRIVER_OPTS__DIAGNOSTICCHAIN_MAP);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__NAME);
		createEAttribute(volumeEClass, VOLUME__DRIVER);
		createEAttribute(volumeEClass, VOLUME__EXTERNAL);
		createEAttribute(volumeEClass, VOLUME__VOLUME_NAME);
		createEReference(volumeEClass, VOLUME__DRIVER_OPTS);
		createEReference(volumeEClass, VOLUME__LABELS);
		createEOperation(volumeEClass, VOLUME___DIFFERENT_LABELS__DIAGNOSTICCHAIN_MAP);
		createEOperation(volumeEClass, VOLUME___DIFFERENT_DRIVER_OPTS__DIAGNOSTICCHAIN_MAP);

		configEClass = createEClass(CONFIG);
		createEAttribute(configEClass, CONFIG__NAME);
		createEAttribute(configEClass, CONFIG__FILE);
		createEAttribute(configEClass, CONFIG__EXTERNAL);
		createEAttribute(configEClass, CONFIG__CONFIG_NAME);
		createEOperation(configEClass, CONFIG___FILE_OR_EXTERNAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(configEClass, CONFIG___EXTERNAL_NAME__DIAGNOSTICCHAIN_MAP);

		secretEClass = createEClass(SECRET);
		createEAttribute(secretEClass, SECRET__NAME);
		createEAttribute(secretEClass, SECRET__FILE);
		createEAttribute(secretEClass, SECRET__ENVIRONMENT);
		createEAttribute(secretEClass, SECRET__EXTERNAL);
		createEAttribute(secretEClass, SECRET__SECRET_NAME);
		createEOperation(secretEClass, SECRET___FILE_OR_EXTERNAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(secretEClass, SECRET___EXTERNAL_NAME__DIAGNOSTICCHAIN_MAP);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__VALUE);

		dnsEClass = createEClass(DNS);
		createEAttribute(dnsEClass, DNS__DNS1);
		createEAttribute(dnsEClass, DNS__DNS2);
		createEAttribute(dnsEClass, DNS__DNS3);
		createEAttribute(dnsEClass, DNS__DNS4);
		createEOperation(dnsEClass, DNS___CORRECT_IP_FORMAT__DIAGNOSTICCHAIN_MAP);

		volumeDriverOptEClass = createEClass(VOLUME_DRIVER_OPT);
		createEAttribute(volumeDriverOptEClass, VOLUME_DRIVER_OPT__NAME);
		createEAttribute(volumeDriverOptEClass, VOLUME_DRIVER_OPT__VALUE);

		volumeLabelEClass = createEClass(VOLUME_LABEL);
		createEAttribute(volumeLabelEClass, VOLUME_LABEL__NAME);
		createEAttribute(volumeLabelEClass, VOLUME_LABEL__VALUE);

		networkLabelEClass = createEClass(NETWORK_LABEL);
		createEAttribute(networkLabelEClass, NETWORK_LABEL__NAME);
		createEAttribute(networkLabelEClass, NETWORK_LABEL__VALUE);

		networkDriverOptEClass = createEClass(NETWORK_DRIVER_OPT);
		createEAttribute(networkDriverOptEClass, NETWORK_DRIVER_OPT__NAME);
		createEAttribute(networkDriverOptEClass, NETWORK_DRIVER_OPT__VALUE);

		ipamEClass = createEClass(IPAM);
		createEAttribute(ipamEClass, IPAM__DRIVER);
		createEReference(ipamEClass, IPAM__OPTIONS);
		createEReference(ipamEClass, IPAM__CONFIGS);
		createEOperation(ipamEClass, IPAM___ANY_PROPERTY__DIAGNOSTICCHAIN_MAP);
		createEOperation(ipamEClass, IPAM___DIFFERENT_OPTIONS__DIAGNOSTICCHAIN_MAP);

		ipamOptionEClass = createEClass(IPAM_OPTION);
		createEAttribute(ipamOptionEClass, IPAM_OPTION__NAME);
		createEAttribute(ipamOptionEClass, IPAM_OPTION__VALUE);

		volumeConnectorEClass = createEClass(VOLUME_CONNECTOR);
		createEReference(volumeConnectorEClass, VOLUME_CONNECTOR__VOLUME);
		createEAttribute(volumeConnectorEClass, VOLUME_CONNECTOR__CONTAINER_PATH);
		createEAttribute(volumeConnectorEClass, VOLUME_CONNECTOR__ACCESS_MODE);
		createEAttribute(volumeConnectorEClass, VOLUME_CONNECTOR__TYPE);
		createEAttribute(volumeConnectorEClass, VOLUME_CONNECTOR__READ_ONLY);
		createEAttribute(volumeConnectorEClass, VOLUME_CONNECTOR__NOCOPY);
		createEAttribute(volumeConnectorEClass, VOLUME_CONNECTOR__SIZE);
		createEAttribute(volumeConnectorEClass, VOLUME_CONNECTOR__PROPAGATION);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__SERVICE);
		createEAttribute(dependencyEClass, DEPENDENCY__CONDITION);

		configConnectorEClass = createEClass(CONFIG_CONNECTOR);
		createEReference(configConnectorEClass, CONFIG_CONNECTOR__CONFIG);
		createEAttribute(configConnectorEClass, CONFIG_CONNECTOR__TARGET);
		createEAttribute(configConnectorEClass, CONFIG_CONNECTOR__UID);
		createEAttribute(configConnectorEClass, CONFIG_CONNECTOR__GID);
		createEAttribute(configConnectorEClass, CONFIG_CONNECTOR__MODE);

		secretConnectorEClass = createEClass(SECRET_CONNECTOR);
		createEReference(secretConnectorEClass, SECRET_CONNECTOR__SECRET);
		createEAttribute(secretConnectorEClass, SECRET_CONNECTOR__TARGET);
		createEAttribute(secretConnectorEClass, SECRET_CONNECTOR__UID);
		createEAttribute(secretConnectorEClass, SECRET_CONNECTOR__GID);
		createEAttribute(secretConnectorEClass, SECRET_CONNECTOR__MODE);

		networkConnectorEClass = createEClass(NETWORK_CONNECTOR);
		createEReference(networkConnectorEClass, NETWORK_CONNECTOR__NETWORK);
		createEAttribute(networkConnectorEClass, NETWORK_CONNECTOR__PRIORITY);
		createEReference(networkConnectorEClass, NETWORK_CONNECTOR__IPV4_ADDRESS);
		createEReference(networkConnectorEClass, NETWORK_CONNECTOR__LINK_LOCAL_IPS);
		createEReference(networkConnectorEClass, NETWORK_CONNECTOR__ALIASES);
		createEOperation(networkConnectorEClass, NETWORK_CONNECTOR___DIFFERENT_ALIASES__DIAGNOSTICCHAIN_MAP);

		networkAddressEClass = createEClass(NETWORK_ADDRESS);
		createEAttribute(networkAddressEClass, NETWORK_ADDRESS__NET_ID);

		aliasEClass = createEClass(ALIAS);
		createEAttribute(aliasEClass, ALIAS__ALIAS);

		ipamAddressEClass = createEClass(IPAM_ADDRESS);
		createEAttribute(ipamAddressEClass, IPAM_ADDRESS__NAME);
		createEReference(ipamAddressEClass, IPAM_ADDRESS__DNS);

		ipamConfigEClass = createEClass(IPAM_CONFIG);
		createEReference(ipamConfigEClass, IPAM_CONFIG__GATEWAY);
		createEReference(ipamConfigEClass, IPAM_CONFIG__SUBNET);
		createEReference(ipamConfigEClass, IPAM_CONFIG__IP_RANGE);
		createEReference(ipamConfigEClass, IPAM_CONFIG__AUX_ADDRESSES);
		createEOperation(ipamConfigEClass, IPAM_CONFIG___ANY_PROPERTY__DIAGNOSTICCHAIN_MAP);
		createEOperation(ipamConfigEClass, IPAM_CONFIG___DIFFERENT_ADDRESSES__DIAGNOSTICCHAIN_MAP);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__VALUE);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__SERVICE);
		createEAttribute(linkEClass, LINK__ALIAS);

		environmentVariableEClass = createEClass(ENVIRONMENT_VARIABLE);
		createEAttribute(environmentVariableEClass, ENVIRONMENT_VARIABLE__NAME);
		createEAttribute(environmentVariableEClass, ENVIRONMENT_VARIABLE__VALUE);

		// Create enums
		restartPolicyEEnum = createEEnum(RESTART_POLICY);
		accessModeEEnum = createEEnum(ACCESS_MODE);
		mountTypeEEnum = createEEnum(MOUNT_TYPE);
		propagationTypeEEnum = createEEnum(PROPAGATION_TYPE);
		conditionEEnum = createEEnum(CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		networkAddressEClass.getESuperTypes().add(this.getDNS());

		// Initialize classes, features, and operations; add parameters
		initEClass(dockerComposeEClass, DockerCompose.class, "DockerCompose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerCompose_Version(), ecorePackage.getEString(), "version", null, 0, 1, DockerCompose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerCompose_Services(), this.getService(), null, "services", null, 1, -1, DockerCompose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerCompose_Networks(), this.getNetwork(), null, "networks", null, 0, -1, DockerCompose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerCompose_Volumes(), this.getVolume(), null, "volumes", null, 0, -1, DockerCompose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerCompose_Configs(), this.getConfig(), null, "configs", null, 0, -1, DockerCompose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerCompose_Secrets(), this.getSecret(), null, "secrets", null, 0, -1, DockerCompose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Build(), ecorePackage.getEString(), "build", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Cpu_count(), ecorePackage.getEInt(), "cpu_count", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Command(), ecorePackage.getEString(), "command", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Container_name(), ecorePackage.getEString(), "container_name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Devices(), this.getDevice(), null, "devices", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Dns(), this.getDNS(), null, "dns", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Image(), ecorePackage.getEString(), "image", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Init(), ecorePackage.getEBoolean(), "init", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Read_only(), ecorePackage.getEBoolean(), "read_only", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Restart(), this.getRestartPolicy(), "restart", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Depends_on(), this.getDependency(), null, "depends_on", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Volumes(), this.getVolumeConnector(), null, "volumes", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Configs(), this.getConfigConnector(), null, "configs", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Secrets(), this.getSecretConnector(), null, "secrets", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Networks(), this.getNetworkConnector(), null, "networks", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Ports(), this.getPort(), null, "ports", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Links(), this.getLink(), null, "links", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Environment(), this.getEnvironmentVariable(), null, "environment", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getService__No_self_links__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_self_links", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Image_or_build__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "image_or_build", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Different_configs__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_configs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Different_volumes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_volumes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Different_networks__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_networks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Different_links__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_links", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Different_dependencies__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_dependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Different_environment_variables__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_environment_variables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__No_self_dependencies__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_self_dependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Different_secrets__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_secrets", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Name(), ecorePackage.getEString(), "name", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Attachable(), ecorePackage.getEBoolean(), "attachable", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Enable_ipv6(), ecorePackage.getEBoolean(), "enable_ipv6", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Internal(), ecorePackage.getEBoolean(), "internal", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_External(), ecorePackage.getEBoolean(), "external", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Network_name(), ecorePackage.getEString(), "network_name", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Labels(), this.getNetworkLabel(), null, "labels", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Driver_opts(), this.getNetworkDriverOpt(), null, "driver_opts", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Driver(), ecorePackage.getEString(), "driver", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Ipam(), this.getIPAM(), null, "ipam", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNetwork__Different_labels__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_labels", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNetwork__Different_driver_opts__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_driver_opts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Name(), ecorePackage.getEString(), "name", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Driver(), ecorePackage.getEString(), "driver", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_External(), ecorePackage.getEBoolean(), "external", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Volume_name(), ecorePackage.getEString(), "volume_name", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolume_Driver_opts(), this.getVolumeDriverOpt(), null, "driver_opts", null, 0, -1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolume_Labels(), this.getVolumeLabel(), null, "labels", null, 0, -1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVolume__Different_labels__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_labels", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVolume__Different_driver_opts__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_driver_opts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfig_Name(), ecorePackage.getEString(), "name", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_File(), ecorePackage.getEString(), "file", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_External(), ecorePackage.getEBoolean(), "external", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Config_name(), ecorePackage.getEString(), "config_name", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getConfig__File_or_external__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "file_or_external", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConfig__External_name__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "external_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(secretEClass, Secret.class, "Secret", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecret_Name(), ecorePackage.getEString(), "name", null, 1, 1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecret_File(), ecorePackage.getEString(), "file", null, 0, 1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecret_Environment(), ecorePackage.getEString(), "environment", null, 0, 1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecret_External(), ecorePackage.getEBoolean(), "external", null, 1, 1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecret_Secret_name(), ecorePackage.getEString(), "secret_name", null, 0, 1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSecret__File_or_external__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "file_or_external", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSecret__External_name__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "external_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Value(), ecorePackage.getEString(), "value", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dnsEClass, dockercompose.DNS.class, "DNS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDNS_Dns1(), ecorePackage.getEInt(), "dns1", null, 1, 1, dockercompose.DNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNS_Dns2(), ecorePackage.getEInt(), "dns2", null, 1, 1, dockercompose.DNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNS_Dns3(), ecorePackage.getEInt(), "dns3", null, 1, 1, dockercompose.DNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNS_Dns4(), ecorePackage.getEInt(), "dns4", null, 1, 1, dockercompose.DNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDNS__CorrectIpFormat__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "correctIpFormat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(volumeDriverOptEClass, VolumeDriverOpt.class, "VolumeDriverOpt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumeDriverOpt_Name(), ecorePackage.getEString(), "name", null, 1, 1, VolumeDriverOpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeDriverOpt_Value(), ecorePackage.getEString(), "value", null, 1, 1, VolumeDriverOpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeLabelEClass, VolumeLabel.class, "VolumeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumeLabel_Name(), ecorePackage.getEString(), "name", null, 1, 1, VolumeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeLabel_Value(), ecorePackage.getEString(), "value", null, 1, 1, VolumeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLabelEClass, NetworkLabel.class, "NetworkLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkLabel_Name(), ecorePackage.getEString(), "name", null, 1, 1, NetworkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLabel_Value(), ecorePackage.getEString(), "value", null, 1, 1, NetworkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkDriverOptEClass, NetworkDriverOpt.class, "NetworkDriverOpt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkDriverOpt_Name(), ecorePackage.getEString(), "name", null, 1, 1, NetworkDriverOpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkDriverOpt_Value(), ecorePackage.getEString(), "value", null, 1, 1, NetworkDriverOpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipamEClass, dockercompose.IPAM.class, "IPAM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIPAM_Driver(), ecorePackage.getEString(), "driver", null, 0, 1, dockercompose.IPAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPAM_Options(), this.getIPAMOption(), null, "options", null, 0, -1, dockercompose.IPAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPAM_Configs(), this.getIPAMConfig(), null, "configs", null, 0, -1, dockercompose.IPAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIPAM__Any_property__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "any_property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIPAM__Different_options__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_options", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ipamOptionEClass, IPAMOption.class, "IPAMOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIPAMOption_Name(), ecorePackage.getEString(), "name", null, 1, 1, IPAMOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIPAMOption_Value(), ecorePackage.getEString(), "value", null, 1, 1, IPAMOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeConnectorEClass, VolumeConnector.class, "VolumeConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVolumeConnector_Volume(), this.getVolume(), null, "volume", null, 1, 1, VolumeConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeConnector_Container_path(), ecorePackage.getEString(), "container_path", ".", 1, 1, VolumeConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeConnector_Access_mode(), this.getAccessMode(), "access_mode", null, 0, 1, VolumeConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeConnector_Type(), this.getMountType(), "type", null, 0, 1, VolumeConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeConnector_Read_only(), ecorePackage.getEBoolean(), "read_only", null, 1, 1, VolumeConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeConnector_Nocopy(), ecorePackage.getEBoolean(), "nocopy", null, 1, 1, VolumeConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeConnector_Size(), ecorePackage.getEInt(), "size", null, 1, 1, VolumeConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeConnector_Propagation(), this.getPropagationType(), "propagation", null, 0, 1, VolumeConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Service(), this.getService(), null, "service", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Condition(), this.getCondition(), "condition", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configConnectorEClass, ConfigConnector.class, "ConfigConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigConnector_Config(), this.getConfig(), null, "config", null, 1, 1, ConfigConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigConnector_Target(), ecorePackage.getEString(), "target", null, 0, 1, ConfigConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigConnector_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, ConfigConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigConnector_Gid(), ecorePackage.getEString(), "gid", null, 0, 1, ConfigConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigConnector_Mode(), ecorePackage.getEInt(), "mode", null, 1, 1, ConfigConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secretConnectorEClass, SecretConnector.class, "SecretConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecretConnector_Secret(), this.getSecret(), null, "secret", null, 1, 1, SecretConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretConnector_Target(), ecorePackage.getEString(), "target", null, 0, 1, SecretConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretConnector_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, SecretConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretConnector_Gid(), ecorePackage.getEString(), "gid", null, 0, 1, SecretConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretConnector_Mode(), ecorePackage.getEInt(), "mode", null, 1, 1, SecretConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkConnectorEClass, NetworkConnector.class, "NetworkConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkConnector_Network(), this.getNetwork(), null, "network", null, 1, 1, NetworkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkConnector_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, NetworkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnector_Ipv4_address(), this.getDNS(), null, "ipv4_address", null, 0, 1, NetworkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnector_Link_local_ips(), this.getDNS(), null, "link_local_ips", null, 0, -1, NetworkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnector_Aliases(), this.getAlias(), null, "aliases", null, 0, -1, NetworkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNetworkConnector__Different_aliases__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_aliases", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(networkAddressEClass, NetworkAddress.class, "NetworkAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkAddress_NetId(), ecorePackage.getEInt(), "netId", null, 1, 1, NetworkAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlias_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipamAddressEClass, IPAMAddress.class, "IPAMAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIPAMAddress_Name(), ecorePackage.getEString(), "name", null, 1, 1, IPAMAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPAMAddress_Dns(), this.getDNS(), null, "dns", null, 1, 1, IPAMAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipamConfigEClass, IPAMConfig.class, "IPAMConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIPAMConfig_Gateway(), this.getDNS(), null, "gateway", null, 0, 1, IPAMConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPAMConfig_Subnet(), this.getNetworkAddress(), null, "subnet", null, 0, 1, IPAMConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPAMConfig_Ip_range(), this.getNetworkAddress(), null, "ip_range", null, 0, 1, IPAMConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPAMConfig_Aux_addresses(), this.getIPAMAddress(), null, "aux_addresses", null, 0, -1, IPAMConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIPAMConfig__Any_property__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "any_property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIPAMConfig__Different_addresses__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "different_addresses", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Value(), ecorePackage.getEString(), "value", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Service(), this.getService(), null, "service", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentVariableEClass, EnvironmentVariable.class, "EnvironmentVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnvironmentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnvironmentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(restartPolicyEEnum, RestartPolicy.class, "RestartPolicy");
		addEEnumLiteral(restartPolicyEEnum, RestartPolicy.NO);
		addEEnumLiteral(restartPolicyEEnum, RestartPolicy.ALWAYS);
		addEEnumLiteral(restartPolicyEEnum, RestartPolicy.ONFAILURE);
		addEEnumLiteral(restartPolicyEEnum, RestartPolicy.UNLESSSTOPPED);

		initEEnum(accessModeEEnum, AccessMode.class, "AccessMode");
		addEEnumLiteral(accessModeEEnum, AccessMode.RW);
		addEEnumLiteral(accessModeEEnum, AccessMode.RO);
		addEEnumLiteral(accessModeEEnum, AccessMode.Z);

		initEEnum(mountTypeEEnum, MountType.class, "MountType");
		addEEnumLiteral(mountTypeEEnum, MountType.VOLUME);
		addEEnumLiteral(mountTypeEEnum, MountType.BIND);
		addEEnumLiteral(mountTypeEEnum, MountType.TMPFS);
		addEEnumLiteral(mountTypeEEnum, MountType.NPIPE);

		initEEnum(propagationTypeEEnum, PropagationType.class, "PropagationType");
		addEEnumLiteral(propagationTypeEEnum, PropagationType.RPRIVATE);
		addEEnumLiteral(propagationTypeEEnum, PropagationType.PRIVATE);
		addEEnumLiteral(propagationTypeEEnum, PropagationType.RSHARED);
		addEEnumLiteral(propagationTypeEEnum, PropagationType.SHARED);
		addEEnumLiteral(propagationTypeEEnum, PropagationType.SLAVE);
		addEEnumLiteral(propagationTypeEEnum, PropagationType.RSLAVE);

		initEEnum(conditionEEnum, Condition.class, "Condition");
		addEEnumLiteral(conditionEEnum, Condition.SERVICE_STARTED);
		addEEnumLiteral(conditionEEnum, Condition.SERVICE_HEALTHY);
		addEEnumLiteral(conditionEEnum, Condition.SERVICE_COMPLETED_SUCCESSFULLY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (serviceEClass,
		   source,
		   new String[] {
			   "constraints", "different_secrets"
		   });
		addAnnotation
		  (networkEClass,
		   source,
		   new String[] {
			   "constraints", "different_driver_opts"
		   });
		addAnnotation
		  (volumeEClass,
		   source,
		   new String[] {
			   "constraints", "different_driver_opts"
		   });
		addAnnotation
		  (configEClass,
		   source,
		   new String[] {
			   "constraints", "external_name"
		   });
		addAnnotation
		  (secretEClass,
		   source,
		   new String[] {
			   "constraints", "external_name"
		   });
		addAnnotation
		  (dnsEClass,
		   source,
		   new String[] {
			   "constraints", "correctIpFormat"
		   });
		addAnnotation
		  (ipamEClass,
		   source,
		   new String[] {
			   "constraints", "different_options"
		   });
		addAnnotation
		  (networkConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "different_aliases"
		   });
		addAnnotation
		  (ipamConfigEClass,
		   source,
		   new String[] {
			   "constraints", "different_addresses"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getService__No_self_links__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.links.service->excludes(self)"
		   });
		addAnnotation
		  (getService__Image_or_build__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(image->excluding(\'\')->notEmpty() and build->excluding(\'\')->isEmpty()) or (image->excluding(\'\')->isEmpty() and build->excluding(\'\')->notEmpty())"
		   });
		addAnnotation
		  (getService__Different_configs__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.configs.config->isUnique(name)"
		   });
		addAnnotation
		  (getService__Different_volumes__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.volumes.volume->isUnique(name)"
		   });
		addAnnotation
		  (getService__Different_networks__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.networks.network->isUnique(name)"
		   });
		addAnnotation
		  (getService__Different_links__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.links.service->isUnique(name)"
		   });
		addAnnotation
		  (getService__Different_dependencies__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.depends_on.service->isUnique(name)"
		   });
		addAnnotation
		  (getService__Different_environment_variables__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.environment->isUnique(name)"
		   });
		addAnnotation
		  (getService__No_self_dependencies__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.depends_on.service->excludes(self)"
		   });
		addAnnotation
		  (getService__Different_secrets__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.secrets.secret->isUnique(name)"
		   });
		addAnnotation
		  (getNetwork__Different_labels__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.labels->isUnique(name)"
		   });
		addAnnotation
		  (getNetwork__Different_driver_opts__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.driver_opts->isUnique(name)"
		   });
		addAnnotation
		  (getVolume__Different_labels__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.labels->isUnique(name)"
		   });
		addAnnotation
		  (getVolume__Different_driver_opts__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.driver_opts->isUnique(name)"
		   });
		addAnnotation
		  (getConfig__File_or_external__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(file->excluding(\'\')->notEmpty() and external=false) or (file->excluding(\'\')->isEmpty() and external=true)"
		   });
		addAnnotation
		  (getConfig__External_name__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "config_name->excluding(\'\')->notEmpty() implies external=true"
		   });
		addAnnotation
		  (getSecret__File_or_external__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(file->excluding(\'\')->notEmpty() and external=false) or (file->excluding(\'\')->isEmpty() and external=true)"
		   });
		addAnnotation
		  (getSecret__External_name__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "secret_name->excluding(\'\')->notEmpty() implies external=true"
		   });
		addAnnotation
		  (getDNS__CorrectIpFormat__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "dns1>=0 and dns2>=0 and dns3>=0 and dns4>=0 and dns1<=255 and dns2<=255 and dns3<=255 and dns4<=255"
		   });
		addAnnotation
		  (getIPAM__Any_property__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(driver->excluding(\'\')->notEmpty()) or (options->size()>0) or (configs->size()>0)"
		   });
		addAnnotation
		  (getIPAM__Different_options__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.options->isUnique(name)"
		   });
		addAnnotation
		  (getNetworkConnector__Different_aliases__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.aliases->isUnique(alias)"
		   });
		addAnnotation
		  (getIPAMConfig__Any_property__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(gateway->notEmpty()) or (subnet->size()>0) or (ip_range->size()>0) or (aux_addresses->size()>0)"
		   });
		addAnnotation
		  (getIPAMConfig__Different_addresses__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.aux_addresses->isUnique(name)"
		   });
	}

} //DockercomposePackageImpl
