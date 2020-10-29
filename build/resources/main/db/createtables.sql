CREATE DATABASE wildlife_tracker;

\c wildlife_tracker

CREATE TABLE sightings(
id SERIAL PRIMARY KEY,
speciesName VARCHAR,
speciesAge INTEGER,
speciesHealth VARCHAR,
rangerId INTEGER,
locationId INTEGER
);

CREATE TABLE rangers(
id SERIAL PRIMARY KEY,
rangerName VARCHAR NOT NULL,
rangerBadgeNumber INTEGER NOT NULL,
rangerContact VARCHAR NOT NULL
);

CREATE TABLE locations(
id SERIAL PRIMARY KEY,
name VARCHAR
);