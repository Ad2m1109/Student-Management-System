# Student Management System

![Java](https://img.shields.io/badge/Java-8-blue.svg)
![Swing](https://img.shields.io/badge/GUI-Swing-orange.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

A comprehensive Java application for managing student records with a user-friendly Swing GUI interface.

## Features

- **Student Management**:
  - Add new students with complete details
  - Remove existing students by ID
  - Update student information
- **Search Functionality**:
  - Search students by name
  - Filter by field of study
- **Data Organization**:
  - Sort students alphabetically by name
  - Display in tabular format
- **Data Persistence**:
  - Save/Load student data to/from file

## Technologies Used

- **Core Java**: Java 8
- **GUI Framework**: Swing
- **Table Management**: AbstractTableModel
- **Build Tool**: Maven (optional)

## Installation

### Prerequisites
- Java JDK 8 or later
- (Optional) Maven 3.6+

### Running the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/student-management-system.git
   cd student-management-system
2. Compile the project:
    
    bash
    
    ```bash
    javac src/*.java -d bin/
    ```
    
3. Run the application:
    
    bash
    
    ```bash
    java -cp bin/ App
    ```
    

## Project Structure

```
student-management-system/
├── src/
│   ├── etudiant.java          # Student entity class
│   ├── GestionEtudiants.java  # Business logic handler
│   ├── tableModele.java       # Table model implementation
│   └── App.java               # Main application class
├── lib/                       # External libraries
├── bin/                       # Compiled classes
├── data/                      # Data storage
├── LICENSE                    # MIT License
└── README.md                  # This file
```

## Class Documentation

### etudiant.java

Represents a student entity with:

- Private fields: id, nom, prenom, filiere, sexe
- Public getter/setter methods
- Constructor with all parameters

### GestionEtudiants.java

Main business logic class with methods:

- ajouterEtudiant() - Add new student
- supprimerEtudiant() - Remove student by ID
- rechercherParNom() - Search by name
- trierParNom() - Sort students alphabetically
- sauvegarderDonnees() - Save to file
- chargerDonnees() - Load from file

### tableModele.java

Custom table model extending AbstractTableModel:

- Manages data display in JTable
- Handles column names and data types
- Implements required TableModel methods

### App.java

Main application class:

- Creates and manages GUI components
- Handles user events
- Coordinates between view and model

## Usage Guide

### Adding a Student:

1. Fill all fields in the "Add Student" form
2. Click "Add" button
3. Verify student appears in the table

### Removing a Student:

1. Select student in table
2. Click "Remove" button
3. Confirm deletion

### Searching Students:

1. Enter search term in search field
2. Results filter automatically

### Sorting Students:

1. Click "Sort by Name" button
2. Table updates with sorted data

### Saving Data:

1. Click "File > Save" menu option
2. Data saves to data/students.dat

## Screenshots

Main Window Add Student

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/awesome-feature`)
3. Commit your changes (`git commit -m 'Add awesome feature'`)
4. Push to the branch (`git push origin feature/awesome-feature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See LICENSE for more information.

## Contact

Project Maintainer: Adem youssfi Email: ademyoussfi57@gmail.com