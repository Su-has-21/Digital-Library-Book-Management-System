import React, { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/api/books").then((res) => {
      console.log(res);
      setBooks(res.data);
    });
  }, []);

  return (
    <div className="min-h-screen bg-gradient-to-br from-[#205781] to-[#98D2C0] p-6">
      {/* Navbar */}
      <nav className="bg-[#4F959D] text-white py-4 px-6 rounded-lg shadow-lg">
        <h1 className="text-3xl font-bold text-center">📚 Digital Library</h1>
      </nav>

      {/* Book List */}
      <div className="container mx-auto mt-8">
        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
          {books.map((book) => (
            <div key={book.bookId} className="bg-[#F6F8D5] p-6 rounded-lg shadow-md transform hover:scale-105 transition duration-300">
              <h2 className="text-2xl font-semibold text-[#205781]">{book.title}</h2>
              <p className="text-lg text-[#4F959D]">by {book.author}</p>
              <p className="text-sm text-[#205781] mt-2">
                <strong>Genre:</strong> {book.genre}
              </p>
              <p className={`mt-2 font-semibold ${book.status === "AVAILABLE" ? "text-green-600" : "text-red-600"}`}>
                Status: {book.status}
              </p>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
}

export default App;
