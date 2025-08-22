# Requisitos
### Levantar un contenedor de postgresql
docker run --ulimit memlock=-1:-1 -d --name postgres -e POSTGRES_USER=sa -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=tipo_cambio_db -p 5432:5432 postgres:13.3

### Ejecutar el comando 
mvn quarkus:dev
