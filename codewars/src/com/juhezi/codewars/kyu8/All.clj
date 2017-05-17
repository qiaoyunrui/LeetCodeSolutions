(ns com.juhezi.codewars.kyu8.All)

;String repeat
;URL: https://www.codewars.com/kata/string-repeat/train/clojure
(defn repeat-str [n s]
  (apply str (repeat n s)))

;-----------------
;Parse nice int from char problem
;URL: https://www.codewars.com/kata/parse-nice-int-from-char-problem/train/clojure
(defn how-old
  [her-old]
  (- (int (nth her-old 0)) 48)
  )

;clever
(def how-old read-string)                                   ;read-String 可以运行代码，如果以数字开头，则默认读取数字，知道遇见空格，否则，则作为字符串读取


;-----------------
;Opposite number
;URL: https://www.codewars.com/kata/opposite-number/train/clojure
(defn opposite [number]
  (- number)
)