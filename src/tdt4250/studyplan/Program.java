/**
 */
package tdt4250.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyplan.Program#getProgramtype <em>Programtype</em>}</li>
 *   <li>{@link tdt4250.studyplan.Program#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyplan.StudyplanPackage#getProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsEnoughSemesters'"
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Programtype</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.studyplan.ProgramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programtype</em>' attribute.
	 * @see tdt4250.studyplan.ProgramType
	 * @see #setProgramtype(ProgramType)
	 * @see tdt4250.studyplan.StudyplanPackage#getProgram_Programtype()
	 * @model
	 * @generated
	 */
	ProgramType getProgramtype();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.Program#getProgramtype <em>Programtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programtype</em>' attribute.
	 * @see tdt4250.studyplan.ProgramType
	 * @see #getProgramtype()
	 * @generated
	 */
	void setProgramtype(ProgramType value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.studyplan.StudyplanPackage#getProgram_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Program
