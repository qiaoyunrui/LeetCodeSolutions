(ns com.juhezi.codewars.kyu7.SumOfAllArguments)

;Sum of all arguments
;URL: https://www.codewars.com/kata/540c33513b6532cd58000259/train/clojure
;Easy
(defn sum
  "Finds the sum of all of its arguments"
  [& data]
  (apply + data))