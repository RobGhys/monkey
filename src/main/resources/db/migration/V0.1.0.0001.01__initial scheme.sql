CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE bucket_list
(
    "id"                                     UUID PRIMARY KEY DEFAULT uuid_generate_v1(),
    "name"                                      text,
    "description"                        text
);

INSERT INTO bucket_list (name, description)
VALUES ('Rob', 'haha'), ('Caro', 'hoho');