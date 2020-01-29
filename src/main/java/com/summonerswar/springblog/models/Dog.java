//package com.summonerswar.springblog.models;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="dogs")
//public class Dog {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(nullable = false, columnDefinition = ("INT(11) UNSIGNED"))
//    private int id;
//
//    @Column(nullable = false, unique = true, columnDefinition = ("TINYINT(3) UNSIGNED"))
//    private int age;
//
//    @Column(nullable = false, length = 200)
//    private String name;
//
//    @Column(length = 2) // needs to default to XX
//    private String resideState;
//
//    public Dog(int id, int age, String name, String resideState) {
//        this.id = id;
//        this.age = age;
//        this.name = name;
//        this.resideState = resideState;
//    }
//
//    // GETTERS AND SETTERS
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getResideState() {
//        return resideState;
//    }
//
//    public void setResideState(String resideState) {
//        this.resideState = resideState;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//}

//================================= JPA TABLE CREATION PRACTICE
//        Create a model class (Dog) with proper annotations to make a dogs table with the following properties:
//        1) id
//        2) age
//        3) name
//        4) resideState
//        Be sure to include getters and setters and constructors and needed annotations.
//
//        When running the 'SHOW CREATE TABLE dogs', you should have the following schema:
//
//        CREATE TABLE `dogs` (
//        `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
//        `age` tinyint(3) unsigned NOT NULL,
//        `name` varchar(200) NOT NULL,
//        `reside_state` char(2) DEFAULT 'XX',
//        PRIMARY KEY (`id`),
//        UNIQUE KEY `UK_?????????????????` (`age`)
//        ) ENGINE=MyISAM DEFAULT CHARSET=utf8
//
//        Once you have the correct schema, use the following seed data to populate the table with default values:
//        USE put_the_name_of_your_DB_here;
//        INSERT INTO dogs (age, name, reside_state)
//        VALUES
//        (2, 'Chuck', 'TX'),
//        (5, 'Fred', 'OH'),
//        (3, 'Bud', 'TN'),
//        (10, 'Bailey', 'AL'),
//        (11, 'Lexie', 'TX'),
//        (1, 'Snickers', 'TX'),
//        (6, 'Red', 'FL'),
//        (8, 'Barney', 'CA'),
//        (12, 'Bowser', 'TX');