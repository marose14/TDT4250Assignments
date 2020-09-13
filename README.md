# TDT4250Assignments
Individual assignments for Advanced Software Design 2020

## Assignment 1 - The model
This model contains a StudyPlan which is the root element. A StudyPlan can contain several programs, which has a specific type, bachelor, master or integrated master. A StudyPlan also contains the courses, making it possible for a course to link to several programs. (It can be on both a bachelorprogram and a master program). 

Each programs contains semesters, and the semesters contains several courses.

The studyplanValidator.java (src/tdt4250/studyplan/util/StudyplanValidator.java) contains code for validating the constraints. One constraint is that a specific type of program has to contain a corresponding number of semesters. Another constraint is that a semester needs to contain at least courses with the sum of 30 credits.
