(ns com.juhezi.codewars.kyu7.BatmanQuotes)

;Batman Quotes
;URL: https://www.codewars.com/kata/551614eb77dd9ee37100003e/train/clojure
;
(defn batman-quotes [quotes hero]
  (let [ind (Integer. (re-find #"\d" hero))                 ;获取数字的位置
        hero (cond
               (= (subs hero 0 1) "B") "Batman: "
               (= (subs hero 0 1) "R") "Robin: "
               :else "Joker: "
               )
        ]
    (str hero (quotes ind))
    )
  )
;subs: 切割字符串