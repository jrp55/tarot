(ns tarot.core
  (:gen-class))

(def cards
	[
		{:card :one :suit :clubs :cmpval 1 :value 0.5}
		{:card :two :suit :clubs :cmpval 2 :value 0.5}
		{:card :three :suit :clubs :cmpval 3 :value 0.5}
		{:card :four :suit :clubs :cmpval 4 :value 0.5}
		{:card :five :suit :clubs :cmpval 5 :value 0.5}
		{:card :six :suit :clubs :cmpval 6 :value 0.5}
		{:card :seven :suit :clubs :cmpval 7 :value 0.5}
		{:card :eight :suit :clubs :cmpval 8 :value 0.5}
		{:card :nine :suit :clubs :cmpval 9 :value 0.5}
		{:card :ten :suit :clubs :cmpval 10 :value 0.5}
		{:card :jack :suit :clubs :cmpval 11 :value 1.5}
		{:card :chevalier :suit :clubs :cmpval 12 :value 2.5}
		{:card :dame :suit :clubs :cmpval 13 :value 3.5}
		{:card :roi :suit :clubs :cmpval 14 :value 4.5}
		{:card :one :suit :hearts :cmpval 1 :value 0.5}
		{:card :two :suit :hearts :cmpval 2 :value 0.5}
		{:card :three :suit :hearts :cmpval 3 :value 0.5}
		{:card :four :suit :hearts :cmpval 4 :value 0.5}
		{:card :five :suit :hearts :cmpval 5 :value 0.5}
		{:card :six :suit :hearts :cmpval 6 :value 0.5}
		{:card :seven :suit :hearts :cmpval 7 :value 0.5}
		{:card :eight :suit :hearts :cmpval 8 :value 0.5}
		{:card :nine :suit :hearts :cmpval 9 :value 0.5}
		{:card :ten :suit :hearts :cmpval 10 :value 0.5}
		{:card :valet :suit :hearts :cmpval 11 :value 1.5}
		{:card :chevalier :suit :hearts :cmpval 12 :value 2.5}
		{:card :dame :suit :hearts :cmpval 13 :value 3.5}
		{:card :roi :suit :hearts :cmpval 14 :value 4.5}
		{:card :one :suit :diamonds :cmpval 1 :value 0.5}
		{:card :two :suit :diamonds :cmpval 2 :value 0.5}
		{:card :three :suit :diamonds :cmpval 3 :value 0.5}
		{:card :four :suit :diamonds :cmpval 4 :value 0.5}
		{:card :five :suit :diamonds :cmpval 5 :value 0.5}
		{:card :six :suit :diamonds :cmpval 6 :value 0.5}
		{:card :seven :suit :diamonds :cmpval 7 :value 0.5}
		{:card :eight :suit :diamonds :cmpval 8 :value 0.5}
		{:card :nine :suit :diamonds :cmpval 9 :value 0.5}
		{:card :ten :suit :diamonds :cmpval 10 :value 0.5}
		{:card :valet :suit :diamonds :cmpval 11 :value 1.5}
		{:card :chevalier :suit :diamonds :cmpval 12 :value 2.5}
		{:card :dame :suit :diamonds :cmpval 13 :value 3.5}
		{:card :roi :suit :diamonds :cmpval 14 :value 4.5}
		{:card :one :suit :spades :cmpval 1 :value 0.5}
		{:card :two :suit :spades :cmpval 2 :value 0.5}
		{:card :three :suit :spades :cmpval 3 :value 0.5}
		{:card :four :suit :spades :cmpval 4 :value 0.5}
		{:card :five :suit :spades :cmpval 5 :value 0.5}
		{:card :six :suit :spades :cmpval 6 :value 0.5}
		{:card :seven :suit :spades :cmpval 7 :value 0.5}
		{:card :eight :suit :spades :cmpval 8 :value 0.5}
		{:card :nine :suit :spades :cmpval 9 :value 0.5}
		{:card :ten :suit :spades :cmpval 10 :value 0.5}
		{:card :valet :suit :spades :cmpval 11 :value 1.5}
		{:card :chevalier :suit :spades :cmpval 12 :value 2.5}
		{:card :dame :suit :spades :cmpval 13 :value 3.5}
		{:card :roi :suit :spades :cmpval 14 :value 4.5}
		{:card :one :suit :trumps :cmpval 1 :value 4.5}
		{:card :two :suit :trumps :cmpval 2 :value 0.5}
		{:card :three :suit :trumps :cmpval 3 :value 0.5}
		{:card :four :suit :trumps :cmpval 4 :value 0.5}
		{:card :five :suit :trumps :cmpval 5 :value 0.5}
		{:card :six :suit :trumps :cmpval 6 :value 0.5}
		{:card :seven :suit :trumps :cmpval 7 :value 0.5}
		{:card :eight :suit :trumps :cmpval 8 :value 0.5}
		{:card :nine :suit :trumps :cmpval 9 :value 0.5}
		{:card :ten :suit :trumps :cmpval 10 :value 0.5}
		{:card :eleven :suit :trumps :cmpval 11 :value 0.5}
		{:card :twelve :suit :trumps :cmpval 12 :value 0.5}
		{:card :thirteen :suit :trumps :cmpval 13 :value 0.5}
		{:card :fourteen :suit :trumps :cmpval 14 :value 0.5}
		{:card :fifteen :suit :trumps :cmpval 15 :value 0.5}
		{:card :sixteen :suit :trumps :cmpval 16 :value 0.5}
		{:card :seventeen :suit :trumps :cmpval 17 :value 0.5}
		{:card :eighteen :suit :trumps :cmpval 18 :value 0.5}
		{:card :nineteen :suit :trumps :cmpval 19 :value 0.5}
		{:card :twenty :suit :trumps :cmpval 20 :value 0.5}
		{:card :twentyone :suit :trumps :cmpval 21 :value 4.5}
		{:card :excuse :suit :excuse :value 4.5}])

(defn shuffle-deck 
  "Returns a shuffled deck from cards"
  [] 
  (shuffle (seq cards)))

(defn show-card 
  "Shows the :card and :suit of x"
  [x] 
  (hash-map :suit (:suit x) :card (:card x)))

(defn show-shuffled-deck 
  "Shows the :card and :suit for each card in a newly shuffled deck"
  [] 
  (map show-card (shuffle-deck)))

