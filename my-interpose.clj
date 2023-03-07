;; 4clojure
;; Problem 40, Interpose a Seq.
(defn my-interpose [sep coll]
  (loop [s sep
         col coll
         so-far []]
    (let [is-last? (empty? (next col))]
      (cond
        is-last? (conj so-far (first col))
        :else (recur s 
                     (rest col)
                     (conj so-far 
                           (first col) s))))))

(my-interpose 0 [1 2 3])
