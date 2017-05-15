(ns com.juhezi.codewars.PrinterErrors)

; URL: https://www.codewars.com/kata/printer-errors/clojure

(defn printer-error [s]
  (str (count (re-seq #"[n-z]" s)) "/" (count s))           ;使用正则表达式进行匹配，Clojure 里面把以 # 开头的字符串当作正则表达式
  )

(println (printer-error "aaaxbbbbyyhwawiwjjjwwm"))