(ns tarot.deal-test
  (require [clojure.test :refer :all]
           [tarot.deal :refer :all]))

(def deck-size 78)
(def test-players [:a :b :c :d])
(def num-player-cards 18)
(def num-dog-cards 6)

(deftest test-deal-all-cards
  (testing "Right number of unique cards are dealt"
    (let [result (tarot.deal/deal-for-players test-players)]
      (is 
        (= 
          deck-size 
          (count 
            (distinct 
              (flatten 
                (vals result)))))))))

(deftest test-deals-are-right-size
  (testing "Each player and the dog gets the right number of cards"
    (let [result (tarot.deal/deal-for-players test-players)]
      (is
        (and
          (= num-player-cards (count (:a result)))
          (= num-player-cards (count (:b result)))
          (= num-player-cards (count (:c result)))
          (= num-player-cards (count (:d result)))
          (= num-dog-cards (count (:dog result))))))))
