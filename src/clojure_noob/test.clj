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

;; vectors (0-indexed collection, like an array)

;; vector literal
[3 2 1]

;; return an element of a vector
(get [3 2 1] 0)

;; another example of getting by index
;; vector elements can be of any type and you can mix and match
(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)

(vector "creepy" "full" "moon")

;; elements get added to the end of a vector
(conj [1 2 3] 4)
(conj [1 2 3] 4 5)

;; lists
;; lists are similar to vectors in that they are linear collections of values.
;; one difference though, you cannot retrieve list elements with `get`

'(1 2 3 4)

;; doesn't work for lists
(get '(100 200 300 400) 0)

;; this works but we'll find out later
(nth '(100 200 300 400) 3)

;; you can create a list with the `list` function
(list 1 2 3 4)

;; elements get added to the beginning of the list
(conj '(1 2 3) 4)

;; when should you use a list and when should you use a vector?
;; for now, probably better off just using vectors

;; sets
;; sets are collections of unique values

;; literal notation
#{"hannah montanna" "miley cyrus" 20 45}

;; if you try to add :b to a set which already has :b, the set will still only have one :b
(conj #{:a :b} :b)

;; list
(conj '(:a :b) :b)
;; vector
(conj [:a :b] :b)

;; you can check whether a value exists in a set
(get #{:a :b} :a)

(:a #{:a :b})

;; returns nil
(get #{:a :b} "hannah montanna")

;; you can create sets from existing vectors and lists by using the set function.
;; one unobvious use for this is to check whether an element exists in a collection

(set [3 3 3 4 4])

(get (set [3 3 3 4 4]) 3)

(get (set [3 3 3 4 4]) 5)

(hash-set 1 1 3 1 2)

(sorted-set :b :a :c)
