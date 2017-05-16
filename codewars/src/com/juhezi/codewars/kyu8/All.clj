(ns com.juhezi.codewars.kyu8.All)

;String repeat
;URL: https://www.codewars.com/kata/string-repeat/train/clojure
(defn repeat-str [n s]
  (apply str (repeat n s)))

