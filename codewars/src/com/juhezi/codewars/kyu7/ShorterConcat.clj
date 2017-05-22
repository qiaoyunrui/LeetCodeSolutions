(ns com.juhezi.codewars.kyu7.ShorterConcat)

;shorter concat [reverse longer]
;URL: https://www.codewars.com/kata/54557d61126a00423b000a45/train/clojure
;

(defn create-string
  [a b]
  (str a (str (clojure.string/reverse b) (str a))))

;more beautiful
(defn create-string
  [a b]
  (str a (clojure.string/reverse b) a))

(defn reverseLonger
  [a b]
  (if (>= (count a) (count b))
  (create-string b a)
  (create-string a b)
    ))
