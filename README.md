# 📚 Library Management System (LMS)

The **Library Management System** (LMS) is a Java-based software solution designed to manage books, users, and borrowing activities efficiently. This project demonstrates clean software architecture with the use of well-known **Design Patterns** to meet common library requirements in a maintainable and extensible way.

---

## 🧩 System Overview

- Manages different types of books (physical, historical, ebook).
- Allows users (regular and premium) to borrow and return books.
- Handles borrowing approval through hierarchical staff roles.
- Enables premium-only access for specific features.
- Integrates external book data from JSON sources.
- Notifies users when books become available.

---

## ✅ Key Features & Applied Design Patterns

| Feature | Description | Design Pattern |
|--------|-------------|----------------|
| Singleton LibraryService | Only one instance of the service handles all operations. | **Singleton Pattern** |
| Dynamic Book Creation | Creating various book types externally, decoupled from main logic. | **Factory Pattern** |
| Premium Book Borrowing | Allow PremiumBook extra 10 days borrowing without altering Book class. | **Decorator Pattern** |
| Premium Access for EBooks | Users get or are denied access to ebooks based on their subscription. | **Strategy Pattern** |
| Approval Chain for Requests | Borrowing requests pass through Librarian → Manager → Director. | **Chain of Responsibility** |
| Simplified Borrowing Flow | Library operations for book borrowing abstracted for ease. | **Facade Pattern** |
| External JSON Conversion | Convert JSON-formatted book data to internal Book entities. | **Adapter Pattern** |
| Notify When Available | Users are notified when a borrowed book becomes available. | **Observer Pattern** |

---

## 🔧 Example JSON Input for External Book

```json
{
  "bookTitle": "Design Patterns",
  "isBorrowable": true,
  "authorName": "Erich Gamma",
  "year": 1994
}
