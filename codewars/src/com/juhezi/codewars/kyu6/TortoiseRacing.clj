(ns com.juhezi.codewars.kyu6.TortoiseRacing)

;Tortoise racing
;URL: https://www.codewars.com/kata/tortoise-racing/train/clojure

(defn get-time [time]
  (def h (int (/ time 3600)))
  (def a (mod time 3600))
  [h (int (/ a 60))  (mod a 60)])

(defn race [v1 v2 g]
  (if (> v1 v2)
    nil
    (get-time (int (* 3600 (/ g (- v2 v1)))))))