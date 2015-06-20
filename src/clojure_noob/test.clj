(if true
  "abra cadabra"
  "hocus pocus")

(if false
  (do (println "Success!")
      "abra cadabra")
  (do (println "Failure :(")
      "hocus pocus"))

(when true
  (println "Success!")
  "abra cadabra")

;; control flow operators
;; if
;; do
;; when

(def failed-protagonist-names
  ["Larry Potter"
   "Doreen The Explorer"
   "The Incredible Bulk"])

;; naming things with def
;; we bind the name `failed-protagonist-names' to a vector containing three strings

(nil? 1)
(nil? nil)

(= 1 1)
(= nil nil)
(= 1 2)

93  ;; integer
1.2  ;; float
1/5  ;; ratio

"Lord Voldemort"
;; 'Lord Voldemort' not a valid string
"\"He who must not be named\""
"\"Great cow of Moscow!\" - Hermes Conrad"

(def name "Chewbacca")
(str "\"Ugglglglglglglglglglglll\" - " name)

;; an empty map
{}

;; :a, :b, and :c are keywords
{:a 1
 :b "boring example"
 :c []}

{"string-key" +}

{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}

(get {:a 0 :b 1} :b)
(get {:a 0 :b {:c "ho hum"}} :b)

;; you can look up values in maps with the `get' function

(get {:a 0 :b 1} :c)
(get {:a 0 :b 1} :c "UNICORNS")

;; `get' will return `nil' if it doesn't find the key

(get-in {:a 0 :b {:c "ho hum"}} [:b :c])

({:name "The Human Coffee Pot"} :name)

;; get and get-in for nested values

;; 2.5

:a
:rumplestiltskin
:34
:_?

;; keywords can be used as functions to look up corresponding value in a data structure
(:a {:a 1 :b 2 :c 3})

;; this is equivalent to
(get {:a 1 :b 2 :c 3} :a)

;; provide a default value
(:d {:a 1 :b 2 :c 3} "FAERIES")

(hash-map :a 1 :b 2)

;; vectors