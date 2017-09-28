(ns com.juhezi.codewars.kyu7.SumPowDig)

;Content: Numbers Which Sum of Powers of Its Digits Is The Same Number
;URL: https://www.codewars.com/kata/560a4962c0cc5c2a16000068/train/clojure

(defn getFunction [index]
  #(int (Math/pow (- (int %) 48) index)))

(defn fun [hmax po]
  (filter #(= % (apply + (vec (map (getFunction po) (str %))))) (range hmax)))

;Error Fix
(defn eq-sum-pow-dig [hmax po]
  (filter #(= hmax %) (fun hmax po)))

;Right
(defn exp [x n]
  (->> (repeat x)
       (take n)
       (apply *)))

(defn eq-sum-pow? [n po]
  (->> (str n)
       (map int)
       (map #(- % 48))
       (map #(exp % po))
       (apply +)
       (= n)))

(defn eq-sum-pow-dig [hmax po]
  (->> (range 2 (+ 1 hmax))
       (filter #(eq-sum-pow? % po))))