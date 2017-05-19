(ns com.juhezi.codewars.kyu7.DisemvowelTrolls)

;URL: https://www.codewars.com/kata/disemvowel-trolls
;去除元音字母
(defn disemvowel
  [string]
  (apply str (re-seq #"[^aeiouAEIOU]" string))
)