(def vert-version "2.0.0-final")
(defproject vertx-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj/"]
  :java-source-paths ["src/java/"]
  :plugins [[lein-libdir "0.1.1"]]
  :libdir-path "lib"
  :resource-paths ["resources/"] 
  :dependencies [
                  [org.clojure/clojure "1.5.1"]
                  [io.vertx/vertx-core "2.0.0-final"]
                  [io.vertx/vertx-platform "2.0.0-final"]
                  ]
  )
