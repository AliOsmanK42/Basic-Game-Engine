# Problems

## 1. All game objects are in a single class
All objects are managed in one class. There are no separate classes for each type.

## 2. If-else chains in every method
`update()`, `render()`, and `interact()` all use if-else blocks to separate behavior. Adding a new type means editing every method.

## 3. Modifying existing code to add new types
Adding a new object type requires changing `update()`, `render()`, and `interact()` separately. This violates the Open/Closed Principle.

## 4. Type is stored as a plain String
There is no validation on the `type` field. A typo like `"Enemey"` would silently fail instead of throwing an error.

## 5. Behavior is not owned by the object
Each object does not know how to behave on its own. All behavior logic is centralized in `GameObject`, not distributed to the relevant class.