(ns com.juhezi.codewars.DeodorantEvaporator)
; URL: https://www.codewars.com/kata/deodorant-evaporator/train/clojure

(defn evaporator [content, evap_per_day, threshold]
  (count (take-while #(> % threshold) (iterate #(* % (- 100 evap_per_day) 0.01) 100)))) ;100 * 0.9 * 0.9 * 0.9 * 0.9 ......

;take-while -> 如果有一个元素返回true，则直接终止，不对后面的元素进行循环
;iterate -> 生成一个[惰性序列]：x, (f x), (f (f x)) etc，f 必须为无副作用，与 take-while 配合使用最佳！

; 示例：
; user=> (take-while #(<= % 1024 ) (iterate #(* 2 %) 1))
; (1 2 4 8 16 32 64 128 256 512 1024)

(println (evaporator 10 10 10))