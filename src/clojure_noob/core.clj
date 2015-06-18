(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))
(println "Cleanliness is next to godliness")

(defn train
  []
  (println "Choo choo!"))

(map)

(+ 1 (* 2 3) 4)
(+ 1 (* 2 3) 4)

(map (comp record first)
     (d/q '[:find ?post
            :in $ ?search
            :wohere
            [(fulltext $ :post/content ?search)
             [[?post ?content]]]]
          (db/db)
          (:q params)))
