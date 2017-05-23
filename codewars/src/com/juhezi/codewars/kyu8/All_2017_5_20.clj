(ns com.juhezi.codewars.kyu8.All-2017-5-20)

;Convert a String to a Number!
;URL: https://www.codewars.com/kata/544675c6f971f7399a000e79/train/clojure
;mine
;toooooo easy!!
(defn string-to-number [str]
  (Integer/parseInt str)
)


;----------------------------
;Kata Example Twist
;URL: https://www.codewars.com/kata/525c1a07bb6dda6944000031/train/clojure
;An interesting solution
(def websites
  (repeat 1000 "codewars")
)
;Other solution,result is the vector
(def websites
  (loop [ws []                                              ;loop 后面的 [] 中是初始化的值
         i  0]
    (if (= i 1000)
        ws
        (recur (conj ws "codewars") (inc i)))))

;No zeros for heros
;去掉数字末尾的 0
;mine
(defn no-boring-zeros [n]
  (let [s (clojure.string/replace (str n) #"0*$" "")]
    (if (= s "")
    0
    (Integer/parseInt s)))
  )


;Last
;https://www.codewars.com/kata/last/train/clojure
;mine
;获取最后一位，注意要判断长度是否为 0
(defn last
  "Returns the last element of an ISeq"
  [lst]
  (if (zero? (count lst))
    nil
    (nth (reverse lst) 0))
  )


;Convert a Number to a String!
;https://www.codewars.com/kata/convert-a-number-to-a-string
;mine
(defn number-to-string [num]
  (str num)
)

;Find the Slope
;https://www.codewars.com/kata/find-the-slope/train/clojure
;mine
(defn slope [v]
  (let [dx (- (v 0) (v 2))
        dy (- (v 1) (v 3))]
    (if (zero? dx)
      "undefined"
      (str (/ dy dx))))
  )
