```markdown
# Deployment Guide

Step-by-step guide to deploy this app using **Supabase** (database), **Render** (backend), and **Vercel** (frontend).

---

## Prerequisites

- [Supabase](https://supabase.com) account
- [Render](https://render.com) account
- [Vercel](https://vercel.com) account

---

## Deployment Order

Always follow this order:

1. **Supabase** → Create database and get credentials
2. **Render** → Deploy backend with database credentials
3. **Vercel** → Deploy frontend with backend URL

---

## Step 1: Create Database on Supabase

1. Go to [supabase.com](https://supabase.com) and sign in.
2. Click **New Project** and fill in your project details.
3. Wait for the project to finish setting up.
4. Go to **Settings → Database** and copy the following credentials:

- `SPRING_DATASOURCE_URL` — found under **Connection String (JDBC)**
- `SPRING_DATASOURCE_USERNAME` — found under **Username**
- `SPRING_DATASOURCE_PASSWORD` — found under **Password**

The JDBC URL looks like this:
```
jdbc:postgresql://db.<project-ref>.supabase.co:5432/postgres
```

---

## Step 2: Deploy Backend on Render

1. Go to [render.com](https://render.com) and sign in.
2. Click **New → Web Service**.
3. Connect your GitHub repository.
4. Set the following configuration:
   - **Language:** Docker
   - **Root Directory:** `backend`
5. Add these 4 environment variables:

| Variable | Value |
|---|---|
| `ALLOWED_ORIGINS` | `https://your-frontend-name.vercel.app` |
| `SPRING_DATASOURCE_URL` | JDBC URL from Supabase |
| `SPRING_DATASOURCE_USERNAME` | Username from Supabase |
| `SPRING_DATASOURCE_PASSWORD` | Password from Supabase |

6. Click **Create Web Service** and wait for deployment to complete.
7. Copy your backend URL — it will look like: `https://your-backend-name.onrender.com`

---

## Step 3: Deploy Frontend on Vercel

1. Go to [vercel.com](https://vercel.com) and sign in.
2. Click **New Project** and import your GitHub repository.
3. Set the following configuration:
   - **Root Directory:** `frontend`
4. Add this 1 environment variable:

| Variable | Value |
|---|---|
| `VITE_API_BASE_URL` | `https://your-backend-name.onrender.com/api` |

Replace `your-backend-name` with the actual name from your Render deployment.

5. Click **Deploy** and wait for the deployment to finish.

---

## Troubleshooting

- **CORS errors:** Make sure `ALLOWED_ORIGINS` in Render exactly matches your Vercel frontend URL with no trailing slash.
- **Database connection errors:** Check that your Supabase JDBC URL is correct and the password has no special characters needing URL encoding.
- **Backend slow to respond:** Render free-tier services sleep after inactivity — the first request may take 30–60 seconds to wake up.
```