(ns com.juhezi.codewars.kyu6.TakeANumber)

;Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!
;URL: https://www.codewars.com/trainer/clojure
;类似与水仙花数
;89 = 8^1 + 9^2
;不知道怎么实现
;使用字符串来获取各个位置的数字，巧妙！！

(defn char->int [c]
  (- (int c) 48))

(defn sum-dig-pow [a b]
  (->> (range a b)
       (filter #(= %
                   (->> (str %)
                        (map-indexed (fn [idx itm] (Math/pow (char->int itm) (inc idx))))
                        (reduce +)
                        (int))))))