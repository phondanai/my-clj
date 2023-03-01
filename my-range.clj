;; 4clojure
;; Problem 34, Implement range
(defn my-range [start end]
  (loop [res []
         s start]
    (if 
      (>= s end) res
      (recur (conj res s) (inc s)))))
