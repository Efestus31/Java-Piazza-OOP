# 🍕 Pizza OOP Java Project

## Descrizione

Questo progetto Java è un semplice esercizio di programmazione orientata agli oggetti (OOP) che modella il processo di creazione, cottura e consumo di una pizza.

L'obiettivo principale è esercitarsi con:

- **Classi e oggetti**
- **Composizione**
- **Incapsulamento**
- **Stati interni**
- **Metodi e costruttori**
- **Liste di oggetti (`ArrayList`)**

## Classi principali

- **`Ingredient`**: rappresenta un singolo ingrediente con nome, quantità, disponibilità e indicazione se va aggiunto dopo la cottura.
- **`Dough`**: rappresenta l’impasto, con tipo di farina, peso, lievitazione, bordo e idratazione.
- **`Pizza`**: unisce impasto e lista di ingredienti, gestisce i metodi `cook()`, `eat()` e `describe()`.
- **`Main`**: classe con il metodo `main()` che crea una pizza, la cuoce, la consuma e ne stampa lo stato.

## Esecuzione

Compila e avvia il programma con un IDE Java oppure da terminale:

```bash
javac Main.java
java Main

#English version

# 🍕 Pizza OOP Java Project

## Description

This Java project is a simple object-oriented programming (OOP) exercise that models the process of
 creating, baking, and eating a pizza.

The main goal is to practice the following OOP concepts:

- **Classes and objects**
- **Composition**
- **Encapsulation**
- **Internal state management**
- **Constructors and methods**
- **Object collections (`ArrayList`)**

## Main Classes

- **`Ingredient`**: Represents a single ingredient with name, quantity, availability, and whether it's added after baking.
- **`Dough`**: Represents the pizza dough, including flour type, hydration, stuffed crust option, weight, and proofing time.
- **`Pizza`**: Composes dough and a list of ingredients. Provides methods `cook()`, `eat()`, and `describe()` to simulate pizza behavior.
- **`Main`**: Contains the `main()` method that creates a pizza, bakes it, eats it, and prints its status.

## How to Run

Compile and run with any Java IDE or from terminal:

```bash
javac Main.java
java Main

