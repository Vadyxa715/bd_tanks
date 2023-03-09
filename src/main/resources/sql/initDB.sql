CREATE TABLE IF NOT EXISTS tanks_type
(
    id    BIGINT PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    vld BIGINT ,
    nld BIGINT ,
    side BIGINT,
    accuracy double precision
);