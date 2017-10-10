(ns com.juhezi.codewars.kyu5.MaximumSubarraySum)

; URL: https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/clojure
; Maximum subarray sum
; Need Study
(defn max-fold
  [[max-here max-so-far] x]
  (let [max-here (max 0 (+ max-here x))]
    [max-here (max max-so-far max-here)]))

(defn max-sequence [xs]
  (second (reduce max-fold [0 0] xs)))