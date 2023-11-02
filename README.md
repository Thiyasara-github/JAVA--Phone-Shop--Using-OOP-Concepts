Getting Started

### Opening the Project in NetBeans

1. **Clone the Repository**: Start by cloning this GitHub repository to your local machine.

2. **Open NetBeans**: Launch NetBeans IDE on your computer.

3. **Open the Project**: In NetBeans, go to `File` > `Open Project...` and select the project directory you just cloned.

### Establishing a Database Connection

To make sure the project can interact with your MySQL database, follow these steps:

1. **Download MySQL Connector/J**:

   You can download MySQL Connector/J from the following links based on your preferences:

   - [Download MySQL Connector/J 8.0.17](https://dev.mysql.com/downloads/connector/j/8.0.html)
   - [Download MySQL Connector/J 5.0.7](https://dev.mysql.com/downloads/connector/j/5.0.html)

   Choose one of these drivers that suits your system.

2. **Add MySQL Connector to Project Libraries**:

   In NetBeans, right-click on your project in the `Projects` tab, then select `Properties`. 

   - Click on `Libraries`.
   - Click on `Add JAR/Folder...`.
   - Navigate to the downloaded MySQL Connector/J JAR file and add it to the project libraries.

3. **Test the Connection**:

   Open the project source code and locate the database connection settings. Ensure that you are using the correct driver class and database URL. For example:

   ```java
   String driver = "com.mysql.jdbc.Driver"; // for MySQL Connector/J 5.0.7
   // OR
   String driver = "com.mysql.cj.jdbc.Driver"; // for MySQL Connector/J 8.0.17
   String url = "jdbc:mysql://localhost:3306/digitaltech"; // Replace 'digitaltech' with your database name
   String username = "your_username"; // Replace with your MySQL username
   String password = "your_password"; // Replace with your MySQL password
