(ns com.juhezi.codewars.kyu8.All)

;String repeat
;URL: https://www.codewars.com/kata/string-repeat/train/clojure
(defn repeat-str [n s]
  (apply str (repeat n s)))

;-----------------
;Parse nice int from char problem
;URL: https://www.codewars.com/kata/parse-nice-int-from-char-problem/train/clojure
(defn how-old
  [her-old]
  (- (int (nth her-old 0)) 48)
  )

;clever
(def how-old read-string)                                   ;read-String 可以运行代码，如果以数字开头，则默认读取数字，知道遇见空格，否则，则作为字符串读取


;-----------------
;Opposite number
;URL: https://www.codewars.com/kata/opposite-number/train/clojure
(defn opposite [number]
  (- number)
)

;-----------------
;Rock Paper Scissors!
;URL: https://www.codewars.com/kata/rock-paper-scissors/train/clojure
(def wins #{["rock" "scissors"] ["scissors" "paper"] ["paper" "rock"]}) ;定义一个 set

(defn rps [p1 p2]
  (cond
    (= p1 p2) "Draw!"
    (wins [p1 p2]) "Player 1 won!"
    :else "Player 2 won!"))

;cond: 与 switch 类似

;-----------------
;Even or Odd
;URL: https://www.codewars.com/kata/even-or-odd/train/clojure
;判断奇偶
(defn even-or-odd [number]
  (if (even? number) "Even" "Odd")                          ;要善于使用内置函数
)

;Calculate average
;https://www.codewars.com/kata/calculate-average/train/clojure
;求平均值
;mine
(defn find-average
  [numbers]
  (/ (apply + numbers) (count numbers))
)
