# Archify AI

## Overview

This repository contains a React frontend and a Spring Boot backend.

- Frontend: React + Vite + React Router
- Backend: Spring Boot + MongoDB

## Prerequisites

- Node.js
- Java 17 JDK
- Maven (or use the included Maven wrapper `./mvnw` / `mvnw.cmd`)
- MongoDB (local or cloud)

## Setup

1. Install frontend dependencies:

```powershell
npm install
```

2. Set `JAVA_HOME` on Windows to the JDK 17 installation folder, for example:

```powershell
setx JAVA_HOME "C:\Program Files\Java\jdk-17"
```

Then restart PowerShell.

## Run frontend

From the repository root:

```powershell
npm run dev
```

Open the URL shown in the terminal (usually `http://localhost:5173`).

## Run backend

From the `backend` folder:

```powershell
cd backend
.\mvnw spring-boot:run
```

The backend runs on `http://localhost:8080` by default.

## Environment variables

The backend supports these values:

- `MONGODB_URI` (default: `mongodb://localhost:27017/archify-ai`)
- `JWT_SECRET` (required for production)
- `JWT_EXPIRATION_MS` (default: 7 days)
- `FRONTEND_ORIGIN` (default: `http://localhost:5173`)

## Notes

- If you see `JAVA_HOME` errors, make sure the environment variable points to a valid Java 17 JDK folder.
- Backend CORS is already configured to allow the frontend origin.
