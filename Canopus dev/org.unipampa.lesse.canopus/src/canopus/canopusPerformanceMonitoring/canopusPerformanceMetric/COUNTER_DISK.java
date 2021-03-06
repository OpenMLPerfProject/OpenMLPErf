/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COUNTER DISK</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getCOUNTER_DISK()
 * @model
 * @generated
 */
public enum COUNTER_DISK implements Enumerator {
	/**
	 * The '<em><b>AVG DISK SECS TRANSFER COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVG_DISK_SECS_TRANSFER_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	AVG_DISK_SECS_TRANSFER_COUNTER(0, "AVG_DISK_SECS_TRANSFER_COUNTER", "AVG DISK SECS TRANSFER COUNTER"),

	/**
	 * The '<em><b>PERCENTAGE IDLE TIME COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_IDLE_TIME_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE_IDLE_TIME_COUNTER(1, "PERCENTAGE_IDLE_TIME_COUNTER", "PERCENTAGE IDLE TIME COUNTER"),

	/**
	 * The '<em><b>DISK TRANSFERS SEC COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISK_TRANSFERS_SEC_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	DISK_TRANSFERS_SEC_COUNTER(2, "DISK_TRANSFERS_SEC_COUNTER", "DISK TRANSFERS SEC COUNTER"),

	/**
	 * The '<em><b>AVG DISK QUEUE LENGTH COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVG_DISK_QUEUE_LENGTH_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	AVG_DISK_QUEUE_LENGTH_COUNTER(3, "AVG_DISK_QUEUE_LENGTH_COUNTER", "AVG DISK QUEUE LENGTH COUNTER"),

	/**
	 * The '<em><b>SPLIT IO SEC COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLIT_IO_SEC_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	SPLIT_IO_SEC_COUNTER(4, "SPLIT_IO_SEC_COUNTER", "SPLIT IO SEC COUNTER"),

	/**
	 * The '<em><b>FREE MEGABYTES COUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_MEGABYTES_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_MEGABYTES_COUNTER(5, "FREE_MEGABYTES_COUNTER", "FREE MEGABYTES COUNTER");

	/**
	 * The '<em><b>AVG DISK SECS TRANSFER COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVG DISK SECS TRANSFER COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVG_DISK_SECS_TRANSFER_COUNTER
	 * @model literal="AVG DISK SECS TRANSFER COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int AVG_DISK_SECS_TRANSFER_COUNTER_VALUE = 0;

	/**
	 * The '<em><b>PERCENTAGE IDLE TIME COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERCENTAGE IDLE TIME COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_IDLE_TIME_COUNTER
	 * @model literal="PERCENTAGE IDLE TIME COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_IDLE_TIME_COUNTER_VALUE = 1;

	/**
	 * The '<em><b>DISK TRANSFERS SEC COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISK TRANSFERS SEC COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISK_TRANSFERS_SEC_COUNTER
	 * @model literal="DISK TRANSFERS SEC COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int DISK_TRANSFERS_SEC_COUNTER_VALUE = 2;

	/**
	 * The '<em><b>AVG DISK QUEUE LENGTH COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVG DISK QUEUE LENGTH COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVG_DISK_QUEUE_LENGTH_COUNTER
	 * @model literal="AVG DISK QUEUE LENGTH COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int AVG_DISK_QUEUE_LENGTH_COUNTER_VALUE = 3;

	/**
	 * The '<em><b>SPLIT IO SEC COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPLIT IO SEC COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPLIT_IO_SEC_COUNTER
	 * @model literal="SPLIT IO SEC COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int SPLIT_IO_SEC_COUNTER_VALUE = 4;

	/**
	 * The '<em><b>FREE MEGABYTES COUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FREE MEGABYTES COUNTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREE_MEGABYTES_COUNTER
	 * @model literal="FREE MEGABYTES COUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_MEGABYTES_COUNTER_VALUE = 5;

	/**
	 * An array of all the '<em><b>COUNTER DISK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COUNTER_DISK[] VALUES_ARRAY =
		new COUNTER_DISK[] {
			AVG_DISK_SECS_TRANSFER_COUNTER,
			PERCENTAGE_IDLE_TIME_COUNTER,
			DISK_TRANSFERS_SEC_COUNTER,
			AVG_DISK_QUEUE_LENGTH_COUNTER,
			SPLIT_IO_SEC_COUNTER,
			FREE_MEGABYTES_COUNTER,
		};

	/**
	 * A public read-only list of all the '<em><b>COUNTER DISK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COUNTER_DISK> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>COUNTER DISK</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_DISK get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COUNTER_DISK result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COUNTER DISK</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_DISK getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COUNTER_DISK result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COUNTER DISK</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COUNTER_DISK get(int value) {
		switch (value) {
			case AVG_DISK_SECS_TRANSFER_COUNTER_VALUE: return AVG_DISK_SECS_TRANSFER_COUNTER;
			case PERCENTAGE_IDLE_TIME_COUNTER_VALUE: return PERCENTAGE_IDLE_TIME_COUNTER;
			case DISK_TRANSFERS_SEC_COUNTER_VALUE: return DISK_TRANSFERS_SEC_COUNTER;
			case AVG_DISK_QUEUE_LENGTH_COUNTER_VALUE: return AVG_DISK_QUEUE_LENGTH_COUNTER;
			case SPLIT_IO_SEC_COUNTER_VALUE: return SPLIT_IO_SEC_COUNTER;
			case FREE_MEGABYTES_COUNTER_VALUE: return FREE_MEGABYTES_COUNTER;
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
	private COUNTER_DISK(int value, String name, String literal) {
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
	
} //COUNTER_DISK
