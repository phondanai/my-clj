;; 4clojure
;; Problem 39, interleave two seqs
(defn my-interleave [col1 col2]
  (loop [c1 col1 
         c2 col2
         so-far []]
    (cond
      (some empty? [c1 c2]) so-far
      :else (recur 
              (rest c1)
              (rest c2)
              (conj so-far (first c1) (first c2))))))
