(ns com.juhezi.sicp.Queen)
;八皇后

(defn is-valid-addition?
  "判断位置是否有效"
  [board proposed-position]
  (let [board-size (count board)]
    (not-any? true?
              (for [row-counter (range board-size) :let [pos (board row-counter)]]
                (or
                  (= pos proposed-position)
                  (= (- board-size row-counter) (Math/abs (- proposed-position pos))))))))

(defn add-to-boards
  [boards board-size]
  (for [board boards column-counter (range 1 (inc board-size)) :when (is-valid-addition? board column-counter)]
    (conj board column-counter)))

(defn solve-for-board-size [board-size]
  (nth (iterate (fn [boards] (add-to-boards boards board-size)) [[]]) board-size))

