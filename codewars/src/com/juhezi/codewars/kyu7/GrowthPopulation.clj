(ns com.juhezi.codewars.kyu7.GrowthPopulation)

;Growth of a Population
;URL：https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/clojure
(defn nb-year [p0 percent aug p]
  (count (take-while #(< % p) (iterate #(+ aug (* % (+ 1 (/ percent 100)))) p0))) ;Have Bug!!
  )

;Other's Solution
(defn nb-year [p0 percent aug p]
  (let [mult (+ 1 (/ percent 100.0))]
    (loop [i 1 prev p0]
      (if (>= prev p)
        (dec i)
        (recur (inc i) (Math/floor (+ aug (* prev mult))))))))
; if 是 Clojure 唯一的基本条件判断函数。
; 如果 if 的第一个表达式的值是逻辑 true 的话，那么整个 if 的值就是第二个表达式的值，
; 否则 if 形式的值则是第三个表达式的值。第二个表达式和第三个表达式都是按需求值的。
; 如果一个条件表达式的值是 false，但 if 的 else 表达式没有提供的话，那么整个 if 的值就是 nil。
; ---
; recur 能够在不消耗堆栈控件的情况下把程序执行到离本地上下文最近的 loop 头那里去，
; 这个 loop 头可以是 loop 定义的，也可以是一个[函数]定义的。
; loop 通过一个隐式的 let 来定义绑定，所以它接受一个绑定数组，跟 let 类似。
; 如果 loop 形式的最后一个表达式产生一个值，那么这个值将作为 loop 形式的值。
; recur 形式会把程序执行的控制权转到上下文里面最近的 loop 头去
; 函数也可以建立 loop 头，如果是函数建立 loop 头的话，那么 recur 所带的值则会绑定到函数的参数上面去
