### Program Details:

- This Java program is a menu-driven program that has the following options for:
    1. Entering Names
    2. Searching for a Name
    3. Removing a Name
    4. Displaying the Names Stored
    5. Quitting the program
- When the User chooses the first option, option for Entering Name, the names are collected using the Scanner object 'sc' and stored in a String Array Names of default size of 1024. The first name is stored at the zeroth position in the String Array and further names collectd are stored at successive position using a for loop. If the entered name is already present in the array, a message is shown saying the name is already existing. Because of this, only unique names are stored in the list.
- When the User chooses the second option, option for Searching for a name, he/she is prompted to enter the name they want to search for in the Names array. A for loop iterates through the Names array and compares the prompted name with the names present in the array. If a match is found, the program prints that the name is present in the Array at so-and-so location/index.
- When the User chooses the third option, option for Removing a name, he/she is again prompted for the name that is to be removed from the list. A for loop iterates through the list and gets the location/index of the name entered. Let's say the name entered is found at the i th index. The name is removed by shifting the next set of names backwards by one position using a for loop. That is, the name at i th position is replaced by the name at the (i+1) th position, the name at (i+1) th position is replaced by the name at (i+2) th position, and so on.
- Displaying the Names stored is basically performed by a for loop iterating through the array.
- Last option is for quitting the menu-driven program.
- The whole menu-driven program is operated using a do-while loop, where the initial condition is boolean true. The condition becomes false when the User chooses to quit the program. Basically, the loop is continued till the condition is true.  