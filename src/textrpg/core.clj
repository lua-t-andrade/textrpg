(ns textrpg.core
  (:gen-class)
  (;;:require [textrpg.description :as desc]
   :require [textrpg.menu :as menu]
   :require [textrpg.input :as input]))

(defn -main
  "Main function of the game."
  [& args]
  (menu/game-menu))
