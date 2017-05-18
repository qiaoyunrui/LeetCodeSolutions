(ns com.juhezi.codewars.kyu7.TwoToOne)
;https://www.codewars.com/kata/two-to-one/train/clojure
;Not UnderStand
(require '[clojure.string :as str])

(defn longest [& ss]
  (->> ss (apply concat) (apply sorted-set) (apply str)))
;concat : 将多个元素合并成一个 lazy-seq
; 流程: 使用 concat 将字符串拼接在一起，并且转换为 seq ->
; 转换为 sorted-set （去重） -> 转换为字符串
; 因为 apply 都是把 coll 作为第二个元素，所以要使用 ->> 而不是 ->