package com.michaelstucki.restfulwebservicedemo;

/**
 * Jackson JSON library automatically marshals Greeting instance to JSON.
 * JSON.Jackson is included by default by web starter.
  */
public record Greeting(long id, String content) {}
