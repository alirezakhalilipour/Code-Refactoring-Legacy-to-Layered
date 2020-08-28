
Project Title: Refactoring Legacy Software for Layer Separation

========================================================================

Content:

This Github project contains descriptions of lab package for layer separation experiment. The experiment is for an educational system.

The BLDALmono package consists the middle layer of a monolithic system. This package includes 4 classes that are related to an educational system: teacher, student, course and section.

The BL_DAL_Separated package is the resulting software after separating the layers; separating the data access layer from the commercial layer. Thus, the data access codes are separated from the business codes in the first package and transferred to another layer.

========================================================================

Specifications:

The initial program code is written in Java as a single layer and is automatically refactored into two layers in Java by a code scanner.

Input: student class, lecturer class, course class, section class ==> Business layer

output: student class, lecturer class, course class, section class, DALClass ==> Business layer + Data Access layer

========================================================================

Reference:
In case the data is used in a study, please cite the following article:


========================================================================

Authors:

Alireza Khalilipour, Moharram Challenger, Mehmet Onat, Hale Gezgen, Geylani Kardas.

========================================================================

Acknowledgements:

Alireza Khalilipour would like to thank "Sama Technical and Vocational Training College" for their support during this study. Also, Mehmet Onat, Hale Gezgen and Geylani Kardas are funded by KocSistem Information and Communication Services Inc. and the Scientific and Technological Research Council of Turkey (TUBITAK) under European Union EUREKA ITEA labelled (ITEA project no: 14014) R&D project ASSUME (TUBITAK Grant no: 9150181).

========================================================================

