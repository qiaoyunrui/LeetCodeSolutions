(ns com.juhezi.sicp.FermatTheroy)

(defn square [x]
  (* x x))

;费马小定理检测素数

;计算一个数的幂对另一个数取模的结果
;采用连续求平方的方式，使相对于计算中指数，，步长增长的阶是对数的。
;even? 判断是不是偶数
(defn expmod [base exp m]
  (cond (= exp 0) 1
        (even? exp) (rem (square (expmod base (/ exp 2) m)) m)
        :else (rem (* base (expmod base (- exp 1) m)) m)))

(defn fermat-test [n]
  (defn try-it [a]
    (= (expmod a n n) a))
  (try-it (+ 1 (rand-int (- n 1)))))

(defn fast-prime? [n times]
  (cond ((= times 0) true)
        ((fermat-test n) (fast-prime? n (- times 1)))
        :else false))