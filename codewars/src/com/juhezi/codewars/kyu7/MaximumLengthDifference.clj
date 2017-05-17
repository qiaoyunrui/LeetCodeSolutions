(ns com.juhezi.codewars.kyu7.MaximumLengthDifference)

;URL: https://www.codewars.com/trainer/clojure
;计算字符串长度最大差值

(defn mxdiflg [a1 a2]
  (apply max (conj (for [x a1
                         y a2]
                     (Math/abs (- (count x) (count y)))) -1)))
;conj: 向集合中添加元素，在这里是添加一个 -1
;for: 使两个集合进行全排列

;Other Solution
(defn mxdiflg [a1 a2]
  (reduce max -1 (for [x a1, y a2] (Math/abs (- (count x) (count y))))))
;reduce 对 coll 代表的 seq 进行迭代式的运算，Don't understand