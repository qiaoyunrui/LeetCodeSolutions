(ns com.juhezi.solutions.other.prime)

;; Calculate primes until 1000

(reduce
  (fn [primes number]
      (if (some zero? (map (partial mod number) primes))
        primes
        (conj primes number)))
  [2]
  (take 1000 (iterate inc 3)))