(ns com.juhezi.codewars.kyu7.AllInclusive)

;URL: https://www.codewars.com/kata/all-inclusive/train/clojure

(defn rotate-s [s]
  (str (subs s 1) (subs s 0 1)))

(defn gen-rotations [s]
  (take (count s) (iterate rotate-s s)))

(defn contain-all-rots [strng arr]
        (every? (set arr) (gen-rotations strng)))