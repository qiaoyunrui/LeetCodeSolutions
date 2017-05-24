(ns com.juhezi.codewars.kyu7.FunctionsOfIntegersOnCartesianPlane)

;Functions of Integers on Cartesian Plane
;URL: https://www.codewars.com/kata/559e3224324a2b6e66000046/train/clojure
;f: 1 <= x <= n, 1 <= y <= n --> f(x, y) = min(x, y)
;g: 1 <= x <= n, 1 <= y <= n --> g(x, y) = max(x, y)
;h: 1 <= x <= n, 1 <= y <= n --> h(x, y) = x + y
;The task is to calculate the sum of f(x), g(x) or h(x) for all integers x and y such that (1 <= x <= n, 1 <= y <= n).
(defn sumin [n]
  (/ (* n (inc n) (+ 1 (* 2 n))) 6))

(defn sumax [n]
  (/ (* n (inc n) (- (* 4 n) 1)) 6))

;mine
;2 * (1 * 1 + ... + n * n) - n * (n + 1) / 2
(defn sumax [n]
  (- (* 2 (apply + (map #(* % %) (range 1 (inc n))))) (/ (* (inc n) n) 2)))

;UnderStand
;(2 * n) * (1 + ... + n) => 2 * n * n * (n + 1) / 2 => (n * n * (n + 1)) => (* n n (inc n))
(defn sumsum [n]
  (* n n (inc n)))
