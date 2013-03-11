package org.sample

import org.junit.Test
import org.junit.Assert

class PersonTest {

    val group = List(
        new Person("John", "Poe", 32), 
        new Person("Jim", "TooYoung", 17), 
        new Person("Joe", "OldEnough", 19)
        )

    @Test
    def testOldPerson() {
        var joe = new Person("Joe", "Smith", 100)
        Assert.assertTrue(joe.valid)
        val str = joe.toString()
    }

    @Test
    def testYounPerson() {
        var joe = new Person("Joe", "Smith", 10)
        Assert.assertTrue("Joe is a kid", !joe.valid)
    }

    @Test
    def testValidAge() {
        Assert.assertEquals(3, group.size)
        val adults = group.filter(p => p.valid)
        Assert.assertEquals("Number of adults", 2, adults.size)
    }

    @Test
    def testAdultsSortedByAgeDecreasing() {
        val adults = group.filter(p => p.valid).sortBy(p => p.age).reverse
        println(adults)
        Assert.assertEquals("Number of adults", 2, adults.size)   
        Assert.assertEquals(group(0).first, adults(0).first)
        Assert.assertEquals(group(2).first, adults(1).first)
    }

    @Test
    def testAdultsSortedByAgeJustFirstNames() {
        def validByAge(in: List[Person]) = in.filter(p => p.valid).sortBy(p => p.age).map(p => p.first)
        Assert.assertEquals("youngest adult's name", group(2).first, validByAge(group)(0))
    }
}
