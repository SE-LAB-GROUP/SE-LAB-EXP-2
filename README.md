# Software Engineering Lab Experiment 2


## Eperiment Report
Tasks were defined by th PO for this particular experiment

<img width="1000" alt="image" src="https://github.com/SE-LAB-GROUP/SE-LAB-EXP-2/assets/79265257/aa3d6eff-2d66-4546-a1c6-ad77f5520452">


### Adding the missing functions using TDD (Test Driven Development)

#### searchStudents
First we implement the UnitTests for the function then after the tests fail we try to pass the tests by implementing the required code


Before:


<img width="1000" alt="image" src="https://github.com/SE-LAB-GROUP/SE-LAB-EXP-2/assets/79265257/f4d07400-1969-4169-9f60-3b7082fe8e4a">


After:


<img width="1000" alt="image" src="https://github.com/SE-LAB-GROUP/SE-LAB-EXP-2/assets/79265257/f47a7046-1364-41fe-bcdd-53703caea186">


#### searchBooks


### Fixing the Bugs

#### Bug 1
Writing Tests for Library lendBook function:


<img width="1000" alt="image" src="https://github.com/SE-LAB-GROUP/SE-LAB-EXP-2/assets/79265257/78f9ad47-8d22-478c-98a1-98b72bdedfd2">


The problem is that in Library lenBook function, the condition where the student is not a member of the library is not checked so we add the statement and run the tests again:


<img width="1000" alt="image" src="https://github.com/SE-LAB-GROUP/SE-LAB-EXP-2/assets/79265257/afbca21c-b5c0-44b8-928b-49fb6a362368">


#### Bug 2


## Questions

### #1

- For smaller and less complex projects, the traditional approach is preferable because writing tests after the code entails less overhead. On the other hand, TDD is better suited for larger, more complex projects. In such cases, TDD helps in better understanding the requirements and enhancing code quality. Moreover, it reduces complexity by breaking down tasks into smaller, testable units.
- If the project lacks stable requirements that remain unchanged, TDD cannot be correctly applied because tests should align with these requirements. In instances where requirements are poorly defined and subject to change during development, the traditional approach is more suitable.
- TDD demands more skill and experience; therefore, if the team lacks sufficient expertise, it cannot be effectively implemented.
- In the short term, TDD increases development time because tests are written before the code. However, in the long term, it reduces development time by minimizing bugs and improving code quality. Consequently, if the project demands a quick start, TDD cannot be employed.

### #2

In general, the development team uses white-box testing, and the QA team uses black-box testing. In white-box testing, tests are designed based on the application's internal workings. However, in black-box testing, testers don't have access to internal code structures.

White-Box Testing Examples:

- Unit Testing: Testing individual units of the software
- Integration Testing: Validating that integrated units work correctly when combined
- Static Testing: Analyzing the source code and documents without running the software

Black-Box Testing Examples:

- Functional Testing: Validating the software's functionality based on specified requirement
- UI Testing: Validating the user interface elements and interactions of the software
- Usability Testing: Evaluating the software's ease of use, intuitiveness, and user satisfaction
- Compatibility Testing: Verifies the software's compatibility with different operating systems and environments
