(ns textrpg.inventory)

(def inventory
  ;; Empty atom list that will store state of the inventory,
  ;; I made it so I can have a mutable inventory!
  (atom ()))

(defn error-message
  "Prints out error for inventory things."
  []
  (println "You can't do that."))

(defn item-in-inventory?
  "Function will check if an item is in the inventory, returns true if so, and nil otherwise"
  [i]
  (if (= (some #{i} @inventory) nil)
    nil
    true))

(defn store-item!
  "Function will add item to the vector inventory, atomically"
  [i]
  (swap! inventory conj i))

(defn remove-item!
  "Function will remove an item from the vector inventory, atomically"
  [i]
  (if (= (item-in-inventory? i) true)
    (swap! inventory #(remove #{i} %))
    (error-message)))

