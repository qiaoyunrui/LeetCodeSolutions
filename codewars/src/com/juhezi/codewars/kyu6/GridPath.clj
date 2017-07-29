(ns com.juhezi.codewars.kyu6.GridPath)

; URL: https://www.codewars.com/kata/paths-in-the-grid/train/java
; 最简单的动态规划
; 首先要定义一个数组

;递归，这个速度太慢

;(defn number-of-routes [m n]
;  (if (= m 0)
;    1
;    (if (= n 0)
;      1
;      (+ (number-of-routes m (- n 1))
;         (number-of-routes (- m 1) n)))))

(defn fact [s e]
  (reduce * (range (biginteger s) (biginteger (inc e))))
  )
(defn number-of-routes [m n]
  (/ (fact (inc n) (+ n m)) (fact 1 m)))
