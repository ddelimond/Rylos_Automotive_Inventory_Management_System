# Rylos Automotive Inventory Management System

## Overview

A comprehensive inventory management web application designed for automotive parts and products retail. Built with Spring Boot and Thymeleaf, this system provides real-time inventory tracking, validation constraints, and e-commerce functionality for managing automotive parts and assembled products. The application demonstrates enterprise-level Java development patterns with robust data validation, persistence, and user-friendly interface design.

## 🚀 Live Demo

**Production Application:** [http://rylos-automotive-prod.us-east-2.elasticbeanstalk.com/](http://rylos-automotive-prod.us-east-2.elasticbeanstalk.com/)

---

## ✨ Features

### 📦 Parts Inventory Management

* **Dual Part Types:** Support for both in-house manufactured and outsourced parts
* **Dynamic Inventory Tracking:** Real-time updates with minimum and maximum threshold enforcement
* **Part Categories:** Complete management of alternators, batteries, engines, brakes, and transmissions
* **CRUD Operations:** Full create, read, update, and delete functionality for all parts

### 🏭 Product Management

* **Product Assembly:** Link multiple parts to create complete automotive products
* **Image Support:** Upload and display product images for enhanced catalog presentation
* **Inventory Control:** Automatic inventory decrementation upon product purchase
* **Product Validation:** Ensure sufficient part inventory before product creation

### 🛒 E-Commerce Functionality

* **Buy Now Feature:** One-click purchasing with real-time inventory validation
* **Transaction Feedback:** Success and failure pages based on inventory availability
* **Stock Management:** Prevents over-selling with intelligent inventory checks
* **Seamless UX:** Immediate user feedback on purchase attempts

### 🔍 Advanced Filtering & Search

* **Filter by Name:** Quick part and product lookup functionality
* **Category Navigation:** Browse inventory by part type
* **Sidebar Filtering:** Convenient left-panel filter controls
* **Responsive Results:** Dynamic table updates based on filter criteria

### ✅ Intelligent Validation System

* **Minimum/Maximum Constraints:** Customizable inventory thresholds for each part
* **Range Validation:** Prevents inventory from falling below minimum or exceeding maximum values
* **Part Availability Checks:** Validates sufficient part stock before product purchases
* **Custom Validators:**
  * `@ValidInventory` - Ensures inventory stays within defined bounds
  * `@ValidMinimum` - Prevents inventory depletion below minimum threshold
  * `@ValidMaximum` - Prevents overstocking beyond maximum capacity
  * `@ValidEnufParts` - Validates adequate parts for product assembly
* **Real-time Error Feedback:** Immediate validation messages on form submission

### 🎨 Modern User Interface

* **Custom Branding:** Professional Rylo's Automotive logo and color scheme
* **Google Fonts:** Clean typography using Roboto and Alfa Slab One
* **Responsive Layout:** Sidebar navigation with organized table displays
* **Intuitive Navigation:** Clear navigation bar with Home, About, and Mission pages
* **Form Styling:** User-friendly input forms with validation error displays

---

## 🎯 Learning Objectives

This project demonstrates mastery of key enterprise Java development concepts:

* **Spring Boot Framework:** Application configuration, dependency injection, and component scanning
* **Spring MVC Architecture:** Controllers, services, and repository pattern implementation
* **Thymeleaf Templating:** Server-side rendering with dynamic content generation
* **Spring Data JPA:** Entity mapping, repository interfaces, and database operations
* **Custom Validation:** Constraint validators and annotation-based validation logic
* **H2 Database:** Embedded database configuration and data persistence
* **RESTful Routing:** Clean URL mapping and HTTP method handling
* **Bootstrap Data:** Application initialization with default inventory data
* **Form Handling:** Data binding, validation, and error message display
* **File Upload:** Image handling and storage for product catalogs
* **AWS Deployment:** Elastic Beanstalk configuration for production hosting
* **Git Version Control:** Repository management and code documentation

---

## 🛠️ Technologies Used

### Backend

* **Java 17** - Core programming language
* **Spring Boot 2.7+** - Application framework and dependency management
* **Spring MVC** - Web application architecture
* **Spring Data JPA** - Data access and ORM
* **Hibernate** - Entity relationship mapping
* **Bean Validation (JSR 380)** - Custom validation framework

### Frontend

* **Thymeleaf** - Server-side template engine
* **HTML5** - Semantic markup structure
* **CSS3** - Custom styling and layout
* **Bootstrap 5** - Responsive UI components
* **Google Fonts** - Typography (Roboto, Alfa Slab One)

### Database

* **H2 Database** - Embedded SQL database for development and production
* **Spring Data Repositories** - Data access layer abstraction

### Deployment & DevOps

* **AWS Elastic Beanstalk** - Cloud application hosting
* **Maven** - Build automation and dependency management
* **Git/GitHub** - Version control and source code management

### Development Tools

* **IntelliJ IDEA Ultimate** - Integrated development environment
* **Spring Boot DevTools** - Hot reload and development utilities

---

## 📋 Key Components

### Domain Models

* **Part** (Abstract) - Base entity for all automotive parts with inventory constraints
* **InhousePart** - Parts manufactured internally with part ID tracking
* **OutsourcedPart** - Externally sourced parts with company name association
* **Product** - Assembled products with associated parts and images

### Custom Validators

* **InventoryValidator** - Validates inventory within min/max bounds
* **MinimumValidator** - Ensures inventory doesn't fall below minimum
* **MaximumValidator** - Prevents inventory from exceeding maximum
* **EnufPartsValidator** - Validates sufficient parts for product creation

### Controllers

* **MainScreenController** - Landing page and inventory display
* **AddPartController** - Part creation and editing functionality
* **AddProductController** - Product management and purchase logic
* **ImageController** - Product image upload handling
* **AboutController** - Company information pages

### Services

* **PartService** - Business logic for part operations
* **ProductService** - Product management operations
* **ImageService** - Image processing and storage

---

## 🚦 Getting Started

### Prerequisites

* Java Development Kit (JDK) 17 or higher
* Maven 3.6 or higher
* IntelliJ IDEA Ultimate Edition (or any Java IDE)
* Git for version control

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/ddelimond/Rylos_Automotive_Inventory_Management_System.git
cd Rylos_Automotive_Inventory_Management_System
```

**2. Build the project**

```bash
mvn clean install
```

**3. Run the application**

```bash
mvn spring-boot:run
```

**4. Access the application**

Open your browser and navigate to: `http://localhost:8080`

### Default Data

The application automatically loads sample inventory data on first run:

* 5 Parts: Alternators, Batteries, Engines, Brakes, Transmissions
* 5 Products: Complete automotive systems with associated parts
* Each part initialized with min (1) and max (50) inventory values

---

## 💡 Usage Guide

### Managing Parts

1. Navigate to the main inventory screen
2. Use the sidebar filter to search parts by name
3. Click "Update" to modify existing part details
4. Click "Add Part" to create new in-house or outsourced parts
5. Set minimum and maximum inventory thresholds for stock alerts

### Managing Products

1. View products in the right table section
2. Click "Update" to edit product information and associations
3. Use "Add Product" to create new products with part assemblies
4. Upload product images for catalog display
5. Monitor associated parts inventory for each product

### Making Purchases

1. Click "Buy Now" on any product
2. System validates sufficient inventory availability
3. Success page displays for completed purchases
4. Failure page shows if product is out of stock
5. Inventory automatically decrements after successful purchase

### Filtering & Search

1. Use the left sidebar "Search by Part Name" filter
2. Enter partial or complete part names
3. Results update dynamically in the parts table
4. Clear filter to view all inventory

---

## 🔐 Data Validation Rules

* **Part Inventory:** Must stay between minimum and maximum values
* **Minimum Inventory:** Default set to 1 unit per part
* **Maximum Inventory:** Default set to 50 units per part
* **Product Creation:** Requires sufficient associated parts in stock
* **Purchase Validation:** Prevents orders when inventory reaches zero
* **Form Validation:** Real-time error messages on invalid submissions

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── bootstrap/         # BootStrapData.java - Initial data loading
│   │   ├── controllers/       # MVC Controllers
│   │   ├── domain/            # Entity models (Part, Product, etc.)
│   │   ├── repositories/      # Spring Data JPA repositories
│   │   ├── services/          # Business logic layer
│   │   └── validators/        # Custom validation classes
│   └── resources/
│       ├── static/
│       │   ├── css/           # style.css - Custom styling
│       │   └── images/        # Logo and product images
│       ├── templates/         # Thymeleaf HTML templates
│       └── application.properties  # Spring Boot configuration
└── test/                      # Unit tests (PartTest, etc.)
```

---

## 🧪 Testing

The application includes comprehensive unit tests for validation logic:

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=PartTest
```

**Test Coverage:**

* Part entity getter/setter methods
* Minimum and maximum inventory validation
* Custom validator logic
* Repository operations

---

## 🚀 Deployment

### AWS Elastic Beanstalk

The application is deployed on AWS Elastic Beanstalk for production hosting:

**1. Package the application**

```bash
mvn clean package
```

**2. Deploy to Elastic Beanstalk**

* Upload the generated JAR file to AWS EB
* Configure environment variables
* Set Java 17 as the platform version

**3. Environment Configuration**

* Platform: Java 17 running on Amazon Linux 2
* Instance type: t2.micro (or higher)
* Region: us-east-2 (Ohio)

---

## ⚠️ Database Note

**Important:** This application currently uses H2 embedded database for demonstration purposes. H2 is suitable for development and testing but **not recommended for production use** due to:

* Data loss on application restart
* No horizontal scaling support
* Limited concurrent access handling
* No backup/recovery mechanisms

**For production deployment, consider migrating to:**

* Amazon RDS (MySQL/PostgreSQL)
* Amazon Aurora
* Other production-grade relational databases

---

## 🤝 Contributing

This project was developed as part of academic coursework. While not actively accepting contributions, feel free to fork the repository for educational purposes.

---

## 📝 License

This project is part of academic coursework for Western Governors University's Java Frameworks course. Please respect academic integrity policies and do not distribute or publicly post solution code.

---

## 👨‍💻 Developer

**Daniel Delimond**

* GitHub: [@ddelimond](https://github.com/ddelimond)
* Project Repository: [Rylos Automotive Inventory Management System](https://github.com/ddelimond/Rylos_Automotive_Inventory_Management_System)

---

## 🙏 Acknowledgments

* Western Governors University - College of Information Technology
* Spring Boot Framework Documentation
* Thymeleaf Template Engine Community
* IntelliJ IDEA Development Tools

---

## 📚 Additional Resources

* [Spring Boot Documentation](https://spring.io/projects/spring-boot)
* [Thymeleaf Documentation](https://www.thymeleaf.org/)
* [Spring Data JPA Reference](https://spring.io/projects/spring-data-jpa)
* [Bean Validation Specification](https://beanvalidation.org/)

---

**Version:** 1.0.0  
**Last Updated:** October 2025
