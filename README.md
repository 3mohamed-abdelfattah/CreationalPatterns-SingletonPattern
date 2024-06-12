# Creational Patterns - Singleton Pattern

## Overview

The Singleton Pattern is one of the simplest design patterns in software engineering. It belongs to the creational patterns group, which deals with object-creation mechanisms. The primary purpose of the Singleton Pattern is to ensure that a class has only one instance and provides a global point of access to it.

![image](https://github.com/3mohamed-abdelfattah/Creational-Patterns---Singleton-Pattern/assets/142848460/69bf4283-e36b-4471-a0a8-728e00b6f965)

## Why Use Singleton Pattern?

1. **Controlled Access to a Single Instance:** Ensures that a class has only one instance and provides a global point of access to it.
2. **Reduced Memory Footprint:** Prevents unnecessary instantiation of objects.
3. **Global Access:** Provides a global point of access to the instance.

## UML Diagram

![Singleton Pattern UML](https://github.com/3mohamed-abdelfattah/Creational-Patterns---Singleton-Pattern/assets/142848460/891c82f2-52d8-4ae3-94ef-004e0680ef73)

## UML Class Diagram
![image](https://github.com/3mohamed-abdelfattah/Creational-Patterns---Singleton-Pattern/assets/142848460/7917a1a8-15f4-447e-9f14-725980bf2290)

## Benefits of Singleton Pattern

1. **Controlled Access:** Only one instance is created, which controls the resource access.
2. **Lazy Initialization:** A Singleton instance is created only when it is required.
3. **Reduced Namespace:** Avoids polluting the global namespace with unnecessary classes.

## Drawbacks of Singleton Pattern

1. **Global State:** A Singleton pattern can introduce a global state in the application.
2. **Single Responsibility Principle Violation:** Over time, a singleton class can accumulate more responsibilities than initially intended.
3. **Concurrency Issues:** In multi-threaded environments, care must be taken to ensure thread safety.


