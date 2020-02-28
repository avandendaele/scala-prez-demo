package com.github.avandendaele.scalaprez

case class Actor(name: String, firstName: String, gender: Gender, age: Int, films: Set[String] = Set.empty)