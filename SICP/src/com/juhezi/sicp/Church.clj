(ns com.juhezi.sicp.Church)

;Church 计数
;所谓的数是指将 f 应用于 x 的次数。
(def zero
  (fn [f]
    (fn [x] x)))

;增加一次 f 操作，即 add-1
;(add-1 zero) => two
(defn add-1 [n]
  (fn [f] (fn [x]
            (f ((n f) x)))))

(def one
  (fn [f]
    (fn [x] (f x))))

(def two
  (fn [f]
    (fn [x] (f (f x)))))

;例子
((zero inc) 0)
;=> 0

(((add-1 zero) inc) 0)
;=> 1

((one inc) 0)
;=> 1

((two inc) 0)
;=> 2
