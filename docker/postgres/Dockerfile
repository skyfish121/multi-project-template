FROM postgres:11.5-alpine
## ADD ./keycloak.sql /docker-entrypoint-initdb.d/
ADD ./00_DDL.sql /docker-entrypoint-initdb.d/
ENV POSTGRES_DB=postgres
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres
