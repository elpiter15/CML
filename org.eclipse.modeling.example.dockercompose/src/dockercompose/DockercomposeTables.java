/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.modeling.example.dockercompose/DockerCompose.ecore
 * using:
 *   /org.eclipse.modeling.example.dockercompose/DockerCompose.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package dockercompose;

// import dockercompose.DockercomposePackage;
// import dockercompose.DockercomposeTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * DockercomposeTables provides the dispatch tables for the dockercompose for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DockercomposeTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DockercomposePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose = IdManager.getNsURIPackageId("http://www.eclipse.org/modeling/example/dockercompose/DockerCompose", null, DockercomposePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Alias = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Alias", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Config = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Config", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ConfigConnector = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("ConfigConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DNS = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("DNS", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Dependency = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Dependency", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Device = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Device", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DockerCompose = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("DockerCompose", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IPAM = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("IPAM", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IPAMAddress = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("IPAMAddress", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IPAMConfig = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("IPAMConfig", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IPAMOption = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("IPAMOption", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Network = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Network", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NetworkAddress = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("NetworkAddress", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NetworkConnector = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("NetworkConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NetworkDriverOpt = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("NetworkDriverOpt", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NetworkLabel = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("NetworkLabel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Port = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Port", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Secret = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Secret", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SecretConnector = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("SecretConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Service = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Service", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Volume = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("Volume", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VolumeConnector = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("VolumeConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VolumeDriverOpt = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("VolumeDriverOpt", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VolumeLabel = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getClassId("VolumeLabel", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_AccessMode = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getEnumerationId("AccessMode");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MountType = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getEnumerationId("MountType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PropagationType = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getEnumerationId("PropagationType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_RestartPolicy = DockercomposeTables.PACKid_http_c_s_s_www_eclipse_org_s_modeling_s_example_s_dockercompose_s_DockerCompose.getEnumerationId("RestartPolicy");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_255 = ValueUtil.integerValueOf("255");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ String STR_ = "";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ConfigConnector = TypeId.BAG.getSpecializedId(DockercomposeTables.CLSSid_ConfigConnector);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Dependency = TypeId.BAG.getSpecializedId(DockercomposeTables.CLSSid_Dependency);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_NetworkConnector = TypeId.BAG.getSpecializedId(DockercomposeTables.CLSSid_NetworkConnector);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SecretConnector = TypeId.BAG.getSpecializedId(DockercomposeTables.CLSSid_SecretConnector);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Service = TypeId.BAG.getSpecializedId(DockercomposeTables.CLSSid_Service);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_VolumeConnector = TypeId.BAG.getSpecializedId(DockercomposeTables.CLSSid_VolumeConnector);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Alias = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Alias);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Config = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Config);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ConfigConnector = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_ConfigConnector);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DNS = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_DNS);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Dependency = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Dependency);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Device = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Device);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_IPAMAddress = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_IPAMAddress);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_IPAMConfig = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_IPAMConfig);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_IPAMOption = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_IPAMOption);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Network = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Network);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_NetworkConnector = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_NetworkConnector);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_NetworkDriverOpt = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_NetworkDriverOpt);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_NetworkLabel = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_NetworkLabel);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Port = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Port);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Secret = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Secret);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SecretConnector = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_SecretConnector);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Service = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Service);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Volume = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_Volume);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_VolumeConnector = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_VolumeConnector);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_VolumeDriverOpt = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_VolumeDriverOpt);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_VolumeLabel = TypeId.ORDERED_SET.getSpecializedId(DockercomposeTables.CLSSid_VolumeLabel);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Config = TypeId.SEQUENCE.getSpecializedId(DockercomposeTables.CLSSid_Config);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Network = TypeId.SEQUENCE.getSpecializedId(DockercomposeTables.CLSSid_Network);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Secret = TypeId.SEQUENCE.getSpecializedId(DockercomposeTables.CLSSid_Secret);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Service = TypeId.SEQUENCE.getSpecializedId(DockercomposeTables.CLSSid_Service);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Volume = TypeId.SEQUENCE.getSpecializedId(DockercomposeTables.CLSSid_Volume);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_DNS = TypeId.SET.getSpecializedId(DockercomposeTables.CLSSid_DNS);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_NetworkAddress = TypeId.SET.getSpecializedId(DockercomposeTables.CLSSid_NetworkAddress);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DockercomposeTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorEnumeration _AccessMode = new EcoreExecutorEnumeration(DockercomposePackage.Literals.ACCESS_MODE, PACKAGE, 0);
		public static final EcoreExecutorType _Alias = new EcoreExecutorType(DockercomposePackage.Literals.ALIAS, PACKAGE, 0);
		public static final EcoreExecutorType _Config = new EcoreExecutorType(DockercomposePackage.Literals.CONFIG, PACKAGE, 0);
		public static final EcoreExecutorType _ConfigConnector = new EcoreExecutorType(DockercomposePackage.Literals.CONFIG_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _DNS = new EcoreExecutorType(DockercomposePackage.Literals.DNS, PACKAGE, 0);
		public static final EcoreExecutorType _Dependency = new EcoreExecutorType(DockercomposePackage.Literals.DEPENDENCY, PACKAGE, 0);
		public static final EcoreExecutorType _Device = new EcoreExecutorType(DockercomposePackage.Literals.DEVICE, PACKAGE, 0);
		public static final EcoreExecutorType _DockerCompose = new EcoreExecutorType(DockercomposePackage.Literals.DOCKER_COMPOSE, PACKAGE, 0);
		public static final EcoreExecutorType _IPAM = new EcoreExecutorType(DockercomposePackage.Literals.IPAM, PACKAGE, 0);
		public static final EcoreExecutorType _IPAMAddress = new EcoreExecutorType(DockercomposePackage.Literals.IPAM_ADDRESS, PACKAGE, 0);
		public static final EcoreExecutorType _IPAMConfig = new EcoreExecutorType(DockercomposePackage.Literals.IPAM_CONFIG, PACKAGE, 0);
		public static final EcoreExecutorType _IPAMOption = new EcoreExecutorType(DockercomposePackage.Literals.IPAM_OPTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MountType = new EcoreExecutorEnumeration(DockercomposePackage.Literals.MOUNT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Network = new EcoreExecutorType(DockercomposePackage.Literals.NETWORK, PACKAGE, 0);
		public static final EcoreExecutorType _NetworkAddress = new EcoreExecutorType(DockercomposePackage.Literals.NETWORK_ADDRESS, PACKAGE, 0);
		public static final EcoreExecutorType _NetworkConnector = new EcoreExecutorType(DockercomposePackage.Literals.NETWORK_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _NetworkDriverOpt = new EcoreExecutorType(DockercomposePackage.Literals.NETWORK_DRIVER_OPT, PACKAGE, 0);
		public static final EcoreExecutorType _NetworkLabel = new EcoreExecutorType(DockercomposePackage.Literals.NETWORK_LABEL, PACKAGE, 0);
		public static final EcoreExecutorType _Port = new EcoreExecutorType(DockercomposePackage.Literals.PORT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PropagationType = new EcoreExecutorEnumeration(DockercomposePackage.Literals.PROPAGATION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _RestartPolicy = new EcoreExecutorEnumeration(DockercomposePackage.Literals.RESTART_POLICY, PACKAGE, 0);
		public static final EcoreExecutorType _Secret = new EcoreExecutorType(DockercomposePackage.Literals.SECRET, PACKAGE, 0);
		public static final EcoreExecutorType _SecretConnector = new EcoreExecutorType(DockercomposePackage.Literals.SECRET_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _Service = new EcoreExecutorType(DockercomposePackage.Literals.SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _Volume = new EcoreExecutorType(DockercomposePackage.Literals.VOLUME, PACKAGE, 0);
		public static final EcoreExecutorType _VolumeConnector = new EcoreExecutorType(DockercomposePackage.Literals.VOLUME_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _VolumeDriverOpt = new EcoreExecutorType(DockercomposePackage.Literals.VOLUME_DRIVER_OPT, PACKAGE, 0);
		public static final EcoreExecutorType _VolumeLabel = new EcoreExecutorType(DockercomposePackage.Literals.VOLUME_LABEL, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AccessMode,
			_Alias,
			_Config,
			_ConfigConnector,
			_DNS,
			_Dependency,
			_Device,
			_DockerCompose,
			_IPAM,
			_IPAMAddress,
			_IPAMConfig,
			_IPAMOption,
			_MountType,
			_Network,
			_NetworkAddress,
			_NetworkConnector,
			_NetworkDriverOpt,
			_NetworkLabel,
			_Port,
			_PropagationType,
			_RestartPolicy,
			_Secret,
			_SecretConnector,
			_Service,
			_Volume,
			_VolumeConnector,
			_VolumeDriverOpt,
			_VolumeLabel
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AccessMode__AccessMode = new ExecutorFragment(Types._AccessMode, DockercomposeTables.Types._AccessMode);
		private static final ExecutorFragment _AccessMode__OclAny = new ExecutorFragment(Types._AccessMode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AccessMode__OclElement = new ExecutorFragment(Types._AccessMode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AccessMode__OclEnumeration = new ExecutorFragment(Types._AccessMode, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _AccessMode__OclType = new ExecutorFragment(Types._AccessMode, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Alias__Alias = new ExecutorFragment(Types._Alias, DockercomposeTables.Types._Alias);
		private static final ExecutorFragment _Alias__OclAny = new ExecutorFragment(Types._Alias, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Alias__OclElement = new ExecutorFragment(Types._Alias, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Config__Config = new ExecutorFragment(Types._Config, DockercomposeTables.Types._Config);
		private static final ExecutorFragment _Config__OclAny = new ExecutorFragment(Types._Config, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Config__OclElement = new ExecutorFragment(Types._Config, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ConfigConnector__ConfigConnector = new ExecutorFragment(Types._ConfigConnector, DockercomposeTables.Types._ConfigConnector);
		private static final ExecutorFragment _ConfigConnector__OclAny = new ExecutorFragment(Types._ConfigConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConfigConnector__OclElement = new ExecutorFragment(Types._ConfigConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DNS__DNS = new ExecutorFragment(Types._DNS, DockercomposeTables.Types._DNS);
		private static final ExecutorFragment _DNS__OclAny = new ExecutorFragment(Types._DNS, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DNS__OclElement = new ExecutorFragment(Types._DNS, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Dependency__Dependency = new ExecutorFragment(Types._Dependency, DockercomposeTables.Types._Dependency);
		private static final ExecutorFragment _Dependency__OclAny = new ExecutorFragment(Types._Dependency, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Dependency__OclElement = new ExecutorFragment(Types._Dependency, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Device__Device = new ExecutorFragment(Types._Device, DockercomposeTables.Types._Device);
		private static final ExecutorFragment _Device__OclAny = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Device__OclElement = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DockerCompose__DockerCompose = new ExecutorFragment(Types._DockerCompose, DockercomposeTables.Types._DockerCompose);
		private static final ExecutorFragment _DockerCompose__OclAny = new ExecutorFragment(Types._DockerCompose, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DockerCompose__OclElement = new ExecutorFragment(Types._DockerCompose, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IPAM__IPAM = new ExecutorFragment(Types._IPAM, DockercomposeTables.Types._IPAM);
		private static final ExecutorFragment _IPAM__OclAny = new ExecutorFragment(Types._IPAM, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IPAM__OclElement = new ExecutorFragment(Types._IPAM, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IPAMAddress__IPAMAddress = new ExecutorFragment(Types._IPAMAddress, DockercomposeTables.Types._IPAMAddress);
		private static final ExecutorFragment _IPAMAddress__OclAny = new ExecutorFragment(Types._IPAMAddress, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IPAMAddress__OclElement = new ExecutorFragment(Types._IPAMAddress, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IPAMConfig__IPAMConfig = new ExecutorFragment(Types._IPAMConfig, DockercomposeTables.Types._IPAMConfig);
		private static final ExecutorFragment _IPAMConfig__OclAny = new ExecutorFragment(Types._IPAMConfig, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IPAMConfig__OclElement = new ExecutorFragment(Types._IPAMConfig, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IPAMOption__IPAMOption = new ExecutorFragment(Types._IPAMOption, DockercomposeTables.Types._IPAMOption);
		private static final ExecutorFragment _IPAMOption__OclAny = new ExecutorFragment(Types._IPAMOption, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IPAMOption__OclElement = new ExecutorFragment(Types._IPAMOption, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MountType__MountType = new ExecutorFragment(Types._MountType, DockercomposeTables.Types._MountType);
		private static final ExecutorFragment _MountType__OclAny = new ExecutorFragment(Types._MountType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MountType__OclElement = new ExecutorFragment(Types._MountType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MountType__OclEnumeration = new ExecutorFragment(Types._MountType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MountType__OclType = new ExecutorFragment(Types._MountType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Network__Network = new ExecutorFragment(Types._Network, DockercomposeTables.Types._Network);
		private static final ExecutorFragment _Network__OclAny = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Network__OclElement = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NetworkAddress__DNS = new ExecutorFragment(Types._NetworkAddress, DockercomposeTables.Types._DNS);
		private static final ExecutorFragment _NetworkAddress__NetworkAddress = new ExecutorFragment(Types._NetworkAddress, DockercomposeTables.Types._NetworkAddress);
		private static final ExecutorFragment _NetworkAddress__OclAny = new ExecutorFragment(Types._NetworkAddress, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NetworkAddress__OclElement = new ExecutorFragment(Types._NetworkAddress, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NetworkConnector__NetworkConnector = new ExecutorFragment(Types._NetworkConnector, DockercomposeTables.Types._NetworkConnector);
		private static final ExecutorFragment _NetworkConnector__OclAny = new ExecutorFragment(Types._NetworkConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NetworkConnector__OclElement = new ExecutorFragment(Types._NetworkConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NetworkDriverOpt__NetworkDriverOpt = new ExecutorFragment(Types._NetworkDriverOpt, DockercomposeTables.Types._NetworkDriverOpt);
		private static final ExecutorFragment _NetworkDriverOpt__OclAny = new ExecutorFragment(Types._NetworkDriverOpt, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NetworkDriverOpt__OclElement = new ExecutorFragment(Types._NetworkDriverOpt, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NetworkLabel__NetworkLabel = new ExecutorFragment(Types._NetworkLabel, DockercomposeTables.Types._NetworkLabel);
		private static final ExecutorFragment _NetworkLabel__OclAny = new ExecutorFragment(Types._NetworkLabel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NetworkLabel__OclElement = new ExecutorFragment(Types._NetworkLabel, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Port__OclAny = new ExecutorFragment(Types._Port, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Port__OclElement = new ExecutorFragment(Types._Port, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Port__Port = new ExecutorFragment(Types._Port, DockercomposeTables.Types._Port);

		private static final ExecutorFragment _PropagationType__OclAny = new ExecutorFragment(Types._PropagationType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PropagationType__OclElement = new ExecutorFragment(Types._PropagationType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PropagationType__OclEnumeration = new ExecutorFragment(Types._PropagationType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PropagationType__OclType = new ExecutorFragment(Types._PropagationType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PropagationType__PropagationType = new ExecutorFragment(Types._PropagationType, DockercomposeTables.Types._PropagationType);

		private static final ExecutorFragment _RestartPolicy__OclAny = new ExecutorFragment(Types._RestartPolicy, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RestartPolicy__OclElement = new ExecutorFragment(Types._RestartPolicy, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RestartPolicy__OclEnumeration = new ExecutorFragment(Types._RestartPolicy, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _RestartPolicy__OclType = new ExecutorFragment(Types._RestartPolicy, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _RestartPolicy__RestartPolicy = new ExecutorFragment(Types._RestartPolicy, DockercomposeTables.Types._RestartPolicy);

		private static final ExecutorFragment _Secret__OclAny = new ExecutorFragment(Types._Secret, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Secret__OclElement = new ExecutorFragment(Types._Secret, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Secret__Secret = new ExecutorFragment(Types._Secret, DockercomposeTables.Types._Secret);

		private static final ExecutorFragment _SecretConnector__OclAny = new ExecutorFragment(Types._SecretConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SecretConnector__OclElement = new ExecutorFragment(Types._SecretConnector, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SecretConnector__SecretConnector = new ExecutorFragment(Types._SecretConnector, DockercomposeTables.Types._SecretConnector);

		private static final ExecutorFragment _Service__OclAny = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Service__OclElement = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Service__Service = new ExecutorFragment(Types._Service, DockercomposeTables.Types._Service);

		private static final ExecutorFragment _Volume__OclAny = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Volume__OclElement = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Volume__Volume = new ExecutorFragment(Types._Volume, DockercomposeTables.Types._Volume);

		private static final ExecutorFragment _VolumeConnector__OclAny = new ExecutorFragment(Types._VolumeConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VolumeConnector__OclElement = new ExecutorFragment(Types._VolumeConnector, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VolumeConnector__VolumeConnector = new ExecutorFragment(Types._VolumeConnector, DockercomposeTables.Types._VolumeConnector);

		private static final ExecutorFragment _VolumeDriverOpt__OclAny = new ExecutorFragment(Types._VolumeDriverOpt, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VolumeDriverOpt__OclElement = new ExecutorFragment(Types._VolumeDriverOpt, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VolumeDriverOpt__VolumeDriverOpt = new ExecutorFragment(Types._VolumeDriverOpt, DockercomposeTables.Types._VolumeDriverOpt);

		private static final ExecutorFragment _VolumeLabel__OclAny = new ExecutorFragment(Types._VolumeLabel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VolumeLabel__OclElement = new ExecutorFragment(Types._VolumeLabel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VolumeLabel__VolumeLabel = new ExecutorFragment(Types._VolumeLabel, DockercomposeTables.Types._VolumeLabel);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _Alias__alias = new EcoreExecutorProperty(DockercomposePackage.Literals.ALIAS__ALIAS, Types._Alias, 0);
		public static final ExecutorProperty _Alias__NetworkConnector__aliases = new ExecutorPropertyWithImplementation("NetworkConnector", Types._Alias, 1, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__ALIASES));

		public static final ExecutorProperty _Config__config_name = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG__CONFIG_NAME, Types._Config, 0);
		public static final ExecutorProperty _Config__external = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG__EXTERNAL, Types._Config, 1);
		public static final ExecutorProperty _Config__file = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG__FILE, Types._Config, 2);
		public static final ExecutorProperty _Config__name = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG__NAME, Types._Config, 3);
		public static final ExecutorProperty _Config__ConfigConnector__config = new ExecutorPropertyWithImplementation("ConfigConnector", Types._Config, 4, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.CONFIG_CONNECTOR__CONFIG));
		public static final ExecutorProperty _Config__DockerCompose__configs = new ExecutorPropertyWithImplementation("DockerCompose", Types._Config, 5, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__CONFIGS));

		public static final ExecutorProperty _ConfigConnector__config = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG_CONNECTOR__CONFIG, Types._ConfigConnector, 0);
		public static final ExecutorProperty _ConfigConnector__gid = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG_CONNECTOR__GID, Types._ConfigConnector, 1);
		public static final ExecutorProperty _ConfigConnector__mode = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG_CONNECTOR__MODE, Types._ConfigConnector, 2);
		public static final ExecutorProperty _ConfigConnector__target = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG_CONNECTOR__TARGET, Types._ConfigConnector, 3);
		public static final ExecutorProperty _ConfigConnector__uid = new EcoreExecutorProperty(DockercomposePackage.Literals.CONFIG_CONNECTOR__UID, Types._ConfigConnector, 4);
		public static final ExecutorProperty _ConfigConnector__Service__configs = new ExecutorPropertyWithImplementation("Service", Types._ConfigConnector, 5, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__CONFIGS));

		public static final ExecutorProperty _DNS__dns1 = new EcoreExecutorProperty(DockercomposePackage.Literals.DNS__DNS1, Types._DNS, 0);
		public static final ExecutorProperty _DNS__dns2 = new EcoreExecutorProperty(DockercomposePackage.Literals.DNS__DNS2, Types._DNS, 1);
		public static final ExecutorProperty _DNS__dns3 = new EcoreExecutorProperty(DockercomposePackage.Literals.DNS__DNS3, Types._DNS, 2);
		public static final ExecutorProperty _DNS__dns4 = new EcoreExecutorProperty(DockercomposePackage.Literals.DNS__DNS4, Types._DNS, 3);
		public static final ExecutorProperty _DNS__IPAMAddress__dns = new ExecutorPropertyWithImplementation("IPAMAddress", Types._DNS, 4, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.IPAM_ADDRESS__DNS));
		public static final ExecutorProperty _DNS__IPAMConfig__gateway = new ExecutorPropertyWithImplementation("IPAMConfig", Types._DNS, 5, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.IPAM_CONFIG__GATEWAY));
		public static final ExecutorProperty _DNS__NetworkConnector__ipv4_address = new ExecutorPropertyWithImplementation("NetworkConnector", Types._DNS, 6, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__IPV4_ADDRESS));
		public static final ExecutorProperty _DNS__NetworkConnector__link_local_ips = new ExecutorPropertyWithImplementation("NetworkConnector", Types._DNS, 7, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__LINK_LOCAL_IPS));
		public static final ExecutorProperty _DNS__Service__dns = new ExecutorPropertyWithImplementation("Service", Types._DNS, 8, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__DNS));

		public static final ExecutorProperty _Dependency__service = new EcoreExecutorProperty(DockercomposePackage.Literals.DEPENDENCY__SERVICE, Types._Dependency, 0);
		public static final ExecutorProperty _Dependency__Service__depends_on = new ExecutorPropertyWithImplementation("Service", Types._Dependency, 1, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__DEPENDS_ON));

		public static final ExecutorProperty _Device__value = new EcoreExecutorProperty(DockercomposePackage.Literals.DEVICE__VALUE, Types._Device, 0);
		public static final ExecutorProperty _Device__Service__devices = new ExecutorPropertyWithImplementation("Service", Types._Device, 1, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__DEVICES));

		public static final ExecutorProperty _DockerCompose__configs = new EcoreExecutorProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__CONFIGS, Types._DockerCompose, 0);
		public static final ExecutorProperty _DockerCompose__networks = new EcoreExecutorProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__NETWORKS, Types._DockerCompose, 1);
		public static final ExecutorProperty _DockerCompose__secrets = new EcoreExecutorProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__SECRETS, Types._DockerCompose, 2);
		public static final ExecutorProperty _DockerCompose__services = new EcoreExecutorProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__SERVICES, Types._DockerCompose, 3);
		public static final ExecutorProperty _DockerCompose__version = new EcoreExecutorProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__VERSION, Types._DockerCompose, 4);
		public static final ExecutorProperty _DockerCompose__volumes = new EcoreExecutorProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__VOLUMES, Types._DockerCompose, 5);

		public static final ExecutorProperty _IPAM__configs = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM__CONFIGS, Types._IPAM, 0);
		public static final ExecutorProperty _IPAM__driver = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM__DRIVER, Types._IPAM, 1);
		public static final ExecutorProperty _IPAM__options = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM__OPTIONS, Types._IPAM, 2);
		public static final ExecutorProperty _IPAM__Network__ipam = new ExecutorPropertyWithImplementation("Network", Types._IPAM, 3, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.NETWORK__IPAM));

		public static final ExecutorProperty _IPAMAddress__dns = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM_ADDRESS__DNS, Types._IPAMAddress, 0);
		public static final ExecutorProperty _IPAMAddress__name = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM_ADDRESS__NAME, Types._IPAMAddress, 1);
		public static final ExecutorProperty _IPAMAddress__IPAMConfig__aux_addresses = new ExecutorPropertyWithImplementation("IPAMConfig", Types._IPAMAddress, 2, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.IPAM_CONFIG__AUX_ADDRESSES));

		public static final ExecutorProperty _IPAMConfig__aux_addresses = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM_CONFIG__AUX_ADDRESSES, Types._IPAMConfig, 0);
		public static final ExecutorProperty _IPAMConfig__gateway = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM_CONFIG__GATEWAY, Types._IPAMConfig, 1);
		public static final ExecutorProperty _IPAMConfig__ip_range = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM_CONFIG__IP_RANGE, Types._IPAMConfig, 2);
		public static final ExecutorProperty _IPAMConfig__subnet = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM_CONFIG__SUBNET, Types._IPAMConfig, 3);
		public static final ExecutorProperty _IPAMConfig__IPAM__configs = new ExecutorPropertyWithImplementation("IPAM", Types._IPAMConfig, 4, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.IPAM__CONFIGS));

		public static final ExecutorProperty _IPAMOption__name = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM_OPTION__NAME, Types._IPAMOption, 0);
		public static final ExecutorProperty _IPAMOption__value = new EcoreExecutorProperty(DockercomposePackage.Literals.IPAM_OPTION__VALUE, Types._IPAMOption, 1);
		public static final ExecutorProperty _IPAMOption__IPAM__options = new ExecutorPropertyWithImplementation("IPAM", Types._IPAMOption, 2, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.IPAM__OPTIONS));

		public static final ExecutorProperty _Network__attachable = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__ATTACHABLE, Types._Network, 0);
		public static final ExecutorProperty _Network__driver = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__DRIVER, Types._Network, 1);
		public static final ExecutorProperty _Network__driver_opts = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__DRIVER_OPTS, Types._Network, 2);
		public static final ExecutorProperty _Network__enable_ipv6 = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__ENABLE_IPV6, Types._Network, 3);
		public static final ExecutorProperty _Network__external = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__EXTERNAL, Types._Network, 4);
		public static final ExecutorProperty _Network__internal = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__INTERNAL, Types._Network, 5);
		public static final ExecutorProperty _Network__ipam = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__IPAM, Types._Network, 6);
		public static final ExecutorProperty _Network__labels = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__LABELS, Types._Network, 7);
		public static final ExecutorProperty _Network__name = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__NAME, Types._Network, 8);
		public static final ExecutorProperty _Network__network_name = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK__NETWORK_NAME, Types._Network, 9);
		public static final ExecutorProperty _Network__DockerCompose__networks = new ExecutorPropertyWithImplementation("DockerCompose", Types._Network, 10, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__NETWORKS));
		public static final ExecutorProperty _Network__NetworkConnector__network = new ExecutorPropertyWithImplementation("NetworkConnector", Types._Network, 11, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__NETWORK));

		public static final ExecutorProperty _NetworkAddress__netId = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_ADDRESS__NET_ID, Types._NetworkAddress, 0);
		public static final ExecutorProperty _NetworkAddress__IPAMConfig__ip_range = new ExecutorPropertyWithImplementation("IPAMConfig", Types._NetworkAddress, 1, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.IPAM_CONFIG__IP_RANGE));
		public static final ExecutorProperty _NetworkAddress__IPAMConfig__subnet = new ExecutorPropertyWithImplementation("IPAMConfig", Types._NetworkAddress, 2, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.IPAM_CONFIG__SUBNET));

		public static final ExecutorProperty _NetworkConnector__aliases = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__ALIASES, Types._NetworkConnector, 0);
		public static final ExecutorProperty _NetworkConnector__ipv4_address = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__IPV4_ADDRESS, Types._NetworkConnector, 1);
		public static final ExecutorProperty _NetworkConnector__link_local_ips = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__LINK_LOCAL_IPS, Types._NetworkConnector, 2);
		public static final ExecutorProperty _NetworkConnector__network = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__NETWORK, Types._NetworkConnector, 3);
		public static final ExecutorProperty _NetworkConnector__priority = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_CONNECTOR__PRIORITY, Types._NetworkConnector, 4);
		public static final ExecutorProperty _NetworkConnector__Service__networks = new ExecutorPropertyWithImplementation("Service", Types._NetworkConnector, 5, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__NETWORKS));

		public static final ExecutorProperty _NetworkDriverOpt__name = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_DRIVER_OPT__NAME, Types._NetworkDriverOpt, 0);
		public static final ExecutorProperty _NetworkDriverOpt__value = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_DRIVER_OPT__VALUE, Types._NetworkDriverOpt, 1);
		public static final ExecutorProperty _NetworkDriverOpt__Network__driver_opts = new ExecutorPropertyWithImplementation("Network", Types._NetworkDriverOpt, 2, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.NETWORK__DRIVER_OPTS));

		public static final ExecutorProperty _NetworkLabel__name = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_LABEL__NAME, Types._NetworkLabel, 0);
		public static final ExecutorProperty _NetworkLabel__value = new EcoreExecutorProperty(DockercomposePackage.Literals.NETWORK_LABEL__VALUE, Types._NetworkLabel, 1);
		public static final ExecutorProperty _NetworkLabel__Network__labels = new ExecutorPropertyWithImplementation("Network", Types._NetworkLabel, 2, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.NETWORK__LABELS));

		public static final ExecutorProperty _Port__value = new EcoreExecutorProperty(DockercomposePackage.Literals.PORT__VALUE, Types._Port, 0);
		public static final ExecutorProperty _Port__Service__ports = new ExecutorPropertyWithImplementation("Service", Types._Port, 1, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__PORTS));

		public static final ExecutorProperty _Secret__environment = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET__ENVIRONMENT, Types._Secret, 0);
		public static final ExecutorProperty _Secret__external = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET__EXTERNAL, Types._Secret, 1);
		public static final ExecutorProperty _Secret__file = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET__FILE, Types._Secret, 2);
		public static final ExecutorProperty _Secret__name = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET__NAME, Types._Secret, 3);
		public static final ExecutorProperty _Secret__secret_name = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET__SECRET_NAME, Types._Secret, 4);
		public static final ExecutorProperty _Secret__DockerCompose__secrets = new ExecutorPropertyWithImplementation("DockerCompose", Types._Secret, 5, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__SECRETS));
		public static final ExecutorProperty _Secret__SecretConnector__secret = new ExecutorPropertyWithImplementation("SecretConnector", Types._Secret, 6, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SECRET_CONNECTOR__SECRET));

		public static final ExecutorProperty _SecretConnector__gid = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET_CONNECTOR__GID, Types._SecretConnector, 0);
		public static final ExecutorProperty _SecretConnector__mode = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET_CONNECTOR__MODE, Types._SecretConnector, 1);
		public static final ExecutorProperty _SecretConnector__secret = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET_CONNECTOR__SECRET, Types._SecretConnector, 2);
		public static final ExecutorProperty _SecretConnector__target = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET_CONNECTOR__TARGET, Types._SecretConnector, 3);
		public static final ExecutorProperty _SecretConnector__uid = new EcoreExecutorProperty(DockercomposePackage.Literals.SECRET_CONNECTOR__UID, Types._SecretConnector, 4);
		public static final ExecutorProperty _SecretConnector__Service__secrets = new ExecutorPropertyWithImplementation("Service", Types._SecretConnector, 5, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__SECRETS));

		public static final ExecutorProperty _Service__build = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__BUILD, Types._Service, 0);
		public static final ExecutorProperty _Service__command = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__COMMAND, Types._Service, 1);
		public static final ExecutorProperty _Service__configs = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__CONFIGS, Types._Service, 2);
		public static final ExecutorProperty _Service__container_name = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__CONTAINER_NAME, Types._Service, 3);
		public static final ExecutorProperty _Service__cpu_count = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__CPU_COUNT, Types._Service, 4);
		public static final ExecutorProperty _Service__depends_on = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__DEPENDS_ON, Types._Service, 5);
		public static final ExecutorProperty _Service__devices = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__DEVICES, Types._Service, 6);
		public static final ExecutorProperty _Service__dns = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__DNS, Types._Service, 7);
		public static final ExecutorProperty _Service__image = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__IMAGE, Types._Service, 8);
		public static final ExecutorProperty _Service__init = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__INIT, Types._Service, 9);
		public static final ExecutorProperty _Service__links = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__LINKS, Types._Service, 10);
		public static final ExecutorProperty _Service__name = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__NAME, Types._Service, 11);
		public static final ExecutorProperty _Service__networks = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__NETWORKS, Types._Service, 12);
		public static final ExecutorProperty _Service__ports = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__PORTS, Types._Service, 13);
		public static final ExecutorProperty _Service__read_only = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__READ_ONLY, Types._Service, 14);
		public static final ExecutorProperty _Service__restart = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__RESTART, Types._Service, 15);
		public static final ExecutorProperty _Service__secrets = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__SECRETS, Types._Service, 16);
		public static final ExecutorProperty _Service__volumes = new EcoreExecutorProperty(DockercomposePackage.Literals.SERVICE__VOLUMES, Types._Service, 17);
		public static final ExecutorProperty _Service__Dependency__service = new ExecutorPropertyWithImplementation("Dependency", Types._Service, 18, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.DEPENDENCY__SERVICE));
		public static final ExecutorProperty _Service__DockerCompose__services = new ExecutorPropertyWithImplementation("DockerCompose", Types._Service, 19, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__SERVICES));
		public static final ExecutorProperty _Service__Service__links = new ExecutorPropertyWithImplementation("Service", Types._Service, 20, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__LINKS));

		public static final ExecutorProperty _Volume__driver = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME__DRIVER, Types._Volume, 0);
		public static final ExecutorProperty _Volume__driver_opts = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME__DRIVER_OPTS, Types._Volume, 1);
		public static final ExecutorProperty _Volume__external = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME__EXTERNAL, Types._Volume, 2);
		public static final ExecutorProperty _Volume__labels = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME__LABELS, Types._Volume, 3);
		public static final ExecutorProperty _Volume__name = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME__NAME, Types._Volume, 4);
		public static final ExecutorProperty _Volume__volume_name = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME__VOLUME_NAME, Types._Volume, 5);
		public static final ExecutorProperty _Volume__DockerCompose__volumes = new ExecutorPropertyWithImplementation("DockerCompose", Types._Volume, 6, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.DOCKER_COMPOSE__VOLUMES));
		public static final ExecutorProperty _Volume__VolumeConnector__volume = new ExecutorPropertyWithImplementation("VolumeConnector", Types._Volume, 7, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__VOLUME));

		public static final ExecutorProperty _VolumeConnector__access_mode = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__ACCESS_MODE, Types._VolumeConnector, 0);
		public static final ExecutorProperty _VolumeConnector__container_path = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__CONTAINER_PATH, Types._VolumeConnector, 1);
		public static final ExecutorProperty _VolumeConnector__nocopy = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__NOCOPY, Types._VolumeConnector, 2);
		public static final ExecutorProperty _VolumeConnector__propagation = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__PROPAGATION, Types._VolumeConnector, 3);
		public static final ExecutorProperty _VolumeConnector__read_only = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__READ_ONLY, Types._VolumeConnector, 4);
		public static final ExecutorProperty _VolumeConnector__size = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__SIZE, Types._VolumeConnector, 5);
		public static final ExecutorProperty _VolumeConnector__type = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__TYPE, Types._VolumeConnector, 6);
		public static final ExecutorProperty _VolumeConnector__volume = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_CONNECTOR__VOLUME, Types._VolumeConnector, 7);
		public static final ExecutorProperty _VolumeConnector__Service__volumes = new ExecutorPropertyWithImplementation("Service", Types._VolumeConnector, 8, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.SERVICE__VOLUMES));

		public static final ExecutorProperty _VolumeDriverOpt__name = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_DRIVER_OPT__NAME, Types._VolumeDriverOpt, 0);
		public static final ExecutorProperty _VolumeDriverOpt__value = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_DRIVER_OPT__VALUE, Types._VolumeDriverOpt, 1);
		public static final ExecutorProperty _VolumeDriverOpt__Volume__driver_opts = new ExecutorPropertyWithImplementation("Volume", Types._VolumeDriverOpt, 2, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.VOLUME__DRIVER_OPTS));

		public static final ExecutorProperty _VolumeLabel__name = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_LABEL__NAME, Types._VolumeLabel, 0);
		public static final ExecutorProperty _VolumeLabel__value = new EcoreExecutorProperty(DockercomposePackage.Literals.VOLUME_LABEL__VALUE, Types._VolumeLabel, 1);
		public static final ExecutorProperty _VolumeLabel__Volume__labels = new ExecutorPropertyWithImplementation("Volume", Types._VolumeLabel, 2, new EcoreLibraryOppositeProperty(DockercomposePackage.Literals.VOLUME__LABELS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AccessMode =
			{
				Fragments._AccessMode__OclAny /* 0 */,
				Fragments._AccessMode__OclElement /* 1 */,
				Fragments._AccessMode__OclType /* 2 */,
				Fragments._AccessMode__OclEnumeration /* 3 */,
				Fragments._AccessMode__AccessMode /* 4 */
			};
		private static final int /*@NonNull*/ [] __AccessMode = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Alias =
			{
				Fragments._Alias__OclAny /* 0 */,
				Fragments._Alias__OclElement /* 1 */,
				Fragments._Alias__Alias /* 2 */
			};
		private static final int /*@NonNull*/ [] __Alias = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Config =
			{
				Fragments._Config__OclAny /* 0 */,
				Fragments._Config__OclElement /* 1 */,
				Fragments._Config__Config /* 2 */
			};
		private static final int /*@NonNull*/ [] __Config = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConfigConnector =
			{
				Fragments._ConfigConnector__OclAny /* 0 */,
				Fragments._ConfigConnector__OclElement /* 1 */,
				Fragments._ConfigConnector__ConfigConnector /* 2 */
			};
		private static final int /*@NonNull*/ [] __ConfigConnector = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DNS =
			{
				Fragments._DNS__OclAny /* 0 */,
				Fragments._DNS__OclElement /* 1 */,
				Fragments._DNS__DNS /* 2 */
			};
		private static final int /*@NonNull*/ [] __DNS = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Dependency =
			{
				Fragments._Dependency__OclAny /* 0 */,
				Fragments._Dependency__OclElement /* 1 */,
				Fragments._Dependency__Dependency /* 2 */
			};
		private static final int /*@NonNull*/ [] __Dependency = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Device =
			{
				Fragments._Device__OclAny /* 0 */,
				Fragments._Device__OclElement /* 1 */,
				Fragments._Device__Device /* 2 */
			};
		private static final int /*@NonNull*/ [] __Device = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DockerCompose =
			{
				Fragments._DockerCompose__OclAny /* 0 */,
				Fragments._DockerCompose__OclElement /* 1 */,
				Fragments._DockerCompose__DockerCompose /* 2 */
			};
		private static final int /*@NonNull*/ [] __DockerCompose = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IPAM =
			{
				Fragments._IPAM__OclAny /* 0 */,
				Fragments._IPAM__OclElement /* 1 */,
				Fragments._IPAM__IPAM /* 2 */
			};
		private static final int /*@NonNull*/ [] __IPAM = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IPAMAddress =
			{
				Fragments._IPAMAddress__OclAny /* 0 */,
				Fragments._IPAMAddress__OclElement /* 1 */,
				Fragments._IPAMAddress__IPAMAddress /* 2 */
			};
		private static final int /*@NonNull*/ [] __IPAMAddress = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IPAMConfig =
			{
				Fragments._IPAMConfig__OclAny /* 0 */,
				Fragments._IPAMConfig__OclElement /* 1 */,
				Fragments._IPAMConfig__IPAMConfig /* 2 */
			};
		private static final int /*@NonNull*/ [] __IPAMConfig = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IPAMOption =
			{
				Fragments._IPAMOption__OclAny /* 0 */,
				Fragments._IPAMOption__OclElement /* 1 */,
				Fragments._IPAMOption__IPAMOption /* 2 */
			};
		private static final int /*@NonNull*/ [] __IPAMOption = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MountType =
			{
				Fragments._MountType__OclAny /* 0 */,
				Fragments._MountType__OclElement /* 1 */,
				Fragments._MountType__OclType /* 2 */,
				Fragments._MountType__OclEnumeration /* 3 */,
				Fragments._MountType__MountType /* 4 */
			};
		private static final int /*@NonNull*/ [] __MountType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Network =
			{
				Fragments._Network__OclAny /* 0 */,
				Fragments._Network__OclElement /* 1 */,
				Fragments._Network__Network /* 2 */
			};
		private static final int /*@NonNull*/ [] __Network = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NetworkAddress =
			{
				Fragments._NetworkAddress__OclAny /* 0 */,
				Fragments._NetworkAddress__OclElement /* 1 */,
				Fragments._NetworkAddress__DNS /* 2 */,
				Fragments._NetworkAddress__NetworkAddress /* 3 */
			};
		private static final int /*@NonNull*/ [] __NetworkAddress = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NetworkConnector =
			{
				Fragments._NetworkConnector__OclAny /* 0 */,
				Fragments._NetworkConnector__OclElement /* 1 */,
				Fragments._NetworkConnector__NetworkConnector /* 2 */
			};
		private static final int /*@NonNull*/ [] __NetworkConnector = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NetworkDriverOpt =
			{
				Fragments._NetworkDriverOpt__OclAny /* 0 */,
				Fragments._NetworkDriverOpt__OclElement /* 1 */,
				Fragments._NetworkDriverOpt__NetworkDriverOpt /* 2 */
			};
		private static final int /*@NonNull*/ [] __NetworkDriverOpt = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NetworkLabel =
			{
				Fragments._NetworkLabel__OclAny /* 0 */,
				Fragments._NetworkLabel__OclElement /* 1 */,
				Fragments._NetworkLabel__NetworkLabel /* 2 */
			};
		private static final int /*@NonNull*/ [] __NetworkLabel = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Port =
			{
				Fragments._Port__OclAny /* 0 */,
				Fragments._Port__OclElement /* 1 */,
				Fragments._Port__Port /* 2 */
			};
		private static final int /*@NonNull*/ [] __Port = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PropagationType =
			{
				Fragments._PropagationType__OclAny /* 0 */,
				Fragments._PropagationType__OclElement /* 1 */,
				Fragments._PropagationType__OclType /* 2 */,
				Fragments._PropagationType__OclEnumeration /* 3 */,
				Fragments._PropagationType__PropagationType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PropagationType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RestartPolicy =
			{
				Fragments._RestartPolicy__OclAny /* 0 */,
				Fragments._RestartPolicy__OclElement /* 1 */,
				Fragments._RestartPolicy__OclType /* 2 */,
				Fragments._RestartPolicy__OclEnumeration /* 3 */,
				Fragments._RestartPolicy__RestartPolicy /* 4 */
			};
		private static final int /*@NonNull*/ [] __RestartPolicy = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Secret =
			{
				Fragments._Secret__OclAny /* 0 */,
				Fragments._Secret__OclElement /* 1 */,
				Fragments._Secret__Secret /* 2 */
			};
		private static final int /*@NonNull*/ [] __Secret = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SecretConnector =
			{
				Fragments._SecretConnector__OclAny /* 0 */,
				Fragments._SecretConnector__OclElement /* 1 */,
				Fragments._SecretConnector__SecretConnector /* 2 */
			};
		private static final int /*@NonNull*/ [] __SecretConnector = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Service =
			{
				Fragments._Service__OclAny /* 0 */,
				Fragments._Service__OclElement /* 1 */,
				Fragments._Service__Service /* 2 */
			};
		private static final int /*@NonNull*/ [] __Service = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Volume =
			{
				Fragments._Volume__OclAny /* 0 */,
				Fragments._Volume__OclElement /* 1 */,
				Fragments._Volume__Volume /* 2 */
			};
		private static final int /*@NonNull*/ [] __Volume = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VolumeConnector =
			{
				Fragments._VolumeConnector__OclAny /* 0 */,
				Fragments._VolumeConnector__OclElement /* 1 */,
				Fragments._VolumeConnector__VolumeConnector /* 2 */
			};
		private static final int /*@NonNull*/ [] __VolumeConnector = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VolumeDriverOpt =
			{
				Fragments._VolumeDriverOpt__OclAny /* 0 */,
				Fragments._VolumeDriverOpt__OclElement /* 1 */,
				Fragments._VolumeDriverOpt__VolumeDriverOpt /* 2 */
			};
		private static final int /*@NonNull*/ [] __VolumeDriverOpt = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VolumeLabel =
			{
				Fragments._VolumeLabel__OclAny /* 0 */,
				Fragments._VolumeLabel__OclElement /* 1 */,
				Fragments._VolumeLabel__VolumeLabel /* 2 */
			};
		private static final int /*@NonNull*/ [] __VolumeLabel = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AccessMode.initFragments(_AccessMode, __AccessMode);
			Types._Alias.initFragments(_Alias, __Alias);
			Types._Config.initFragments(_Config, __Config);
			Types._ConfigConnector.initFragments(_ConfigConnector, __ConfigConnector);
			Types._DNS.initFragments(_DNS, __DNS);
			Types._Dependency.initFragments(_Dependency, __Dependency);
			Types._Device.initFragments(_Device, __Device);
			Types._DockerCompose.initFragments(_DockerCompose, __DockerCompose);
			Types._IPAM.initFragments(_IPAM, __IPAM);
			Types._IPAMAddress.initFragments(_IPAMAddress, __IPAMAddress);
			Types._IPAMConfig.initFragments(_IPAMConfig, __IPAMConfig);
			Types._IPAMOption.initFragments(_IPAMOption, __IPAMOption);
			Types._MountType.initFragments(_MountType, __MountType);
			Types._Network.initFragments(_Network, __Network);
			Types._NetworkAddress.initFragments(_NetworkAddress, __NetworkAddress);
			Types._NetworkConnector.initFragments(_NetworkConnector, __NetworkConnector);
			Types._NetworkDriverOpt.initFragments(_NetworkDriverOpt, __NetworkDriverOpt);
			Types._NetworkLabel.initFragments(_NetworkLabel, __NetworkLabel);
			Types._Port.initFragments(_Port, __Port);
			Types._PropagationType.initFragments(_PropagationType, __PropagationType);
			Types._RestartPolicy.initFragments(_RestartPolicy, __RestartPolicy);
			Types._Secret.initFragments(_Secret, __Secret);
			Types._SecretConnector.initFragments(_SecretConnector, __SecretConnector);
			Types._Service.initFragments(_Service, __Service);
			Types._Volume.initFragments(_Volume, __Volume);
			Types._VolumeConnector.initFragments(_VolumeConnector, __VolumeConnector);
			Types._VolumeDriverOpt.initFragments(_VolumeDriverOpt, __VolumeDriverOpt);
			Types._VolumeLabel.initFragments(_VolumeLabel, __VolumeLabel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AccessMode__AccessMode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AccessMode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AccessMode__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AccessMode__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AccessMode__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Alias__Alias = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Alias__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Alias__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Config__Config = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Config__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Config__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ConfigConnector__ConfigConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConfigConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConfigConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DNS__DNS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DNS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DNS__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Dependency__Dependency = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Dependency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Dependency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Device__Device = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DockerCompose__DockerCompose = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DockerCompose__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DockerCompose__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IPAM__IPAM = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IPAM__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IPAM__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IPAMAddress__IPAMAddress = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IPAMAddress__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IPAMAddress__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IPAMConfig__IPAMConfig = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IPAMConfig__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IPAMConfig__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IPAMOption__IPAMOption = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IPAMOption__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IPAMOption__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MountType__MountType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MountType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MountType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MountType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MountType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Network__Network = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NetworkAddress__NetworkAddress = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkAddress__DNS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkAddress__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkAddress__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NetworkConnector__NetworkConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NetworkDriverOpt__NetworkDriverOpt = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkDriverOpt__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkDriverOpt__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NetworkLabel__NetworkLabel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkLabel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkLabel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Port__Port = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Port__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Port__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PropagationType__PropagationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PropagationType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PropagationType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PropagationType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PropagationType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RestartPolicy__RestartPolicy = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RestartPolicy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RestartPolicy__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RestartPolicy__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RestartPolicy__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Secret__Secret = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Secret__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Secret__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SecretConnector__SecretConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecretConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SecretConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Service__Service = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Volume__Volume = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Volume__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Volume__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VolumeConnector__VolumeConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VolumeDriverOpt__VolumeDriverOpt = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeDriverOpt__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeDriverOpt__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VolumeLabel__VolumeLabel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeLabel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeLabel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AccessMode__AccessMode.initOperations(_AccessMode__AccessMode);
			Fragments._AccessMode__OclAny.initOperations(_AccessMode__OclAny);
			Fragments._AccessMode__OclElement.initOperations(_AccessMode__OclElement);
			Fragments._AccessMode__OclEnumeration.initOperations(_AccessMode__OclEnumeration);
			Fragments._AccessMode__OclType.initOperations(_AccessMode__OclType);

			Fragments._Alias__Alias.initOperations(_Alias__Alias);
			Fragments._Alias__OclAny.initOperations(_Alias__OclAny);
			Fragments._Alias__OclElement.initOperations(_Alias__OclElement);

			Fragments._Config__Config.initOperations(_Config__Config);
			Fragments._Config__OclAny.initOperations(_Config__OclAny);
			Fragments._Config__OclElement.initOperations(_Config__OclElement);

			Fragments._ConfigConnector__ConfigConnector.initOperations(_ConfigConnector__ConfigConnector);
			Fragments._ConfigConnector__OclAny.initOperations(_ConfigConnector__OclAny);
			Fragments._ConfigConnector__OclElement.initOperations(_ConfigConnector__OclElement);

			Fragments._DNS__DNS.initOperations(_DNS__DNS);
			Fragments._DNS__OclAny.initOperations(_DNS__OclAny);
			Fragments._DNS__OclElement.initOperations(_DNS__OclElement);

			Fragments._Dependency__Dependency.initOperations(_Dependency__Dependency);
			Fragments._Dependency__OclAny.initOperations(_Dependency__OclAny);
			Fragments._Dependency__OclElement.initOperations(_Dependency__OclElement);

			Fragments._Device__Device.initOperations(_Device__Device);
			Fragments._Device__OclAny.initOperations(_Device__OclAny);
			Fragments._Device__OclElement.initOperations(_Device__OclElement);

			Fragments._DockerCompose__DockerCompose.initOperations(_DockerCompose__DockerCompose);
			Fragments._DockerCompose__OclAny.initOperations(_DockerCompose__OclAny);
			Fragments._DockerCompose__OclElement.initOperations(_DockerCompose__OclElement);

			Fragments._IPAM__IPAM.initOperations(_IPAM__IPAM);
			Fragments._IPAM__OclAny.initOperations(_IPAM__OclAny);
			Fragments._IPAM__OclElement.initOperations(_IPAM__OclElement);

			Fragments._IPAMAddress__IPAMAddress.initOperations(_IPAMAddress__IPAMAddress);
			Fragments._IPAMAddress__OclAny.initOperations(_IPAMAddress__OclAny);
			Fragments._IPAMAddress__OclElement.initOperations(_IPAMAddress__OclElement);

			Fragments._IPAMConfig__IPAMConfig.initOperations(_IPAMConfig__IPAMConfig);
			Fragments._IPAMConfig__OclAny.initOperations(_IPAMConfig__OclAny);
			Fragments._IPAMConfig__OclElement.initOperations(_IPAMConfig__OclElement);

			Fragments._IPAMOption__IPAMOption.initOperations(_IPAMOption__IPAMOption);
			Fragments._IPAMOption__OclAny.initOperations(_IPAMOption__OclAny);
			Fragments._IPAMOption__OclElement.initOperations(_IPAMOption__OclElement);

			Fragments._MountType__MountType.initOperations(_MountType__MountType);
			Fragments._MountType__OclAny.initOperations(_MountType__OclAny);
			Fragments._MountType__OclElement.initOperations(_MountType__OclElement);
			Fragments._MountType__OclEnumeration.initOperations(_MountType__OclEnumeration);
			Fragments._MountType__OclType.initOperations(_MountType__OclType);

			Fragments._Network__Network.initOperations(_Network__Network);
			Fragments._Network__OclAny.initOperations(_Network__OclAny);
			Fragments._Network__OclElement.initOperations(_Network__OclElement);

			Fragments._NetworkAddress__DNS.initOperations(_NetworkAddress__DNS);
			Fragments._NetworkAddress__NetworkAddress.initOperations(_NetworkAddress__NetworkAddress);
			Fragments._NetworkAddress__OclAny.initOperations(_NetworkAddress__OclAny);
			Fragments._NetworkAddress__OclElement.initOperations(_NetworkAddress__OclElement);

			Fragments._NetworkConnector__NetworkConnector.initOperations(_NetworkConnector__NetworkConnector);
			Fragments._NetworkConnector__OclAny.initOperations(_NetworkConnector__OclAny);
			Fragments._NetworkConnector__OclElement.initOperations(_NetworkConnector__OclElement);

			Fragments._NetworkDriverOpt__NetworkDriverOpt.initOperations(_NetworkDriverOpt__NetworkDriverOpt);
			Fragments._NetworkDriverOpt__OclAny.initOperations(_NetworkDriverOpt__OclAny);
			Fragments._NetworkDriverOpt__OclElement.initOperations(_NetworkDriverOpt__OclElement);

			Fragments._NetworkLabel__NetworkLabel.initOperations(_NetworkLabel__NetworkLabel);
			Fragments._NetworkLabel__OclAny.initOperations(_NetworkLabel__OclAny);
			Fragments._NetworkLabel__OclElement.initOperations(_NetworkLabel__OclElement);

			Fragments._Port__OclAny.initOperations(_Port__OclAny);
			Fragments._Port__OclElement.initOperations(_Port__OclElement);
			Fragments._Port__Port.initOperations(_Port__Port);

			Fragments._PropagationType__OclAny.initOperations(_PropagationType__OclAny);
			Fragments._PropagationType__OclElement.initOperations(_PropagationType__OclElement);
			Fragments._PropagationType__OclEnumeration.initOperations(_PropagationType__OclEnumeration);
			Fragments._PropagationType__OclType.initOperations(_PropagationType__OclType);
			Fragments._PropagationType__PropagationType.initOperations(_PropagationType__PropagationType);

			Fragments._RestartPolicy__OclAny.initOperations(_RestartPolicy__OclAny);
			Fragments._RestartPolicy__OclElement.initOperations(_RestartPolicy__OclElement);
			Fragments._RestartPolicy__OclEnumeration.initOperations(_RestartPolicy__OclEnumeration);
			Fragments._RestartPolicy__OclType.initOperations(_RestartPolicy__OclType);
			Fragments._RestartPolicy__RestartPolicy.initOperations(_RestartPolicy__RestartPolicy);

			Fragments._Secret__OclAny.initOperations(_Secret__OclAny);
			Fragments._Secret__OclElement.initOperations(_Secret__OclElement);
			Fragments._Secret__Secret.initOperations(_Secret__Secret);

			Fragments._SecretConnector__OclAny.initOperations(_SecretConnector__OclAny);
			Fragments._SecretConnector__OclElement.initOperations(_SecretConnector__OclElement);
			Fragments._SecretConnector__SecretConnector.initOperations(_SecretConnector__SecretConnector);

			Fragments._Service__OclAny.initOperations(_Service__OclAny);
			Fragments._Service__OclElement.initOperations(_Service__OclElement);
			Fragments._Service__Service.initOperations(_Service__Service);

			Fragments._Volume__OclAny.initOperations(_Volume__OclAny);
			Fragments._Volume__OclElement.initOperations(_Volume__OclElement);
			Fragments._Volume__Volume.initOperations(_Volume__Volume);

			Fragments._VolumeConnector__OclAny.initOperations(_VolumeConnector__OclAny);
			Fragments._VolumeConnector__OclElement.initOperations(_VolumeConnector__OclElement);
			Fragments._VolumeConnector__VolumeConnector.initOperations(_VolumeConnector__VolumeConnector);

			Fragments._VolumeDriverOpt__OclAny.initOperations(_VolumeDriverOpt__OclAny);
			Fragments._VolumeDriverOpt__OclElement.initOperations(_VolumeDriverOpt__OclElement);
			Fragments._VolumeDriverOpt__VolumeDriverOpt.initOperations(_VolumeDriverOpt__VolumeDriverOpt);

			Fragments._VolumeLabel__OclAny.initOperations(_VolumeLabel__OclAny);
			Fragments._VolumeLabel__OclElement.initOperations(_VolumeLabel__OclElement);
			Fragments._VolumeLabel__VolumeLabel.initOperations(_VolumeLabel__VolumeLabel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AccessMode = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Alias = {
			DockercomposeTables.Properties._Alias__alias,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Config = {
			DockercomposeTables.Properties._Config__config_name,
			DockercomposeTables.Properties._Config__external,
			DockercomposeTables.Properties._Config__file,
			DockercomposeTables.Properties._Config__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConfigConnector = {
			DockercomposeTables.Properties._ConfigConnector__config,
			DockercomposeTables.Properties._ConfigConnector__gid,
			DockercomposeTables.Properties._ConfigConnector__mode,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._ConfigConnector__target,
			DockercomposeTables.Properties._ConfigConnector__uid
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DNS = {
			DockercomposeTables.Properties._DNS__dns1,
			DockercomposeTables.Properties._DNS__dns2,
			DockercomposeTables.Properties._DNS__dns3,
			DockercomposeTables.Properties._DNS__dns4,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Dependency = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._Dependency__service
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Device = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._Device__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DockerCompose = {
			DockercomposeTables.Properties._DockerCompose__configs,
			DockercomposeTables.Properties._DockerCompose__networks,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._DockerCompose__secrets,
			DockercomposeTables.Properties._DockerCompose__services,
			DockercomposeTables.Properties._DockerCompose__version,
			DockercomposeTables.Properties._DockerCompose__volumes
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IPAM = {
			DockercomposeTables.Properties._IPAM__configs,
			DockercomposeTables.Properties._IPAM__driver,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._IPAM__options
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IPAMAddress = {
			DockercomposeTables.Properties._IPAMAddress__dns,
			DockercomposeTables.Properties._IPAMAddress__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IPAMConfig = {
			DockercomposeTables.Properties._IPAMConfig__aux_addresses,
			DockercomposeTables.Properties._IPAMConfig__gateway,
			DockercomposeTables.Properties._IPAMConfig__ip_range,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._IPAMConfig__subnet
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IPAMOption = {
			DockercomposeTables.Properties._IPAMOption__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._IPAMOption__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MountType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Network = {
			DockercomposeTables.Properties._Network__attachable,
			DockercomposeTables.Properties._Network__driver,
			DockercomposeTables.Properties._Network__driver_opts,
			DockercomposeTables.Properties._Network__enable_ipv6,
			DockercomposeTables.Properties._Network__external,
			DockercomposeTables.Properties._Network__internal,
			DockercomposeTables.Properties._Network__ipam,
			DockercomposeTables.Properties._Network__labels,
			DockercomposeTables.Properties._Network__name,
			DockercomposeTables.Properties._Network__network_name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NetworkAddress = {
			DockercomposeTables.Properties._DNS__dns1,
			DockercomposeTables.Properties._DNS__dns2,
			DockercomposeTables.Properties._DNS__dns3,
			DockercomposeTables.Properties._DNS__dns4,
			DockercomposeTables.Properties._NetworkAddress__netId,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NetworkConnector = {
			DockercomposeTables.Properties._NetworkConnector__aliases,
			DockercomposeTables.Properties._NetworkConnector__ipv4_address,
			DockercomposeTables.Properties._NetworkConnector__link_local_ips,
			DockercomposeTables.Properties._NetworkConnector__network,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._NetworkConnector__priority
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NetworkDriverOpt = {
			DockercomposeTables.Properties._NetworkDriverOpt__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._NetworkDriverOpt__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NetworkLabel = {
			DockercomposeTables.Properties._NetworkLabel__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._NetworkLabel__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Port = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._Port__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PropagationType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RestartPolicy = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Secret = {
			DockercomposeTables.Properties._Secret__environment,
			DockercomposeTables.Properties._Secret__external,
			DockercomposeTables.Properties._Secret__file,
			DockercomposeTables.Properties._Secret__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._Secret__secret_name
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SecretConnector = {
			DockercomposeTables.Properties._SecretConnector__gid,
			DockercomposeTables.Properties._SecretConnector__mode,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._SecretConnector__secret,
			DockercomposeTables.Properties._SecretConnector__target,
			DockercomposeTables.Properties._SecretConnector__uid
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Service = {
			DockercomposeTables.Properties._Service__build,
			DockercomposeTables.Properties._Service__command,
			DockercomposeTables.Properties._Service__configs,
			DockercomposeTables.Properties._Service__container_name,
			DockercomposeTables.Properties._Service__cpu_count,
			DockercomposeTables.Properties._Service__depends_on,
			DockercomposeTables.Properties._Service__devices,
			DockercomposeTables.Properties._Service__dns,
			DockercomposeTables.Properties._Service__image,
			DockercomposeTables.Properties._Service__init,
			DockercomposeTables.Properties._Service__links,
			DockercomposeTables.Properties._Service__name,
			DockercomposeTables.Properties._Service__networks,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._Service__ports,
			DockercomposeTables.Properties._Service__read_only,
			DockercomposeTables.Properties._Service__restart,
			DockercomposeTables.Properties._Service__secrets,
			DockercomposeTables.Properties._Service__volumes
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Volume = {
			DockercomposeTables.Properties._Volume__driver,
			DockercomposeTables.Properties._Volume__driver_opts,
			DockercomposeTables.Properties._Volume__external,
			DockercomposeTables.Properties._Volume__labels,
			DockercomposeTables.Properties._Volume__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._Volume__volume_name
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VolumeConnector = {
			DockercomposeTables.Properties._VolumeConnector__access_mode,
			DockercomposeTables.Properties._VolumeConnector__container_path,
			DockercomposeTables.Properties._VolumeConnector__nocopy,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._VolumeConnector__propagation,
			DockercomposeTables.Properties._VolumeConnector__read_only,
			DockercomposeTables.Properties._VolumeConnector__size,
			DockercomposeTables.Properties._VolumeConnector__type,
			DockercomposeTables.Properties._VolumeConnector__volume
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VolumeDriverOpt = {
			DockercomposeTables.Properties._VolumeDriverOpt__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._VolumeDriverOpt__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VolumeLabel = {
			DockercomposeTables.Properties._VolumeLabel__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DockercomposeTables.Properties._VolumeLabel__value
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AccessMode__AccessMode.initProperties(_AccessMode);
			Fragments._Alias__Alias.initProperties(_Alias);
			Fragments._Config__Config.initProperties(_Config);
			Fragments._ConfigConnector__ConfigConnector.initProperties(_ConfigConnector);
			Fragments._DNS__DNS.initProperties(_DNS);
			Fragments._Dependency__Dependency.initProperties(_Dependency);
			Fragments._Device__Device.initProperties(_Device);
			Fragments._DockerCompose__DockerCompose.initProperties(_DockerCompose);
			Fragments._IPAM__IPAM.initProperties(_IPAM);
			Fragments._IPAMAddress__IPAMAddress.initProperties(_IPAMAddress);
			Fragments._IPAMConfig__IPAMConfig.initProperties(_IPAMConfig);
			Fragments._IPAMOption__IPAMOption.initProperties(_IPAMOption);
			Fragments._MountType__MountType.initProperties(_MountType);
			Fragments._Network__Network.initProperties(_Network);
			Fragments._NetworkAddress__NetworkAddress.initProperties(_NetworkAddress);
			Fragments._NetworkConnector__NetworkConnector.initProperties(_NetworkConnector);
			Fragments._NetworkDriverOpt__NetworkDriverOpt.initProperties(_NetworkDriverOpt);
			Fragments._NetworkLabel__NetworkLabel.initProperties(_NetworkLabel);
			Fragments._Port__Port.initProperties(_Port);
			Fragments._PropagationType__PropagationType.initProperties(_PropagationType);
			Fragments._RestartPolicy__RestartPolicy.initProperties(_RestartPolicy);
			Fragments._Secret__Secret.initProperties(_Secret);
			Fragments._SecretConnector__SecretConnector.initProperties(_SecretConnector);
			Fragments._Service__Service.initProperties(_Service);
			Fragments._Volume__Volume.initProperties(_Volume);
			Fragments._VolumeConnector__VolumeConnector.initProperties(_VolumeConnector);
			Fragments._VolumeDriverOpt__VolumeDriverOpt.initProperties(_VolumeDriverOpt);
			Fragments._VolumeLabel__VolumeLabel.initProperties(_VolumeLabel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _AccessMode__rw = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.ACCESS_MODE.getEEnumLiteral("rw"), Types._AccessMode, 0);
		public static final EcoreExecutorEnumerationLiteral _AccessMode__ro = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.ACCESS_MODE.getEEnumLiteral("ro"), Types._AccessMode, 1);
		public static final EcoreExecutorEnumerationLiteral _AccessMode__z = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.ACCESS_MODE.getEEnumLiteral("z"), Types._AccessMode, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AccessMode = {
			_AccessMode__rw,
			_AccessMode__ro,
			_AccessMode__z
		};

		public static final EcoreExecutorEnumerationLiteral _MountType__volume = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.MOUNT_TYPE.getEEnumLiteral("volume"), Types._MountType, 0);
		public static final EcoreExecutorEnumerationLiteral _MountType__bind = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.MOUNT_TYPE.getEEnumLiteral("bind"), Types._MountType, 1);
		public static final EcoreExecutorEnumerationLiteral _MountType__tmpfs = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.MOUNT_TYPE.getEEnumLiteral("tmpfs"), Types._MountType, 2);
		public static final EcoreExecutorEnumerationLiteral _MountType__npipe = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.MOUNT_TYPE.getEEnumLiteral("npipe"), Types._MountType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MountType = {
			_MountType__volume,
			_MountType__bind,
			_MountType__tmpfs,
			_MountType__npipe
		};

		public static final EcoreExecutorEnumerationLiteral _PropagationType__rprivate = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.PROPAGATION_TYPE.getEEnumLiteral("rprivate"), Types._PropagationType, 0);
		public static final EcoreExecutorEnumerationLiteral _PropagationType__private = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.PROPAGATION_TYPE.getEEnumLiteral("private"), Types._PropagationType, 1);
		public static final EcoreExecutorEnumerationLiteral _PropagationType__rshared = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.PROPAGATION_TYPE.getEEnumLiteral("rshared"), Types._PropagationType, 2);
		public static final EcoreExecutorEnumerationLiteral _PropagationType__shared = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.PROPAGATION_TYPE.getEEnumLiteral("shared"), Types._PropagationType, 3);
		public static final EcoreExecutorEnumerationLiteral _PropagationType__slave = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.PROPAGATION_TYPE.getEEnumLiteral("slave"), Types._PropagationType, 4);
		public static final EcoreExecutorEnumerationLiteral _PropagationType__rslave = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.PROPAGATION_TYPE.getEEnumLiteral("rslave"), Types._PropagationType, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PropagationType = {
			_PropagationType__rprivate,
			_PropagationType__private,
			_PropagationType__rshared,
			_PropagationType__shared,
			_PropagationType__slave,
			_PropagationType__rslave
		};

		public static final EcoreExecutorEnumerationLiteral _RestartPolicy__no = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.RESTART_POLICY.getEEnumLiteral("no"), Types._RestartPolicy, 0);
		public static final EcoreExecutorEnumerationLiteral _RestartPolicy__always = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.RESTART_POLICY.getEEnumLiteral("always"), Types._RestartPolicy, 1);
		public static final EcoreExecutorEnumerationLiteral _RestartPolicy__onfailure = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.RESTART_POLICY.getEEnumLiteral("onfailure"), Types._RestartPolicy, 2);
		public static final EcoreExecutorEnumerationLiteral _RestartPolicy__unlessstopped = new EcoreExecutorEnumerationLiteral(DockercomposePackage.Literals.RESTART_POLICY.getEEnumLiteral("unlessstopped"), Types._RestartPolicy, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _RestartPolicy = {
			_RestartPolicy__no,
			_RestartPolicy__always,
			_RestartPolicy__onfailure,
			_RestartPolicy__unlessstopped
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AccessMode.initLiterals(_AccessMode);
			Types._MountType.initLiterals(_MountType);
			Types._PropagationType.initLiterals(_PropagationType);
			Types._RestartPolicy.initLiterals(_RestartPolicy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DockercomposeTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DockercomposeTables();
	}

	private DockercomposeTables() {
		super(DockercomposePackage.eNS_URI);
	}
}
