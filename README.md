# GUI Project

## Project Overview

This project is a Java-based Graphical User Interface (GUI) application that provides multiple interactive frames for different functionalities. It features an organized structure of classes that handle various frames, including home, information, matching, quiz, and rating functionalities.

## Features

- **Home Frame (`HomeFrame.java`)**: The main entry point for the application. It provides an overview of the app and serves as the central hub to navigate to other sections.
  
- **Information Frame (`InformationFrame.java`)**: Displays relevant information and guides the user on how to use the application.

- **Matching Frame (`MatchingFrame.java`)**: A feature that allows users to interact with a matching game or quiz.

- **Quiz Frame (`QuizFrame.java`)**: A section where users can take part in a quiz or other assessment.

- **Rating Frame (`RatingFrame.java`)**: Allows users to provide feedback by rating the application or their experience.

## Getting Started

### Prerequisites

To run this project, ensure you have the following installed:

- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- An Integrated Development Environment (IDE) such as [Eclipse](https://www.eclipse.org/downloads/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Apache Ant](https://ant.apache.org/) for building the project (optional if not using an IDE)

### Setup Instructions

1. Clone the repository or download the project ZIP file.
   ```bash
   git clone https://github.com/IbrahimT04/GUI_project.git
   ```
2. Open the project in your preferred IDE.
3. Ensure that your IDE is set up to handle Java applications with GUI components (Swing/AWT).

### Building and Running

1. **Build the Project**  
   Use your IDE's build functionality or, if you are using Apache Ant, run the following command in the project directory:
   ```bash
   ant build
   ```

2. **Run the Project**  
   After building, run the `MainFrame.java` file, which serves as the main entry point for the application:
   ```bash
   java MainFrame
   ```

### Application Flow

- Upon launching, users are greeted with the **Home Frame**, which offers navigation to other sections.
- The **Information Frame** provides detailed guidance on how to use the application.
- The **Matching Frame** and **Quiz Frame** offer interactive and educational components, encouraging user engagement.
- Finally, the **Rating Frame** allows users to provide feedback about their experience.

## Project Structure

```
GUI_project-main/
├── HomeFrame.java       # Main entry point for the app
├── InformationFrame.java# Displays general app information
├── MainFrame.java       # Base frame for managing other frames
├── MatchingFrame.java   # Handles the matching game or activity
├── QuizFrame.java       # Manages quizzes or user assessments
├── RatingFrame.java     # Feedback mechanism for users
├── build.xml            # Build configuration for Apache Ant
├── manifest.mf          # Manifest file for running the JAR
└── README.md            # Project documentation
```

## Future Enhancements

Some potential improvements to this project could include:
- **Unit Testing**: Integrating a testing framework such as JUnit to validate the functionality of each frame.
- **Improved UI/UX**: Enhancing the visual components and adding animations to improve the overall user experience.
- **Multithreading**: Implementing multithreading for smoother user interaction, especially in the quiz and matching components.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact

If you have any questions or suggestions, feel free to contact me at [itariq640@gmail.com] or contribute to the repository.
