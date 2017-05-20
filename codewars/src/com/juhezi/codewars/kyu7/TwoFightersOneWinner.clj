(ns com.juhezi.codewars.kyu7.TwoFightersOneWinner)

;URL: https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/clojure
(defrecord Fighter [name hp attack])

;ERROR[I think]  与题目不符
(defn declare-winner [f1 f2]
  (if (> (quot (:hp f1) (:attack f2))
         (quot (:hp f2) (:attack f1)))
         (:name f1)
         (:name f2)))
;quot 的使用方法
;(quot 2 3)
;=> 0
;(quot 3 2)
;=> 1

;Test
(declare-winner (->Fighter "Harald" 20 5)
                (->Fighter "Jerry" 30 3))

;Other
(defn declare-winner [f1 f2]
  (cond
    (<= (:hp f1) 0) (:name f2)
    (<= (:hp f2) 0) (:name f1)
    :else
      (recur
        (update f1 :hp - (:attack f2))
        (update f2 :hp - (:attack f1)))))