CREATE DATABASE animal;

\c animal;

CREATE TABLE sightings(
id SERIAL PRIMARY KEY,
speciesName VARCHAR,
speciesAge VARCHAR,
speciesHealth VARCHAR,
rangerId INTEGER,
locationId INTEGER,
type VARCHAR
);

CREATE TABLE rangers(
id SERIAL PRIMARY KEY,
rangerName VARCHAR NOT NULL,
rangerBadgeNumber INTEGER NOT NULL,
rangerContact VARCHAR NOT NULL
);

CREATE TABLE locations(
id SERIAL PRIMARY KEY,
locationName VARCHAR
);