(ns com.juhezi.codewars.kyu7.Penultimate)

; name: Penultimate
; Find the second-to-last element of a list.

(defn penultimate
  [lst]
  (second (reverse lst))
)