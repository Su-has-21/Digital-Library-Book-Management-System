# Digital Library Book Management System

## 📌 Overview

This is a **Spring Boot and React.js** based application that allows users to manage a digital library efficiently. Librarians can **add, update, search, and remove books** while maintaining their availability status.

---

## 🛠 Tech Stack

- **Backend:** Spring Boot (Java), Spring Data JPA, MySQL
- **Frontend:** React.js (Tailwind CSS for UI styling)
- **Database:** MySQL
- **Tools:** VS Code, Postman, Git, Maven

---

## 🚀 Features

✅ Add, view, update, and delete books
✅ Search books by ID or Title
✅ Maintain book availability status
✅ Fully responsive UI with Tailwind CSS
✅ RESTful API with proper validation
✅ Exception handling & error messages

---

## ⚙️ Setup Instructions (VS Code)

### **1️⃣ Clone the Repository**

```sh
# Open terminal and run:
git clone https://github.com/Su-has-21/Digital-Library-Book-Management-System.git
cd digital-library
```

### **2️⃣ Backend Setup (Spring Boot)**

1. Open the **backend** folder in VS Code
2. Install dependencies:

```sh
mvn clean install
```

3. Update **application.properties** with your MySQL database details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/digital_library
spring.datasource.username=root
spring.datasource.password=your_password
```

4. Run the application:

```sh
mvn spring-boot:run
```

Backend will start at: **[http://localhost:8080](http://localhost:8080)**

---

### **3️⃣ Frontend Setup (React.js)**

1. Open the **frontend** folder in VS Code
2. Install dependencies:

```sh
npm install
```

3. Start the React application:

```sh
npm start
```

Frontend will be available at: **[http://localhost:3000](http://localhost:3000)**

---

## 📌 API Endpoints

| Method | Endpoint          | Description          |
| ------ | ----------------- | -------------------- |
| GET    | `/api/books`      | Get all books        |
| GET    | `/api/books/{id}` | Get book by ID       |
| POST   | `/api/books`      | Add a new book       |
| PUT    | `/api/books/{id}` | Update book details  |
| DELETE | `/api/books/{id}` | Delete a book record |

---

## ✅ Deployment

1. Build the frontend:

```sh
npm run build
```

2. Deploy the Spring Boot backend to a server like AWS/GCP/Heroku
3. Serve the React frontend using Nginx or Netlify

---

## ❗ Challenges Faced & Improvements

- **Handling edge cases**: Added exception handling for missing book IDs
- **UI improvements**: Used Tailwind for better styling
- **Scalability**: Improved API response structure for better future integrations

---

## 🤝 Contributing

1. Fork the repo
2. Create a new branch (`feature-xyz`)
3. Commit changes (`git commit -m "Added new feature"`)
4. Push to the branch (`git push origin feature-xyz`)
5. Create a pull request

---

## 📄 License

This project is open-source and available under the **MIT License**.

