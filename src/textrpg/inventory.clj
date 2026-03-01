(ns textrpg.inventory)

(def inventory
  ;; Empty atom that will store state of the inventory.
  (atom []))

(defn error-message
  "Prints out error for inventory things."
  []
  (println "You can't do that."))

(defn store-item!
  "Function will add item to the vector inventory, atomically"
  [i]
  (swap! inventory conj i)
  )

(defn remove-item!
  "Function will remove an item from the vector inventory, atomically"
  [i]
  (if (= (some #{i} @inventory) nil)
      (error-message)
      (swap! inventory remove #{i})))

(store-item! "sword")
(store-item! "phone")
@inventory



