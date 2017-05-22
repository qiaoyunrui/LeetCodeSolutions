(ns com.juhezi.codewars.kyu7.SpeedControl)

;Speed Control
;URL: https://www.codewars.com/trainer/clojure
; not understand the question
(defn gps [s x]
  (if (<= (count x) 1)
    0
    (int (apply max (map #(/ (* % 3600) (float s)) (map - (rest x) x))))
    )
  )