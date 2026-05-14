# AI Log - Phase 1

## Prompt
"What design problems do you see in this code? Which design patterns could solve them?"

## AI Response (Summary)
- Object creation is scattered, Factory Method can centralize it
- if-else chains violate Open/Closed Principle
- No separation between object types

## What I Applied
Applied Factory Method via GameObjectFactory class.
Object creation is now centralized and Main no longer uses `new GameObject()` directly.

## Difference from AI Suggestion
AI suggested also using abstract classes at this stage.
I decided to keep it simple for Phase 1 and apply inheritance in later phases.