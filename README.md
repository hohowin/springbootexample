# Getting Started

## For Development

```bash
# Spin up postgres
docker-compose -f dev.yaml up -d
# Connect to postgres
psql -h localhost -p 5432 -U postgres
\q
```

## For Production

```bash
docker-compose -f prd.yaml up -d
```