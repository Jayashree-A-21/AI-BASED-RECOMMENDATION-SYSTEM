# AI-Based Recommendation System

## 📌 Description
This project implements an AI-based recommendation system using Java and Apache Mahout.
The system analyzes user preferences and generates personalized product recommendations using collaborative filtering algorithms.

A CSV file is used as sample data representing user–item interactions, making the project easy to understand and suitable for academic and internship purposes.

## 🛠 Technologies Used
- Java (JDK 8 or above)
- Apache Mahout 0.9
- Machine Learning (Collaborative Filtering)
- CSV Data Processing

## 📂 Project Structure
- RecommendationSystem.java — Main recommendation engine
- data.csv — Sample user preference dataset

## 📦 Dependencies
The following JAR files are required:
- mahout-core-0.9.jar
- mahout-math-0.9.jar
- slf4j-api-1.7.30.jar
- slf4j-simple-1.7.30.jar
- guava-18.0.jar
- commons-math3-3.2.jar

## ▶️ How to Run

### Compile
javac -cp .;mahout-core-0.9.jar;mahout-math-0.9.jar;slf4j-api-1.7.30.jar;slf4j-simple-1.7.30.jar;guava-18.0.jar;commons-math3-3.2.jar RecommendationSystem.java

### Execute
java -cp .;mahout-core-0.9.jar;mahout-math-0.9.jar;slf4j-api-1.7.30.jar;slf4j-simple-1.7.30.jar;guava-18.0.jar;commons-math3-3.2.jar RecommendationSystem

### 📌 Sample Output
Recommended products for User 1:
Product ID: 104 | Predicted Preference: 4.5

### 📊 Dataset Format (data.csv)

Each row represents a user rating a product:
userID,itemID,preference
1,101,4.0
1,102,3.5
2,101,5.0
### ⚠️ Note: The CSV file must not contain a header row.

### 📚 Use Case

Product recommendation systems

E-commerce personalization

AI & machine learning demonstrations

Academic projects and internships

###🚀 Future Enhancements

Web-based UI

Larger datasets

Content-based filtering

Deep learning models
