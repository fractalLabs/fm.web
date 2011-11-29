(ns web)


(defn table 
  ([coll]
   [:table
    (for [row coll]
      [:tr
       (map (fn [elem] [:td elem]) row)])])
  ([titles coll]
   (table (cons titles coll))))

(defn link-to [obj reference]
  [:a {href reference} obj])

(defn bullet-list [coll]
  [:ul
   (map (fn [elem] [:li elem]))])

(defn number-list [coll]
  [:ol
   (map (fn [elem] [:li elem]))])

(defn wawa [coll]
  [:wawa coll])
