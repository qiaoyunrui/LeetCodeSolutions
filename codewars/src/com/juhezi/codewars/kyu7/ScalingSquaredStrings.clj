(ns com.juhezi.codewars.kyu7.ScalingSquaredStrings)

;Scaling Squared Strings
;URL: https://www.codewars.com/trainer/clojure
;从横竖两个方向对字符串进行拉伸
;Have no ideas
(require '[clojure.string :as str])

(defn scale [s h v]
  (->> (str/split-lines s)
       (filter seq)
       (map (comp str/join (partial mapcat (partial repeat h))))
       (mapcat (partial repeat v))
       (str/join \newline)))
;clojure.string/split-lines: 将字符串分成一行一行的
;seq: 可以将 Vector 转化为序列
;partial 接受一个函数，以及这个函数的一个或者多个参数作为参数，并且产生一个新的函数 g，这个函数保持了这些参数以及函数 f 的引用
;comp 接收任意数量的函数，并生成一个新的函数
;mapcat: Returns the result of applying concat to the result of applying map to f and colls. 即 map + concat

