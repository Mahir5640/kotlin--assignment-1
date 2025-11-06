// Main.kt

/**
 * Checks if a given number is prime.
 * A prime number is a natural number greater than 1 that has no positive divisors
 * other than 1 and itself.
 *
 * @param num The number to check.
 * @return `true` if the number is prime, `false` otherwise.
 */
fun isPrime(num: Int): Boolean {
    // Numbers 1 or less are not prime
    if (num <= 1) return false
    
    // We check for divisors from 2 up to the square root of the number.
    // If we find any divisor in this range, the number is not prime.
    var i = 2
    while (i * i <= num) {
        if (num % i == 0) {
            // Divisible by i, so not prime
            return false
        }
        i++
    }
    
    // If no divisors were found, the number is prime
    return true
}

fun main() {
    // 1. Find the first 50 prime numbers
    val primeNumbers = mutableListOf<Int>()
    var currentNumber = 2 // Start checking from the first prime number

    while (primeNumbers.size < 50) {
        if (isPrime(currentNumber)) {
            primeNumbers.add(currentNumber)
        }
        currentNumber++
    }

    // 2. Print the list of prime numbers
    println("--- First 50 Prime Numbers ---")
    println(primeNumbers)
    println("Total primes found: ${primeNumbers.size}")


    // 3. Create a list of the first 50 even numbers
    // The first 50 even numbers are 2, 4, 6, ..., 100.
    // We can generate this by mapping numbers 1 to 50 and multiplying each by 2.
    val evenNumbers = (1..50).map { it * 2 }

    
    // 4. Add the even numbers to the prime list
    primeNumbers.addAll(evenNumbers)

    
    // 5. Print the combined list
    println("\n--- Combined List (Primes + Evens) ---")
    println(primeNumbers)
    println("Total numbers in combined list: ${primeNumbers.size}")
}
