(ns com.juhezi.sicp.Fib)

(defn fib [x]
  "求斐波那契数"
  (cond (= x 0) 0
        (= x 1) 1
        :else (+ (fib (- x 1))
                 (fib (- x 2)))))