(ns com.juhezi.codewars.kyu7.SelfDescriptiveNumbers)

;URL: https://www.codewars.com/kata/56a628758f8d06b59800000f/train/clojure

(defn self-descriptive? [num]
  (let
    [digits (map #(Character/digit % 10) (str num))
     ind (range (count digits))
     pred (fn [d] (count (filter #(== % d) digits)))]
    (= (map pred ind) digits)
    ))

; 要灵活使用 range
;pred 作用是 获取 1 2 3 4 ....的位数