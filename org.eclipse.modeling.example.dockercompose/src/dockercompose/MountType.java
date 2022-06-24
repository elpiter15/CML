/**
 */
package dockercompose;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mount Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dockercompose.DockercomposePackage#getMountType()
 * @model
 * @generated
 */
public enum MountType implements Enumerator {
	/**
	 * The '<em><b>Volume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLUME_VALUE
	 * @generated
	 * @ordered
	 */
	VOLUME(0, "volume", "volume"),

	/**
	 * The '<em><b>Bind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND_VALUE
	 * @generated
	 * @ordered
	 */
	BIND(1, "bind", "bind"),

	/**
	 * The '<em><b>Tmpfs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TMPFS_VALUE
	 * @generated
	 * @ordered
	 */
	TMPFS(2, "tmpfs", "tmpfs"),

	/**
	 * The '<em><b>Npipe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NPIPE_VALUE
	 * @generated
	 * @ordered
	 */
	NPIPE(3, "npipe", "npipe");

	/**
	 * The '<em><b>Volume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLUME
	 * @model name="volume"
	 * @generated
	 * @ordered
	 */
	public static final int VOLUME_VALUE = 0;

	/**
	 * The '<em><b>Bind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND
	 * @model name="bind"
	 * @generated
	 * @ordered
	 */
	public static final int BIND_VALUE = 1;

	/**
	 * The '<em><b>Tmpfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TMPFS
	 * @model name="tmpfs"
	 * @generated
	 * @ordered
	 */
	public static final int TMPFS_VALUE = 2;

	/**
	 * The '<em><b>Npipe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NPIPE
	 * @model name="npipe"
	 * @generated
	 * @ordered
	 */
	public static final int NPIPE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Mount Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MountType[] VALUES_ARRAY =
		new MountType[] {
			VOLUME,
			BIND,
			TMPFS,
			NPIPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Mount Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MountType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mount Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MountType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MountType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mount Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MountType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MountType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mount Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MountType get(int value) {
		switch (value) {
			case VOLUME_VALUE: return VOLUME;
			case BIND_VALUE: return BIND;
			case TMPFS_VALUE: return TMPFS;
			case NPIPE_VALUE: return NPIPE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MountType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MountType
