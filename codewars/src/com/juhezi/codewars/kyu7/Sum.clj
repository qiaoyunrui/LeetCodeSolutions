(ns com.juhezi.codewars.kyu7.Sum)

;URL: https://www.codewars.com/trainer/clojure

(defn sum
  ([a]
   (fn [b]
     (+ a b)))
  ([a b]
   (+ a b)))