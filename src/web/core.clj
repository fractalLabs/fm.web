(ns web.core)


(defn table 
  ([coll]
   [:table
    (for [row coll]
      [:tr
       (map (fn [elem] [:td elem]) row)])])
  ([titles coll]
   (table (cons titles coll))))


(defn bullet-list [coll]
  [:ul
   (map (fn [elem] [:li elem]) coll)])

(defn number-list [coll]
  [:ol
   (map (fn [elem] [:li elem]) coll)])
