/**
 */
package dockercompose.impl;

import dockercompose.Config;
import dockercompose.ConfigConnector;
import dockercompose.DNS;
import dockercompose.Dependency;
import dockercompose.Device;
import dockercompose.DockercomposePackage;
import dockercompose.DockercomposeTables;
import dockercompose.EnvironmentVariable;
import dockercompose.Link;
import dockercompose.Network;
import dockercompose.NetworkConnector;
import dockercompose.Port;
import dockercompose.RestartPolicy;
import dockercompose.Secret;
import dockercompose.SecretConnector;
import dockercompose.Service;
import dockercompose.Volume;
import dockercompose.VolumeConnector;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockercompose.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getCpu_count <em>Cpu count</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getContainer_name <em>Container name</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getDns <em>Dns</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#isInit <em>Init</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#isRead_only <em>Read only</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getRestart <em>Restart</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getDepends_on <em>Depends on</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getConfigs <em>Configs</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dockercompose.impl.ServiceImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuild() <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected String build = BUILD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu_count() <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_count()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu_count() <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_count()
	 * @generated
	 * @ordered
	 */
	protected int cpu_count = CPU_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer_name() <em>Container name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer_name() <em>Container name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_name()
	 * @generated
	 * @ordered
	 */
	protected String container_name = CONTAINER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getDns() <em>Dns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected EList<DNS> dns;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRead_only() <em>Read only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead_only()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRead_only() <em>Read only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead_only()
	 * @generated
	 * @ordered
	 */
	protected boolean read_only = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected static final RestartPolicy RESTART_EDEFAULT = RestartPolicy.NO;

	/**
	 * The cached value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected RestartPolicy restart = RESTART_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepends_on() <em>Depends on</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends_on()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> depends_on;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeConnector> volumes;

	/**
	 * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigConnector> configs;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<SecretConnector> secrets;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkConnector> networks;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentVariable> environment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuild(String newBuild) {
		String oldBuild = build;
		build = newBuild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__BUILD, oldBuild, build));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCpu_count() {
		return cpu_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpu_count(int newCpu_count) {
		int oldCpu_count = cpu_count;
		cpu_count = newCpu_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__CPU_COUNT, oldCpu_count, cpu_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainer_name() {
		return container_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer_name(String newContainer_name) {
		String oldContainer_name = container_name;
		container_name = newContainer_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__CONTAINER_NAME, oldContainer_name, container_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Device>(Device.class, this, DockercomposePackage.SERVICE__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNS> getDns() {
		if (dns == null) {
			dns = new EObjectContainmentEList<DNS>(DNS.class, this, DockercomposePackage.SERVICE__DNS);
		}
		return dns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, DockercomposePackage.SERVICE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvironmentVariable> getEnvironment() {
		if (environment == null) {
			environment = new EObjectContainmentEList<EnvironmentVariable>(EnvironmentVariable.class, this, DockercomposePackage.SERVICE__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRead_only() {
		return read_only;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRead_only(boolean newRead_only) {
		boolean oldRead_only = read_only;
		read_only = newRead_only;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__READ_ONLY, oldRead_only, read_only));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestartPolicy getRestart() {
		return restart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestart(RestartPolicy newRestart) {
		RestartPolicy oldRestart = restart;
		restart = newRestart == null ? RESTART_EDEFAULT : newRestart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__RESTART, oldRestart, restart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dependency> getDepends_on() {
		if (depends_on == null) {
			depends_on = new EObjectContainmentEList<Dependency>(Dependency.class, this, DockercomposePackage.SERVICE__DEPENDS_ON);
		}
		return depends_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeConnector> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<VolumeConnector>(VolumeConnector.class, this, DockercomposePackage.SERVICE__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigConnector> getConfigs() {
		if (configs == null) {
			configs = new EObjectContainmentEList<ConfigConnector>(ConfigConnector.class, this, DockercomposePackage.SERVICE__CONFIGS);
		}
		return configs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecretConnector> getSecrets() {
		if (secrets == null) {
			secrets = new EObjectContainmentEList<SecretConnector>(SecretConnector.class, this, DockercomposePackage.SERVICE__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NetworkConnector> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<NetworkConnector>(NetworkConnector.class, this, DockercomposePackage.SERVICE__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, DockercomposePackage.SERVICE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean image_or_build(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::image_or_build";
		try {
			/**
			 *
			 * inv image_or_build:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = image->excluding('')
			 *         ->notEmpty() and
			 *         build->excluding('')
			 *         ->isEmpty() or
			 *         image->excluding('')
			 *         ->isEmpty() and
			 *         build->excluding('')
			 *         ->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SERVICE___IMAGE_OR_BUILD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						/*@Caught*/ Object CAUGHT_notEmpty;
						try {
							final /*@NonInvalid*/ String image = this.getImage();
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_PRIMid_String, image);
							final /*@Thrown*/ SetValue excluding = (SetValue)CollectionExcludingOperation.INSTANCE.evaluate(oclAsSet, DockercomposeTables.STR_);
							final /*@Thrown*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(excluding).booleanValue();
							CAUGHT_notEmpty = notEmpty;
						}
						catch (Exception e) {
							CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_notEmpty == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							/*@Caught*/ Object CAUGHT_isEmpty;
							try {
								final /*@NonInvalid*/ String build = this.getBuild();
								final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_PRIMid_String, build);
								final /*@Thrown*/ SetValue excluding_0 = (SetValue)CollectionExcludingOperation.INSTANCE.evaluate(oclAsSet_0, DockercomposeTables.STR_);
								final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(excluding_0).booleanValue();
								CAUGHT_isEmpty = isEmpty;
							}
							catch (Exception e) {
								CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_isEmpty == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_notEmpty instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_notEmpty;
								}
								if (CAUGHT_isEmpty instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_isEmpty;
								}
								and = ValueUtil.TRUE_VALUE;
							}
						}
						CAUGHT_and = and;
					}
					catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ Object CAUGHT_isEmpty_0;
							try {
								final /*@NonInvalid*/ String image_0 = this.getImage();
								final /*@Thrown*/ SetValue oclAsSet_1 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_PRIMid_String, image_0);
								final /*@Thrown*/ SetValue excluding_1 = (SetValue)CollectionExcludingOperation.INSTANCE.evaluate(oclAsSet_1, DockercomposeTables.STR_);
								final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(excluding_1).booleanValue();
								CAUGHT_isEmpty_0 = isEmpty_0;
							}
							catch (Exception e) {
								CAUGHT_isEmpty_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0;
							if (CAUGHT_isEmpty_0 == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_notEmpty_0;
								try {
									final /*@NonInvalid*/ String build_0 = this.getBuild();
									final /*@Thrown*/ SetValue oclAsSet_2 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DockercomposeTables.SET_PRIMid_String, build_0);
									final /*@Thrown*/ SetValue excluding_2 = (SetValue)CollectionExcludingOperation.INSTANCE.evaluate(oclAsSet_2, DockercomposeTables.STR_);
									final /*@Thrown*/ boolean notEmpty_0 = CollectionNotEmptyOperation.INSTANCE.evaluate(excluding_2).booleanValue();
									CAUGHT_notEmpty_0 = notEmpty_0;
								}
								catch (Exception e) {
									CAUGHT_notEmpty_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_notEmpty_0 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_isEmpty_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_isEmpty_0;
									}
									if (CAUGHT_notEmpty_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_notEmpty_0;
									}
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and_0 = and_0;
						}
						catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_volumes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::different_volumes";
		try {
			/**
			 *
			 * inv different_volumes:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.volumes.volume->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SERVICE___DIFFERENT_VOLUMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<VolumeConnector> volumes = this.getVolumes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_volumes = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_VolumeConnector, volumes);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Volume);
				Iterator<Object> ITERATOR__1 = BOXED_volumes.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ VolumeConnector _1 = (VolumeConnector)ITERATOR__1.next();
					/**
					 * volume
					 */
					final /*@NonInvalid*/ Volume volume = _1.getVolume();
					//
					accumulator.add(volume);
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Volume);
				Iterator<Object> ITERATOR__1_0 = collect.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Volume _1_0 = (Volume)ITERATOR__1_0.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1_0.getName();
					//
					if (accumulator_0.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator_0.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_links(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::different_links";
		try {
			/**
			 *
			 * inv different_links:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.links.service->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SERVICE___DIFFERENT_LINKS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Link> links = this.getLinks();
				final /*@NonInvalid*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Service);
				Iterator<Object> ITERATOR__1 = BOXED_links.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Link _1 = (Link)ITERATOR__1.next();
					/**
					 * service
					 */
					final /*@NonInvalid*/ Service service = _1.getService();
					//
					accumulator.add(service);
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Service);
				Iterator<Object> ITERATOR__1_0 = collect.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Service _1_0 = (Service)ITERATOR__1_0.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1_0.getName();
					//
					if (accumulator_0.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator_0.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_networks(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::different_networks";
		try {
			/**
			 *
			 * inv different_networks:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.networks.network->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SERVICE___DIFFERENT_NETWORKS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<NetworkConnector> networks = this.getNetworks();
				final /*@NonInvalid*/ OrderedSetValue BOXED_networks = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_NetworkConnector, networks);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Network);
				Iterator<Object> ITERATOR__1 = BOXED_networks.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ NetworkConnector _1 = (NetworkConnector)ITERATOR__1.next();
					/**
					 * network
					 */
					final /*@NonInvalid*/ Network network = _1.getNetwork();
					//
					accumulator.add(network);
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Network);
				Iterator<Object> ITERATOR__1_0 = collect.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Network _1_0 = (Network)ITERATOR__1_0.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1_0.getName();
					//
					if (accumulator_0.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator_0.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_dependencies(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::different_dependencies";
		try {
			/**
			 *
			 * inv different_dependencies:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.depends_on.service->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SERVICE___DIFFERENT_DEPENDENCIES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Dependency> depends_on = this.getDepends_on();
				final /*@NonInvalid*/ OrderedSetValue BOXED_depends_on = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_Dependency, depends_on);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Service);
				Iterator<Object> ITERATOR__1 = BOXED_depends_on.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Dependency _1 = (Dependency)ITERATOR__1.next();
					/**
					 * service
					 */
					final /*@NonInvalid*/ Service service = _1.getService();
					//
					accumulator.add(service);
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Service);
				Iterator<Object> ITERATOR__1_0 = collect.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Service _1_0 = (Service)ITERATOR__1_0.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1_0.getName();
					//
					if (accumulator_0.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator_0.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean no_self_dependencies(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::no_self_dependencies";
		try {
			/**
			 *
			 * inv no_self_dependencies:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.depends_on.service->excludes(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SERVICE___NO_SELF_DEPENDENCIES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Dependency> depends_on = this.getDepends_on();
				final /*@NonInvalid*/ OrderedSetValue BOXED_depends_on = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_Dependency, depends_on);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Service);
				Iterator<Object> ITERATOR__1 = BOXED_depends_on.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Dependency _1 = (Dependency)ITERATOR__1.next();
					/**
					 * service
					 */
					final /*@NonInvalid*/ Service service = _1.getService();
					//
					accumulator.add(service);
				}
				final /*@NonInvalid*/ boolean result = CollectionExcludesOperation.INSTANCE.evaluate(collect, this).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_secrets(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::different_secrets";
		try {
			/**
			 *
			 * inv different_secrets:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.secrets.secret->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SERVICE___DIFFERENT_SECRETS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<SecretConnector> secrets = this.getSecrets();
				final /*@NonInvalid*/ OrderedSetValue BOXED_secrets = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_SecretConnector, secrets);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Secret);
				Iterator<Object> ITERATOR__1 = BOXED_secrets.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ SecretConnector _1 = (SecretConnector)ITERATOR__1.next();
					/**
					 * secret
					 */
					final /*@NonInvalid*/ Secret secret = _1.getSecret();
					//
					accumulator.add(secret);
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Secret);
				Iterator<Object> ITERATOR__1_0 = collect.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Secret _1_0 = (Secret)ITERATOR__1_0.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1_0.getName();
					//
					if (accumulator_0.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator_0.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean different_configs(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Service::different_configs";
		try {
			/**
			 *
			 * inv different_configs:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.configs.config->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DockercomposePackage.Literals.SERVICE___DIFFERENT_CONFIGS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DockercomposeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<ConfigConnector> configs = this.getConfigs();
				final /*@NonInvalid*/ OrderedSetValue BOXED_configs = idResolver.createOrderedSetOfAll(DockercomposeTables.ORD_CLSSid_ConfigConnector, configs);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Config);
				Iterator<Object> ITERATOR__1 = BOXED_configs.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ ConfigConnector _1 = (ConfigConnector)ITERATOR__1.next();
					/**
					 * config
					 */
					final /*@NonInvalid*/ Config config = _1.getConfig();
					//
					accumulator.add(config);
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(DockercomposeTables.SEQ_CLSSid_Config);
				Iterator<Object> ITERATOR__1_0 = collect.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Config _1_0 = (Config)ITERATOR__1_0.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1_0.getName();
					//
					if (accumulator_0.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator_0.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DockercomposeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockercomposePackage.SERVICE__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__DNS:
				return ((InternalEList<?>)getDns()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__DEPENDS_ON:
				return ((InternalEList<?>)getDepends_on()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__CONFIGS:
				return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__SECRETS:
				return ((InternalEList<?>)getSecrets()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case DockercomposePackage.SERVICE__ENVIRONMENT:
				return ((InternalEList<?>)getEnvironment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockercomposePackage.SERVICE__NAME:
				return getName();
			case DockercomposePackage.SERVICE__BUILD:
				return getBuild();
			case DockercomposePackage.SERVICE__CPU_COUNT:
				return getCpu_count();
			case DockercomposePackage.SERVICE__COMMAND:
				return getCommand();
			case DockercomposePackage.SERVICE__CONTAINER_NAME:
				return getContainer_name();
			case DockercomposePackage.SERVICE__DEVICES:
				return getDevices();
			case DockercomposePackage.SERVICE__DNS:
				return getDns();
			case DockercomposePackage.SERVICE__IMAGE:
				return getImage();
			case DockercomposePackage.SERVICE__INIT:
				return isInit();
			case DockercomposePackage.SERVICE__READ_ONLY:
				return isRead_only();
			case DockercomposePackage.SERVICE__RESTART:
				return getRestart();
			case DockercomposePackage.SERVICE__DEPENDS_ON:
				return getDepends_on();
			case DockercomposePackage.SERVICE__VOLUMES:
				return getVolumes();
			case DockercomposePackage.SERVICE__CONFIGS:
				return getConfigs();
			case DockercomposePackage.SERVICE__SECRETS:
				return getSecrets();
			case DockercomposePackage.SERVICE__NETWORKS:
				return getNetworks();
			case DockercomposePackage.SERVICE__PORTS:
				return getPorts();
			case DockercomposePackage.SERVICE__LINKS:
				return getLinks();
			case DockercomposePackage.SERVICE__ENVIRONMENT:
				return getEnvironment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockercomposePackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case DockercomposePackage.SERVICE__BUILD:
				setBuild((String)newValue);
				return;
			case DockercomposePackage.SERVICE__CPU_COUNT:
				setCpu_count((Integer)newValue);
				return;
			case DockercomposePackage.SERVICE__COMMAND:
				setCommand((String)newValue);
				return;
			case DockercomposePackage.SERVICE__CONTAINER_NAME:
				setContainer_name((String)newValue);
				return;
			case DockercomposePackage.SERVICE__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case DockercomposePackage.SERVICE__DNS:
				getDns().clear();
				getDns().addAll((Collection<? extends DNS>)newValue);
				return;
			case DockercomposePackage.SERVICE__IMAGE:
				setImage((String)newValue);
				return;
			case DockercomposePackage.SERVICE__INIT:
				setInit((Boolean)newValue);
				return;
			case DockercomposePackage.SERVICE__READ_ONLY:
				setRead_only((Boolean)newValue);
				return;
			case DockercomposePackage.SERVICE__RESTART:
				setRestart((RestartPolicy)newValue);
				return;
			case DockercomposePackage.SERVICE__DEPENDS_ON:
				getDepends_on().clear();
				getDepends_on().addAll((Collection<? extends Dependency>)newValue);
				return;
			case DockercomposePackage.SERVICE__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends VolumeConnector>)newValue);
				return;
			case DockercomposePackage.SERVICE__CONFIGS:
				getConfigs().clear();
				getConfigs().addAll((Collection<? extends ConfigConnector>)newValue);
				return;
			case DockercomposePackage.SERVICE__SECRETS:
				getSecrets().clear();
				getSecrets().addAll((Collection<? extends SecretConnector>)newValue);
				return;
			case DockercomposePackage.SERVICE__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends NetworkConnector>)newValue);
				return;
			case DockercomposePackage.SERVICE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case DockercomposePackage.SERVICE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case DockercomposePackage.SERVICE__ENVIRONMENT:
				getEnvironment().clear();
				getEnvironment().addAll((Collection<? extends EnvironmentVariable>)newValue);
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
			case DockercomposePackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__BUILD:
				setBuild(BUILD_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__CPU_COUNT:
				setCpu_count(CPU_COUNT_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__CONTAINER_NAME:
				setContainer_name(CONTAINER_NAME_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__DEVICES:
				getDevices().clear();
				return;
			case DockercomposePackage.SERVICE__DNS:
				getDns().clear();
				return;
			case DockercomposePackage.SERVICE__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__READ_ONLY:
				setRead_only(READ_ONLY_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__RESTART:
				setRestart(RESTART_EDEFAULT);
				return;
			case DockercomposePackage.SERVICE__DEPENDS_ON:
				getDepends_on().clear();
				return;
			case DockercomposePackage.SERVICE__VOLUMES:
				getVolumes().clear();
				return;
			case DockercomposePackage.SERVICE__CONFIGS:
				getConfigs().clear();
				return;
			case DockercomposePackage.SERVICE__SECRETS:
				getSecrets().clear();
				return;
			case DockercomposePackage.SERVICE__NETWORKS:
				getNetworks().clear();
				return;
			case DockercomposePackage.SERVICE__PORTS:
				getPorts().clear();
				return;
			case DockercomposePackage.SERVICE__LINKS:
				getLinks().clear();
				return;
			case DockercomposePackage.SERVICE__ENVIRONMENT:
				getEnvironment().clear();
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
			case DockercomposePackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DockercomposePackage.SERVICE__BUILD:
				return BUILD_EDEFAULT == null ? build != null : !BUILD_EDEFAULT.equals(build);
			case DockercomposePackage.SERVICE__CPU_COUNT:
				return cpu_count != CPU_COUNT_EDEFAULT;
			case DockercomposePackage.SERVICE__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case DockercomposePackage.SERVICE__CONTAINER_NAME:
				return CONTAINER_NAME_EDEFAULT == null ? container_name != null : !CONTAINER_NAME_EDEFAULT.equals(container_name);
			case DockercomposePackage.SERVICE__DEVICES:
				return devices != null && !devices.isEmpty();
			case DockercomposePackage.SERVICE__DNS:
				return dns != null && !dns.isEmpty();
			case DockercomposePackage.SERVICE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockercomposePackage.SERVICE__INIT:
				return init != INIT_EDEFAULT;
			case DockercomposePackage.SERVICE__READ_ONLY:
				return read_only != READ_ONLY_EDEFAULT;
			case DockercomposePackage.SERVICE__RESTART:
				return restart != RESTART_EDEFAULT;
			case DockercomposePackage.SERVICE__DEPENDS_ON:
				return depends_on != null && !depends_on.isEmpty();
			case DockercomposePackage.SERVICE__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case DockercomposePackage.SERVICE__CONFIGS:
				return configs != null && !configs.isEmpty();
			case DockercomposePackage.SERVICE__SECRETS:
				return secrets != null && !secrets.isEmpty();
			case DockercomposePackage.SERVICE__NETWORKS:
				return networks != null && !networks.isEmpty();
			case DockercomposePackage.SERVICE__PORTS:
				return ports != null && !ports.isEmpty();
			case DockercomposePackage.SERVICE__LINKS:
				return links != null && !links.isEmpty();
			case DockercomposePackage.SERVICE__ENVIRONMENT:
				return environment != null && !environment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DockercomposePackage.SERVICE___DIFFERENT_DEPENDENCIES__DIAGNOSTICCHAIN_MAP:
				return different_dependencies((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.SERVICE___NO_SELF_DEPENDENCIES__DIAGNOSTICCHAIN_MAP:
				return no_self_dependencies((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.SERVICE___DIFFERENT_CONFIGS__DIAGNOSTICCHAIN_MAP:
				return different_configs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.SERVICE___DIFFERENT_SECRETS__DIAGNOSTICCHAIN_MAP:
				return different_secrets((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.SERVICE___IMAGE_OR_BUILD__DIAGNOSTICCHAIN_MAP:
				return image_or_build((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.SERVICE___DIFFERENT_VOLUMES__DIAGNOSTICCHAIN_MAP:
				return different_volumes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.SERVICE___DIFFERENT_LINKS__DIAGNOSTICCHAIN_MAP:
				return different_links((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockercomposePackage.SERVICE___DIFFERENT_NETWORKS__DIAGNOSTICCHAIN_MAP:
				return different_networks((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", build: ");
		result.append(build);
		result.append(", cpu_count: ");
		result.append(cpu_count);
		result.append(", command: ");
		result.append(command);
		result.append(", container_name: ");
		result.append(container_name);
		result.append(", image: ");
		result.append(image);
		result.append(", init: ");
		result.append(init);
		result.append(", read_only: ");
		result.append(read_only);
		result.append(", restart: ");
		result.append(restart);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
