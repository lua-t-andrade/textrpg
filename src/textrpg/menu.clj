(ns textrpg.menu)

;; Start game menu print out.

(def menu-text
  ["WELCOME TO THE TEXT RPG ADVENTURE!!1!"
   "1 START"
   "2 EXIT"])

(defn game-menu
  "This function prints out the game menu."
  []
  (doseq
      [e menu-text]
      (println e)))
