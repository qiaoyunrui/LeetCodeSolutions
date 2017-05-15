(ns com.juhezi.codewars.PrinterErrors)

; URL: https://www.codewars.com/kata/printer-errors/clojure

(defn printer-error [s]
  (str (count (re-seq #"[n-z]" s)) "/" (count s))           ;使用正则表达式进行匹配
  )

(println (printer-error "aaaxbbbbyyhwawiwjjjwwm"))