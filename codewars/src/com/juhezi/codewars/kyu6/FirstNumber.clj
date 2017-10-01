(ns com.juhezi.codewars.kyu6.FirstNumber)

;URL:https://www.codewars.com/kata/5612ab201830eb000f0000c0/train/clojure
;Find the First Number in Having a Certain Number of Divisors

;约束定理
;首先要生成素数序列

(defn find-min-num [n]
  ;todo
  )

;判断一个数是否为素数
(defn prime? [n]
  (= 0 (count (filter #(= 0 (mod n %)) (range 2 (+ 1 (int (Math/sqrt n))))))))

;从 2 开始的素数序列
(defn prime-numbers []
  (rest (rest (filter prime? (lazy-seq (range))))))