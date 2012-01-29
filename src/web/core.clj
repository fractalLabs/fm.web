(ns web.core)


(defn table 
  ([coll options]
   [:table options
    (for [row coll]
      [:tr
       (map (fn [elem] [:td elem]) row)])])
  ([coll]
   (table coll {})))


(defn bullet-list [coll]
  [:ul
   (map (fn [elem] [:li elem]) coll)])

(defn number-list [coll]
  [:ol
   (map (fn [elem] [:li elem]) coll)])
