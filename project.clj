(defproject web "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[fm.util "1.0.0-SNAPSHOT"]
                 [fm.namespaces "1.0.0-SNAPSHOT"]
                 [org.clojure/clojure "1.2.0"]]
            :repositories {"fractal" {:url "http://67.205.67.146:8099/archiva/repository/fractal"}
                                                      "snapshots" {:url "http://67.205.67.146:8099/archiva/repository/snapshots"}
                                                      "stuartsierra-releases" "http://stuartsierra.com/maven2"})
