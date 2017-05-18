(ns com.juhezi.codewars.kyu7.TwoToOne)
;https://www.codewars.com/kata/two-to-one/train/clojure
;Not UnderStand
(require '[clojure.string :as str])

(defn longest [& ss]
  (->> ss (apply concat) (apply sorted-set) (apply str)))
;->>
;->