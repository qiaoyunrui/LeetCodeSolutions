(ns com.juhezi.codewars.Samples)

(first (.split (.replace (.toUpperCase "a b c d") "A" "X") " "))
;全部大写 -> 把 'A' 替换为 'X' -> 使用 ' ' 将字符串分割 -> 取第一个值

(-> "a b c d"
    .toUpperCase
    (.replace "A" "X")
    (.split " ")
    first)
;与上一个作用相同。

;------------------------------
(-> 3 (- 2))
;=> 1
(->> 3 (- 2))
;=> -1

;由例子可知，-> 是把当前的 coll 作为第一个参数，而 ->> 则是把 coll 当作第二个参数


;根据句号断句
(defn cut-str
  [s]
  (clojure.string/replace s #"。" "。\n;"))

;For Sample
(for [x [0 1 2 3 4 5]
      :let [y (* x 3)]
      :when (even? y)]
  y)
;=> (0 6 12)
