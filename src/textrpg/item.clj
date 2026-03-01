(ns textrpg.item)

(defrecord item
    ;; Items will have a name and a use. Use will be a function
    ;; assigned to the specific item.
    [name
     use])

(defn item? [i]
  ;; TODO: Returns whether arg is item or not.
  false)

(defn pick-item [i]
  ;; TODO: Implement the pick item function
  )

(defn inspect-item [i]
  ;; TODO: Implement the inspect item function
  )

(defn use-item! [i]
  ;; TODO: Implement function to use the item. Will check the record
  ;;       of the item for the specific function it will use. Items
  ;;       are lost after use (removed from inventory).
  )

