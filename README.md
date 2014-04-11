# SugarMock
A mocking library for [Sugar ORM](http://satyan.github.io/sugar/)
Also known as Splenda

## What is Sugar ORM?
Sugar ORM is an Object Relational Mapper for Android, allowing developers to persist and load POJOs in Android code using an embedded SQLite database.

## What is SugarMock?
SugarMock is a mock implementation of SugarOrm, which when included instead of the real library, allows population of test data for unit tests without requiring a real database, and allows assertion of ORM calls in tests.

## Current functionality
- Implemented _findByQuery_, with ability to pre-populate results

## Setup
In your Android project's build.gradle, include SugarMock instead of SugarORM for the testCompile phase.

## Next steps
- Set up build.gradle, using the Android plugin to build deps. Currently it is user's job to put Android stub jar on classpath
- Expose more of Sugar ORM functionality (currently there are a lot of stubs)
