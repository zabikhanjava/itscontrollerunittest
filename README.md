# itscontrollerunittest
docker exec -it mysql-localhost mysql -u root -p -D something
docker restart bfe3d8d7fd7609387552d58490c8f93c07c3f573b416f13869e09d9a853e2c7b
docker build --no-cache . -t crud 
 docker logs bfe3d8d7fd7609387552d58490c8f93c07c3f573b416f13869e09d9a853e2c7b   
docker run -p 8086:8086 --name crud-locallyss --link mysql-localhost:mysql -d crud:latest
docker exec -it mysql-localhost mysql -u root -p -D something
docker images
docker pull mysql
docker run --name mysql-localhost -e MYSQL_ROOT_PASSWORD=mypassword -e MYSQL_DATABASE=something -e MYSQL_USER=sa -e MYSQL_PASSWORD=mypassword -d mysql:latest 
docker ps
docker container ls
docker ps -a
docker rm 7f7f1f8bbb89
docker image rm cruds
docker exec -it mysql-localhost mysql -u root -p -D something
