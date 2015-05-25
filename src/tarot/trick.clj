(ns tarot.trick
  (require [tarot.core :as tc])
  (:gen-class)) 

(defn compare-plays
  [winning-play candidate-play]
  (let [winning-card (:card winning-play)
        winning-suit (:suit winning-card)
        candidate-card (:card candidate-play)
        candidate-suit (:suit candidate-card)]
    (if (not= winning-suit candidate-suit)
      (if (not= :trumps candidate-suit)
        winning-play
        candidate-play)
      (if (> (:cmpval winning-card) (:cmpval candidate-card))
        winning-play
        candidate-play))))

(defn deduce-winner
  [card-plays]
  (let [lead-suit (:suit (:card (first card-plays)))]
    (loop [winning-play (first card-plays)
           to-compare (rest card-plays)]
      (if (zero? (count to-compare))
        winning-play
        (recur (compare-plays winning-play (first to-compare))
               (rest to-compare))))))

(defn evaluate-trick
  "Takes an array of maps, the array being in order of play, and returns a map of the players to the list of cards they won"
  [card-plays]
  (let [winning-play (deduce-winner card-plays)
        winning-player (:player winning-play)
        cards-played (reduce conj [] (map :card card-plays))]
    {:winner winning-player :trick cards-played}))
