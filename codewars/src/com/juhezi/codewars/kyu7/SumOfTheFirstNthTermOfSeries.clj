(ns com.juhezi.codewars.kyu7.SumOfTheFirstNthTermOfSeries)

;Sum of the first nth term of Series
;URL: https://www.codewars.com/kata/555eded1ad94b00403000071/train/clojure
;1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16
;I can do it,but time out,but I get it.
(defn series-sum [n]
  (let [s (range 1 (* 3 n) 3)]
    (str (format "%.2f" (double (apply + (map #(double (/ 1 %)) s))))))
)