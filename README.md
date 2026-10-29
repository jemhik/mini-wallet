# mini-wallet

Learning project: a small wallet with card payments, built step by step to practise
transactions, concurrency, idempotency, webhooks, Kafka and security in Spring Boot.

## Run locally

```bash
docker compose up -d
./mvnw spring-boot:run   # or run MiniWalletApplication from the IDE
curl http://localhost:8080/actuator/health
```

Tests use Testcontainers, so Docker must be running: `./mvnw test`.
