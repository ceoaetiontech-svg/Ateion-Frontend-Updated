VITE_API_BASE_URL=https://your-backend-name.onrender.com/api

ALLOWED_ORIGINS
SPRING_DATASOURCE_URL
SPRING_DATASOURCE_USERNAME
SPRING_DATASOURCE_PASSWORD

A Quick Warning on Supabase URLs
When you copy the connection string from Supabase, they often give you a URI that looks like this:
postgresql://postgres.xyz:password@host:5432/postgres

You must change the start of it for Spring Boot:

Supabase gives: postgresql://...

Spring Boot needs: jdbc:postgresql://...