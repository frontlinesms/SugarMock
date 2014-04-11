# SugarMock
A mocking library for [Sugar ORM](http://satyan.github.io/sugar/)
Also known as Splenda

## What is Sugar ORM?
Sugar ORM is an Object Relational Mapper for Android, allowing developers to persist and load POJOs in Android code using an embedded SQLite database.

## What is SugarMock?
SugarMock is a mock implementation of SugarOrm, which when included instead of the real library, allows population of test data for unit tests without requiring a real database, and allows assertion of ORM calls in tests. The builds so far are against v1.2 of Sugar ORM.

## Current functionality
- Implemented _findByQuery_, with ability to pre-populate results
- Migrated build to gradle

## Setup
In your Android project's build.gradle, include SugarMock jar instead of SugarORM for the testCompile phase.

## Building
We build with gradle, but unfortunately the android.jar dependency isn't available in any public maven repos. To build, copy android.jar from your sdk into the libs folder (we've tested against android-19 so far).

## Next steps
- Ability to test calls to save()
- More advanced usage of findWithQuery(), e.g. assert query string and params, and return different lists based on both
