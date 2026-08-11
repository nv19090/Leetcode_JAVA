### Stimulation Problems 

---

# 3100. Water Bottles II

## Problem Statement

You are given two integers:

* `numBottles` — the number of full water bottles you initially have.
* `numExchange` — the number of empty bottles required to exchange for one full bottle.

You can drink the full bottles and collect the empty bottles.

However, after every exchange, the number of empty bottles required for the next exchange increases by `1`.

Return the maximum number of bottles you can drink.

## Approach

### Simulation + Greedy

1. Initially, all `numBottles` are full, so add them to the answer.
2. Store the number of empty bottles in `empty`.
3. While there are enough empty bottles to make an exchange:

   * Use the available empty bottles to make as many exchanges as possible.
   * Increase `numExchange` after every successful exchange.
   * Add the newly obtained full bottles to the total answer.
   * Drink those bottles and convert them into empty bottles.
4. Continue until there are not enough empty bottles for another exchange.
5. Return the total number of bottles drunk.

The solution directly simulates the exchange process while updating the exchange requirement after every bottle exchange.

**Topic:** Math, Simulation
**Technique Used:** Simulation / Greedy

## Time Complexity

* **O(n)** approximately, where `n` represents the number of exchanges performed.
* Each exchange increases `numExchange`, so the number of exchanges is limited.

## Space Complexity

* O(1)
* Only a constant number of variables are used.

---

