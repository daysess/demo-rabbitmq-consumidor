# Modelo de implementação RabbitMQ

## 1. Instalação do rabbitMQ com o docker localmente:

### para RabbitMQ 3.9, a série mais recente
``` 
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management

```

``` 
# para RabbitMQ 3.8,
# 3.8.x linha do tempo de suporte: https://www.rabbitmq.com/versions.html
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.8-management

```
Link de referência: (https://www.rabbitmq.com/download.html)

Prontinho, já pode visualizar o containeres  docker deesktop.

