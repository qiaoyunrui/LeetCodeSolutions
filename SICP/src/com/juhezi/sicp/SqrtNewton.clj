(ns com.juhezi.sicp.SqrtNewton)

;牛顿法求平方根
;(defn average [x y]
;  (/ (+ x y) 2))
;
;;修改猜测的数值
;(defn improve
;  [guess x]
;  (average guess (/ x guess)))
;
;(defn good-enough? [guess x]
;  (< (Math/abs (- (Math/pow guess 2) x)) 0.001))
;
;(defn sqrt-iter [guess x]
;  (if (good-enough? guess x)
;    guess
;    (sqrt-iter (improve guess x) x)))
;
;;complete
;(defn sqrt [x]
;  (sqrt-iter 1.0 x))

;定义内部方法
(defn sqrt [x]
  (defn good-enough?
    [guess x]
    (< (Math/abs (- (Math/pow guess 2) x)) 0.001))
  (defn average [x y]
    (/ (+ x y) 2))
  (defn improve [guess x]
    (average guess (/ x guess)))
  (defn sqrt-iter [guess x]
    (if (good-enough? guess x)
      guess
      (sqrt-iter (improve guess x) x)))
  (sqrt-iter 1.0 x))