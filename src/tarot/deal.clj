(ns tarot.deal
  (require [tarot.core :as t])
  (:gen-class))

(defn dog-deal? 
  "Returns true if a card should be dealt into the dog and false otherwise"
  [dealt-dog counter]
  (and 
    (false? dealt-dog) 
    (pos? counter) 
    (zero? (mod counter 2))))

(def deal-packet-size 3)

(defn get-list-for-conj
  "Gets a list viable for conj"
  [candidate]
  (if (zero? (count candidate))
    []
    candidate))

(defn deal-packet 
  "Deals a packet of cards to the next player"
  [deck result counter players]
  (assoc result 
    (nth players counter) 
    (flatten 
      (conj 
        (get-list-for-conj 
          ((nth players counter) result))
        (take deal-packet-size deck)))))

(def dog-deal-size 1)

(defn deal-dog 
  "Deals a card to the dog"
  [deck result]
  (assoc result :dog 
    (flatten 
      (conj 
        (get-list-for-conj
          (:dog result))
        (take dog-deal-size deck)))))

(defn deal-int 
  "Deals the deck out to the players, and includes a dog" 
  [deck players]
  (loop [remaining-deck deck
	 result (hash-map)
         counter 0
         dealt-dog false]
    (let [dealing-dog (dog-deal? dealt-dog counter)]
      (if (zero? (count remaining-deck))
        result
        (recur (nthrest remaining-deck (if dealing-dog dog-deal-size deal-packet-size))
	       (if dealing-dog
                 (deal-dog remaining-deck result)
                 (deal-packet remaining-deck result counter players))
               (if dealing-dog
                 counter
                 (mod (inc counter) (count players)))
               dealing-dog)))))

(defn deal-for-players 
  "Deals a tarot deck out to the players"
  [players]
  (deal-int (t/show-shuffled-deck) players))
