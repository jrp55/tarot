(ns tarot.core-test
  (:require [clojure.test :refer :all]
            [clojure.set :refer :all]
            [tarot.core :refer :all]))

(def deck-size 78)
(def test-players [:a :b :c :d])

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

(deftest test-deal-all-cards
  (testing "Right number of unique cards are dealt"
    (let [result (tarot.core/deal-for-players test-players)]
      (is (= deck-size (count (distinct (flatten (vals result)))))))))

(deftest test-deals-are-right-size
  (testing "Each player and the dog gets the right number of cards"
    (let [result (tarot.core/deal-for-players test-players)]
      (is
        (and
          (= 18 (count (:a result)))
          (= 18 (count (:b result)))
          (= 18 (count (:c result)))
          (= 18 (count (:d result)))
          (= 6 (count (:dog result))))))))
