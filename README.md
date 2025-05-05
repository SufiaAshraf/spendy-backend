# 💰 Spendy - Smart Personal Finance Tracker

Spendy is a smart expense and income tracking app that helps users automatically parse bank SMS, categorize transactions, set long-term financial goals, and receive AI-powered recommendations to stay on track.

---

## 🚀 MVP Features

- ✅ Parse bank SMS (Android-only) to extract income & expenses. 
- ✅ Categorize transactions by type and payment method (UPI, Credit, Cash, etc.)
- ✅ Visual dashboards with spending trends and breakdowns
- ✅ Set 5- or 10-year financial goals (e.g., apartment, travel)
- ✅ Track monthly progress and savings toward goals
- ✅ Get AI-based suggestions to improve financial habits

---

## 🧱 Tech Stack

- **Backend:** Java 17, Spring Boot
- **Database:** PostgreSQL
- **Authentication:** JWT (Spring Security)
- **Queueing (optional for scale):** Kafka or RabbitMQ
- **AI Integration:** OpenAI API or HuggingFace
- **Cloud-ready:** AWS/GCP compatible

---

## 🏗️ Backend Architecture

### Modules

| Module               | Description                                                   | Patterns Used                     |
|----------------------|---------------------------------------------------------------|-----------------------------------|
| SMS Parsing          | Extracts transaction data from SMS using strategy pattern     | Strategy, Factory                 |
| Transaction Manager  | Stores and updates transactions, determines type/category     | Factory, Service                  |
| Category Engine      | Dynamically classifies transactions via rule/ML chain         | Chain of Responsibility           |
| Goal Planner         | Allows users to create and monitor long-term financial goals  | SRP, OCP                          |
| AI Recommender       | Observes user behavior and gives tips/predictions             | Observer Pattern                  |

---

## 🧮 Database Schema (Simplified)

- `users` — stores user info
- `sms_messages` — raw SMS content from user devices
- `transactions` — parsed and categorized income/expenses
- `goals` — financial goal data
- `recommendations` — AI suggestions and insights

---

## 📡 API Endpoints

| Method | Endpoint                   | Description                          |
|--------|----------------------------|--------------------------------------|
| POST   | `/api/sms/ingest`          | Submit SMS for parsing               |
| GET    | `/api/transactions`        | View all transactions                |
| POST   | `/api/goals`               | Create a financial goal              |
| GET    | `/api/recommendations`     | Get personalized AI recommendations  |
| GET    | `/api/dashboard/summary`   | Get expense & income dashboard data  |

---

## 🔐 Auth & Security

- JWT-based token authentication
- Encrypted storage of sensitive SMS data
- Role-based access (`USER`, `ADMIN`)

---

## 🛠️ Setup Instructions

1. Clone this repo:
   ```bash
   git clone https://github.com/yourusername/spendy-backend.git
   cd spendy-backend
   ```

2. Configure `application.yml`:
   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/spendy
       username: postgres
       password: your_password
   jwt:
     secret: your_jwt_secret
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

4. API is available at: `http://localhost:8080/api`

---

## 📈 Future Enhancements

- OCR support for scanned receipts  
- iOS support via API-based bank integration (e.g., Setu, Yodlee)  
- AI budget planning based on transaction history  
- Notification system (email, in-app, WhatsApp)

---

## 👩‍💻 Contributors

- [@sufia](https://github.com/sufiaAshraf) - Founder & Architect  
- Contributions welcome! Submit PRs or feature requests.

---

## 📄 License

This project is under the MIT License.