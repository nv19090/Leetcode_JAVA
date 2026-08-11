### Stimulation Problems 

---

# 3100. Water Bottles II

## Problem Statement

You are given two integers `numBottles` and `numExchange`.

* `numBottles` represents the number of full water bottles you initially have.
* `numExchange` represents the number of empty bottles required to exchange for one full bottle.

You can drink a full bottle and obtain one empty bottle.

After every exchange, the number of empty bottles required for the next exchange increases by `1`.

Return the maximum number of bottles you can drink.

## Approach

### Simulation + Greedy

1. Initially, all `numBottles` are full, so add them to `ans`.
2. Store the number of empty bottles in `empty`.
3. While there are enough empty bottles for an exchange:

   * Use the available empty bottles to perform as many exchanges as possible.
   * For every exchange:

     * Reduce the available empty bottles by `numExchange`.
     * Increase `filled_tobe`.
     * Increase `numExchange` by `1`.
4. Add the newly obtained bottles to `ans`.
5. After drinking the new bottles, add them to the empty bottles.
6. Repeat until there are not enough empty bottles for another exchange.
7. Return the total number of bottles drunk.

This solution simulates the exchange process while greedily performing every possible exchange.

**Topic:** Simulation, Greedy
**Technique Used:** Simulation + Greedy

## Time Complexity

* **O(√n)**
* The exchange requirement increases after every successful exchange, so the total number of exchanges is bounded by approximately `√n`.

## Space Complexity

* **O(1)**
* Only a constant number of variables are used.

---


