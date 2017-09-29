(ns com.juhezi.codewars.kyu6.Same)

;URL: https://www.codewars.com/kata/550498447451fbbd7600041c/train/clojure
;Are they the "same"?

(defn compSame [a b]
  (if (or (= a nil) (= b nil) (not= (count a) (count b)))
    false
    (= (str (sort (map #(* % %) a))) (str (sort b)))))

