;; 4clojure
;; Problem 38, Maximum value
(defn my-max [max-so-far & nums]
  (loop [msf max-so-far
         xs nums]
    (if 
      (empty? xs)
      msf
      (cond
        (> (first xs) msf) (recur (first xs) (rest xs))
        :else (recur msf (rest xs))))))
