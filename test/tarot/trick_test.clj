(ns tarot.trick-test
  (require [clojure.test :refer :all]
           [tarot.trick :refer :all]
           [clojure.data :refer :all]))

(def conventional-win-from-lead (tarot.trick/evaluate-trick [{:player :a, :card {:suit :hearts, :cmpval 14}} {:player :b, :card {:suit :hearts, :cmpval 13}} {:player :c, :card {:suit :hearts, :cmpval 12}} {:player :d, :card {:suit :hearts :cmpval 11}}]))

(deftest test-conventional-win-from-lead-winner
  (testing "Winning from the leading card reports correct winner"
      (is
        (= :a (:winner conventional-win-from-lead)))))

(deftest test-conventional-win-from-lead-trick
  (testing "Winning from the leading card reports correct trick cards"
    (let [d (diff [{:suit :hearts, :cmpval 14} {:suit :hearts, :cmpval 13} {:suit :hearts, :cmpval 12} {:suit :hearts :cmpval 11}] (:trick conventional-win-from-lead))]
      (is
        (and
          (nil? (first d))
          (nil? (second d)))))))
