Please read the User Manual pdf in this project's "Documents" folder for instructions on how this program works.

In my Introduction to Computer Science II class, my first project was to complete the software for a simplified voting machine with a GUI.
My teacher provided the class with a GUI by providing three classes: PerfectCandidate (main), FileSelector, and BallotDialog.
Students were not allowed to modify these classes and did not need to understand the code in order for the voting machine to work.
The objective of the project was to put everything else together by implementing the Candidate, Ballot, BallotReader, and ResultWriter classes.

In this project, I created a fully functioning simplified voting machine with a GUI.
This repository consists of five folders: Source Code, Executable JAR, JavaDoc, UML, and Documents.
  Source Code: Contains the classes listed above in addition to two JUnit test classes for the Candidate and Ballot classes.
  Executable JAR: Contains the .jar file which allows the user to run the program without having to identify the class with the main method (which is the PerfectCandidate class) or using command lines
  JavaDoc: Contains all of the elements of the zip file that is created from the following command: javadoc -link https://docs.oracle.com/en/java/javase/14/docs/api/ -sourcepath ./ *.java -d ./JavaDoc
  UML: Contains a picture of a handdrawn UML diagram mapping each class.
  Documents: Contains a Test Scenario Document (outlining my testing procedure), a User Manual, and Output Tests (from the BallotWriter class).
