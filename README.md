# DCIT-202-Android-Group-10
Android Group Project
Project Documentation - Recipe App

	Project Overview
This repository contains the source code for a Recipe App, developed by a group of 10 members. The app allows users to create an account, search for recipes, add new recipes, and receive notifications. Each group member was assigned specific roles and responsibilities in different areas of the project.

	Group Members
1.	Peter Opoku-Mensah (Group Leader, Developer) – 10985470
	(https://github.com/deezyfg)
•	Role: Group leader, responsible for coordinating the team and managing the overall project.
•	Responsibilities:
•	Collaborated with Erica to create the "Login page" by implementing the Java part.
•	Worked with Carter to develop the "Notification page" by implementing the Java part.
•	Contributed to creating the README.

2.	Sharon Prempeh (Developer) – 10945439
	(https://github.com/Sharonprempeh)
•	Role: Developer
•	Responsibilities:
•	Created the "Welcome page" of the app.

3.	Hinson Erica Ama (Developer) – 10940827
	(https://github.com/Ericahinson)
•	Role: Developer
•	Responsibilities:
•	Collaborated with Peter to create the "Login page" by implementing the XML part.

4.	Iddris Tipagya Saeed (Developer) – 10970376
	(https://github.com/IddrisTipagya)
•	Role: Developer
•	Responsibilities:
•	Collaborated with Elikem to create the "Sign Up page" by implementing the XML part.

5.	Elikem Doh (Developer) -10976460
	(https://github.com/elikemdoh)
•	Role: Developer
•	Responsibilities:
•	Collaborated with Iddris to create the "Sign Up page" by implementing the Java part.
•	Worked with Peter and Iddris to add a database to the system using Firebase.

6.	Yaqeen Wunzalgu Mumuni (Developer) – 10990036
	(https://github.com/yaqeen009)
•	Role: Developer
•	Responsibilities:
•	Collaborated with Ramsey to create the "Home page" by implementing the XML part.
•	Implemented the Java part of the "Home page" along with the API integration using the Spoonacular API and Picasso dependency for images.
•	Collaborated with Ramsey to create the "Add A Recipe! page" by implementing the XML part.

7.	Ramsey Asante-Dampson (Developer) – 10989853
	(https://github.com/ramseymadeit)
•	Role: Developer
•	Responsibilities:
•	Collaborated with Yaqeen to create the "Home page" by implementing the Java part.
•	Collaborated with Yaqeen to create the "Add A Recipe! page" by implementing the Java part.
8.	Odame Papalabi Steven (Developer) -10989156
	(https://github.com/Odamegithub)
•	Role: Developer
•	Responsibilities:
•	Collaborated with Nelly to create the "Search page" by implementing the XML part.

9.	Nelly Odai (Developer) – 10957485
	(https://github.com/odainelly)
•	Role: Developer
•	Responsibilities:
•	Collaborated with Steven to create the "Search page" by implementing the Java part.

10.	Kattah Gabriel Selasi (Developer) -10961951
(https://github.com/Cartha07)
•	Role: Developer
•	Responsibilities:
•	Collaborated with Peter to create the "Notification page" by implementing the XML part.


	Project Structure
The project follows a modular structure with separate components for different app features. Here is an overview of the project structure:
|-- app
    |-- src
        |-- main
            |-- java
                |-- com.example.recipeapp
                    |-- activity
                        |-- WelcomeActivity.java
                        |-- LoginActivity.java
                        |-- SignUpActivity.java
                        |-- HomeActivity.java
                        |-- SearchActivity.java
                        |-- AddRecipeActivity.java
                        |-- NotificationActivity.java
                    |-- adapter
                        |-- RecipeAdapter.java
                        |-- NotificationAdapter.java
                    |-- model
                        |-- Recipe.java
                        |-- Notification.java
                    |-- util
                        |-- NetworkUtils.java
                        |-- FirebaseUtils.java
                        |-- SpoonacularAPI.java
                |-- ...
            |-- res
                |-- layout
                    |-- activity_welcome.xml
                    |-- activity_login.xml
                    |-- activity_signup.xml
                    |-- activity_home.xml
                    |-- activity_search.xml
                    |-- activity_add_recipe.xml
                    |-- activity_notification.xml
                |-- ...
        |-- ...
    |-- ...
|-- ...

	Getting Started
To run the Recipe App project, follow these steps:
1.	Clone the repository: git clone https://github.com/dcit202Andriod/DCIT-202-Android-Group-10
2.	Open the project in Android Studio.
3.	Build the project to resolve dependencies.
4.	Run the app on an emulator or physical device.

	Conclusion
This documentation provides an overview of the Recipe App project and the roles and responsibilities of each group member. The project was completed successfully, and the application is now available for use. By following the instructions in the "Getting Started" section, you can set up the project and run the app. 






