# Patterns

## Phase 1 — Factory Method

### Where
`GameObjectFactory.java` — `create()` method

### Why
Object creation was scattered in Main. Every new object required `new GameObject()` directly in the caller.

### Before
```java
GameObject goblin = new GameObject("enemy", "goblin");
```

### After
```java
GameObject goblin = GameObjectFactory.create("enemy", "goblin");
```

### What We Gained
- Object creation is centralized
- Main no longer depends on constructor details
- Adding a new type only requires changing the Factory