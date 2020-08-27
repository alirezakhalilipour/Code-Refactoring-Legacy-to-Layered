# Code-Refactoring-Legacy-to-Layered

Project Title: Refactoring Legacy Software for Layer Separation

========================================================================

Content:
This file contains descriptions of software packages before and after layer separation operations.
The first package consists of the middle layer of a monolithic system. This package includes 4 classes that
 are related to an educational system: teacher, student, course and section.
The second package is after separating the layers and separating the 
data access layer from the commercial layer.
Thus, the data access codes are separated from the business 
codes in the first package and transferred to another layer.
Therefore, in addition to the previous package classes, another class will be added to this set.

========================================================================

Specifications:
The initial program code is written in Java as a single layer and is automatically refactored into two layers in Java by a code scanner.

Input: student class, lecturer class, course class, section class ==> Business layer
output: student class, lecturer class, course class, section class, DALClass ==> Business layer + Data Access layer

========================================================================

License:
If to be use this data (benchmark) in the studies, cite the article as:
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

========================================================================

Copyright:

========================================================================

Authors:
Alireza Khalilipour, Moharram Challenger, Mehmet Onat, Hale Gezgen, Geylani Kardas.
========================================================================

Acknowledgements:

Alireza Khalilipour would like to thank "Sama Technical and Vocational Training
College" for their support during this study. Also, Mehmet Onat, Hale Gezgen and
Geylani Kardas are funded by KocSistem Information and Communication Services
Inc. and the Scientific and Technological Research Council of Turkey (TUBITAK)
under European Union EUREKA ITEA labelled (ITEA project no: 14014) R&D
project ASSUME (TUBITAK Grant no: 9150181).
========================================================================

