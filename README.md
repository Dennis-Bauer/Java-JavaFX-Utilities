# Java-JavaFX-Utilities

## English Version

### Description
**Java Utilities** is a collection of Java and JavaFX classes that provide static methods to make using these languages easier. This library includes several helper functions:

- **Save and load data**: The `SaveDataUtilities` class offers simple methods for saving and loading data.
- **Formatted console output**: The `ConsoleUtilities` class allows for printing colored and formatted text to the console.
- **JavaFX shapes creation**: The `JavaFXConstructorUtilities` class provides constructors for various JavaFX shapes to simplify their creation.
- **General utilities**: Standard helper methods for Java and JavaFX that facilitate common tasks.

Each method is well-documented and explains what it does.

### Installation
1. Download the desired file and add it to your Java project.
2. If you place the file in a folder, don't forget to specify the `package` at the top.
3. Access the methods using the file name.
4. If it doesn't work automatically, don't forget to import.

```java
import com.example.deinprojekt.SaveDataUtilities;

public class Main {
    public static void main(String[] args) {
        // Example usage of a method
        SaveDataUtilities.saveData("fileName", "Data");
    }
}
```

### Usage
#### Save and load data
```java
import com.example.deinprojekt.SaveDataUtilities;

public class Main {
    public static void main(String[] args) {
        // Save data
        SaveDataUtilities.saveData("fileName", "Data");

        // Load data
        if (SaveDataUtilities.getData("fileName") instanceof String data) {
            System.out.println(data);
        }
    }
}
```

#### Formatted console output
```java
import com.example.deinprojekt.ConsoleUtilities;

public class Main {
    public static void main(String[] args) {
        // Print text that is red and bold
        ConsoleUtilities.consoleOutPut(ConsoleUtilities.colors.RED, ConsoleUtilities.textStyle.BOLD, "WOW So schön");
    }
}
```

#### Create JavaFX shapes
```java
import com.example.deinprojekt.JavaFXConstructorUtilities;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Create a rectangle with a width and height of 200 and the color red.
        // Its border is black and 2px thick.
        Rectangle r = JavaFXConstructorUtilities.buildRectangle("id", 200, 200, Color.RED, true, Color.BLACK, 2);
    }
}
```

There are many more useful functions! Check out the source code to discover all possibilities.

### Contributions
Contributions are welcome! Please send a pull request or open an issue if you have any suggestions.

### Author
Dennis Bauer (Sandwich898)

---

## Deutsche Version

### Beschreibung
**Java Utilities** ist eine Sammlung von Java- und JavaFX-Klassen, die statische Methoden bereitstellen, um die Nutzung der Programmiersprachen einfacher zu gestalten. Diese Bibliothek umfasst mehrere Hilfsfunktionen:

- **Daten speichern und laden**: Die `SaveDataUtilities`-Klasse bietet einfache Methoden zum Speichern und Laden von Daten.
- **Schöne Konsolenausgabe**: Die `ConsoleUtilities`-Klasse ermöglicht das Ausgeben von farbigem und formatiertem Text in der Konsole.
- **Erstellung von JavaFX-Formen**: Die `JavaFXConstructorUtilities`-Klasse stellt Konstruktoren für verschiedene JavaFX-Formen bereit, um deren Erstellung zu vereinfachen.
- **Allgemeine Utilities**: Standard-Hilfsmethoden für Java und JavaFX, die häufige Aufgaben erleichtern.

Jede Methode ist gut dokumentiert und erklärt, was sie macht.

### Installation
1. Lade die gewünschte Datei herunter und füge sie in dein Java-Projekt ein.
2. Wenn du die Datei in einen Ordner legst, vergiss nicht, oben das `package` anzugeben.
3. Greife mit dem Dateinamen auf die Methoden zu.
4. Falls das nicht automatisch funktioniert, vergiss den Import nicht.

```java
import com.example.deinprojekt.SaveDataUtilities;

public class Main {
    public static void main(String[] args) {
        // Beispielverwendung einer Methode
        SaveDataUtilities.saveData("fileName", "Data");
    }
}
```

### Verwendung
#### Daten speichern und laden
```java
import com.example.deinprojekt.SaveDataUtilities;

public class Main {
    public static void main(String[] args) {
        // Daten speichern
        SaveDataUtilities.saveData("fileName", "Data");

        // Daten laden
        if (SaveDataUtilities.getData("fileName") instanceof String data) {
            System.out.println(data);
        }
    }
}
```

#### Schöne Konsolenausgabe
```java
import com.example.deinprojekt.ConsoleUtilities;

public class Main {
    public static void main(String[] args) {
        // Text der rot und fett geschrieben ist ausgeben
        ConsoleUtilities.consoleOutPut(ConsoleUtilities.colors.RED, ConsoleUtilities.textStyle.BOLD, "WOW So schön");
    }
}
```

#### JavaFX-Formen erstellen
```java
import com.example.deinprojekt.JavaFXConstructorUtilities;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Erstellt ein Rechteck mit einer Breite und Höhe von 200 und mit der Farbe Rot.
        // Sein Rand ist Schwarz und 2px dick.
        Rectangle r = JavaFXConstructorUtilities.buildRectangle("id", 200, 200, Color.RED, true, Color.BLACK, 2);
    }
}
```

Es gibt noch mehr nützliche Funktionen! Schau dir den Quellcode an, um alle Möglichkeiten zu entdecken.

### Beiträge
Beiträge sind herzlich willkommen! Bitte sende einen Pull-Request oder eröffne ein Issue, wenn du Verbesserungsvorschläge hast.

### Autor
Dennis Bauer (Sandwich898)
