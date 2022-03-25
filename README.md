# Exercicio2

Exercicio2 TI-BD

Banco Inicial:



--
-- PostgreSQL database dump
--

-- Dumped from database version 12.9 (Ubuntu 12.9-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.9 (Ubuntu 12.9-0ubuntu0.20.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: carros; Type: TABLE; Schema: public; Owner: ti2cc
--

CREATE TABLE public.carros (
    id integer NOT NULL,
    nome text,
    marca text,
    ano integer
);


ALTER TABLE public.carros OWNER TO ti2cc;

--
-- Data for Name: carros; Type: TABLE DATA; Schema: public; Owner: ti2cc
--

INSERT INTO public.carros VALUES (1, 'focus', 'ford', 2016);
INSERT INTO public.carros VALUES (2, 'fusca', 'volkswagen', 1970);
INSERT INTO public.carros VALUES (3, 'onix', 'chevrolet', 2012);
INSERT INTO public.carros VALUES (4, 'uno', 'fiat', 2005);
INSERT INTO public.carros VALUES (5, 'hb20', 'hyundai', 2020);
INSERT INTO public.carros VALUES (6, 'fox', 'volkswagen', 2019);
INSERT INTO public.carros VALUES (7, 'brasilia', 'volkswagen', 1975);
INSERT INTO public.carros VALUES (8, 'kwid', 'renault', 2016);
INSERT INTO public.carros VALUES (11, 'fiesta', 'ford', 2018);


--
-- Name: carros carros_pkey; Type: CONSTRAINT; Schema: public; Owner: ti2cc
--

ALTER TABLE ONLY public.carros
    ADD CONSTRAINT carros_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

