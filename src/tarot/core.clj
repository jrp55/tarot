(ns tarot.core
  (:gen-class))

(def cards
	[
		{:card :one :suit :clubs :value 0.5}
		{:card :two :suit :clubs :value 0.5}
		{:card :three :suit :clubs :value 0.5}
		{:card :four :suit :clubs :value 0.5}
		{:card :five :suit :clubs :value 0.5}
		{:card :six :suit :clubs :value 0.5}
		{:card :seven :suit :clubs :value 0.5}
		{:card :eight :suit :clubs :value 0.5}
		{:card :nine :suit :clubs :value 0.5}
		{:card :ten :suit :clubs :value 0.5}
		{:card :jack :suit :clubs :value 1.5}
		{:card :chevalier :suit :clubs :value 2.5}
		{:card :dame :suit :clubs :value 3.5}
		{:card :roi :suit :clubs :value 4.5}
		{:card :one :suit :hearts :value 0.5}
		{:card :two :suit :hearts :value 0.5}
		{:card :three :suit :hearts :value 0.5}
		{:card :four :suit :hearts :value 0.5}
		{:card :five :suit :hearts :value 0.5}
		{:card :six :suit :hearts :value 0.5}
		{:card :seven :suit :hearts :value 0.5}
		{:card :eight :suit :hearts :value 0.5}
		{:card :nine :suit :hearts :value 0.5}
		{:card :ten :suit :hearts :value 0.5}
		{:card :valet :suit :hearts :value 1.5}
		{:card :chevalier :suit :hearts :value 2.5}
		{:card :dame :suit :hearts :value 3.5}
		{:card :roi :suit :hearts :value 4.5}
		{:card :one :suit :diamonds :value 0.5}
		{:card :two :suit :diamonds :value 0.5}
		{:card :three :suit :diamonds :value 0.5}
		{:card :four :suit :diamonds :value 0.5}
		{:card :five :suit :diamonds :value 0.5}
		{:card :six :suit :diamonds :value 0.5}
		{:card :seven :suit :diamonds :value 0.5}
		{:card :eight :suit :diamonds :value 0.5}
		{:card :nine :suit :diamonds :value 0.5}
		{:card :ten :suit :diamonds :value 0.5}
		{:card :valet :suit :diamonds :value 1.5}
		{:card :chevalier :suit :diamonds :value 2.5}
		{:card :dame :suit :diamonds :value 3.5}
		{:card :roi :suit :diamonds :value 4.5}
		{:card :one :suit :spades :value 0.5}
		{:card :two :suit :spades :value 0.5}
		{:card :three :suit :spades :value 0.5}
		{:card :four :suit :spades :value 0.5}
		{:card :five :suit :spades :value 0.5}
		{:card :six :suit :spades :value 0.5}
		{:card :seven :suit :spades :value 0.5}
		{:card :eight :suit :spades :value 0.5}
		{:card :nine :suit :spades :value 0.5}
		{:card :ten :suit :spades :value 0.5}
		{:card :valet :suit :spades :value 1.5}
		{:card :chevalier :suit :spades :value 2.5}
		{:card :dame :suit :spades :value 3.5}
		{:card :roi :suit :spades :value 4.5}
		{:card :one :suit :trumps :value 4.5}
		{:card :two :suit :trumps :value 0.5}
		{:card :three :suit :trumps :value 0.5}
		{:card :four :suit :trumps :value 0.5}
		{:card :five :suit :trumps :value 0.5}
		{:card :six :suit :trumps :value 0.5}
		{:card :seven :suit :trumps :value 0.5}
		{:card :eight :suit :trumps :value 0.5}
		{:card :nine :suit :trumps :value 0.5}
		{:card :ten :suit :trumps :value 0.5}
		{:card :eleven :suit :trumps :value 0.5}
		{:card :twelve :suit :trumps :value 0.5}
		{:card :thirteen :suit :trumps :value 0.5}
		{:card :fourteen :suit :trumps :value 0.5}
		{:card :fifteen :suit :trumps :value 0.5}
		{:card :sixteen :suit :trumps :value 0.5}
		{:card :seventeen :suit :trumps :value 0.5}
		{:card :eighteen :suit :trumps :value 0.5}
		{:card :nineteen :suit :trumps :value 0.5}
		{:card :twenty :suit :trumps :value 0.5}
		{:card :twentyone :suit :trumps :value 4.5}
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

