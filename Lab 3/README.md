### Program Description:

- This Java program is a menu-driven program that has the following options:
    1. Collect Student Details.
    2. Searching the detials of a Student.
    3. Display the details of all the students.
- When the user selects the first option, he/she is prompted to enter the student details through the **collectDetails()** method. The details include Name, Register number, Email, Class, and Department. The details collected are stored in a one-dimensional String array **studentNames**, with a default size of 1024. The **studentNames** array is passed to a two-dimensional array **arr** which basically collects details of all the students.
- When the user selects the second option, he/she is prompted to enter the name of the student whose details is to be printed. The **displayDetails(arr)** method that takes a two-dimensional String array is called to display the detials of the student. When the user enters a name, the name is matched with every name present in the two-dimensional array by iterating using a **for loop**. When a match is found, the complete details of the Student are displayed.
- The last option, displaying the details of all the Students. For this, the method **name(arr)**, which takes two-dimensional String array, is used to display the details of all the students present in the **studentNames** array. The Name of the Students are stored at the zeroth index of the **studentNames** array. A **for loop** is used to iterate through the two-dimensional array, to print the details.
- The whole menu and the options are run using a **do-while** loop. The loop stops when the user inputs anything other than **y** or **Y**.

Basic flowchart for the above mentioned program:
[Lab3 Flowchart](https://github.com/narpatk78/22122031-MDS273L-JAVA/blob/main/Flowchart/lab3_flow.jpg)
