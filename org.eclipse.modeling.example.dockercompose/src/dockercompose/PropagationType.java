/**
 */
package dockercompose;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Propagation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dockercompose.DockercomposePackage#getPropagationType()
 * @model
 * @generated
 */
public enum PropagationType implements Enumerator {
	/**
	 * The '<em><b>Rprivate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	RPRIVATE(0, "rprivate", "rprivate"),

	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(1, "private", "private"),

	/**
	 * The '<em><b>Rshared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSHARED_VALUE
	 * @generated
	 * @ordered
	 */
	RSHARED(2, "rshared", "rshared"),

	/**
	 * The '<em><b>Shared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_VALUE
	 * @generated
	 * @ordered
	 */
	SHARED(3, "shared", "shared"),

	/**
	 * The '<em><b>Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLAVE_VALUE
	 * @generated
	 * @ordered
	 */
	SLAVE(4, "slave", "slave"), /**
	 * The '<em><b>Rslave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSLAVE_VALUE
	 * @generated
	 * @ordered
	 */
	RSLAVE(5, "rslave", "rslave");

	/**
	 * The '<em><b>Rprivate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPRIVATE
	 * @model name="rprivate"
	 * @generated
	 * @ordered
	 */
	public static final int RPRIVATE_VALUE = 0;

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model name="private"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 1;

	/**
	 * The '<em><b>Rshared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSHARED
	 * @model name="rshared"
	 * @generated
	 * @ordered
	 */
	public static final int RSHARED_VALUE = 2;

	/**
	 * The '<em><b>Shared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED
	 * @model name="shared"
	 * @generated
	 * @ordered
	 */
	public static final int SHARED_VALUE = 3;

	/**
	 * The '<em><b>Slave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLAVE
	 * @model name="slave"
	 * @generated
	 * @ordered
	 */
	public static final int SLAVE_VALUE = 4;

	/**
	 * The '<em><b>Rslave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSLAVE
	 * @model name="rslave"
	 * @generated
	 * @ordered
	 */
	public static final int RSLAVE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Propagation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropagationType[] VALUES_ARRAY =
		new PropagationType[] {
			RPRIVATE,
			PRIVATE,
			RSHARED,
			SHARED,
			SLAVE,
			RSLAVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Propagation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropagationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Propagation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropagationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropagationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Propagation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropagationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropagationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Propagation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropagationType get(int value) {
		switch (value) {
			case RPRIVATE_VALUE: return RPRIVATE;
			case PRIVATE_VALUE: return PRIVATE;
			case RSHARED_VALUE: return RSHARED;
			case SHARED_VALUE: return SHARED;
			case SLAVE_VALUE: return SLAVE;
			case RSLAVE_VALUE: return RSLAVE;
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
	private PropagationType(int value, String name, String literal) {
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
	
} //PropagationType
