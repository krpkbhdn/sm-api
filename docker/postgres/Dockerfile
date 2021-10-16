FROM postgres:13.4-alpine

ENV POSTGRES_USER=sm_user \
    POSTGRES_PASSWORD=P@ssw0rd \
    POSTGRES_DB=school_meals

ADD sql/init.sql /docker-entrypoint-initdb.d/1-schema.sql

VOLUME ["/var/lib/postgresql/data"]

EXPOSE 5432

CMD ["docker-entrypoint.sh", "postgres"]
