(ns hello-hoplon.util
  (:require [tailrecursion.hoplon.env :refer :all]))

(defn random-color [text]
  (span {:style (str "color:" (rand-nth ["red" "orange" "yellow" "green" "blue" "indigo" "violet"]))} text))
