(ns com.juhezi.sicp.Factorial)

(defn factorial [n]
  "计算阶乘"
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))

(defn ackermann
  [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (ackermann (- x 1) (ackermann x (- y 1)))))