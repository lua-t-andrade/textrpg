(defproject textrpg "0.0.1"
  :description "This is a text-based RPG."
  :url ""
  :license {:name ""
            :url  ""}
  :dependencies [[org.clojure/clojure "1.12.2"]]
  :main ^:skip-aot textrpg.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
