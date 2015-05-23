(ns tarot.core-test
  (:require [clojure.test :refer :all]
            [clojure.set :refer :all]
            [tarot.core :refer :all]))

(def deck-size 78)

(deftest card-count
  (testing "Number of cards defined"
    (is (= deck-size (count tarot.core/cards)))))

(deftest all-uniq-cards
  (testing "All defined cards are unique"
    (is (= deck-size (count (distinct tarot.core/cards))))))

(deftest shuffled-deck-card-count
  (testing "Number of cards in a shuffled deck"
    (is (= deck-size (count (tarot.core/shuffle-deck))))))

(deftest shuffled-deck-cards-uniq
  (testing "All cards in a shuffled deck are unique"
    (is (= deck-size (count (distinct (tarot.core/shuffle-deck)))))))

(deftest shuffled-deck-cards-same-as-defined
  (testing "Shuffled deck cards are the same as defined cards"
    (is (= 0 (count (clojure.set/difference (set tarot.core/cards) (set (tarot.core/shuffle-deck))))))))

