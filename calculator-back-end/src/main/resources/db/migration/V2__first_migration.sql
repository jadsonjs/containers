
-----------------------------------------------------------------------------
-----------------------------------------------------------------------------
-------            Migrações Automáticas da Versão 1.0.0              -------
-------                                                               -------
-----------------------------------------------------------------------------
-----------------------------------------------------------------------------

-- create user table

CREATE TABLE public.users
(
    id bigint NOT NULL,
    login character varying(60) NOT NULL,
    password character varying(60) NOT NULL
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public.users
    OWNER to postgres;


