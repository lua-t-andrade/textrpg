(ns textrpg.input)

;; This will deal with the game inputs.

(def map-commands
  {:look "You look around."
   :inspect "You inspect it."
   :pick "You pick it."
   :store "You put it in the inventory."})

(defn input-error
  "Prints out the input error message."
  []
  (println
   "This does not work."))

(defn input->vector
  "This function will receive the player input and return it as a vector."
  []
  (vector (read-line)))
