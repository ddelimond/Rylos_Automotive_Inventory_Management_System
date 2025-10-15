<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## CHANGES MADE TO PROJECT

1.  linked an external stylesheet for styling added the following html <b>th:href="@{/css/style.css}</b>,  file:mainscreen.html , line:14
2.  renamed demo.css to style.css.
3. Added google font Roborto to head, file: mainscreen.html,  lines:14 - 16
4. Added google font Alfa Slab One to head, file: mainscreen.html, lines 10-20
5. Changed application title to "Rylo's Automotive" , file: mainscreen.html, line:16
6. created and aside element and placed the filter forms in it, gave the element a class of filterContainter ,and  repositioned aside to the left of the application viewport, line 30.
7. Added logoContainer div which will hold the application logo image,file: mainscreen.html , line 31 
8. added img element with a class of logo, file:mainscreen.html line 23
9. created div with a class name of partInvContainer that is holding the Part form , file: mainscreen.html, line 34
10. added class of partsForm to form element for parts mainscreen.html, line 34 
11. created div with a class name of productInvContainer that is holding the Products form , file: mainscreen.html, line 45 
12. added class of productsForm to form elelment for products mainscreen.html, line 34 
13. created main element to hold both the Parts and Product Tables in it,mainscreen.html, line 58 
14. moved the h1 element into the main element , ,mainscreen.html, line 59 
15. contained each table in their a corresponding styling div , putting the following class on each tables corresponding div   "partsTable" and "productsTable" , mainscreen.html ,lines 

[//]: # (part C is done)

16. created about.html in templates folder
17. created new Controller to navigate to the about.html page, set up the needed mapping for "/about"
18. Added navigation bar that links to the Home , About, and Missions page in both mainscreen.html and about.html, lines 28 - 31(mainscreen.html) and 20-24(about.html) 

[//]: # (part D is done)

19. created a new controller and service in order to allow users to submit / add products and include an image, the controller that were created are ImageController and ImageService
20. created five default Product and Part objects that will run as long as the DB does not have anything it it to render , save the objects to the corresponding repositoies, made all of these updates to BootStrapData.java, from lines 54 -162.

[//]: # (part E is done)

21. created a new button for the products table that says buy now, added a new link element with the needed btn classes, changed mapping to "/buyProduct", file: mainscreen.html, line 127
22. created a new method within AddProductController that matches the mapping that I changed to of "/buyProduct", file: mainscreen.html, line 181
23. created inventory variable to store updated / altered inventory count when purchasing, file AddProductController.java, line 181
24. added logic to route to different html pages based on the value of the inventory variable , file AddProductController.java, lines 184-190
25. created 2 html files (success.html and failure.html) base on results from the boolean / if else statement
26. added updated logic to buyProduct mapping with an if statement that will remove 1 from the inventory if its not 0, then routes to success.html, if inventory is 0 page routes to failure.html, file: AddProductController.java, lines 187 -195

[//]: # (part F is done)

27. added two annotations for min and max Inventory 
28. made annotation called minInv that is for the mininum inventory constraint and updated the message to go with the variable , file Part.java , line 33 & 34
29. made annotation called maxInv that is for the maximum inventory constraint and updated the message to go with the variable , file Part.java , line 36
30. Generated the getter and setter for both minInv and maxInv,file: Part.java, lines 115 -129
31. created a new table header of Min Inventory, file: mainscreen.html, line: 75 
32. created a new table header of Max Inventory, file: mainscreen.html, line: 76
33. created new td elements for both minInv & maxInv, file: mainscreen.html, line: 93 -94
34. set min (1) and max (50) inventory values for alternators, file: BootStrapData.java, lines 63 & 64 
35. set min (1) and max (50) inventory values for battery's, file: BootStrapData.java, lines 76 & 77 
36. set min (1) and max (50) inventory values for engines, file: BootStrapData.java, lines 92 & 93
37. set min (1) and max (50) inventory values for brakes, file: BootStrapData.java, lines 104 & 10
38. set min (1) and max (50) inventory values for transmissions, file: BootStrapData.java, lines 117 & 118
39. renamed spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102_5 to spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102_6, file applications.properties, line 6
40. created two new input fields for updating minimum and maximum inventory, file: InhousePartForm.html, lines 24 - 28
41. created two new input fields for updating minimum and maximum inventory, file: OutsourcedPartForm.html, lines 25 - 29
42. renamed spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102_6 to spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102_7, file applications.properties, line 6
43. created InventoryValidator and ValidInventory Interface
44. added InventoryValidator to ValidInventory Interface , file ValidInventory.java , line 16
45. changed the default message to a generic "Inventory Error" string , file ValidInventory.java, line 20; 
46. made ValidInventory and Part  for the ConstraintValidator , file: InventoryValidator, line 19
47. made ValidInventory a parameter for the initialized function, file: InventoryValidator, line 22
48. made Part a parameter for the isValid function, file: InventoryValidator, line 26
49. added logic for isValid function for when inv is greater than the maximum and lower than the minimum, file: InventoryValidator , lines 28 -36
50. added @ValidInventory annotation to Part class, file: Part.java ,line 24
50. created div element with logic to trigger if there is any errors for the field, file InhousePartForm.html, line 72
51. created a ul element , file: InhousePartFrom.html, line 73
52. created li element to display the text of the error that is triggered, file: InhousePartFrom.html, line 74
53. created div element with logic to trigger if there is any errors for the field, file OutsourcedPartForm.html, line 72
51. created a ul element , file: OutsourcedPartForm.html, line 73
52. created li element to display the text of the error that is triggered, file: OutsourcedPartForm.html, line 74

[//]: # (part G is done)

53.updated contents of my databases, added max a min values for products also , file application.properties, line:6
54. created new interface validation file ValidMinimum;
55. created new class validation file MinimumValidator;
56. added the parameter of the MinimumValidator class for ValidMinimum.java , line 16;
57. made the default message for the ValidMinimum.java file to be "Part count will be below the set minimum", line 20
58. added parameter of ValidMinimum to initialization function for MinimumValidator.java, line 21;
59. updated logic of isValid method, file: MinimumValidator.java, line 28-32
60. added @ValidMinimum object to Part domain file to apply minimum validator, file: Part.java, line 24
61. updated logic and message to EnufPartsValidatory.java to account for min value of remaining Parts when decrementing Product inventory for a purchase, also update the displayed messaged that will be returned, line 38;
62. added @ValidEnufParts object to Part domain file to apply minimum validator, file: Part.java, line 25
63. created two new validator files MaximumValidator class and ValidMaximum interface
64. added the parameter of the MaximumValidator class for ValidMaximum.java , line 16; 
65. made the default message for the ValidMaximum.java file to be "Part count will be above the set maximum", line 20 
66. added parameter of ValidMaximum to initialization function for MaximumValidator.java, line 21; 
67. updated logic of isValid method, file: MaximumValidator.java, line 28-32 
68. added @ValidMaximum object to Part domain file to apply maximum validator, file: Part.java, line 26

[//]: # (Part H Completed)

69. added code lines 160 - 195 to create 4 unit test for the getter and setter methods for Minimum & Maximum inventory within the Part class, file:PartTest
[//]: # (Part I Completed)

69. Deleted ValidProductPrice validator and PriceProductValidator

[//]: # (Part J Completed)