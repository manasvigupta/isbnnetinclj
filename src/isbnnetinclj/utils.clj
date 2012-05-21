(ns isbnnetinclj.utils
  (:require [net.cgrand.enlive-html :as html]
            [clj-time.core :as time]))

(defn fetch-url
  [url]
  (html/html-resource (java.net.URL. url)))

(defn twenty-four-hours-ago
  []
  (time/minus (time/now) (time/days 1)))
