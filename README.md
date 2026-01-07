# DSA Practice Repository

Daily practice repository for Data Structures and Algorithms implementations in Java.

## 📋 Overview

This repository contains solutions to algorithmic problems organized by topic. Each solution includes problem description, approach, and time/space complexity analysis.

## 🎯 Focus Areas

- **Pattern Problems** - Algorithmic patterns and problem-solving techniques
- **Arrays** - Array manipulation, searching, and optimization algorithms
- **Strings** - String processing and pattern matching algorithms

## 📅 Practice Schedule

- **Frequency**: Daily
- **Problems**: 2-3 per day
- **Language**: Java

## 📁 Repository Structure

```
dsa-daily/
├── Arrays/      # Array-related problems
├── Patterns/    # Common algorithmic patterns
├── Strings/     # String manipulation problems
├── PROGRESS.md  # Daily progress tracking
└── README.md
```

## 💻 Code Format

Each solution follows this structure:

```java
/*
Problem: Print Right Triangle Star Pattern
Category: Pattern
Difficulty: Easy

Approach:
- Use nested loops
- Outer loop for rows
- Inner loop for stars

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class StarPattern1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

---

**Started**: 1 Jan 2026 | **Status**: Active
