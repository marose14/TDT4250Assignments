/**
 */
package tdt4250.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyplan.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.studyplan.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.studyplan.Semester#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyplan.StudyplanPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsEnoughCourses'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyplan.SelectiveCourse}.
	 * It is bidirectional and its opposite is '{@link tdt4250.studyplan.SelectiveCourse#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.studyplan.StudyplanPackage#getSemester_Courses()
	 * @see tdt4250.studyplan.SelectiveCourse#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<SelectiveCourse> getCourses();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see tdt4250.studyplan.StudyplanPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.studyplan.SemesterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see tdt4250.studyplan.SemesterPart
	 * @see #setPart(SemesterPart)
	 * @see tdt4250.studyplan.StudyplanPackage#getSemester_Part()
	 * @model
	 * @generated
	 */
	SemesterPart getPart();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.Semester#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see tdt4250.studyplan.SemesterPart
	 * @see #getPart()
	 * @generated
	 */
	void setPart(SemesterPart value);

} // Semester
