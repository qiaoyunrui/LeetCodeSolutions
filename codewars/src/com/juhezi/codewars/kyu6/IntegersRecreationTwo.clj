(ns com.juhezi.codewars.kyu6.IntegersRecreationTwo)

;Integers: Recreation Two
;URL: https://www.codewars.com/kata/55e86e212fce2aae75000060/train/clojure
;Not UnderStand

(defn prod-2-sum [a b c d]
  (sort-by first (into []
  (hash-set (sort [(Math/abs (+ (* a c) (* b d))) (Math/abs (- (* a d) (* b c)))])
    (sort [(Math/abs (- (* a c) (* b d))) (Math/abs (+ (* a d) (* b c)))])))))