#Resources


10021  mvn package && docker build -t svc/chips .
10022  docker run -d -p 8484:8080 --name chips svc/chips
10023  docker logs chips
10024  docker stats
10021  mvn package && docker build -t svc/chips .
10022  docker run -d -p 8484:8080 --name chips svc/chips
10023  docker logs chips
10024  docker stats
