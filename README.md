# Java vs Scala 

## Summary
A simple app to illustrate the conciseness of Scala when compared with Java
inspired by this http://stackoverflow.com/questions/2952732/samples-of-scala-and-java-code-where-scala-code-looks-simpler-has-fewer-lines
question and apparently inturn from "Begining Scala" by David Pollack
http://www.amazon.com/Beginning-Scala-Experts-Voice-Source/dp/1430219890/ref=sr_1_1?ie=UTF8&qid=1361218155&sr=8-1&keywords=scala+david+pollack

To run and test it use SBT invoke: 'sbt run'

## Scala Unit Tests with Coverage

I have added example Scala JUnit tests using [Jacoco](https://github.com/Godin/sonar-experiments/tree/master/jacoco-examples/scala-example) and Maven.
To execute, from command line in `src\main\scala` run `mvn clean install`, then open in the browser _src/main/scala/target/site/jacoco/index.html_

### Example unit test

The Scala unit tests can use JUnit

    package org.sample

    import org.junit.Test
    import org.junit.Assert

    class PersonTest {
        @Test
        def testYounPerson() {
            var joe = new Person("Joe", "Smith", 10)
            Assert.assertTrue("Joe is a kid", !joe.valid)
        }
    }

See *src/main/scala/pom.xml* for dependencies.


