(ns com.juhezi.codewars.kyu7.JadenCasingStrings)

;URL: https://www.codewars.com/kata/jaden-casing-strings/train/clojure
;使字符串的首字母大写
;mine
(defn upFirst [ss]
  (let [head (str (.charAt ss 0))]
    (clojure.string/replace-first ss head (.toUpperCase head))))

(defn jaden-case [s]
  (clojure.string/join " " (map upFirst (clojure.string/split s #" "))))


;Better
(defn jaden-case [s]
  (clojure.string/replace s #"(?:^|\s)\w" #(.toUpperCase %)))
;这个正则表达式是匹配空格以及空格之后的字符
;\s 匹配任意空白字符
;? 匹配前面的子表达式零次或一次，或指明一个非贪婪限定符。
;: 指明两项之间的一个选择
;^ 匹配输入字符串的开始位置，除非在方括号表达式中使用，此时它表示不接受该字符集合
;\w 匹配单个字母

(defn jaden-case [s]
  (->> (clojure.string/split s #" ")
       (map clojure.string/capitalize)
       (interpose " ")
       (apply str)))
;clojure.string/capitalize: 把字符串的第一个字符变成大写，后面的全部变成小写
;interpose: 在集合中的相邻元素间插入指定元素，