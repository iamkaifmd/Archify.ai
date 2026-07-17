# ✨ Archify AI

[![Vite](https://img.shields.io/badge/Vite-646CFF?style=for-the-badge&logo=vite&logoColor=white)](https://vitejs.dev/)
[![React Router](https://img.shields.io/badge/React_Router-CA4245?style=for-the-badge&logo=react-router&logoColor=white)](https://reactrouter.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com/)
[![Gemini](https://img.shields.io/badge/Gemini_AI-8E75C2?style=for-the-badge&logo=google-gemini&logoColor=white)](https://deepmind.google/technologies/gemini/)

Archify AI is an AI-first collaborative design environment that helps you visualize, render, and manage architectural projects at the speed of thought. Upload your 2D sketch or floor plan and transform it into a stunning 3D architectural render powered by **Gemini 2.5 Flash via HeyPuter**.

---

## 🚀 Key Features

*   **AI Floorplan Rendering**: Convert 2D floor plans, drawings, or sketches into high-fidelity 3D-styled architectural renders instantly.
*   **Intuitive Visualizer**: An interactive preview editor to compare source drawings and generated renders side-by-side.
*   **Project Management**: Create, search, page through, and organize your architectural designs easily.
*   **Public/Private Sharing**: Securely share project links with collaborators or publish them to the community, with robust owner-only permission guardrails.
*   **JWT Authentication**: Secure user credentials, registration, and session management.

---

## 🛠️ Technology Stack

### Frontend
- **Framework**: React + Vite + TypeScript (React Router v7)
- **Styling**: Vanilla CSS with modern variables, grid layouts, animations, and dark modes
- **State Management & Routing**: React Router + Context API
- **AI Integration**: [@heyputer/puter.js](https://puter.com/) calling `gemini-2.5-flash-image-preview`

### Backend
- **Framework**: Spring Boot (Java 17)
- **Database**: MongoDB (Persistence for users & project configurations)
- **Security**: JWT-based stateless authentication
- **Build Tool**: Maven

---

## 📦 Directory Structure

```text
archify_frontend-main/
├── app/                  # React Router routes and pages
├── components/           # Reusable UI component files (Navbar, AuthModal, Upload, etc.)
├── lib/                  # Helper utilities and API handlers
├── public/               # Public assets (favicon, icons, etc.)
└── backend/              # Spring Boot Java application
```

---

## ⚙️ Local Development Setup

### Prerequisites
- [Node.js](https://nodejs.org/) (v20+ recommended)
- [Java 17 JDK](https://adoptium.net/temurin/releases/?version=17)
- [MongoDB](https://www.mongodb.com/try/download/community) (running locally on port 27017 or a cloud URI)

---

### Step 1: Start the Spring Boot Backend

1. Navigate to the backend directory:
   ```bash
   cd backend
   ```
2. Configure environment variables in a `.env` file or export them:
   - `MONGODB_URI` (Default: `mongodb://localhost:27017/archify-ai`)
   - `JWT_SECRET` (A strong, random secret key for token signing)
   - `JWT_EXPIRATION_MS` (Default: `604800000` / 7 days)
   - `FRONTEND_ORIGIN` (Default: `http://localhost:5173`)
3. Set your `JAVA_HOME` environment variable (if not already set) pointing to your JDK 17 installation.
4. Run the development server using the Maven wrapper:
   - **Windows (PowerShell)**:
     ```powershell
     .\mvnw spring-boot:run
     ```
   - **macOS / Linux**:
     ```bash
     chmod +x mvnw
     ./mvnw spring-boot:run
     ```
   The API will start on `http://localhost:8080`.

---

### Step 2: Start the React Frontend

1. From the root directory, install all required Node dependencies:
   ```bash
   npm install
   ```
2. Run the Vite development server:
   ```bash
   npm run dev
   ```
3. Open `http://localhost:5173` in your browser.

---

## 🐳 Docker Deployment

Both the frontend and backend are fully Dockerized.

### Run Frontend in Docker
```bash
docker build -t archify-frontend .
docker run -p 3000:3000 archify-frontend
```

### Run Backend in Docker
```bash
cd backend
docker build -t archify-backend .
docker run -p 8080:8080 -e MONGODB_URI=mongodb://host.docker.internal:27017/archify-ai archify-backend
```

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit issues or pull requests to help improve the Archify AI experience.
